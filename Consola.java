package org.Ejercicios.ejercicio34Interface;

public class Consola implements Imprimible {

    private String print = PROMPT;
    private final static String PROMPT = "$";


    @Override //Sobreescribe con asteriscos
    public void borrar() {
        int longitud = print.length();
        print = "";
        for (int i = 0; i < longitud; i++) {
            print += "*";
        }
    }


    @Override
    public void imprime() {
        System.out.printf("%S%n", print);
    }

    public void establecerContenido (String contenido) {
        print = PROMPT + contenido;
    }
}
