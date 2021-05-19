/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author macbookair
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "hospital.txt";

        Hospital h1 = new Hospital("San Agustin", 90 , 1000);

        
        ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
       
        escritura.establecerRegistro(h1);
        escritura.establecerSalida();

        escritura.cerrarArchivo();

        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();

        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
