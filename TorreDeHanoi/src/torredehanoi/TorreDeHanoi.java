package torredehanoi;
//Edwing Rodriguez y Juan Marcano

import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        int opcion = 0;
        
        //Objetos de Tipo Pila que son los que almacenaran los discos
        Pila origen = new Pila();
        Pila destino = new Pila();
        Pila auxiliar = new Pila();
        
        // Objeto Tipo Nodo
        Nodo N = new Nodo();
        
        //Obejeto de Tipo Lista Circular que contendra los Elementos de las torres
        ListaCircular torreOrigen = new ListaCircular();
        for (int i = 1; i < 9; i++) {
            origen.Push(N(i));
        }
        
        System.out.println("Aqui se ven los valores que tiene la primera Torre");
        torreOrigen.mostrar();
        
        
        System.out.println("Ingrese a cual Pila Quiere ir \n"
                + "|1. Origen  | \n"
                + "|2. Destino | \n"
                + "|3. Auxiliar| \n");
        opcion = op.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Esta en la pila origen");
                origen.Peek();
                break;
            case 2:
                System.out.println("Esta en la pila destino");
                break;
            case 3:
                System.out.println("esta en la pila auxiliar");
            default:
                System.out.println("NO");
                break;
        }
        
        //Aqui se elige la torre que quieres
        TorreDeHanoi torre = new TorreDeHanoi();
        torre.Elegir();
        
    }
    void Elegir(){
        System.out.println("");
    }
    
    public static int moverDiscos(int n, Pila origen, Pila destino, Pila auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco " + n + " de " + origen + " para " + destino);
            return 1;
        } else {
            int movimentos = moverDiscos(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " para " + destino);
            movimentos++;
            movimentos += moverDiscos(n - 1, auxiliar, destino, origen);
            return movimentos;
        }
    }
}
