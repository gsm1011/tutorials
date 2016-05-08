import shapefile

reader = shapefile.Reader("./test.shp")
fields = reader.fields[1:]
field_names = [fields[0] for field in fields]

buffer = []

for sr in reader.shapeRecords():
    # print field_names
    print zip(sr.record, field_names)
    atr = dict(zip(sr.record, field_names))
    geom = sr.shape.__geo_interface__
    buffer.append(dict(type = "Feature", geometry = geom, properties = atr))

from json import dumps
geojson = open("shape-to-geojson.json", "w")
geojson.write(dumps({"type": "FeatureCollection", "features": buffer}, indent = 2) + "\n")
geojson.close()
