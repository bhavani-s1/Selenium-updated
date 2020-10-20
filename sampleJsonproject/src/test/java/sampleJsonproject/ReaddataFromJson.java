package sampleJsonproject;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaddataFromJson {

	public static void main(String[] args) throws IOException, ParseException {
		
		//parse json file
		JSONParser parser= new JSONParser();
			
FileReader reader= new FileReader(".\\jsonfiles\\Empjson.json"); //load json file 
		
  Object javaobj=parser.parse(reader); // return java object 
  
  JSONObject empjsonobj=(JSONObject)(javaobj); //convert javaobject to Json object
		
 
  JSONArray empdetails=(JSONArray)empjsonobj.get("Empdetails");
  
  String arr[]=new String[empdetails.size()];
  for(int i=0;i<empdetails.size();i++) {
	  
	  JSONObject employees=(JSONObject)empdetails.get(i);
	  
	String Name =(String)employees.get("empname");
	String empid =(String)employees.get("Empid");
	String dept =(String)employees.get("Dept");
	//String salary =(String)employees.get("salary");
	  
	arr[i]=empid+"," +Name+"," +dept;
	
	System.out.println(arr[i]);
  
  
  
	} 
  
 
	}
}
