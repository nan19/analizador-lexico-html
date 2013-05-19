/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import model.Analizador;
/**
 *
 * @author ArandiLopez
 */
public class AnalizadorControlador {
    
    Analizador yucalex;
    String rutaArchivo;
    
    public AnalizadorControlador(String ruta){
        rutaArchivo = ruta;
        yucalex = new Analizador(rutaArchivo);
    }
    
    
    
}
