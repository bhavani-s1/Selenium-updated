package sampleJsonproject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteToEmpjson {

	
		
		@SuppressWarnings("unchecked")
		public static void main(String[] args) 
		
		{
		//first user
			
		JSONObject userDetails = new JSONObject();
	    userDetails.put("Empid", 100);
	    userDetails.put("empname", "Ramesh");
	    userDetails.put("Dept", "IT");
	    

	    //Second user
	    JSONObject userDetails1 = new JSONObject();
	    userDetails1.put("Empid", 101);
	    userDetails1.put("empname", "John");
	    userDetails1.put("Dept", "Accounts");
	    
	    // Third User
	    JSONObject userDetails2 = new JSONObject();
	    userDetails2.put("Empid", 102);
	    userDetails2.put("empname", "Tony");
	    userDetails2.put("Dept", "Finance");
	 
	    //Add employees to list
	    JSONArray userList = new JSONArray();
	    userList.add(userDetails);
	    userList.add(userDetails1);
	    userList.add(userDetails2);
	    userDetails2.put("empname","Bhavani");
	    userDetails2.put("Empid",818);
	    System.out.println("changed name as bhavani");
	    //Write JSON file
	    try (FileWriter file = new FileWriter("Empjson.json")) {

	        file.write(userList.toJSONString());
	        
	        
	        file.flush();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
		

	}


