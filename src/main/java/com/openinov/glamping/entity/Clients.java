package com.openinov.glamping.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Client;

    private String Nom;
    private String Prénom;
    private String Adresse;
    private String Email;
    private String Téléphone;

}

