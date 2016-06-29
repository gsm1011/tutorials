import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.util.Bytes;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;


public class ScanTable{

    public static void main(String args[]) throws IOException{

	// Instantiating Configuration class
	Configuration config = HBaseConfiguration.create();

	// Instantiating HTable class
	HTable table = new HTable(config, "np_soil_sample");

	// Instantiating the Scan class
	Scan scan = new Scan();

	// Scanning the required columns
	scan.addColumn(Bytes.toBytes("f"), Bytes.toBytes("fieldId"));
	scan.addColumn(Bytes.toBytes("f"), Bytes.toBytes("growerName"));

	// Getting the scan result
	ResultScanner scanner = table.getScanner(scan);

	// Reading values from scan result
	for (Result result = scanner.next(); result != null; result = scanner.next()) {
	    byte[] fieldId = result.getValue(Bytes.toBytes("f"), Bytes.toBytes("fieldId")); 
	    byte[] growerName = result.getValue(Bytes.toBytes("f"), Bytes.toBytes("growerName")); 
	    System.out.println(fieldId.toString());
	    // System.out.println("Found row : " + result);
	}
	//closing the scanner
	scanner.close();
    }
}
