package torredehanoi;

public class Pila {
    Nodo top;
    Pila aux;
    String dato;
    
    boolean isEmpty(){ // comprobar si existen elementos en la pila o no
        if (top == null){ // si top esta asignado es porque existe un elemento al menos
            return true;
        }else{
            return false;
        }
    }
    void push(Nodo elemento){ // insertar un elemento nuevo al tope de la pila
        if (this.isEmpty()){ // Si no existe nada almacenado en la pila asigna a top el elemento entrante
            top = elemento;
        }else{ // si ya existen elementos agregados se adjuntan los elementos actuales de la pila al
            elemento.siguiente = this.top; // Nodo que esta entrando, y este elemento pasa a ser TOP
            this.top = elemento;
        }
    }
    Nodo pop(){
        if (!this.isEmpty()){
            Nodo temp = new Nodo();
            temp.dato = this.top.dato; // asigno los datos de top al Nodo temporal
            this.top = this.top.siguiente;
            return temp;
        }else{
            System.out.println("Pila Vacía");
            return null;
        }
    }
    void destroy(String valor){
        aux = new Pila();
        while (this.top!=null){
            if (this.top.dato.equals(valor)) {
                System.out.println("Eliminado " + this.pop().dato);
                break;
            }else{
            aux.push(this.pop()); // paso todos los elementos existentes de "this" a "aux"
            }
        }
        while (aux.top!=null){
            this.push(aux.pop());
        }
    }
    void edit(String valor , String nuevo){
        aux = new Pila();
        while (this.top!=null){
            if (this.top.dato.equals(valor)) {
                System.out.println("Modificado \"" + this.top.dato +"\" por el valor \"" + nuevo +"\"");
                top.dato = nuevo;
            }else{
            aux.push(this.pop()); // paso todos los elementos existentes de "this" a "aux"
            }
        }
        while (aux.top!=null){
            this.push(aux.pop());
        }
    }
}
