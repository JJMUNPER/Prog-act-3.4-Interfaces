package org.Ejercicios.ejercicio34Interface;

/**
 * @autor: Juan Jesus Muñoz Perez
 */

public class Impresora implements Imprimible {


    private String pagina;


    // Se inicializa la constante de la interface imprimible
    public Impresora() {

        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    @Override //Porque se va a sobreescribir
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido(String contenido) {
        pagina = contenido;
    }

    /**
     * Borra el contenido de la página
     */
    @Override
    public void borrar() {
        pagina = "";
    }
}