/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.Scanner;

/**
 *
 * @author avanza
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Concesion miConcesionario = new Concesion(3);
        /*if (miConcesionario.insertarCoche("Seat", "Leon", "Rojo", "1234GHT")==true)
            System.out.println("Inserción correcta");
        else
            System.out.println("Inserción INcorrecta");
        if (miConcesionario.insertarCoche("Renault", "Megane", "Verde", "1444GHT")==true)
            System.out.println("Inserción correcta");
        else
            System.out.println("Inserción INcorrecta");
        if (miConcesionario.insertarCoche("Renault", "Megane", "Verde", "1444GHT")==true)
            System.out.println("Inserción correcta");
        else
            System.out.println("Inserción INcorrecta");
        if (miConcesionario.insertarCoche("Ford", "Focus", "Azul", "1333GHT")==true)
            System.out.println("Inserción correcta");
        else
            System.out.println("Inserción INcorrecta");*/
       Scanner entrada=new Scanner(System.in);
       String op=new String();
        String mar,mod,color,matr;
        do {
            System.out.println("1) Alta");
            System.out.println("2) Baja");
            System.out.println("3) Modificar");
            System.out.println("4) Listar");
            System.out.println("5) Salir");
            op=entrada.nextLine();
            if (op.equals("1")){
                //ALTA
                System.out.println("Intro. Marca:");
                mar=entrada.nextLine();
                System.out.println("Intro. Modelo:");
                mod=entrada.nextLine();                
                System.out.println("Intro. Color:");
                color=entrada.nextLine();
                System.out.println("Intro. Matricula:");
                matr=entrada.nextLine();
                if (miConcesionario.insertarCoche(mar, mod, color, matr)==true)
                    System.out.println("INSERCCION CORRECTA");
                else
                    System.out.println("INSERCCION INCORRECTA");                
            }
            if (op.equals("2")){
                
            }
            if (op.equals("4")){
                miConcesionario.listarStock();
            }
        }while (op.equals("5")==false);
        System.out.println("FIN");
    }
}
