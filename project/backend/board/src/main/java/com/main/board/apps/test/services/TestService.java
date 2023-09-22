package com.main.board.apps.test.services;

import org.springframework.stereotype.Service;

import com.main.board.apps.test.dtos.TestDto.VariableRequest;

@Service
public class TestService {

    /*
     * [API Service]x+y 반환
     */
    public Integer getTestResponse(VariableRequest variableRequest){
        return sum(variableRequest.getX(),variableRequest.getY());
    }

    /*
     * [Function] return x+y
     */
    public Integer sum(int x, int y){
        return x+y;
    }
    
}
