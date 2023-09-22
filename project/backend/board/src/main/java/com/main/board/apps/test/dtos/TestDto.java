package com.main.board.apps.test.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TestDto {

    @Data
    @ApiModel("TestDto_VariableRequest")
    public static class VariableRequest{

        @ApiModelProperty(value = "변수 x")
        private int x;

        @ApiModelProperty(value = "변수 y")
        private int y;

    }
    
}
