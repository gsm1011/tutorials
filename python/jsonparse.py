import json
import pdb
from pprint import pprint

pdb.set_trace()

with open('data.json') as df:
    data = json.load(df)

pprint(data)
