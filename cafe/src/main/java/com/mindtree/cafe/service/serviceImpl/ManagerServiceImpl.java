package com.mindtree.cafe.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mindtree.cafe.dto.CafeDto;
import com.mindtree.cafe.dto.ManagerDto;
import com.mindtree.cafe.entity.Cafe;
import com.mindtree.cafe.entity.Manager;
import com.mindtree.cafe.exception.ManagerNotFoundException;
import com.mindtree.cafe.exception.ServiceException;
import com.mindtree.cafe.repositary.CafeRepositary;
import com.mindtree.cafe.repositary.ManagerRepositary;
import com.mindtree.cafe.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerRepositary managerRepositary;
	@Autowired
	CafeRepositary cafeRepositary;
	
	@Autowired
	ModelMapper mapper;
	
	
//	@Bean
//	public ModelMapper Mapper() {
//		return new ModelMapper();
//	}


	@Override
	public Object getManager(int mid) {
		
		return managerRepositary.findAllByMid(mid);
		
	}


	@Override
	public List<Cafe> fetch(int mid) throws ServiceException {
		
		if(!(managerRepositary.existsByMid(mid)))
		{
		
		try {
			throw new ManagerNotFoundException("No such Manager");
		}
    	catch(ManagerNotFoundException e)
    	  {
    		
	  	throw new ServiceException(e.getMessage());
	   }
	}
	
		else
		{
			Manager manager=managerRepositary.findByMid(mid);
			
			List<Cafe>list1=new ArrayList<>();
			return manager.getCafelist();
		
	
		//return list1;
}
		//return null;
}}


