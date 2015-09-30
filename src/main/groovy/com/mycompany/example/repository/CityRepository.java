package com.mycompany.example.repository;

import com.mycompany.example.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by Cesar Redondo on 9/29/2015.
 */
public interface CityRepository extends CrudRepository<City, Long>
{

    Page<City> findAll(Pageable pageable);

}