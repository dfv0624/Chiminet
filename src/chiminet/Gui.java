/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiminet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CHIMINET
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
           //Date date=new Date();
             //this.Date.setText(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
             
             
             Calendar c;
             c=Calendar.getInstance();
             int d =c.get(Calendar.DATE), m=1+(c.get(Calendar.MONTH)), a=c.get(Calendar.YEAR);
             // this.Date.setText(d+"-"+m+"-"+a);
              this.Date.setText(a+"-"+m+"-"+d);
             
             
             
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Trabajador = new javax.swing.JComboBox<>();
        Lab_Fecha = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Lab_Recargas = new javax.swing.JLabel();
        RecargasFinal = new javax.swing.JTextField();
        Lab_Internacional = new javax.swing.JLabel();
        InternacionalFinal = new javax.swing.JTextField();
        Lab_baseInicial = new javax.swing.JLabel();
        Lab_baseFinal = new javax.swing.JLabel();
        Lab_Fotocopias = new javax.swing.JLabel();
        FotocopiasFinal = new javax.swing.JTextField();
        Lab_ImpresionesBN = new javax.swing.JLabel();
        ImpresionesBnFinal = new javax.swing.JTextField();
        Lab_Scanner = new javax.swing.JLabel();
        ScannerFinal = new javax.swing.JTextField();
        Lab_internet = new javax.swing.JLabel();
        InternetFinal = new javax.swing.JTextField();
        GuardarFinal = new javax.swing.JButton();
        lab_ImpColor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ImpreColorFinal = new javax.swing.JTextArea();
        lab_TrabTurno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TrabTurno = new javax.swing.JTextArea();
        RecargasInicial = new javax.swing.JLabel();
        InternacionalInicial = new javax.swing.JLabel();
        FotocopiasInicial = new javax.swing.JLabel();
        ImpresionesBnInicial = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Trabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione El Trabajador", "Daniel", "Linda" }));

        Lab_Fecha.setText("Fecha :");

        Date.setText(" ");

        Lab_Recargas.setText("Recargas Celular");

        RecargasFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargasFinalActionPerformed(evt);
            }
        });

        Lab_Internacional.setText("Internacional");

        Lab_baseInicial.setText("Base Inicial");

        Lab_baseFinal.setText("Base Final");

        Lab_Fotocopias.setText("Fotocopias");

        Lab_ImpresionesBN.setText("Impresiones B/N");

        Lab_Scanner.setText("Scanner");

        Lab_internet.setText("Internet");

        GuardarFinal.setText("Guardar");
        GuardarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFinalActionPerformed(evt);
            }
        });

        lab_ImpColor.setText("Impresiones Color");

        ImpreColorFinal.setColumns(20);
        ImpreColorFinal.setRows(5);
        jScrollPane1.setViewportView(ImpreColorFinal);

        lab_TrabTurno.setText("Trabajos Turno");

        TrabTurno.setColumns(20);
        TrabTurno.setRows(5);
        jScrollPane2.setViewportView(TrabTurno);

        RecargasInicial.setText("jLabel1");

        InternacionalInicial.setText("jLabel2");

        FotocopiasInicial.setText("jLabel3");

        ImpresionesBnInicial.setText("jLabel4");

        jButton1.setText("Conexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Lab_Fecha))
                            .addComponent(Lab_Recargas)
                            .addComponent(Lab_Internacional)
                            .addComponent(Lab_Fotocopias)
                            .addComponent(Lab_ImpresionesBN)
                            .addComponent(Lab_Scanner))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecargasFinal)
                            .addComponent(InternacionalFinal)
                            .addComponent(FotocopiasFinal)
                            .addComponent(ImpresionesBnFinal)
                            .addComponent(ScannerFinal)
                            .addComponent(InternetFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Listar)
                        .addGap(50, 50, 50)
                        .addComponent(GuardarFinal)
                        .addGap(72, 72, 72)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lab_internet)
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecargasInicial)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lab_baseInicial)
                                .addGap(93, 93, 93)
                                .addComponent(Lab_baseFinal))
                            .addComponent(InternacionalInicial)
                            .addComponent(FotocopiasInicial)
                            .addComponent(ImpresionesBnInicial))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_TrabTurno)
                    .addComponent(lab_ImpColor))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab_Fecha)
                    .addComponent(Date))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_baseInicial)
                    .addComponent(Lab_baseFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_Recargas)
                    .addComponent(RecargasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecargasInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_Internacional)
                    .addComponent(InternacionalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InternacionalInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_Fotocopias)
                    .addComponent(FotocopiasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FotocopiasInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_ImpresionesBN)
                    .addComponent(ImpresionesBnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImpresionesBnInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_Scanner)
                    .addComponent(ScannerFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_internet)
                    .addComponent(InternetFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(lab_TrabTurno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarFinal)
                            .addComponent(jButton1)
                            .addComponent(Listar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lab_ImpColor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecargasFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargasFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecargasFinalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
        JOptionPane.showMessageDialog(null, "Conexion Exitosa");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarFinalActionPerformed
        ConexionMySQL mySQL = new ConexionMySQL();
        Connection Cn = mySQL.Conectar();
        String Trabajador,Fecha,Recargas,Internacional,fotocopias, ImpresionesBN,Scanner,internet,ImpresionesColor,TrabajosTurno;
        
        String Sql = "";
        String Mensaje = "";
        //Cargamos Las Variables con un valor de los controles de la gui.
        Trabajador = String.valueOf(this.Trabajador.getSelectedItem());
        Fecha = this.Date.getText();
        //////
        String date = "'"+Fecha+"'";
        System.out.println(date);
        
        Recargas = this.RecargasFinal.getText();
        Internacional = this.InternacionalFinal.getText();
        fotocopias = this.FotocopiasFinal.getText();
        ImpresionesBN = this.ImpresionesBnFinal.getText();
        Scanner = this.ScannerFinal.getText();
        internet = this.InternetFinal.getText();
        ImpresionesColor = this.ImpreColorFinal.getText();
        TrabajosTurno = this.TrabTurno.getText();
        
        Sql = "INSERT INTO CuadreCaja(Trabajador,Fecha,Recargas,Internacional,fotocopias, ImpresionesBN,Scanner,internet,ImpresionesColor,TrabTurno) VALUES (?,?,?,?,?,?,?,?,?,?)";
        //colocamos la variable mensaje asumiendo qu ele registro se inserto en la tabla
        Mensaje = "Registro Insertado Con Exito";
        try
        {
         PreparedStatement Pst=Cn.prepareStatement(Sql);
        
         Pst.setString(1,Trabajador);
         Pst.setString(2,date);
         Pst.setString(3,Recargas);
         Pst.setString(4,Internacional);
         Pst.setString(5,fotocopias);
         Pst.setString(6,ImpresionesBN);
         Pst.setString(7,Scanner);
         Pst.setString(8,internet);
         Pst.setString(9,ImpresionesColor);
         Pst.setString(10,TrabajosTurno);
         
         
         int N=Pst.executeUpdate();
         if(N>0)
         {
         JOptionPane.showMessageDialog(null, Mensaje);
         }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_GuardarFinalActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
     ConexionMySQL mySQL = new ConexionMySQL();
        Connection Cn = mySQL.Conectar();
        String Recargas,Internacional,fotocopias, ImpresionesBN;
        
        String Sql = "";

     
        try {
      Sql="SELECT Recargas,Internacional,fotocopias, ImpresionesBN FROM CuadreCaja WHERE Id=1";
     java.sql.Statement st = Cn.createStatement();
     ResultSet rs = st.executeQuery(Sql);
      if(rs.first()){
       this.RecargasInicial.setText(rs.getString("Recargas"));  //campo 1 de la tabla personas
       this.InternacionalInicial.setText(rs.getString("Internacional"));      //campo 2 de la tabla personas
       this.FotocopiasInicial.setText(rs.getString("fotocopias"));  
       this.ImpresionesBnInicial.setText(rs.getString("ImpresionesBN")); 
      }
   } catch(SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al realizar la consulta");
       e.printStackTrace();
} 
  
        
        
        
    }//GEN-LAST:event_ListarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JTextField FotocopiasFinal;
    private javax.swing.JLabel FotocopiasInicial;
    private javax.swing.JButton GuardarFinal;
    private javax.swing.JTextArea ImpreColorFinal;
    private javax.swing.JTextField ImpresionesBnFinal;
    private javax.swing.JLabel ImpresionesBnInicial;
    private javax.swing.JTextField InternacionalFinal;
    private javax.swing.JLabel InternacionalInicial;
    private javax.swing.JTextField InternetFinal;
    private javax.swing.JLabel Lab_Fecha;
    private javax.swing.JLabel Lab_Fotocopias;
    private javax.swing.JLabel Lab_ImpresionesBN;
    private javax.swing.JLabel Lab_Internacional;
    private javax.swing.JLabel Lab_Recargas;
    private javax.swing.JLabel Lab_Scanner;
    private javax.swing.JLabel Lab_baseFinal;
    private javax.swing.JLabel Lab_baseInicial;
    private javax.swing.JLabel Lab_internet;
    private javax.swing.JButton Listar;
    private javax.swing.JTextField RecargasFinal;
    private javax.swing.JLabel RecargasInicial;
    private javax.swing.JTextField ScannerFinal;
    private javax.swing.JTextArea TrabTurno;
    private javax.swing.JComboBox<String> Trabajador;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lab_ImpColor;
    private javax.swing.JLabel lab_TrabTurno;
    // End of variables declaration//GEN-END:variables
}