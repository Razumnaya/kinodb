/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.persistens;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, которая будет маппитьсяв БД
 * 
 * @author a.pleshkanev
 */
    @Entity
    @Table(name="Kinoteatri")
    public class Kinoteatri implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodkinot")
        private int kodkinot;
        
        @Column(name="name")
        private String name;
        
        @Column(name="adress")
        private String adress;
        
        @Column(name="telephone")
        private String telephone;
        
        @Column(name="raion")
        private String raion;

    public Kinoteatri() {
    }

    public Kinoteatri(int kodkinot, String name, String adress, String telephone, String raion) {
        this.kodkinot = kodkinot;
        this.name = name;
        this.adress = adress;
        this.telephone = telephone;
        this.raion = raion;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public int getKodkinot() {
        return kodkinot;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getRaion() {
        return raion;
    }

    public void setKodkinot(int kodkinot) {
        this.kodkinot = kodkinot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setRaion(String raion) {
        this.raion = raion;
    }
        
       
    


        @Override
        public String toString() {
            return String.format("(%d, %s,%s,%s,%s)", this.kodkinot, this.name,this.adress,this.raion,this.telephone);
        }
    }

