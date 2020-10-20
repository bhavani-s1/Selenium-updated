package sampleJsonproject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	
	{
	//first user
		
	JSONObject userDetails = new JSONObject();
    userDetails.put("id", 100);
    userDetails.put("firstName", "Ramesh");
    userDetails.put("lastName", "Fadatare");
    userDetails.put("userName", "Ramesh Fadatare");
    userDetails.put("email", "ramesh@gmail.com");


    //Second user
    JSONObject userDetails1 = new JSONObject();
    userDetails1.put("id", 101);
    userDetails1.put("firstName", "John");
    userDetails1.put("lastName", "Cena");
    userDetails1.put("userName", "John Cena");
    userDetails1.put("email", "john@gmail.com");

    // Third User
    JSONObject userDetails2 = new JSONObject();
    userDetails2.put("id", 102);
    userDetails2.put("firstName", "Tony");
    userDetails2.put("lastName", "stark");
    userDetails2.put("userName", "Tony stark");
    userDetails2.put("email", "tony@gmail.com");

    //Add employees to list
    JSONArray userList = new JSONArray();
    userList.add(userDetails);
    userList.add(userDetails1);
    userList.add(userDetails2);

    //Write JSON file
    try (FileWriter file = new FileWriter("users.json")) {

    	
        file.write(userList.toJSONString());
        
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}