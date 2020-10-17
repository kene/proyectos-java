package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.dao.TeamDao;
import demo.domain.Team;

@RestController
public class WhateverIWant {

	@Autowired
	private TeamDao teamDao;
	
	@RequestMapping("/hi/{name}")
	public Team hiThere(@PathVariable String name) {
		return teamDao.findByName(name);
	}
	

	
	
}
