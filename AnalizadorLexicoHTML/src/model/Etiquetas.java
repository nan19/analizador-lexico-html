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
        if (validar.equals("html")){
            lexema = "Etiqueta de apertura de inicio de contenido de pagina";
        }
        if(validar.equals("/html")){
            lexema = "Etiqueta de apertura de inicio de contenido de pagina";
        }
        if(validar.equals("head")){
            lexema = "Etiqueta de apertura de cabecera de pagina";
        }
        if(validar.equals("/head")){
            lexema = "Etiqueta de fin de cabecera de pagina";
        }
        if(validar.equals("title")){
            lexema = "Etiqueta de inicio de titulo de pagina";
        }
        
        if (validar.equals("/title")){
            lexema = "Etiqueta de fin de titulo pagina";
        }
        if (validar.equals("body")){
            lexema = "Etiqueta de inicio de cuerpo de pagina";
        }
        
        if (validar.equals("/body")){
            lexema = "Etiqueta de fin de cuerpo de pagina";
        }
        if (validar.equals("h1")){
            lexema = "Etiqueta de apertura de cabecera mayor de pagina";
        }
        
        if (validar.equals("/h1")){
            lexema = "Etiqueta de fin de cabecera mayor de pagina";
        }
        
        if (validar.equals("b")){
            lexema = "Etiqueta de apertura de texto en negrita";
        }
        
        if (validar.equals("/b")){
            lexema = "Etiqueta de fin de texto en negrita";
        }
        
        if (validar.equals("i")){
            lexema = "Etiqueta de apertura de texto en cursiva";
        }
        
        if (validar.equals("/i")){
            lexema = "Etiqueta de fin de textto en cursiva";
        }
        
        if (validar.equals("u")){
            lexema = "Etiqueta de apertuta de texto en subrayado";
        }
        
        if (validar.equals("/u")){
            lexema = "Etiqueta de fin de texto en subrayado";
        }
        
        if (validar.equals("ol")){
            lexema = "Etiqueta de apertura de lista ordenado";
        }
        
        if (validar.equals("/ol")){
            lexema = "Etiqueta de fin de lista ordenada";
        }
        
        if (validar.equals("ul")){
            lexema = "Etiqueta de apertura de lista no ordenada";
        }
        
        if (validar.equals("/ul")){
            lexema = "Etiqueta de fin de lista no ordenada";
        }
        
        if (validar.equals("il")){
            lexema = "Etiqueta de apertura de elementos de una lista";
        }
        
        if (validar.equals("/il")){
            lexema = "Etiqueta de fin de elementos de una lista";
        }
        
        if (validar.equals("table")){
            lexema = "Etiqueta de apertura de una definicion de tablas";
        }
        
        if (validar.equals("/table")){
            lexema = "Etiqueta de fin de una definicion de tablas";
        }
        
        if (validar.equals("tr")){
            lexema = "Etiqueta de apertura de una fila de tabla";
        }
        
        if (validar.equals("/tr")){
            lexema = "Etiqueta de fin de una fila de tabla";
        }
        
        if (validar.equals("td")){
            lexema = "Etiqueta de celda de una tabla";
        }
        
        if (validar.equals("/td")){
            lexema = "Etiqueta de fin de celda de una tabla";
        }
        
        if (validar.equals("a herf=\"\"")){
            lexema = "Etiqueta de apertura de enlace a otro elemento";
        }
        
        if (validar.equals("/a")){
            lexema = "Etiqueta de fin de enlace a otro elemento";
        }
        
        if (validar.equals("strong")){
            lexema = "Etiqueta de inicio de texto fuerte";
        }
        
        if (validar.equals("/strong")){
            lexema = "Etiqueta de fin de enlace a otro elemento";
        }
            /*default:
                etiqueta = validar;
                lexema = "Esto es texto";
                break;*/

        return lexema;
    }
}
