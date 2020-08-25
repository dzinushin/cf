APP_NAME=demo1
cf t -s support
cf service mongo-${APP_NAME} || cf create-service mongodb default mongo-${APP_NAME}
cf push -f manifest.yml ${APP_NAME} -p target/${APP_NAME}-*.jar --no-start
cf start ${APP_NAME}