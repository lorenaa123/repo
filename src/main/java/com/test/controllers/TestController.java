package com.test.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.configuration.http.ResponseMessage;
import com.test.configuration.http.ResponseMessageBuilder;
import com.test.persistence.entities.TestEntity;
import com.test.services.ITestService;
import com.test.util.messages.MessagesEnum;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/")
@RestController
public class TestController {

	private final ITestService testService;

	@GetMapping
	ResponseEntity<ResponseMessage<List<TestEntity>>> getAll() {
		return ResponseMessageBuilder.buildResponse(this.testService.getAll(), MessagesEnum.SUCCESSFULLY_OPERATION);
	}
}
