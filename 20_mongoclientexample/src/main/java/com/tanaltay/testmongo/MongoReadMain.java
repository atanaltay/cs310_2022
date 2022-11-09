package com.tanaltay.testmongo;

import org.bson.BsonDocument;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoReadMain {

	
	public static void main(String[] args) {
		
		System.out.println("Hello maven");
		
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://admin:pass@localhost:27017"));
		
		MongoDatabase db= mongoClient.getDatabase("example_customers");
		
		
		BsonDocument doc = BsonDocument.parse("{name:{$regex:'jo',$options:'i'}}");
		
		MongoCollection<Document> collection = db.getCollection("people");
		

		FindIterable<Document> items =  collection.find(doc);
		
		items.cursor().forEachRemaining(item->{
			System.out.println(item.get("name"));
		});
		
		mongoClient.close();
		
		
		
	}
	
	
}
