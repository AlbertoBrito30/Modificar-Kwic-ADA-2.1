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
    
    //letras a ignorar
    private final Set<String> palabrasIgnoradas = new HashSet<>(Arrays.asList("de", "el", "la", "los", "las", "a", "en", "y"));

    //variables de estructuras
    private final Scanner sc;
    private List<List<String>> listaPalabras;

    //variables
    private String texto = "";

    public LogicKwic(Scanner sc, List<List<String>> listaPalabras) {
        this.sc = sc;
        this.listaPalabras = listaPalabras;

    }

    private String pedirTexto() {
        System.out.println("Ingrese su palabra: ");
        return sc.nextLine();
    }

    private boolean pedirConfirmacion() {
        char charAux;
        while (true) {
            try {
                System.out.println("Desea continuat? y/n");
                charAux = Character.toUpperCase(sc.nextLine().charAt(0));
                
                if(charAux == 'Y' || charAux == 'N') return charAux == 'Y';
                
                System.out.println("Intente de nuevo");

            } catch (Exception e) {
                System.out.println("Upss. Ah ocurrido algo mal, intenta ingresar de nuevo una letra");
            }
        }
    }
    
    private List<String> filtrarListaPalabras(List<String> auxList){
        List<String> auxTexto;
        
        auxTexto = auxList.stream()
                .filter(actual -> !palabrasIgnoradas.contains(actual.toLowerCase()))
                .toList();
        
        return auxTexto;
    }

    private List<List<String>> listaPalabras() {
        
        List<String> auxTexto;
        
        do {
            texto = pedirTexto();
            auxTexto = Arrays.asList(texto.trim().split("\\s+"));
            listaPalabras.add(filtrarListaPalabras(auxTexto));
            

        } while (pedirConfirmacion());
        return listaPalabras;
    }
    
    public List<String> generadorColas(List<List<String>> lista){
        Queue<String> colita = new ArrayDeque<>();
        String auxText = "";
        
        for (List<String> listaPalabras : lista) {
            for (int i = 0; i < listaPalabras.size(); i++) {
                auxText = listaPalabras.get(i);
                colita.offer(auxText);
                
            }
            
        }
        
        
        return auxList;
    }
    

}
