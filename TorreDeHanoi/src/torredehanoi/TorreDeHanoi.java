package torredehanoi;
//Edwing Rodriguez y Juan Marcano

import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        
        //Objetos de Tipo Pila que son los que almacenaran los discos
        Pila origen = new Pila();
        Pila destino = new Pila();
        Pila auxiliar = new Pila();
        
        TorreDeHanoi torre = new TorreDeHanoi();
        torre.Elegir(opcion);
    }
    
    void Elegir(int opcion){
        Scanner op = new Scanner(System.in);
        System.out.println("Ingrese a cual Pila Quiere ir \n"
                + "1. Origen \n"
                + "2. Destino \n"
                + "3. Auxiliar \n");
        opcion = op.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Esta en la pila origen");
                break;
            case 2:
                System.out.println("Esta en la pila destino");
                break;
            case 3:
                System.out.println("esta en la pila auxiliar");
            default:
                throw new AssertionError();
        }
    }
}
