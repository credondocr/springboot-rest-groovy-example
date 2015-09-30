package com.mycompany.example.models

/**
 * Created by Cesar Redondo on 9/29/2015.
 */
class City {

    def String name
    def String state

    def toCityModel( com.mycompany.example.domain.City city  ) {

        this.name = city.name
        this.state = city.state

    }
}
