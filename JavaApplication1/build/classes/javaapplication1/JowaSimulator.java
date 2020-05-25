/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @rocel
 */
public class JowaSimulator {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Boy or Girl? ");
        System.out.println("What's your Name? ");
        String name = input.nextLine();
        clearScreen();
        System.out.println("Good Morning, mi Amore.");
        System.out.println("What do you want me to do?");
        System.out.println("[A] Eat \n[B] Sleep \n[C] Bonding");
       
        
    }
    static void clearScreen() throws IOException, InterruptedException {  
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } 
    
    
}
