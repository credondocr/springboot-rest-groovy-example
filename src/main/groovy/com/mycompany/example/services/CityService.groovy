package com.mycompany.example.services

import com.mycompany.example.domain.City
import com.mycompany.example.repository.CityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by Cesar Redondo on 9/29/2015.
 */
@Service
class CityService {

    @Autowired
    CityRepository repository

    def City createCity( String name, String state){
        def city = new City()
        city.name = name
        city.state = state
        def cityModel = repository.save( city )
        return cityModel
    }

    def City findCityById( Long id ) {
        return repository.findOne( id )
    }
}
