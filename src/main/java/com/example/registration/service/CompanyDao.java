package com.example.registration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Company;
import com.example.registration.repository.CompanyRepository;

@Service
public class CompanyDao {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
//	@Transactional
//	public Company registerCompany(Company company) {
//		company.setPassword(this.bCryptPasswordEncoder.encode(company.getPassword()));
//		return companyRepository.save(company);
//	}
	
	
	
	public List<Company> getAllCompany() {
		Company ss = new Company();
		
		List<Company> s = companyRepository.findAll();
		for(int i =0;i<s.size();i++){
			
			s.get(i).setPassword(this.bCryptPasswordEncoder.decode(s.get(i).getPassword()));
			
		}
		
		return s;
	}
	
	public Company getCompanyById(int companyId) {
		return companyRepository.findById(companyId).orElse(null);
	}
	
	public Company updateCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public void deleteCompany(int companyId) {
		companyRepository.deleteById(companyId);
	}
	
}
