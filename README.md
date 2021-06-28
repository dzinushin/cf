# cf


## Service brokers

```
cf create-service-broker <service-broker-name> mongodb-broker <<pwd>> http://10.3.16.63:8080

cf service-brokers

cf delete-service-broker <service-broker-name>
```

cf service-access
cf enable-service-access
cf disable-service-access


## space roles 

```shell
cf space-users
cf set-space-role dzinushin cian ote SpaceDeveloper
```

## network policices

https://docs.cloudfoundry.org/devguide/deploy-apps/cf-networking.html

```shell
cf network-policies
cf add-network-policy ...
```


## app instance affinity
```shell
cf restart-app-instance anketa 3

curl app.example.com -H "X-Cf-App-Instance":"YOUR-APP-GUID:YOUR-INSTANCE-INDEX"

cf app YOUR-APP --guid

curl https://www.cian.ru/cf/anketa/phone\?borrower\=BORROWER -H "X-Cf-App-Instance":"xxxx:0"
```
