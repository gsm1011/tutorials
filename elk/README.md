# Getting started with logstash + elasticsearch + kibana (ELK)

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
