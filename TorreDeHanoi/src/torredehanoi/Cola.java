package torredehanoi;

public class Cola {
    Nodo front;
    Nodo tail;
    boolean isEmpty(){
        return front == null;
    }
    void enqueue(int dato){
        if (this.isEmpty()){
            front = tail = new Nodo(dato);
        }else{
            tail.siguiente = new Nodo(dato);
            tail = tail.siguiente;
        }
    }
    Nodo dequeue(){
        if (!isEmpty()){
            Nodo temp = front;
            front = front.siguiente;
            temp.siguiente = null;
            if (isEmpty()){
                tail = null;
            }
            return temp;
        }else{
            System.out.println("La cola esta vacía");
        }
        return null;
    }
}
