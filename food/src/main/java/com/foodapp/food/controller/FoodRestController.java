package com.foodapp.food.controller;

import java.util.List;

import com.foodapp.food.dao.PlanRepository;
import com.foodapp.food.entities.Plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FoodRestController{

    @Autowired
    PlanRepository planRepo;

    @GetMapping("/plans")
    public List<Plan> getPlans(){
        return planRepo.findAll();
    }

    @PostMapping("/plans")
    public Plan savePlan(@RequestBody Plan p){
        return planRepo.save(p);
    }

    @PutMapping("/plans/{id}")
    public Plan updatePlanById(@PathVariable("id") String id){
        Plan p = planRepo.findById(id).get();
        p.setFood("xyz");
        p.setPlan("abc");
        planRepo.save(p);
        return p;
    }

    @DeleteMapping("/plans/{id}")
    public String deletePlanById(@PathVariable("id") String id){
        planRepo.deleteById(id);
        return "deleted";
    }

    
}