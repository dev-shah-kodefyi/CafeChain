package com.mindtree.cafe.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.cafe.dto.ManagerDto;
import com.mindtree.cafe.entity.Manager;

@Repository
public interface ManagerRepositary extends JpaRepository<Manager, Integer> {

	Object findAllByMid(int mid);

	Manager findByMid(int mid);

	boolean existsByMid(int mid);

  

}
