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
    @Table(name="seansi")
    public class Seansi implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodzala")
        private int kodzala;
        
        @Column(name="kodfilma")
        private int kodfilma;
        
      
        @Column(name="film")
        private String film;
        
        @Column(name="kinoteatr")
        private String kinoteatr;
        
         @Column(name="zal")
        private String zal;
         
          @Column(name="data")
        private String data;
          
           @Column(name="time")
        private String time;
           
           @Column(name="costticket")
        private int costticket;

    public Seansi() {
    }

    public Seansi(int kodzala, int kodfilma, String film, String kinoteatr, String zal, String data, String time, int costticket) {
        this.kodzala = kodzala;
        this.kodfilma = kodfilma;
        this.film = film;
        this.kinoteatr = kinoteatr;
        this.zal = zal;
        this.data = data;
        this.time = time;
        this.costticket = costticket;
    }

    public void setKodzala(int kodzala) {
        this.kodzala = kodzala;
    }

    public void setKodfilma(int kodfilma) {
        this.kodfilma = kodfilma;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setKinoteatr(String kinoteatr) {
        this.kinoteatr = kinoteatr;
    }

    public void setZal(String zal) {
        this.zal = zal;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCostticket(int costticket) {
        this.costticket = costticket;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public int getKodzala() {
        return kodzala;
    }

    public int getKodfilma() {
        return kodfilma;
    }

    public String getFilm() {
        return film;
    }

    public String getKinoteatr() {
        return kinoteatr;
    }

    public String getZal() {
        return zal;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public int getCostticket() {
        return costticket;
    }

    

        @Override
        public String toString() {
            return String.format("(%d, %s,%s,%s,%d,%d,%s,%s)", this.kodzala, this.data,this.film,this.kinoteatr,this.kodfilma,this.costticket,this.time,this.zal);
        }
    }

