
package interfaz;
import clases.pila;
import clases.cola;
import static java.lang.System.exit;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

   
    //objetos a utilizar
    pila pila;
    String tipo = "";
    cola cola;
    //consyructor de la interfaz
    public Principal() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTipo = new javax.swing.JComboBox<>();
        elementos = new javax.swing.JTextField();
        jLabelElementos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bcrear = new javax.swing.JButton();
        binsertar = new javax.swing.JButton();
        sacar = new javax.swing.JButton();
        bmostrar = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        Principal = new javax.swing.JLabel();
        txtinsertar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..", "Pila", "Cola" }));
        cbTipo.setName("tipo"); // NOI18N
        cbTipo.setOpaque(true);
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        elementos.setToolTipText("");
        elementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementosActionPerformed(evt);
            }
        });

        jLabelElementos.setText("Ingresa el # de elementos");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datos"
            }
        ));
        tabla.setEnabled(false);
        tabla.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabla);

        bcrear.setLabel("crear");
        bcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcrearActionPerformed(evt);
            }
        });

        binsertar.setText("Insertar Dato");
        binsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binsertarActionPerformed(evt);
            }
        });

        sacar.setText("Sacar Dato");
        sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarActionPerformed(evt);
            }
        });

        bmostrar.setText("Mostrar");
        bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostrarActionPerformed(evt);
            }
        });

        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });

        Principal.setText("Programa Visual Pilas Y Colas");

        txtinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinsertarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bcrear)
                                    .addGap(77, 77, 77)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelElementos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(binsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(50, 50, 50)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtinsertar)
                                        .addComponent(elementos))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(beliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Principal)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcrear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelElementos)
                            .addComponent(elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(binsertar))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sacar)
                            .addComponent(bmostrar)
                            .addComponent(beliminar)
                            .addComponent(jButton1))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        bcrear.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elementosActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void bcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcrearActionPerformed
        
          //declarar si tipo se seleccion y es igual a pila despliega esa accion  
        if (this.cbTipo.getSelectedItem().equals("Pila") ){
            
            if (this.elementos.getText()!=""){
            try{
                pila =new pila(Integer.parseInt(this.elementos.getText()));
                this.Principal.setText("se creo la pila de "+this.elementos.getText()  + " Datos");
            }catch(Exception e){
                pila = new pila();
                this.Principal.setText("se creo la pila de 5 datos ");
            }
            
            }
            this.cbTipo.setEnabled(false);
            this.bcrear.setEnabled(false);
            this.elementos.setEnabled(false);
            this.tipo="PILA";
        }    
        //implementacion cola
        if (this.cbTipo.getSelectedItem().equals("Cola") ){
            
            if (this.elementos.getText()!=""){
            try{
                cola =new cola(Integer.parseInt(this.elementos.getText()));
                this.Principal.setText("se creo la cola de "+this.elementos.getText()  + " Datos");
            }catch(Exception e){
                cola = new cola();
                this.Principal.setText("se creo la cola de 5 elementos  ");
            }
            
            }
            this.cbTipo.setEnabled(false);
            this.bcrear.setEnabled(false);
            this.elementos.setEnabled(false);
            this.tipo="COLA";
        }    
    }//GEN-LAST:event_bcrearActionPerformed

    private void binsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binsertarActionPerformed
        // TODO add your handling code here:
        if(tipo.equals("PILA")){
            
            String entrada=this.txtinsertar.getText();
            //se crea variable para guardar
            int valor;
            try{            
            valor=Integer.parseInt(entrada);
            }catch(Exception e){
                this.Principal.setText("Ingresa algun valor" );
               return;
            }
            
            if (pila.push(valor)){
                this.Principal.setText("Valor Insertado");
                //se inserta en la tabla
                this.tabla.setModel(pila.generaTabla());
            }else{
                this.Principal.setText("Pila llena");
            }
            this.txtinsertar.setText("");
        }
        //implementacion cola
        if(tipo.equals("COLA")){
            String entrada=this.txtinsertar.getText();
            int valor;
            try{            
            valor=Integer.parseInt(entrada);
            }catch(Exception e){
                this.Principal.setText("ingresa algun valor" );
               return;
            }
            
            if (cola.agregar(valor)){
                this.Principal.setText("Valor Insertado");
                this.tabla.setModel(cola.generaTabla());
            }else{
                this.Principal.setText("Cola llena");
            }
            this.txtinsertar.setText("");
        }
    }//GEN-LAST:event_binsertarActionPerformed

    private void txtinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinsertarActionPerformed

    private void sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarActionPerformed
        if(tipo.equals("PILA")){
            if(pila.pilaVacia()==false){
            pila.pop();
            this.tabla.setModel(pila.generaTabla());
            this.Principal.setText("Numero retirado");
            }else{
                this.Principal.setText("Pila Vacia");
            } 
            
        }
        //implementacion cola
        if(tipo.equals("COLA")){
            if(cola.colaVacia() ==false){
            cola.recupera();
            this.tabla.setModel(cola.generaTabla());
            this.Principal.setText("Numero retirado");
            }else{
                this.Principal.setText("Cola Vacia");
            } 
            
        }
    }//GEN-LAST:event_sacarActionPerformed

    private void bmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmostrarActionPerformed
        //muestra en la tabla que tipo de estructura es
        if(tipo.equals("PILA")){
            this.tabla.setModel(pila.generaTabla());
        }
        //cola
        if(tipo.equals("COLA")){
            this.tabla.setModel(cola.generaTabla());
        }
        
    }//GEN-LAST:event_bmostrarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        //Se debe reestablecer todo
        if(tipo.equals("PILA")){
            tipo="";
            //se borra contenido tabla
            this.tabla.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {},
                    new String [] {"Datos"}));
            this.pila=new pila();
            this.cbTipo.setEnabled(true);
            this.bcrear.setEnabled(true);
            this.elementos.setEnabled(true);
            this.Principal.setText("");
        }
        //cola
        if(tipo.equals("COLA")){
            tipo="";
            //se borra contenido tabla
            this.tabla.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {},
                    new String [] {"Datos"}));
            this.cola=new cola();
            this.cbTipo.setEnabled(true);
            this.bcrear.setEnabled(true);
            this.elementos.setEnabled(true);
            this.Principal.setText("");
        }
    }//GEN-LAST:event_beliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Principal;
    private javax.swing.JButton bcrear;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton binsertar;
    private javax.swing.JButton bmostrar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JTextField elementos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelElementos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sacar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtinsertar;
    // End of variables declaration//GEN-END:variables
}
