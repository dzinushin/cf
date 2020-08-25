APP_NAME=demo2
cf t -s support
cf service mongo-${APP_NAME} || cf create-service mongodb default mongo-${APP_NAME}
cf push -f manifest.yml ${APP_NAME} -p target/${APP_NAME}-*.jar -b https://github.com/cloudfoundry/java-buildpack.git#v4.25 -s cflinuxfs3 --no-start
cf start ${APP_NAME}