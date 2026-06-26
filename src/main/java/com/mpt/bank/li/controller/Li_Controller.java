package com.mpt.bank.li.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpt.bank.li.model.Life_insurance;
import com.mpt.bank.li.serviceimpl.Li_Serviceimpl;

@RestController
@RequestMapping("/api/Life_insurance")
public class Li_Controller {
	
	@Autowired
	Li_Serviceimpl lifes;

	@PostMapping
	public void saveLi(@RequestBody Life_insurance life) {
		lifes.saveLi(life);
	}

	@PutMapping
	public void updateLi(@RequestParam("policyNo") int policyNo, @RequestParam("plan") String plan,
			@RequestParam("ppt") int ppt, @RequestParam("pt") int pt) {
		lifes.updateLi(policyNo, plan, ppt, pt);
	}

	@DeleteMapping("delete")
	public void deleteLiById(@RequestParam("policyNo") int policyNo) {
		lifes.deleteLiById(policyNo);
	}

	@DeleteMapping
	public void deleteAll() {
		lifes.deleteAll();
	}

	@GetMapping("/{policyNo}")
	public void getById(@PathVariable("policyNo") int policyNo) {
		lifes.getById(policyNo);
	}

	@GetMapping
	public void getAll() {
		lifes.getAll();
		
	}

}
