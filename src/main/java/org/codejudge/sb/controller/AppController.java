package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;
import org.codejudge.sb.model.Add;
import org.codejudge.sb.model.Addition;
import org.codejudge.sb.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AppController {

    @Autowired
    AppService appService;

    @PostMapping("/api/add")
    public Addition giveSummation(@RequestBody Add add){

        return appService.findSum(add.getNumber1(),add.getNumber2());

    }

    @ApiOperation("This is the hello world api")
    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }

}
