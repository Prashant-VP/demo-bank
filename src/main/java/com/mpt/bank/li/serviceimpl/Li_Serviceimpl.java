package com.mpt.bank.li.serviceimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpt.bank.li.model.Life_insurance;
import com.mpt.bank.li.repository.Li_reposit;
import com.mpt.bank.li.service.Li_Service;

@Service
public class Li_Serviceimpl implements Li_Service {
	
	@Autowired
	Li_reposit lif;

	@Override
	public void saveLi(Life_insurance life) {
		lif.save(life);

	}

	@Override
	public Life_insurance updateLi(int policyNo, String plan, int ppt, int pt) {
		Optional<Life_insurance> olu = lif.findById(policyNo);
		if (olu != null) {
			Life_insurance up = olu.get();
			up.setPlan(plan);
			up.setPpt(ppt);
			up.setPt(pt);
			lif.save(up);
			return up;
		}
		return null;

	}

	@Override
	public void deleteLiById(int policyNo) {
		lif.deleteById(policyNo);

	}

	@Override
	public void deleteAll() {
		lif.deleteAll();

	}

	@Override
	public Optional<Life_insurance> getById(int policyNo) {
		Optional<Life_insurance> ge = lif.findById(policyNo);
		if (ge != null) {
			System.out.println(ge);
		}
		return lif.findById(policyNo);

	}

	@Override
	public void getAll() {
		List<Life_insurance> al = lif.findAll();
		Iterator<Life_insurance> it = al.iterator();
		while (it.hasNext()) {
			Life_insurance p = it.next();
			System.out.println(p);
		}

	}

}
