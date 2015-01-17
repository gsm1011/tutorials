-- This is pig version of word count. 

inputData = load '$input' as (line); 
words = foreach inputData generate flatten(TOKENIZE(line)) as word; 
grpd = group words by word; 
cnts = foreach grpd generate group, COUNT(words); 
-- dump cnts; 
store cnts into 'wordcount_pig_result'; 