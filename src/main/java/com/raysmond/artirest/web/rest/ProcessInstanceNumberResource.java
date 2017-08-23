package com.raysmond.artirest.web.rest;

import com.raysmond.artirest.domain.StatisticModel;

import com.raysmond.artirest.service.StateNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by xiaobai on 17-7-18.
 */
@RestController
@RequestMapping("/api")
public class ProcessInstanceNumberResource {

    @Autowired
    StateNumberService stateNumberService;

    @RequestMapping(value = "/processnumber",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,StatisticModel> getprocessNumber() throws Exception{
        System.out.println("111");
        System.out.println("stateNumberService:"+stateNumberService.getprocessNumber().size());
        return stateNumberService.getprocessNumber();
    }

}
