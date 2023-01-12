package org.Ejercicios.ejercicio34Interface;

public interface Imprimible extends Borrable, Editable {

    //Constante
    final static String TEXTO_POR_DEFECTO = "Página de prueba";


    void imprime();

}
