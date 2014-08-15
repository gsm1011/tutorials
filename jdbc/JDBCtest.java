import java.io.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;

class JDBCtest {
    
    public static void main(String[] args)   {
	Connection        conn = null;
	Statement         st = null;
	ResultSet         rs = null;
	ResultSetMetaData rmd = null;
	String            query = null;
   
	try{
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
	    System.out.println("Driver Registration Successful.");
	} catch (InstantiationException ie){
	    System.out.println("Class Instantiation Exception: " + ie);
	} catch (ClassNotFoundException cnf){
	    System.out.println("Class Not Found Exception: " + cnf);
	} catch (IllegalAccessException iae){
	    System.out.println("Illegal Access Exception: " + iae);
	}
  
	try {
	    conn = DriverManager.getConnection("jdbc:mysql://192.168.83.179:3306/sonar?user=sonar&password=sonar");
	    System.out.println("Connection to MySQL Database Successful");
	} catch (SQLException sqe1){
	    System.out.println("Caught SQL Exception: " + sqe1);
	}
	try {
	    st = conn.createStatement();
	    query = "SELECT * FROM mysql.user" ;
	    rs = st.executeQuery(query);
	    rmd = rs.getMetaData();
	    System.out.println("Meta (# of columns): "+rmd.getColumnCount());
         
	    while(rs.next()){
		String str1 = rs.getString("User");
		System.out.println("User = " + str1 );
		String str2 = rs.getString("Password");
		System.out.println("Password = " + str2 );
	    }
	} catch (SQLException sqe2){
	    System.out.println("Caught SQL Exception: " + sqe2);
	}
   
    }//end main

}//end class