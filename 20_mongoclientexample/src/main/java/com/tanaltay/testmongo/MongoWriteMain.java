package com.tanaltay.testmongo;


import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoWriteMain {

	
	public static void main(String[] args) {
		
		System.out.println("Hello maven");
		
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://admin:pass@localhost:27017"));
		
		MongoDatabase db= mongoClient.getDatabase("example_customers");
		
		
		
		
		Document person1 = new Document()
                .append("name", "Jo Bloggs")
                .append("address", new BasicDBObject("street", "123 Fake St")
                                             .append("city", "Faketon")
                                             .append("state", "MA")
                                             .append("zip", 12345));
		
		Document person2 = new Document()
                .append("name", "Noo Harris")
                .append("address", new BasicDBObject("street", "1123 Test St")
                                             .append("city", "Faketon")
                                             .append("state", "MA")
                                             .append("zip", 12345));
		
		MongoCollection<Document> collection = db.getCollection("people");
		
		collection.insertOne(person1);
		collection.insertOne(person2);
		
		mongoClient.close();
		
		
		
	}
	
	
}
