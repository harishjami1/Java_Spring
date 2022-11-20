package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Alien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//public interface AlienRepo extends CrudRepository<Alien,Integer>{
    //For JSon Response Use JPA repository
   public interface AlienRepo extends JpaRepository<Alien,Integer>{
    List<Alien> findByAid(int aid);
    @Query("from Alien where aname=?1 order by aid")
    List<Alien> findByAnameSorted(String aname);
}
