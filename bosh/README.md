# BOSH

```
bosh env
bosh deployments --column=name

bosh steamcells
```

## Releases

```
bosh releases
bosh create-release --name=widgets-mongodb-services
bosh delete-release widgets-mongodb-services/0+dev.1
```

