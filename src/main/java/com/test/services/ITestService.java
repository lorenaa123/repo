package com.test.services;

import java.util.List;

import com.test.persistence.entities.TestEntity;

public interface ITestService {

	/**
	 * Method to get test entity list from database
	 * 
	 * @return List of TestEntity
	 */
	List<TestEntity> getAll();

}
