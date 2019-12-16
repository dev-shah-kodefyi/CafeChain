package com.mindtree.cafe.service;

import java.util.List;

import com.mindtree.cafe.entity.Cafe;
import com.mindtree.cafe.entity.Manager;
import com.mindtree.cafe.exception.ServiceException;

public interface ManagerService {

	//Manager fetch(int mid);

	//Object getCafe(int mid);

	//Object getCafe(int mid);

	Object getManager(int mid);

	List<Cafe> fetch(int mid) throws ServiceException;

	

}
