https://github.com/cloudfoundry-incubator/uaa-cli

```
uaa target https://uaa.fin.cian.ru

uaa get-client-credentials-token admin -s PWD

uaa list-clients 

uaa list-clients -z ote

uaa list-clients -z ote | jq  -r '.[].client_id'

uaa list-users

uaa list-users | jq -r '.[].userName'

uaa list-groups
```