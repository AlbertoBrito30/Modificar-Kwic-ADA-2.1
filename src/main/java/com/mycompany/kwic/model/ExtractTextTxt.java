/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kwic.model;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

/**
 *
 * @author betit
 */
public class ExtractTextTxt {

    /**
     * Retorna las lineas de una lista anidadas, se tiene que usar
     * el retornarArchivo de la clase SelectTxtPBA1
     */
    public List<List<String>> retornarLienasTxt(File Archivo){
        List<List<String>> listaLineas = new ArrayList<>();
        
        if (Archivo == null){
            System.out.println("Operacion cancelada");
            return listaLineas;
        }
        
        try {
            List<String> auxLineas = Files.readAllLines(Archivo.toPath());
            
            for (String auxLinea : auxLineas) {
                if(!auxLinea.trim().isEmpty())
                listaLineas.add(Arrays.asList(auxLinea.trim().split("\\s+")));
            }
        } catch (IOException e) {
        }
        return listaLineas;
    }
    
    
    
}
