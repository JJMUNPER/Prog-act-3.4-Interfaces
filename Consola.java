package org.Ejercicios.ejercicio34Interface;

public class Consola implements Imprimible {

    private String pantalla = PROMPT;
    private final static String PROMPT = "$";


    @Override //Sobreescribe con asteriscos
    public void borrar() {
        int longitud = pantalla.length();
        pantalla = "";
        for (int i = 0; i < longitud; i++) {
            pantalla += "*";
        }
    }


    @Override
    public void imprime() {
        System.out.printf("%S%n", pantalla);
    }

    public void establecerContenido (String contenido) {
        pantalla = PROMPT + contenido;
    }
}
