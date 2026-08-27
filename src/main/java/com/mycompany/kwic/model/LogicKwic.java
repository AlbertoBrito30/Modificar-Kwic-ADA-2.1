/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kwic.model;

import java.util.*;

/**
 *
 * @author betit
 */
public class LogicKwic {

    //variables de estructuras
    private final Scanner sc;
    private List<String> listaPalabras;

    //variables
    private boolean var = true;
    private String texto = "";

    public LogicKwic(Scanner sc, List<String> listaPalabras) {
        this.sc = sc;
        this.listaPalabras = listaPalabras;

    }

    private String pedirTexto() {
        System.out.println("Ingrese su palabra: ");
        return sc.nextLine();
    }

    private char pedirConfirmacion() {
        while (true) {
            try {
                System.out.println("Desea continuat? y/n");
                char aux = Character.toUpperCase(sc.nextLine().charAt(0));
                return aux;

            } catch (Exception e) {
                System.out.println("Upss. Ah ocurrido algo mal, intenta ingresar de nuevo una letra");
            }
        }
    }

    public List<String> listaPalabras() {
        do {
            texto = pedirTexto();
            listaPalabras.add(texto);

        } while (pedirConfirmacion() == 'Y');
        return listaPalabras;
    }

}
