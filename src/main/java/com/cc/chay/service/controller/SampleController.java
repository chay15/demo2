package com.cc.chay.service.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @Author: cc
 * @since: 2020/5/8 0008
 */
@RestController
@RequestMapping("/cc")
@Api(value = "demo", tags = "演示") //swagger文档
public class SampleController {


    /**
     *
     * @Author: cc
     * @since: 2020/5/8 0008
     */
    @GetMapping(value = "/001")
    @ApiOperation(value = "test")
    @ResponseBody
    public String return01(){
        return "Hello world!";
    }


}