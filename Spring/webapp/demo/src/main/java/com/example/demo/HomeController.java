package com.example.demo;

//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("home")
  //  @ResponseBody
  //Using servlets 
   // public String home(HttpServletRequest req){
  //  HttpSession session =req.getSession();
   // String name =req.getParameter("name");

   //Using httpsession
  // public String home(@RequestParam("name")String myname,HttpSession session){
  //  System.out.println("Home Controller");

   // session.setAttribute("name", myname);
   // return "home";

   //Using ModelView
  // public ModelAndView home(@RequestParam("name")String name){
    //   ModelAndView mv = new ModelAndView();
      // mv.addObject("name", name);
       //mv.setViewName("home");
        //return mv;
        public ModelAndView home(Alien alien){
            ModelAndView mv = new ModelAndView();
            mv.addObject("obj", alien);
            mv.setViewName("home");
            return mv;
        }
   
    }

