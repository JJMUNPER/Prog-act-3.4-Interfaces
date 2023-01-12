package org.Ejercicios.ejercicio34Interface;

public class TestImpresiones {

    public static void main(String[] args) {


        Imprimible typePrint = new Impresora();
        typePrint.imprime();
        typePrint.borrar();
        typePrint.imprime();
        typePrint.establecerContenido("Esto es un test");
        typePrint.imprime();

        Imprimible linuxBash = new Consola();
        linuxBash.imprime();
        linuxBash.borrar();
        linuxBash.imprime();
        linuxBash.establecerContenido("Esto es un test");
        linuxBash.imprime();

        //Tipo Imprimible




    }
}
