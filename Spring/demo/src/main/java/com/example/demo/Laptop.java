package com.example.demo;

import org.springframework.stereotype.Component;

@Component("LapObj")
public class Laptop {
     String brand;
     int ram ;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void compile(){
        System.out.println("Compiing in laptop");
    }
     
}
