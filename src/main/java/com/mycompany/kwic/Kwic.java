/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kwic;

import java.util.*;

/**
 *
 * @author betit
 */
public class Kwic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> colaCircular = new ArrayDeque<>();
        List<String> listaPalabras = new ArrayList<>();
        List<String> listaKwic = new ArrayList<>();
        Kwic kwic = new Kwic();
        
        //obtenemos el texto
        String texto = pedirTexto(sc);
        
        /*convertimos el texto en una lista que esta misma nos servira para
        pasar a una cola circular y de ahi a otra lista del kwic
        */
        listaPalabras = Arrays.asList(texto.split(" "));
        
        //obtenemos la cola cicular para generar el kwic
        colaCircular = generadorColaCircular(listaPalabras);
        listaKwic = generadorKwic(colaCircular, listaPalabras);
        //kwic.mostrarResultados(listaKwic);
        
        mostrarResultados(listaKwic);
        
        
    }

    //Metodo para pedir el texto
    public static String pedirTexto(Scanner sc){
        System.out.print("Ingrese Texto: ");
        return sc.nextLine();
    }
    
    //metodo para generar cola circular
    public static Queue<String> generadorColaCircular(List<String> listaPalabras){
        Queue<String> cola = new ArrayDeque<>();
        
        for (String string : listaPalabras) {
            cola.offer(string);
        }
        
        return cola;
    }
    
    //metodo para generar el kwic
    public static List<String> generadorKwic(Queue<String> cola, List<String> listaPalabras){
        List<String> list = new ArrayList<>();
        int auxInt = cola.size();
        String auxText = "";
        
        for (int i = 0; i < auxInt; i++) {
            auxText = String.join(" ", cola);
            
            list.add(auxText);
            
            cola.offer(cola.poll());
        }
        
        Collections.sort(list);
        
        
        return list;
    }
    public static void mostrarResultados(List<String> listaKwic){
            System.out.println("Resultados");
        for (String string : listaKwic) {
            System.out.println(string);
        }
    }
    

    
}


