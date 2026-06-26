package com.mpt.bank.li.service;

import java.util.Optional;

import com.mpt.bank.li.model.Life_insurance;

public interface Li_Service {
	
	public void saveLi(Life_insurance life);

	public Life_insurance updateLi(int policyNo, String plan, int ppt, int pt);

	public void deleteLiById(int policyNo);

	public void deleteAll();

	public Optional<Life_insurance> getById(int policyNo);

	public void getAll();

}
