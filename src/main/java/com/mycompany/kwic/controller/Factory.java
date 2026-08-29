/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kwic.controller;

import com.mycompany.kwic.model.*;
import com.mycompany.kwic.view.SelectTxtPBA1;
import java.io.File;
import java.util.*;

/**
 *
 * @author betit
 */
public class Factory {
    
    public void launcher(){
   
        Scanner sc = new Scanner(System.in);
        LogicKwic logica = new LogicKwic();
        SelectTxtPBA1 selectorTxt = new SelectTxtPBA1();
        ExtractTextTxt extractTextTxt = new ExtractTextTxt();
        
        List<String> listaAImprimir = new ArrayList<>();
        
        String auxText;
        int auxInt = 0;

        do {
            auxInt = 0;
            
            System.out.println("Que desea hacer:"
                + "\n1.-Ingresar palabra por palabra"
                + "\n2.-Buscar .txt"
                + "\n3.-Salir");
            
            try {
                auxText = sc.nextLine();
                auxInt = Integer.parseInt(auxText);
            } catch (Exception e) {
                System.out.println("Por favor Seleccione entrada valida");
            }
            
            if(auxInt == 3){ System.out.println("Saliendo"); return;}
            
            switch (auxInt) {
                case 1:
                    List<List<String>> auxList = logica.pedirPalabras();
                    if(auxList ==  null){
                        System.out.println("No hay palabras ingresadas");
                        break;
                    }
                    listaAImprimir = logica.generadorColas(auxList);
                    logica.imprimirPalabras(listaAImprimir);
                    
                    break;
                case 2:
                    File archivo = selectorTxt.retornarArchivo();
                    List<List<String>> lineasTxt = extractTextTxt.retornarLienasTxt(archivo);

                    if (lineasTxt.isEmpty()) {
                        System.out.println("No se pudo leer el archivo");
                        break;
                    }

                    List<List<String>> lineasFiltradas = new ArrayList<>();
                    for (List<String> linea : lineasTxt) {
                        lineasFiltradas.add(logica.filtrarListaPalabras(linea));
                    }

                    listaAImprimir = logica.generadorColas(lineasFiltradas);
                    logica.imprimirPalabras(listaAImprimir);

                    break;
            }
            
        } while (true);

    
    
    }
    
    
    
}
