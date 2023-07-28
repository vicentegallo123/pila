
package clases;

import javax.swing.table.DefaultTableModel;


public class pila {
    private int[] pila;
    private int ultimo;
    
    //construcot definido 
    public pila(){
        pila = new int[5];
        ultimo=0;
    }
    //construcotr definido por el usuario
    public pila(int tamano){
        pila= new int[tamano];
        ultimo=0;
    }
    
    public Boolean push(int agregar){
         // true se agrego, false no se agrego
        if(pilaLlena() == false){
            pila[ultimo]=agregar;
            ultimo++;
            return true;
        }else{
            return false;
        }
     
    }
    //recupera el ultimo elemento ingresado
    public int pop(){
        int val;
        ultimo--;
        val=pila[ultimo];
        pila[ultimo]=0;
        return val;
    }
    public boolean pilaLlena(){
        if(pila.length == ultimo){
            System.out.println("la pila esta llena");
            return true;
        }else {
            
            return false;
        }        
    }
    
    public boolean pilaVacia(){
        if(ultimo==0){
             System.out.println("la pila esta vacia");
            return true;
        }else{
           
            return false;
        }
    }
    
    public DefaultTableModel generaTabla(){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Pila");
        for (int i=0;i< ultimo;i++){
            Object[] dato=new Object[1];
            dato[0]=pila[i];
            modelo.addRow(dato);
        }
        
        return modelo;
    }
    
}
