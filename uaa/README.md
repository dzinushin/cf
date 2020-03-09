
# UAA

### uaa cli 

https://github.com/cloudfoundry/cf-uaac

Concepts
The user uses a client (like a webapp, or uaac) to do things. The client and the user have different secrets; both the user's and client's secret are passwords.

Main entities:
* targets
* contexts
* users (with passwords)
* clients (with secrets)
* groups

#### how get help about command
```
$ uaac [cmd] -h
```

#### Quick start
```
# uaac target uaa.fin.cian.ru [--skip-ssl-validation]
# uaac token get admin -s <admin password>
# uaac contexts
# uaac info
```

#### targets
```
$ uaac targets # display all targets
$ uaac target [uaa_url | target_number] [--skip-ssl-validation] # display current or set new target
```

info about targets/contexts stored in ```~/.uaac.yml```

#### contexts

```
$ uaac contexts
$ uaac context [ctx-name]
```

#### tokens

```
$ uaac token client get admin -s <password>
$ uaac token [
        get
        client get
        delete [contexts...] [--[no-]all]
]
```

#### users
```
$ uaac users
$ uaac users -a username | grep username # get name of all users
$ uaac user [
      get [name]
      add [name]
      update [name]
      delete [name]
]
$ uaac password set [name] [-p <password>]

$ uaac user add [id] -p [passwd] --emails [user-email]
```

#### clients
```
# uaac clients
# uaac clients -a username | grep username # get name for all clients
# uaac client [
        get [id]
        add [id]
        update [id]
        delete [id]
        secret set [id] 
   ]
# uaac client update grafana --authorized_grant_types="refresh_token authorization_code"   
# uaac client update actuator-metrics-client --authorities “actuator.read, scim.read, scim.write, cloud_controller.admin”   
```

#### groups
```
# uaac groups

# uaac member add [group-id] [user-id]
```
