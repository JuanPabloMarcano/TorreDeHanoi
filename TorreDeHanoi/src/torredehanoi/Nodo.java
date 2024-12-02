package torredehanoi;

public class Nodo {
    int informacion;
    Nodo siguiente;
    String dato;
    
    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
    Nodo(int pnum, Nodo L) {
        this.informacion = pnum;
        this.siguiente = L;
    }
    Nodo(String valor){
        this.dato = valor;
    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }
}
