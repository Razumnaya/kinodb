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
    @Table(name="Filmi")
    public class Filmi implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodfilma")
        private int kodfilma;
        
        @Column(name="name")
        private String name;
        
        @Column(name="producer")
        private String producer;
        
        @Column(name="godvip")
        private int godvip;
        
        @Column(name="country")
        private String country;
        
         @Column(name="genre")
        private String genre;
         
          @Column(name="dlit")
        private String dlit;

    public Filmi(int kodfilma, String name, String producer, int godvip, String country, String genre, String dlit) {
        this.kodfilma = kodfilma;
        this.name = name;
        this.producer = producer;
        this.godvip = godvip;
        this.country = country;
        this.genre = genre;
        this.dlit = dlit;
    }

    public Filmi() {
    }

    public void setKodfilma(int kodfilma) {
        this.kodfilma = kodfilma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setGodvip(int godvip) {
        this.godvip = godvip;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDlit(String dlit) {
        this.dlit = dlit;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public int getKodfilma() {
        return kodfilma;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getGodvip() {
        return godvip;
    }

    public String getCountry() {
        return country;
    }

    public String getGenre() {
        return genre;
    }

    public String getDlit() {
        return dlit;
    }
    

        @Override
        public String toString() {
            return String.format("(%s, %s,%d,%d,%s,%s)", this.country, this.genre,this.godvip,this.kodfilma,this.name,this.producer);
        }
    }

