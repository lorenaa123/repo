package com.test.services.imp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.persistence.entities.TestEntity;
import com.test.persistence.repositories.ITestRepository;
import com.test.services.ITestService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestService implements ITestService {

	private final ITestRepository testRepository;

	@Transactional(readOnly = true)
	@Override
	public List<TestEntity> getAll() {
		return this.testRepository.findAll();
	}

}
