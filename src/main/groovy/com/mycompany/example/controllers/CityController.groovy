package com.mycompany.example.controllers

import com.mycompany.example.models.City
import com.mycompany.example.services.CityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/city")
def class CityController {

    @Autowired
    def CityService cityService;

    @RequestMapping( method = RequestMethod.POST, produces = "application/json", consumes = "application/json" )
    @ResponseBody
    def  greeting(@RequestBody City city) {
        def response = [:]
        response.data = cityService.createCity( city.name, city.state)
        return response
    }

    @RequestMapping( method = RequestMethod.GET, produces = "application/json" )
    def getCity(@RequestParam Long id) {
        def response = [:]
        response.data = cityService.findCityById( id )
        return response
    }
}