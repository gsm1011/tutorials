import geojson
import shapely.wkt

s = '''POLYGON ((23.314208 37.768469, 24.039306 37.768469, 24.039306 38.214372, 23.314208 38.214372, 23.314208 37.768469))'''

g1 = shapely.wkt.loads(s)
g2 = geojson.Feature(geometry=g1, properties={})
print g2
