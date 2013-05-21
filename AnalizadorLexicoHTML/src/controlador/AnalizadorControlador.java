package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JTextArea;
import model.Analizador;
import model.Archivo;

public class AnalizadorControlador {

    /**
     * Constructor que genera una instancia de analizador
     */
    public AnalizadorControlador() {
        yucalex = new Analizador();
    }

    /**
     * Método que coloca el contenido del analisis en pantalla
     *
     * @param textArea
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void analizar(JTextArea textArea, String contenido) throws FileNotFoundException, IOException {
        textArea.setText(yucalex.analizarLex(contenido));
    }

    /**
     * Método que guarda un archivo
     *
     * @param ruta
     * @param contenido
     * @throws IOException
     */
    public void guardarArchivo(String tipoArchivo, String contenido) throws IOException {
        Archivo.getINSTANCIA().guardarArchivo(tipoArchivo, contenido);
    }

    /**
     * Método que lee el archivo y lo imprime en pantalla
     *
     * @param textArea
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void abrirArchivo(JTextArea textArea, String tipoArchivo) throws FileNotFoundException, IOException {
        textArea.setText(Archivo.getINSTANCIA().abrirArchivo(tipoArchivo));
    }
    /**
     * Atributos privados
     */
    private Analizador yucalex = null;
    
}
