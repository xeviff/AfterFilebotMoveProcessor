docker run --rm --name=filebot_cli_filebot \
-v $FILEBOT_CONFIG_HOST_PATH:/data \
-v $DOCKER_VOLUME_MOVIES_HOST_PATH:/pelis \
-v $FILEBOT_GROOVY_PRESETS_HOST_PATH:/presets \
rednoah/filebot -rename --action MOVE -non-strict --conflict override \
--format "{evaluate('$FILEBOT_GROOVY_PRESET_MOVIES_DOCKER_PATH' as File)}" \
-r "$1"  --apply prune \
--file-filter "f.video" \
--db TheMovieDB --lang Spanish -no-xattr