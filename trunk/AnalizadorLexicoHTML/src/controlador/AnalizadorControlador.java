/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JTextArea;
import model.Analizador;
/**
 *
 * @author ArandiLopez
 */
public class AnalizadorControlador {
    
    Analizador yucalex;
    String rutaArchivo;
    
    public AnalizadorControlador(){
        yucalex = new Analizador();
    }
    
    public void setRutaArchivo(String ruta){
        this.rutaArchivo = ruta;
        yucalex.setRuta(rutaArchivo);
    }
    
    public void analizar(JTextArea textArea) throws FileNotFoundException, IOException{
        textArea.setText(yucalex.analizarLex());
    }
    
    public void imprimirLex(String ruta, String contenido) throws IOException{
        yucalex.imprimirArchivo(ruta, contenido);
    }
    
    public void abrirArchivo(JTextArea textArea) throws FileNotFoundException, IOException{
        textArea.setText(yucalex.leerArchivo());
    }
    
    
}
