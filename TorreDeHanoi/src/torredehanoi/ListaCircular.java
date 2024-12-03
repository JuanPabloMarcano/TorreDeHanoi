package torredehanoi;

public class ListaCircular {
    Nodo L;
    Nodo aux;
    
   void agregar(int pnum) {       
       if (L==null){
           L=new Nodo(pnum);
           L.setSiguiente(L);
       }else{
           aux=L;
           while(aux.getSiguiente()!=L)
               aux=aux.getSiguiente();
           aux.setSiguiente(new Nodo(pnum, L));
       }
   }
    void mostrar (){
        aux=L;
        String dat="";
        while (aux.getSiguiente()!=L){
            dat=dat+aux.getInformacion()+",";
            aux=aux.getSiguiente();
        }
        dat=dat+aux.getInformacion()+", ";
        System.out.print("L-->"+dat);
    }
    
    public int extraer(){ 
        if (L == null) return -1;// Lista vacía
                int valor = Integer.parseInt(L.dato);
                    if (L.siguiente == L) { // Un solo elemento en la lista 
                L = null;   
        }else{ 
            Nodo temp = L; 
                while (temp.siguiente != L){ 
                        temp = temp.siguiente; 
                    } 
                temp.siguiente = L.siguiente; 
            L = L.siguiente; 
        } return valor;
    }
}