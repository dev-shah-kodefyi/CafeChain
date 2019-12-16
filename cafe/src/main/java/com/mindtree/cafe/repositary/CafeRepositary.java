package com.mindtree.cafe.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.cafe.entity.Cafe;
import com.mindtree.cafe.entity.Manager;

@Repository
public interface CafeRepositary extends JpaRepository<Cafe, Integer> {



}
