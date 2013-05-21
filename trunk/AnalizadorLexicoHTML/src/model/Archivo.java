package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;


public class Archivo {

    private Archivo() {
    }

    /**
     *  Metodo que devuelve la instancia unica de Archivo usando el patron Singleton
     * @return
     */
    public static Archivo getINSTANCIA() {
        return INSTANCIA;
    }

    /**
     *  Lee un archivo y devuelve su contenido
     * @param rutaArchivo
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    private String leerArchivo(String rutaArchivo) throws FileNotFoundException, IOException {
        String contenido = "", linea;
        FileReader fr = new FileReader(rutaArchivo);
        BufferedReader br = new BufferedReader(fr);

        while ((linea = br.readLine()) != null) {
            contenido += linea + "\n";
        }

        br.close();
        fr.close();

        return contenido;
    }

    /**
     *  Escribe un archivo de texto a base de su contenido
     * @param rutaArchivo
     * @param contenidoArchivo
     * @throws IOException
     */
    private void escribirArchivo(String rutaArchivo, String contenidoArchivo) throws IOException {
        FileWriter fw = new FileWriter(rutaArchivo);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.print(contenidoArchivo);

        pw.close();
        bw.close();
        fw.close();
    }

    /**
     *  Selecciona un archivo y devuelve su contenido
     * @param tipoArchivo
     * @return
     */
    public String abrirArchivo(String tipoArchivo) throws FileNotFoundException, IOException {
        String rutaArchivo = "";
        JFileChooser chooser = new JFileChooser();
        if(tipoArchivo.equals(Ext_HTML)){
            chooser.setFileFilter(new ExtensionFileFilter("Archivo HTML", Ext_HTML));
            chooser.setDialogTitle(ABRIR_HTML);
        }
        if(tipoArchivo.equals(Ext_LEX)){
            chooser.setFileFilter(new ExtensionFileFilter("Archivo Lex", Ext_LEX));
            chooser.setDialogTitle(ABRIR_LEX);
        }
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showOpenDialog(null);

        rutaArchivo = chooser.getSelectedFile().getPath();

        return leerArchivo(rutaArchivo);
    }

    /**
     *  Guarda o crea un nuevo archivo con el contenido asigando
     * @param tipoArchivo
     * @param contenido
     * @throws IOException
     */
    public void guardarArchivo(String tipoArchivo, String contenido) throws IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        if(tipoArchivo.equals(Ext_HTML)){
            chooser.setDialogTitle(GUARDAR_HTML);
            chooser.setFileFilter(new ExtensionFileFilter("Archivo lexico *.lex", Ext_HTML));
        }
        if(tipoArchivo.equals(Ext_LEX)){
            chooser.setDialogTitle(GUARDAR_LEX);
            chooser.setFileFilter(new ExtensionFileFilter("Archivo lexico *.lex", Ext_LEX));
        }
        chooser.showSaveDialog(null);
        
        String rutaArchivo = chooser.getSelectedFile().getPath();
        
        escribirArchivo(rutaArchivo, contenido);
    }
    private static Archivo INSTANCIA = new Archivo();
    
    private static String ABRIR_HTML = "Seleccione un Archivo HTML";
    
    private static String ABRIR_LEX = "Seleccione un Archivo Lex";
    
    private static String GUARDAR_HTML = "Guardar un Archivo HTML";
    
    private static String GUARDAR_LEX = "Guardar un Archivo Lex";
    /**
     *  Se toma el valor string para asignar un tipo de Archivo en la operaciones de abrir y guardar archivo
     */
    public static String Ext_HTML = "html";
    /**
     *  Se toma el valor string para asignar un tipo de Archivo en la operaciones de abrir y guardar archivo
     */
    public static String Ext_LEX = "lex";
}//fin de la clase Archivo
