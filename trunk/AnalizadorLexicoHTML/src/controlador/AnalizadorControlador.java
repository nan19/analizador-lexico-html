package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JTextArea;
import model.Analizador;

public class AnalizadorControlador {

    /**
     * Constructor que genera una instancia de analizador
     */
    public AnalizadorControlador() {
        yucalex = new Analizador();
    }

    /**
     * Método que coloca la ruta del archivo
     *
     * @param ruta
     */
    public void setRutaArchivo(String ruta) {
        this.rutaArchivo = ruta;
        yucalex.setRuta(rutaArchivo);
    }

    /**
     * Método que coloca el contenido del analisis en pantalla
     *
     * @param textArea
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void analizar(JTextArea textArea) throws FileNotFoundException, IOException {
        textArea.setText(yucalex.analizarLex());
    }

    /**
     * Método que guarda el archivo lex
     *
     * @param ruta
     * @param contenido
     * @throws IOException
     */
    public void imprimirLex(String ruta, String contenido) throws IOException {
        yucalex.imprimirArchivo(ruta, contenido);
    }

    /**
     * Método que lee el archivo y lo imprime en pantalla
     *
     * @param textArea
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void abrirArchivo(JTextArea textArea) throws FileNotFoundException, IOException {
        textArea.setText(yucalex.leerArchivo());
    }
    /**
     * Atributos privados
     */
    private Analizador yucalex = null;
    private String rutaArchivo = "";
}
