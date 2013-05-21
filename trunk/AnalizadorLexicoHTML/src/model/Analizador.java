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

    /**
     * constructor que inicializa el atributo ruta
     *
     * @param ruta
     */
    public Analizador(String ruta) {
        this.ruta = ruta;

    }

    /**
     * contructor vacio
     */
    public Analizador() {
    }

    /**
     * Método para obtener la ruta
     *
     * @return
     */
    public String getRuta() {
        return this.ruta;
    }

    /**
     * Método para colocar la ruta
     *
     * @param ruta
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Método para obtener el token
     *
     * @return
     */
    public StringTokenizer getToken() {
        return this.token;
    }

    /**
     * Método para colocar un token
     *
     * @param token
     */
    public void setToken(StringTokenizer token) {
        this.token = token;
    }

    /**
     * Método para analizar el archivo y dividir el contenido en tokens
     *
     * @return String
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String analizarLex() throws FileNotFoundException, IOException {

        String linea, contenido = "", lexema = "";
        this.fr = new FileReader(this.ruta);
        this.br = new BufferedReader(this.fr);

        while ((linea = br.readLine()) != null) {
            contenido += linea + "\n";
        }

        this.token = new StringTokenizer(contenido, "<>\n\t");
        int i = 1;
        while (token.hasMoreTokens()) {
            String tokenizado = token.nextToken();
            if (!(tokenizado.equals("") || tokenizado.equals(" "))) {
                lexema += i + "-  " + Etiquetas.getINSTANCE().validarEtiqueta(tokenizado) + "\n";
                i++;
            }

        }

        fr.close();
        br.close();

        return lexema;
    }

    /**
     * Método que leé el archivo
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String leerArchivo() throws FileNotFoundException, IOException {
        String contenido = "", linea;
        this.fr = new FileReader(ruta);
        this.br = new BufferedReader(fr);

        while ((linea = br.readLine()) != null) {
            contenido += linea + "\n";
        }

        br.close();
        fr.close();

        return contenido;
    }

    /**
     * Método que imprime el archivo
     *
     * @param ruta
     * @param contenido
     * @throws IOException
     */
    public void imprimirArchivo(String ruta, String contenido) throws IOException {
        FileWriter fw = new FileWriter(ruta);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.print(contenido);

        pw.close();
        bw.close();
        fw.close();
    }
    private FileReader fr = null;
    private BufferedReader br = null;
    private String ruta;
    private StringTokenizer token;
}
