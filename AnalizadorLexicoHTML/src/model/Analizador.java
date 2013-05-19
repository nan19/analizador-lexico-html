package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Analizador {

    private FileReader fr = null;
    private BufferedReader br = null;
    private String ruta;
    private StringTokenizer token;
    private Etiquetas et;
    private ArrayList<String> lista;

    public Analizador(String ruta) {
        this.ruta = ruta;
        this.lista = new ArrayList<>();
    }

    public String getRuta() {
        return this.ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public StringTokenizer getToken() {
        return this.token;
    }

    public void setToken(StringTokenizer token) {
        this.token = token;
    }

    public void analizador() throws FileNotFoundException, IOException {

        String linea, contenido = "", lexema;
        this.fr = new FileReader(this.ruta);
        this.br = new BufferedReader(this.fr);

        while ((linea = br.readLine()) != null) {
            contenido += linea + "\n";
        }

        this.token = new StringTokenizer(contenido);

        while (token.hasMoreTokens()) {
            lexema = this.et.validarEtiqueta(token.nextToken());
            lista.add(lexema);
        }

        fr.close();
        br.close();
    }
    
    public String leerArchivo(String ruta) throws FileNotFoundException, IOException{
        String contenido="", linea;
        this.fr = new FileReader(ruta);
        this.br = new BufferedReader(fr);
        
        while ((linea = br.readLine()) != null){
            contenido += linea + "\n";
        }
        
        br.close();
        fr.close();
        
        return contenido;
    }
    
    public void imprimirArchivo(String ruta, String contenido) throws IOException{
        FileWriter fw = new FileWriter(ruta);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        pw.print(contenido);
        
        pw.close();
        bw.close();
        fw.close();
    }
}
