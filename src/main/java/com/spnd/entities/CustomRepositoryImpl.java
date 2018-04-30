package com.spnd.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import com.mongodb.WriteResult;

public class CustomRepositoryImpl implements CustomRepository {
	/*@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public int updateCustomer(String collectionName, String firstName) {
		Query query = new Query(Criteria.where("customer").is(collectionName));
		Update update = new Update();
        update.set("firstName", firstName);
        
        WriteResult result = mongoTemplate.updateFirst(query, update, Customer.class);

        if(result!=null)
            return result.getN();
        else
            return 0;
	}*/
}
