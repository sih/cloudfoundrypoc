# Simple Country Service
## Usage
GET /country/{code} where the code is a two-letter ISO-3166 country code. Currently this supports the following [GB, FR, ES]!
## Cloudfoundry

* `cf push`
* `cf logs country-service --recent`