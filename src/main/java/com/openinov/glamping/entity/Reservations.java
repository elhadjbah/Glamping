package com.openinov.glamping.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservations")
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Reservation;

    @ManyToOne
    @JoinColumn(name = "ID_Client")
    private Clients client;

    @ManyToOne
    @JoinColumn(name = "ID_Destination")
    private Destinations destination;

    @Temporal(TemporalType.DATE)
    private Date Date_Début;

    @Temporal(TemporalType.DATE)
    private Date Date_Fin;

    private int Nombre_Voyageurs;

}

