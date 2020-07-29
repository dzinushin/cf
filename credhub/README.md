https://sourcegraph.com/github.com/cloudfoundry-incubator/credhub-cli/-/blob/EXAMPLES.md

# find
credhub find -p /ote/keys/banks
credhub find -n /ote/keys/banks
credhub find -n /ote/keys/banks --output-json
credhub find -n /production/keys/banks --output-json


# get
credhub get --name /production/keys/banks/vtb/bank-client-secret
credhub get --name /ote/keys/banks/vtb/bank-client-secret

credhub get --name /cf/analytical-services/analytics_minio_secretkey --output-json

# set
credhub set -n "/ote/keys/banks/vtb/bank-client-secret" -w "secret" --type=password

credhub set -n "/cf/analytical-services/domrf_minio_secretkey" -w "xxxx" --type=password