package torredehanoi;

public class Nodo {
    int informacion;
    Nodo siguiente;
    
    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
    Nodo(int pnum, Nodo L) {
        this.informacion = pnum;
        this.siguiente = L;
    }
}
