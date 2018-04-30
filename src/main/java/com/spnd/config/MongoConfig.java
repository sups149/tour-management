package com.spnd.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
	
	@Value("${server.dbName}")
	String dbName;

	@Value("${spring.data.mongodb.uri}")
	String mongoURI;
	
	@Override
	protected String getDatabaseName() {
		return dbName;
	}

	@Override
	public Mongo mongo() throws Exception {
		String[] addresses = mongoURI.split(",");
		List<ServerAddress> serverAddressList = new ArrayList<ServerAddress>();
		
		for(String address : addresses) {
			String[] addressPart = address.split(":");
			serverAddressList.add(new ServerAddress(addressPart[0], Integer.parseInt(addressPart[1])));
		}
		
		return new MongoClient(serverAddressList);
	}
	
	

}
