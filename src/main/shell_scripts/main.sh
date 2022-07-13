echo "> !!! Hi. Very welcome to filebot+radarr fix shell script !!!"
echo "setting up the (secret) env variables..."
~/jobs/filebot_and_radarr_fix_env.sh
echo "> renaming previous execution logs..."
mv ~/logs/filebot/lists_movies_movements_done.log ~/logs/filebot/lists_movies_movements_old.log
mv ~/logs/filebot/_Filebot_movies_movements_done.log ~/logs/filebot/_Filebot_movies_movements_old.log
mv ~/logs/filebot/uploads_movies_movements_done.log ~/logs/filebot/uploads_movies_movements_old.log
echo "> "
echo "> starting Filebot CLI dockers process"
echo "> *** Execution for radarr_lists folder ***"
./filebot_pelis.sh /pelis/radarr_lists > ~/logs/filebot/lists_movies_movements.log
echo "$(cat ~/logs/filebot/lists_movies_movements.log)"
echo "> *** Execution for _Filebot folder ***"
./filebot_pelis.sh /pelis/_Filebot > ~/logs/filebot/_Filebot_movies_movements.log
echo "$(cat ~/logs/filebot/_Filebot_movies_movements.log)"
echo "> *** Execution for radarr_uploads folder ***"
./filebot_pelis.sh /pelis/radarr_uploads > ~/logs/filebot/uploads_movies_movements.log
echo "$(cat ~/logs/filebot/uploads_movies_movements.log)"
echo "> "
echo "> Done. Now it's time for java trick ;-)"
./java_radarr-fix.sh
echo "> renaming filebot logs..."
mv ~/logs/filebot/lists_movies_movements.log ~/logs/filebot/lists_movies_movements_done.log
mv ~/logs/filebot/_Filebot_movies_movements.log ~/logs/filebot/_Filebot_movies_movements_done.log
mv ~/logs/filebot/uploads_movies_movements.log ~/logs/filebot/uploads_movies_movements_done.log
echo "> Done"
echo "> The End. Thanks for watching :) bye"