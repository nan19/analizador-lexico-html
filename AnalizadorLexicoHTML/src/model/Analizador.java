package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import model.Etiquetas;




public class Analizador {
    
   private FileReader fr = null;
   private BufferedReader br = null;
   private String contenido = "";
   private String ruta;
   StringTokenizer token;
   private Etiquetas et;
   
   
   public Analizador (String ruta) {
       this.ruta = ruta;
   }
   
   public String getRuta() {
       return this.ruta;
   }
   
   public void setRuta (String ruta) {
       this.ruta = ruta;
   }
   
   public String getContenido () {
       return this.contenido;
   }
   
   public void setContenido (String contenido) {
       this.contenido = contenido;
   }
   
   public StringTokenizer getToken () {
       return this.token;
   }
   
   public void setToken (StringTokenizer token) {
       this.token = token;
   }
   
   public void analizador () throws FileNotFoundException, IOException {
       
       String linea;
       this.fr = new FileReader (this.ruta);
       this.br = new BufferedReader (this.fr);
       
       while( ( linea = br.readLine() ) != null ){
		 this.contenido += linea + "\n";
		 }
       
       this.token = new StringTokenizer (this.contenido);
       
       while (token.hasMoreTokens()) {
           this.et.validarEtiqueta(token.nextToken());
       }
   }
   
   
    
}
