package com.mindtree.cafe.service.serviceImpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mindtree.cafe.dto.CafeDto;
import com.mindtree.cafe.entity.Cafe;
import com.mindtree.cafe.entity.Manager;
import com.mindtree.cafe.repositary.CafeRepositary;
import com.mindtree.cafe.repositary.ManagerRepositary;
import com.mindtree.cafe.service.CafeService;

@Service
public class CafeServiceImpl implements CafeService {

	@Autowired
	CafeRepositary cafeRepositary;

	
	@Autowired
	ManagerRepositary managerRepositary;
	
	@Autowired
	ModelMapper mapper;
	
	
	@Bean
	public ModelMapper Mapper() {
		return new ModelMapper();

	}

	
//	@Override
//	public String insert1(Cafe cafe) {
//	Cafe message=cafeRepositary.save(cafe);
//	Manager messag=managerRepositary.save(cafe.getManager());
//	
//		return "inserted";
//	}
	
	

	@Override
	public CafeDto insert(CafeDto cafedto) {
		List<Cafe> cafeList= new ArrayList<>();
		Manager managerentity = new Manager();
		Cafe cafeentity=new Cafe();
		
		cafeentity.setId(cafedto.getId());
		cafeentity.setName(cafedto.getName());
		cafeentity.setRevenue(cafedto.getRevenue());
		
		managerentity.setMid(cafedto.getManager().getMid());
		managerentity.setName(cafedto.getManager().getName());
		managerentity.setSalary(cafedto.getManager().getSalary());
		
		cafeList.add(cafeentity);
		managerentity.setCafelist(cafeList);
		cafeentity.setManager(managerentity);
		
		cafeRepositary.save(cafeentity);
			
		return mapper.map(cafeentity, CafeDto.class);
	}

}