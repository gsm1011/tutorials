import shapefile
import sys

filename = sys.argv[1]

if filename == '':
    print "Usage: python shape-to-geojson.py <shapefile>"
    exit (1)

basename = filename[0:filename.index('.')]
print 'basename is: ', basename

reader = shapefile.Reader(filename)
fields = reader.fields[1:]
field_names = [field[0] for field in fields]
buffer = []

for sr in reader.shapeRecords():
    # print field_names
    # print zip(sr.record, field_names)
    atr = dict(zip(field_names, sr.record))
    geom = sr.shape.__geo_interface__
    buffer.append(dict(type = "Feature", id = basename, geometry = geom, properties = atr))

crs = { "properties": {"name": "EPSG:4326" }, "type": "name" }

from json import dumps
geojson = open(basename + ".json", "w")
geojson.write(dumps({"crs": crs, "type": "FeatureCollection", "features": buffer}, indent = 2) + "\n")
geojson.close()
