-- This is a pig join example. 
train = LOAD 'rec_log_train.txt.bz2' USING PigStorage('\t') AS (uid:chararray,iid:chararray,result:int,timestamp:chararray); 
profile = LOAD 'user_profile.txt.bz2' USING PigStorage('\t') AS (uid:chararray,yob:chararray,gender:int,numtweets:int,tagids:chararray);

joined = JOIN train BY uid, profile BY uid; 

STORE joined INTO 'joined'; 