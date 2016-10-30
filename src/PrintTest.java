
import java.io.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kelvin
 */
public class PrintTest {

    public static void main(String[] args) {
        //you();
        scanscan();
    }

    public static void you() {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileOutputStream("test.txt", true));
            out.print("hello, superman");
            out.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }

    public static void scanscan() {
        try {
            Scanner scan = new Scanner(new FileInputStream("test.txt"));
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }
}
