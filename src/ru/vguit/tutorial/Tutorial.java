/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial;

import ru.vguit.tutorial.db.DBDerby;
import ru.vguit.tutorial.persistens.Point;
import ru.vguit.tutorial.persistens.Zali;

/**
 * Главный класс программы, представляет собой точку входа в программу
 *
 * @author a.pleshkanev
 */
public class Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DBDerby db = new DBDerby();

        Zali zal = new Zali(23,23,"asda","asda",2);

        db.addZali(zal);

        //Point pDataBase = db.find(1L);

       // System.err.println("X = " + pDataBase.getX() + "Y = " + pDataBase.getY());
    }

}
