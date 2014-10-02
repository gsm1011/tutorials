Install Pig
===========

- Download pig from the apache site
- Decompress the tar file into a directory such as /usr/local. 
- Create symbolic link for the folder with the `ln -s` command
```
  $ ln -s pig-x.y.z pig
```
- Configure the environment variables for the pig folder by putting the following into your `~/.bash_profile` file
```
  PIG_HOME=/usr/local/pig
  PATH=$PATH:$PIG_HOME/bin
  export PATH
```
- Pig will automatically identify your hadoop installation. The typical scenario is to install pig into a client/gateway machine which has hadoop client configured pointing to the correct *NameNode* and *Jobtracker*. 
- Test your pig installation by running the Grunt command tool from command line. 

```
  $ pig 
  grunt> 
```

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

`$ pig -x local -f wordcount.pig -param input=<small_input.txt>`

It is advisable to test the script locally on small input data first before running over large dataset on the `HDFS/MAPREDUCE` mode.

`$ pig -x mapreduce -f wordcount.pig -param input=<normal_input.txt>`

When we run `pig` script in `mapreduce` mode, the `pig` script will be parsed and translated into MapReduce job (**DAG**) and submitted to the hadoop cluster. 

Basic data operations using pig
===============================

Pig can load different formats of data for processing. The most common format is column oriented files/tables. We will illustrate how to use `pig` to load data, clean/filter data and aggregate the data based on certain attributes. For purpose of illustration, we download the kddcup 2012 data set from [here]{https://www.kddcup2012.org/c/kddcup2012-track1/data?track1.7z#_=_}. 

> In order to obtain the kddcup data, registration is required. 

