# Introduction

The ELK stack is a powerful tool chain for collecting and visualizing logs
and various kinds of data sets. Once configured, the full stack will run
periodically to check the input data, process it if anything new and
visualize it as a dashboard. 

## Logstash

Logstash parses input data, then filter on the data and write the data into
output. In the ELK stack, Elasticsearch is the output for stash.

The configuration file is using the following structure, `input`, `filter`
and `output`. 

```json
input { ...... }
filter { ...... }
output { ...... }
```

In the `input` block, we specify wher the input data is from and how to
parse the input data, for example, we can tell `logstash` to read data from
local filesystem or Amazon S3 etc. and we can use common formats including
csv, json, etc.

The `filter` section tells logstash how to processed the input data, for
example, we can add, remove and modify columns from the input data.

The `output` specifies where logstash pushes data to, this can be a local
file, or elasticsearch server.

The syntax to start up logstash is

``` bash
    $ logstash -f logstash.conf 
```

## Elasticsearch

Elasticsearch is the indexing and search engine for the processed data. It
provides convienient REST API to ingest, query, update and delete documents
in the index store. 

## Kibana 

Kibana is the visualization layer for the ELK stack, it takes the query
result from elastic search and visualizes the result data into graphs. 

# Getting started tutorial

This section shows how to get started with ELK on Mac OSX environment, if
you are using a different environment, please refer to related documents. 

## Installation 

Installation is very simple with homebrew. 

``` bash 
	$ brew install logstash 
	$ brew install elasticsearch
	$ brew install kibana 
```

or, you can use a more concise command 

``` bash 
	$ brew install elasticsearch logstash kibana 
``` 

> The configuration files for the ELK stack will be located at
> `/usr/local/etc` directory just in case you need to modify some
> configurations. 

## Creating a schema template for elasticsearch 

The schema template is a json format file, specifying fields and their data
types etc. An example ES template is similar to the following

``` json 

{
	"template": "sample-es-template",
	"mappings": {
		"sample-es-type": {
			"dynamic": "strict", 
			"properties": {
				"NAME": {
					"type": "string"
				}
				"AGE": {
					"type": "int"
				}
				"WEIGHT": {
					"type": "double"
				}
			}
		}
	}
}

```

Once the schema template is generated, we need to ingest the template file
into elasticsearch. This can be done with the following command: 

``` bash 
	$ curl -X PUT localhost:9200/_template/analytics-model -d@es.template.json
```

Once ingested, we can verify the template on elasticsearch using the
following curl HTTP request. 

``` bash 
	$ curl -X GET localhost:9200/_template/
``` 

## Creating a a config file for logstash 

Corresponding to the input and the elasticsearch schema template, we should
configure the logstash configuration file accordingly. 

> Once the logstash config file and the elasticsearch schema template are
> created, we can now start both services. 

## Using Kibana to visualize the query results

After `kibana` is started, it will be able to connect to the local elastic
search instance automatically. If you want to connect to a remote ES
instance, you need to modify the kibana configuration file located at
`/usr/local/etc/kibana/kibana.yml`. 

Once `kibana` is started with the default settings, we can access the web
interface using `http://localhost:5601/`. 

From the web interface, you can query, visualize and create dashboard from
the visualizations. 

> By default, kibana might not be able to find your index, you need to
> create one manually from the settings -> indices -> create index. 
