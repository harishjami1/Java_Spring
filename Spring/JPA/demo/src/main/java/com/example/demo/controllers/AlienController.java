package com.example.demo.controllers;


import java.util.List;
import java.util.Optional;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/home")
    public String home(){
        System.out.println("In Home");
        return "home.jsp";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        repo.save(alien);
        return "home.jsp";
    }
    @RequestMapping("/getAlien")
    public ModelAndView addAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("showalien.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien());
        mv.addObject(alien);
        System.out.println(repo.findByAid(aid).get(0).getAname());
        return mv;
    }
    @RequestMapping("/aliens")
    @ResponseBody
    public List<Alien> getAliens(){
        return repo.findAll();
    }
    @RequestMapping("/alien/{aid}")
    @ResponseBody //To send Data to client
    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
        System.out.println("AID is "+ aid);
        System.out.println(repo.findById(aid).get());
    return repo.findById(aid);}
}
