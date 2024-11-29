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
            dat=dat+aux.informacion+",";
            aux=aux.siguiente;
        }
        dat=dat+aux.informacion+", ";
        System.out.print("L-->"+dat);
}
    void eliminar(int valor){
        aux=L;
        Nodo aux2 = null;
        while(aux.siguiente!=L || aux.informacion != valor){
            aux2=aux;
            aux=aux.siguiente;
        }
        if (aux.informacion == valor){
            if (aux == L && aux.informacion == valor) {
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
            while (aux.siguiente!=L || aux.informacion != valor)
                aux= aux.siguiente;
            if (aux.informacion == valor){
                System.out.println(valor + " Existe dentro de la lista");
            }else{
                System.out.println("valor no encontrado en la lista");
            }
        }
    }
}
