package com.mycompany.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Cesar Redondo on 9/29/2015.
 */
@Entity
public class City implements Serializable
{

    @Id
    @GeneratedValue( generator = "idGenerator", strategy = GenerationType.SEQUENCE )
    @SequenceGenerator( name = "idGenerator", sequenceName = "public.application_seq", allocationSize = 1 )
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String state;

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }


}
