package com.openinov.glamping.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private String ID_Client;

    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Email;
    private String Telephone;

}

