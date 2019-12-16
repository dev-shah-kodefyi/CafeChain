package com.mindtree.cafe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.cafe.dto.CafeDto;
import com.mindtree.cafe.dto.ManagerDto;
import com.mindtree.cafe.entity.Cafe;
import com.mindtree.cafe.entity.Manager;
import com.mindtree.cafe.exception.CafeApplication;
import com.mindtree.cafe.exception.ServiceException;
import com.mindtree.cafe.service.CafeService;
import com.mindtree.cafe.service.ManagerService;

@RestController
public class AppRunner {
	@Autowired
	CafeService cafeService;

	@Autowired
	ManagerService managerService;

	
	
	public ResponseEntity<CafeDto> insertCafe(@RequestBody CafeDto cafe) {
		CafeDto cafedto1 = cafeService.insert(cafe);

		return ResponseEntity.status(HttpStatus.OK).body(cafedto1);
	}

	@GetMapping("/getCafe/{mid}")
	public List <Cafe> getCafe(@PathVariable("mid") int mid) throws CafeApplication {
		
		try {
			
		
		Manager manager=new Manager();
	
		return managerService.fetch(mid);
	}
		catch(ServiceException e)
		{
			throw new CafeApplication(e.getMessage());
		}

//@GetMapping("/getCafe/{mid}")
//public ResponseEntity<Object> fetchValue(@PathVariable("mid")int mid)
//{
//	
//	//return ResponseEntity.status(HttpStatus.OK).body(cafeService.getCafe(mid));
//	
//	return ResponseEntity.status(HttpStatus.OK).body(managerService.getCafe(mid));
//	
//}
//	@GetMapping("/getCafe/{mid}")
//	
//	public ResponseEntity<ManagerDto> fetchValue(@PathVariable("mid") int mid) {
//		
//		//CafeDto cafe=managerService.getCafe(mid);
//		
//		return ResponseEntity.status(HttpStatus.OK).body(managerService.getCafe(mid));
//
//	}
//	
	
	
	}
}