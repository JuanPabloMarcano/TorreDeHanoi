package torredehanoi;

public class Nodo {
    int informacion;
    private Nodo siguiente;
    private Nodo down; //La palabra favorita de la clase
    private String dato;
    
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

    public Nodo getDown() {
        return down;
    }

    public void setDown(Nodo down) {
        this.down = down;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
