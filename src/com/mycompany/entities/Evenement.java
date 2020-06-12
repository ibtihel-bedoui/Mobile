/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

/**
 *
 * @author pc-ibtihel
 */
public class Evenement {
    
    protected int id;
    protected String libelle;
    protected String description;
    protected String datedebut;
    protected String datefin;
    protected String nomImage;

    public Evenement() {
    }

    public Evenement(int id, String libelle, String description, String datedebut, String datefin, String nomImage) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.nomImage = nomImage;
    }

    public Evenement(String libelle, String description, String datedebut, String datefin, String nomImage) {
        this.libelle = libelle;
        this.description = description;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.nomImage = nomImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    @Override
    public String toString() {
        return "Evenement{" + "id=" + id + ", libelle=" + libelle + ", description=" + description + ", datedebut=" + datedebut + ", datefin=" + datefin + ", nomImage=" + nomImage + '}';
    }
    
    
    
}
