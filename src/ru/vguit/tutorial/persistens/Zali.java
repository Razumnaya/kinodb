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
    @Table(name="zali")
    public class Zali implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="kodzala")
        private int kodzala;
        
        @Column(name="kodkinot")
        private int kodkinot;
        
        @Column(name="namezala")
        private String namezala;
        
        @Column(name="kinot")
        private String kinot;
        
        @Column(name="vmest")
        private int vmest;

    public Zali() {
    }

    public Zali(int kodzala, int kodkinot, String namezala, String kinot, int vmest) {
        this.kodzala = kodzala;
        this.kodkinot = kodkinot;
        this.namezala = namezala;
        this.kinot = kinot;
        this.vmest = vmest;
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

    public int getKodkinot() {
        return kodkinot;
    }

    public String getNamezala() {
        return namezala;
    }

    public String getKinot() {
        return kinot;
    }

    public int getVmest() {
        return vmest;
    }

    public void setKodzala(int kodzala) {
        this.kodzala = kodzala;
    }

    public void setKodkinot(int kodkinot) {
        this.kodkinot = kodkinot;
    }

    public void setNamezala(String namezala) {
        this.namezala = namezala;
    }

    public void setKinot(String kinot) {
        this.kinot = kinot;
    }

    public void setVmest(int vmest) {
        this.vmest = vmest;
    }
    


        @Override
        public String toString() {
            return String.format("(%d, %d,%d,%s,%s)", this.kodzala, this.kodkinot,this.vmest,this.namezala,this.kinot);
        }
    }

