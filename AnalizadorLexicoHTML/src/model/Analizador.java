package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
}
