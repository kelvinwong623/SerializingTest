/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelvin
 */
import java.io.*;

public class Tester {

    public static void main(String[] args) {
        //poopoo();
        exporter();
    }

    public static void inputter() {
        Serial serial = new Serial();
        serial.a = 2;
        serial.b = 3;
        serial.c = "Poo";
        serial.d = true;
        serial.e = 3.4;
        try {
            FileOutputStream doo = new FileOutputStream("serial.ser");
            ObjectOutputStream poo;
            poo = new ObjectOutputStream(doo);
            poo.writeObject(serial);
            poo.close();
            doo.close();
            System.out.println("Done");
        } catch (IOException ex) {
            System.out.println("Can't fint it!!!");
        }
    }

    public static void exporter() {
        Serial serial = null;
        try {
            FileInputStream too = new FileInputStream("serial.ser");
            ObjectInputStream soo;
            soo = new ObjectInputStream(too);
            serial = (Serial) soo.readObject();
            soo.close();
            too.close();
        } catch (IOException ex) {
            System.out.println("Nope");
        } catch (ClassNotFoundException ex) {
            System.out.println("Nope");
        }
        System.out.println(serial.a);
        System.out.println(serial.b);
        System.out.println(serial.c);
        System.out.println(serial.d);
        System.out.println(serial.e);
    }
}
