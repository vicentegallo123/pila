
package clases;

import javax.swing.table.DefaultTableModel;


public class cola {
    private int[] cola;
    private int cima;
    private int num_elem;
    //constructor definido
    public cola(){
        cola = new int[5];
        cima=0;
        num_elem=5;
    }
    //constructor definido por el usuario
    public cola(int tamano){
        cola= new int[tamano];
        cima=0;
        num_elem=tamano;
    }
    
    public Boolean agregar(int agregar){
         // true se agrego, false no se agrego
        if(colaLlena() == false){
            cola[cima]=agregar;
            cima++;
            return true;
        }else{
            return false;
        }
     
    }
    //recupera elemento
    public int recupera(){
        int val=cola[0];
        cima--;
        for(int i=0;i<cima;i++){
            cola[i]=cola[i+1];
        }
        return val;
    }
    public boolean colaLlena(){
        if(cola.length == cima){
             System.out.println("cola llena");
            return true;
        }else {
           
            return false;
        }        
    }
    
    public boolean colaVacia(){
        if(cima==0){
            System.out.println("cola vacia");
            return true;
        }else{
            
            return false;
        }
    }
    
    public DefaultTableModel generaTabla(){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Cola");
        for (int i=0;i< cima;i++){
            Object[] dato=new Object[1];
            dato[0]=cola[i];
            modelo.addRow(dato);
        }
        
        return modelo;
    }
    
}
