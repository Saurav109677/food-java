package com.foodapp.food.entities;

import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;

public class Plan {
    
    @Id
    String id;
    String plan;
    String food;

    
    public Plan() {
    }
    
    public Plan(String plan, String food) {
        this.plan = plan;
        this.food = food;
    }
   
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Plan [food=" + food + ", id=" + id + ", plan=" + plan + "]";
    }

    

    

    

  

   

    
}

