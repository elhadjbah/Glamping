package com.openinov.glamping.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Extras")
public class Extras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Extra;

    private String Nom;
    private String Description;
    private double Prix;


}

