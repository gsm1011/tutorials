-- This script show how to load data and do filtering and other common operations. 

inputData = load 'rec_log_train.txt' using PigStorage('\t') as (uid:chararray, itemid:chararray, result:int, timestamp:chararray); 
accepted = filter inputData by (result == 1); 
notaccepted = filter inputData by (result == -1); 
-- store accepted into 'accepted'; 
-- store notaccepted into 'notaccepted'; 

-- sorting based on uid. 
accepted_sorted = ORDER accepted BY uid ASC PARALLEL 5; 
-- STORE accepted_sorted INTO 'accepted_sorted'; 

-- table job with other data set. 
-- load the user data. 
-- pig data types: int, long, float, double, chararray, bytearray. 
-- complex data types: bag, tuple, map, null. 
userData = LOAD 'user_profile.txt' USING PigStorage('\t') AS (uid:chararray, yob:chararray, gender:chararray, numtweets:int, tagids:chararray); 
