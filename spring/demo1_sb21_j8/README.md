
```shell script
cf create-service mongodb default mongo-demo1
cf push -f manifest.yml demo1 -p target/demo-0.0.1-SNAPSHOT.jar --no-start 
```