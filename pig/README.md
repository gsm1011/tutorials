Install Pig
===========

- Download pig from the apache site
- Decompress the tar file into a directory such as /usr/local. 
- Create symbolic link for the folder with the `ln -s` command

> $ ln -s pig-x.y.z pig

- Configure the environment variables for the pig folder by putting the following into your `~/.bash_profile` file
```
PIG_HOME=/usr/local/pig
PATH=$PATH:$PIG_HOME/bin
export PATH
```
- Pig will automatically identify your hadoop installation. The typical scenario is to install pig into a client/gateway machine which has hadoop client configured pointing to the correct *NameNode* and *Jobtracker*. 
- Test your pig installation by running the Grunt command tool from command line. 

> $ pig 
> grunt> 

Wordcount using pig
===================

Wordcount is the `helloworld` of hadoop. There are implementations using different programming languages including `java`, `bash`, `python` etc. We can do the *wordcount* using `pig` or `pig script` too. 

Pig is a data flow language, it follows the general steps of data input, data manipulation and data output. Pig can load data in different format, we can even create customized loaders to load data files of specific format, such as `xml`, `json`, `binary` etc. But the `wordcount` example only requires loading data as plain text data on a line by line basis. This is similar to the implementation of all other programming languages. After the data is loaded, lines should be splitted into individual words and then the same words are grouped and occurances are counted and finally result is writen to a file or dumped into terminal. 

The final script is shown as follows: 

```
inputData = load '$input' as (line);
words = foreach inputData generate flatten(TOKENIZE(line)) as word;
grpd = group words by word;
cnts = foreach grpd generate group, COUNT(words);
dump cnts;
```

Now we can run the `pig script` either in local mode or in distributed (MAPREDUCE) mode.

> $ pig -x local -f wordcount.pig -param input=<small_input.txt>`

It is advisable to test the script locally on small input data first before running over large dataset on the `HDFS/MAPREDUCE` mode.

> $ pig -x mapreduce -f wordcount.pig -param input=<normal_input.txt>`

When we run `pig` script in `mapreduce` mode, the `pig` script will be parsed and translated into MapReduce job (**DAG**) and submitted to the hadoop cluster. 

We can also run the `pig` script from the `grunt` prompt with the following: 

> grunt> exec -param input=<normal_input.txt> wordcount.pig

The `grunt` shell also has the capability to execute `hadoop fs` commands to operate the file system. For example, the `ls` command can list files/directories in `$CWD`. 

Basic data operations using pig
===============================

Pig can load different formats of data for processing. The most common format is column oriented files/tables. We will illustrate how to use `pig` to load data, clean/filter data and aggregate the data based on certain attributes. For purpose of illustration, we download the kddcup 2012 data set from [here](https://www.kddcup2012.org/c/kddcup2012-track1). 

> In order to obtain the kddcup data, registration is required. 

Filtering
---------

The `FILTER` operator can filter data with given conditions. For example, using our `rec_log_train.txt` dataset, we want to get all the records with the result as *accepted*, which means the column of `result` is *1*. We can do this with the following: 

```
inputData = load 'rec_log_train.txt' using PigStorage('\t') as (uid:chararray, itemid:chararray, result:int, timestamp:chararray);
accepted = filter inputData by (result == 1);
notaccepted = filter inputData by (result == -1);
store accepted into 'accepted';
store notaccepted into 'notaccepted';
```

We can run the script file in mapreduce mode using `pig`. Before doing that we need to make sure that the file `rec_log_train.txt` has been copyed from local to *HDFS*. 

> hadoop fs -copyFromLocal rec_log_train.txt ./
> pig -x mapreduce basic.pig

It might take a few minutes for the job to finish. After the job is done, we can take a look at the result with `hadoop` commands. 

> hadoop fs -ls accepted 

Next, we want to some sorting based on user id (`uid`) of the data set. 


Table Joins
-----------

Table join is one of the most popular data operations. Pig supports join operation with the `join` operator. In order to illustrate how it works, we want to join two data sets `user_profile` and `rec_log_train`. 

```
train = LOAD 'rec_log_train.txt.bz2' USING PigStorage('\t') AS (uid:chararray,iid:chararray,result:int,timestamp:chararray);
profile = LOAD 'user_profile.txt.bz2' USING PigStorage('\t') AS (uid:chararray,yob:chararray,gender:int,numtweets:int,tagids:chararray);

joined = JOIN train BY uid, profile BY uid;
```

Used compressed data
--------------------

As `pig` scripts will be translated into mapreduce jobs, it also inherits the capability of supporting splitable compressed formats such as `bzip2`. Using compressed data can on one hand save storage space on HDFS and on the other hand save network transfer bandwidth. We can directly provide the compressed file in `bz2` format, `pig` will automatically decompress the file on the fly. For example. 

```bash
$ bzip2 user_profile.txt 
$ ls 
user_profile.txt.bz2
$ hadoop fs -put user_profile.txt.bz2
$ pig -x mapreduce 
grunt> profiles = LOAD 'user_profile.txt.bz2' USING PigStorage('\t') AS (uid:chararray,yob:chararray,gender:int,numtweets:int,tagids:chararray);
grunt> uids = FOREACH profiles GENERATE uid; 
grunt> STORE uids INTO 'uids'; 
```

We first compressed the txt file into `.bz2` format, and copy the file from local to *HDFS*. Then, we use `pig` in mapreduce mode to process the data. 

From the grunt shell, we first load the data into a pig variable with defined schema. Then we get the *uid* of each record and store it into a file on *HDFS*. 

Pig UDFs
========

Basics
------

Evaluation and filtering functions using pig
--------------------------------------------

Writing pig load and store functions
------------------------------------

Using pig with python
=====================

Debugging and performance tuning of `pig latin` script
======================================================

Pig in the hadoop big data ecosystem
====================================
