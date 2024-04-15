package com.openinov.glamping.entity;

import jakarta.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "Destinations")
public class Destinations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Destination;

    private String Nom;
    private String Description;
    private String Pays;
    private String Ville;

    // Getters and setters
}

