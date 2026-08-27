/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kwic;

import java.util.*;

/**
 *
 * @author betit
 */
public class KwicLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Texto");
        String texto = sc.nextLine();
        
        for (String palabra : texto.split(" ")) {
            lista.add(palabra);
            
        }
        
        
        
        
        
        
    }
    
}
