package model;

public class Etiquetas {

    /**
     * constructor vacio
     */
    private Etiquetas() {
    }

    /**
     * Devuelve una instancia de etiquetas usando el patron de diseño Singleton
     *
     * @return
     */
    public static Etiquetas getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Método para identificar el tipo de etiqueta
     *
     * @param validar
     * @return
     */
    public String validarEtiqueta(String validar) {
        String etiqueta = "";
        String lexema = "";

        switch (validar) {
            case "html":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de inicio de contenido de pagina";
                break;
            case "/html":
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
            case "title":
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
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de texto en negrita";
                break;
            case "i":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de texto en cursiva";
                break;
            case "/i":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de texto en cursiva";
                break;
            case "u":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de texto en subrayado";
                break;
            case "/u":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de texto en cursiva";
                break;
            case "ol":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de lista ordenado";
                break;
            case "/ol":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de lista ordenada";
                break;
            case "ul":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de lista no ordenada";
                break;
            case "/ul":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de lista no ordenada";
                break;
            case "il":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de elementos de una lista";
                break;
            case "/il":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de elementos de una lista";
                break;
            case "table":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de definicion de tablas";
                break;
            case "/table":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de definicion de tablas";
                break;
            case "tr":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de fila de una tabla";
                break;
            case "/tr":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de fila de una tabla";
                break;
            case "td":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de celda de una tabla";
                break;
            case "/td":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de celda de una tabla";
                break;
            case "a herf=\"\"":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de apertura de enlace a otro elemento";
                break;
            case "/a":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de enlace a otro elemento";
                break;
            case "p":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de inicio de parrafo";
                break;
            case "/p":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de parrafo";
                break;
            case "strong":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de inicio de texto fuerte";
                break;
            case "/strong":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de texto fuerte";
                break;
            case "img":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de inicio de imagen";
                break;
            case "/img":
                etiqueta = "<" + validar + ">";
                lexema = "Etiqueta de fin de imagen";
                break;
            default:
                etiqueta = validar;
                lexema = "Esto es texto";
                break;
        }
        return (etiqueta + " - " + lexema);
    }//fin de validar
    private static Etiquetas INSTANCE = new Etiquetas();
}//fin de la clase
