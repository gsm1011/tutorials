import geojson
import json
from shapely.geometry import shape

o = {
    "coordinates": [[[23.314208, 37.768469], [24.039306, 37.768469], [24.039306, 38.214372], [23.314208, 38.214372], [23.314208, 37.768469]]],
    "type": "Polygon"
}
s = json.dumps(o)

g1 = geojson.loads(s)

g2 = shape(g1)

print g2.wkt
# print g2.wkb
