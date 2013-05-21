package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Analizador {

    /**
     * contructor vacio
     */
    public Analizador() {
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
    public String analizarLex(String contenido) throws FileNotFoundException, IOException {
        String analisis = "";
        this.token = new StringTokenizer(contenido, "<>\n\t");
        int i = 1;
        while (token.hasMoreTokens()) {
            String tokenizado = token.nextToken();
            if (!(tokenizado.equals("") || tokenizado.equals(" "))) {
                analisis += i + "-  " + Etiquetas.getINSTANCE().validarEtiqueta(tokenizado) + "\n";
                i++;
            }

        }
        return analisis;
    }

    private StringTokenizer token = null;
}
