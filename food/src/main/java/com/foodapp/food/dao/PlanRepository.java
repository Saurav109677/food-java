package com.foodapp.food.dao;

import com.foodapp.food.entities.Plan;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanRepository extends MongoRepository<Plan,String>{
    
}
