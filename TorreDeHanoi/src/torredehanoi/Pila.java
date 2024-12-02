package torredehanoi;

public class Pila {
    private Nodo top;
    private int valorNodo = 0;

    public int getvalorNodo() {
        return valorNodo;
    }

    public Nodo getTop() {
        return top;
    }
    
    public void Push (Nodo N){
        valorNodo++;
        if (top==null){
            top=N;
        }else{
            N.setDown(top);
            top.setSiguiente(N);
            top = N;
            
        }
    }  
    public void Pop(){
        if(valorNodo > 0){
            valorNodo--;
            top = top.getDown();
        }
    }
    public String Peek (){
        return top.getDato();
    }

}
