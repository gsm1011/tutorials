# An example of python multithread processing using thread pool and map function.

# from multiprocessing import Pool
import time
import urllib2
from multiprocessing.dummy import Pool as ThreadPool

def printOut(url):
    print 'enter program'
    time.sleep(10)
    print url
    print 'exiting.'
    
    return 0
    
pool = ThreadPool(4)

urls = [
    'http://www.python.org', 
    'http://www.python.org/about/',
    'http://www.python.org/doc/']

results = pool.map(printOut, urls)

print results
pool.close()
pool.join()
    
    
