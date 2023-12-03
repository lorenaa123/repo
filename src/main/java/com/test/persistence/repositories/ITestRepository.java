package com.test.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.persistence.entities.TestEntity;

@Repository
public interface ITestRepository extends JpaRepository<TestEntity, Long>{

}
