package com.main.board.apps.test.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.board.apps.test.dtos.TestDto.VariableRequest;
import com.main.board.apps.test.services.TestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/test")
@Api(tags = "Test")
public class TestController {

    private final TestService testService;

    @ApiOperation(value = "hi")
    @GetMapping(value = "/test")
    public ResponseEntity<Integer> getTestResponse(VariableRequest variableRequest) {

        return ResponseEntity.ok(testService.getTestResponse(variableRequest));
    }


}