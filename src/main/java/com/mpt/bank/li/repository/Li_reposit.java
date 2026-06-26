package com.mpt.bank.li.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpt.bank.li.model.Life_insurance;

@Repository
public interface Li_reposit extends JpaRepository<Life_insurance, Integer>{

}
