/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kwic.view;

import javax.swing.JFileChooser;
import javax.swing.JFileChooser.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author betit
 */
public class SelectTxtPBA1 {

    public File retornarArchivo() {
        JFileChooser seleccionadorArchivo = new JFileChooser();
        
        //creacion del filtro
        FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter(".txt", "txt");
        
        //aplicar filtro
        seleccionadorArchivo.setFileFilter(filtroTxt);
        seleccionadorArchivo.setAcceptAllFileFilterUsed(false);

        int opcion = seleccionadorArchivo.showOpenDialog(null);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            return  seleccionadorArchivo.getSelectedFile();

        }

        return null;

    }

}

