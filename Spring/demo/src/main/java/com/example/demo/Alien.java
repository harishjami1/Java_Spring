package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("laptop")
public class Alien {
    Alien(){
        System.out.println("Object Created");
    }
    private int aid;
    private String aname;
    @Autowired
    @Qualifier("LapObj")
    Laptop laptop;
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    
    public void set_aid(int aid){
        this.aid=aid;
    }
    public int get_aid(){
        return this.aid;
    }
    public void set_aname(String aname){
        this.aname=aname;
    }
    public String get_aname(){
        return this.aname;
    }
    public void show(){
        System.out.println("In show method");
        System.out.println(laptop.getRam());
    }
}
