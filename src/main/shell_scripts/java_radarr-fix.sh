echo "> renaming previous log file for java trick..."
mv ~/logs/java/radarr-fix_done.log ~/logs/java/radarr-fix_old.log 
echo "> Done"
echo "> docker-compose down and up the AfterFilebotMoveProcessor"
cd "$JAVA_RADARRFIX_PROJECT_PATH"
docker-compose down
echo "> down complete, now up"
docker-compose up > ~/logs/java/radarr-fix.log
echo "$(cat ~/logs/java/radarr-fix.log)"
echo "> java fix done. removing docker..."
docker-compose down
echo "> "
echo "> done, now renaming java log..."
mv ~/logs/java/radarr-fix.log ~/logs/java/radarr-fix_done.log 