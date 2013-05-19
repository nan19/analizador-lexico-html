/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ArandiLopez
 */
public class Etiquetas {

    private static Etiquetas INSTANCE = new Etiquetas();

    private Etiquetas() {
    }

    public static Etiquetas getINSTANCE() {
        return INSTANCE;
    }

    public String validarEtiqueta(String validar) {
        String etiqueta = "";
        String lexema = "";
        switch (validar) {
            case "html":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de inicio de contenido de pagina";
                break;
            case "/hmtl":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de inicio de contenido de pagina";
                break;
            case "head":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de cabecera de pagina";
                break;
            case "/head":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de cabecera de pagina";
                break;
            case "tile":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de inicio de titulo de pagina";
                break;
            case "/title":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de titulo pagina";
                break;
            case "body":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de inicio de cuerpo de pagina";
                break;
            case "/body":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de cuerpo de pagina";
                break;
            case "h1":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de cabecera mayor de pagina";
                break;
            case "/h1":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de cabecera mayor de pagina";
                break;
            case "b":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de texto en negrita";
                break;
            case "/b":
                etiqueta = "<"+validar+">";
               lexema = "Etiqueta de fin de texto en negrita";
               break;

        }
        return etiqueta + " - " + lexema;
    }
}
