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
//
//    private static Etiquetas INSTANCE = new Etiquetas();
//
//    private Etiquetas() {
//    }
//
//    public static Etiquetas getINSTANCE() {
//        return INSTANCE;
//    }
    
    public Etiquetas(){
        
    }

    public String validarEtiqueta(String validar) {
        String etiqueta = "";
        String lexema = "";
        if (validar.equals("html")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de inicio de contenido de pagina";
        }
        if(validar.equals("/html")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de inicio de contenido de pagina";
        }
        if(validar.equals("head")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de cabecera de pagina";
        }
        if(validar.equals("/head")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de cabecera de pagina";
        }
        if(validar.equals("title")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de inicio de titulo de pagina";
        }
        
        if (validar.equals("/title")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de titulo pagina";
        }
        if (validar.equals("body")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de inicio de cuerpo de pagina";
        }
        
        if (validar.equals("/body")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de cuerpo de pagina";
        }
        if (validar.equals("h1")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de cabecera mayor de pagina";
        }
        
        if (validar.equals("/h1")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de cabecera mayor de pagina";
        }
        
        if (validar.equals("b")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de texto en negrita";
        }
        
        if (validar.equals("/b")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de texto en negrita";
        }
        
        if (validar.equals("i")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de texto en cursiva";
        }
        
        if (validar.equals("/i")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de textto en cursiva";
        }
        
        if (validar.equals("u")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertuta de texto en subrayado";
        }
        
        if (validar.equals("/u")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de texto en subrayado";
        }
        
        if (validar.equals("ol")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de lista ordenado";
        }
        
        if (validar.equals("/ol")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de lista ordenada";
        }
        
        if (validar.equals("ul")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de lista no ordenada";
        }
        
        if (validar.equals("/ul")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de lista no ordenada";
        }
        
        if (validar.equals("il")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de elementos de una lista";
        }
        
        if (validar.equals("/il")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de elementos de una lista";
        }
        
        if (validar.equals("table")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de una definicion de tablas";
        }
        
        if (validar.equals("/table")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de una definicion de tablas";
        }
        
        if (validar.equals("tr")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de una fila de tabla";
        }
        
        if (validar.equals("/tr")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de una fila de tabla";
        }
        
        if (validar.equals("td")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de celda de una tabla";
        }
        
        if (validar.equals("/td")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de celda de una tabla";
        }
        
        if (validar.equals("a herf=\"\"")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de apertura de enlace a otro elemento";
        }
        
        if (validar.equals("/a")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de enlace a otro elemento";
        }
        
        if (validar.equals("strong")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de inicio de texto fuerte";
        }
        
        if (validar.equals("/strong")){
            etiqueta = "<" + validar + ">";
            lexema = "Etiqueta de fin de enlace a otro elemento";
        }
            /*default:
                etiqueta = validar;
                lexema = "Esto es texto";
                break;*/

        return (etiqueta + " - " + lexema);
    }
}
