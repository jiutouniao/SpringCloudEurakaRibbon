package com.yck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 邵兵
 * @create 2017/4/15.
 * @blog http://blog.didispace.com
 */
@Api(tags = "移动app-负载均衡测试", description = "测试模块")
@RestController
public class DcController {
	// http://47.105.166.206:2102/find/test2
	// http://localhost:2102/find/test2
	// http://localhost:2102/swagger-ui.html#/

//	http://47.105.166.206:8081/swagger-ui.html#/
	@Autowired
    RestTemplate restTemplate;

    @GetMapping("/find/test2")
    @ApiOperation(value = "接口测试(created by shangshanshan)", httpMethod = "GET", notes = "负载均衡测试")
    public String dc() {
        return restTemplate.getForObject("http://english/find/test2", String.class);
    }
    
    
    @GetMapping("/find/test3")
    @ApiOperation(value = "接口测试3(created by shangshanshan)", httpMethod = "GET", notes = "负载均衡测试")
    public String dc2() {
        return "ssssssss";
    }


}
