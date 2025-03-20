package com.tandan.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tandan.springbootmvc.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
@Controller
public class HomeController
{
	  @Autowired
	    AlienRepo repo;

	    @ModelAttribute
	    public void modelData(Model m) {
	        m.addAttribute("name", "Aliens");
	    }
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
//	@RequestMapping("add")
//	public String add(@RequestParam("number1")int i,@RequestParam("number2") int j , Model m)
//	{
//		int number3 = i+j;
//		m.addAttribute("number3",number3);
//		return "result";
//	}
	
	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("aid")int aid,@RequestParam("aname") String aname , Model m)
	{
		Alien a = new Alien();
		a.setAid(aid);
		a.setAname(aname);
		m.addAttribute("alien",a);
		return "result";
	}
	
	 @GetMapping("getAliens")
	    public String getAliens(Model m) {
	       // List<Alien> aliens = Arrays.asList(new Alien("Anand", 101), new Alien("Soni", 103));
	        m.addAttribute("result", repo.findAll());
	        return "showAliens";
	    }
	    @GetMapping("getAlien")
	    public String getAlien(@RequestParam int aid, Model m){
	        m.addAttribute("result", repo.getOne(aid));
	        return "showAliens";
	    }

	    @GetMapping("getAlienByName")
	    public String getAlienByName(@RequestParam String aname, Model m){
	        m.addAttribute("result", repo.find(aname));
	        return "showAliens";
	    }

	    /*@PostMapping(value = "addAlien")
	    public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m) {
	        Alien a = new Alien();
	        a.setAid(aid);
	        a.setAname(aname);
	        m.addAttribute("alien", a);
	        return "result";
	    }*/
	    @PostMapping(value = "addAlien")
	    public String addAlien(@ModelAttribute Alien a) {
	        repo.save(a);
	        return "result";
	    }
}