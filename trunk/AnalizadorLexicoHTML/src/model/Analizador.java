import java.io.BufferedReader;
import java.io.File;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

package model;

public class Analizador {
    
   private FileReader fr = null;
   private BufferedReader br = null;
   private String contenido = "";
   private String ruta;
   StringTokenizer token;
   
   
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
   
   
   
   
    
}
