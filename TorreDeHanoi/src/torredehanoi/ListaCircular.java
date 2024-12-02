package torredehanoi;

public class ListaCircular {
    Nodo L;
    Nodo aux;
    
   void agregar(int pnum) {       
       if (L==null){
           L=new Nodo(pnum);
           L.siguiente=L;
       }else{
           aux=L;
           while(aux.siguiente!=L)
               aux=aux.siguiente;
           aux.siguiente=new Nodo(pnum, L);
       }
   }
    void mostrar (){
        aux=L;
        String dat="";
        while (aux.siguiente!=L){
            dat=dat+aux.getInformacion()+",";
            aux=aux.siguiente;
        }
        dat=dat+aux.getInformacion()+", ";
        System.out.print("L-->"+dat);
}
    void eliminar(int valor){
        aux=L;
        Nodo aux2 = null;
        while(aux.siguiente!=L || aux.getInformacion() != valor){
            aux2=aux;
            aux=aux.siguiente;
        }
        if (aux.getInformacion() == valor){
            if (aux == L && aux.getInformacion() == valor) {
                Nodo auxL=L;
                L = L.siguiente;
                while(aux.siguiente!=auxL)
                    aux=aux.siguiente;
                aux.siguiente = L;
            }else{
                aux2.siguiente = aux.siguiente;
            }
            System.out.println(valor + " Eliminado de la lista");
        }else{
            System.out.println("valor no encontrado en la lista");
        }
    }
    
    
    void buscar(int valor){
        aux=L;
        if(aux!=null){
            while (aux.siguiente!=L || aux.getInformacion() != valor)
                aux= aux.siguiente;
            if (aux.getInformacion() == valor){
                System.out.println(valor + " Existe dentro de la lista");
            }else{
                System.out.println("valor no encontrado en la lista");
            }
        }
    }
    
    void recorrer(Pila pila) {
        if (L != null) {
            Nodo actual = L;
            do {
                pila.push());
                actual = actual.siguiente;
            } while (actual != L);
        }
    }
}
