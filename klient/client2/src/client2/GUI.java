/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.net.Socket;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author jan10
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("rEmOtE pRoCeDuRe");

        jTextField1.setText("127.0.0.1");

        jButton1.setText("Connect");
        jButton1.setMultiClickThreshhold(100L);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setEnabled(false);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Procedures:");

        jLabel2.setText("Arg 1:");

        jLabel3.setText("Arg 2:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Arg 3:");

        jLabel5.setText("Arg 4:");

        jLabel6.setText("Arg 5:");

        jTextField2.setEnabled(false);

        jTextField3.setEnabled(false);

        jTextField4.setEnabled(false);

        jTextField5.setEnabled(false);

        jTextField6.setEnabled(false);

        jButton2.setText("Execute");
        jButton2.setEnabled(false);
        jButton2.setMultiClickThreshhold(100L);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Result:");

        jLabel8.setText("Description:");

        jLabel9.setText("Server:");

        jTextField7.setText("1025");

        jLabel11.setText("Port:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 147, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // CONNECT
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    String serverName = jTextField1.getText();
                    int serverPortNumber = Integer.parseInt(jTextField7.getText());
            
                    clientSocket = new Socket(serverName, serverPortNumber);
                    //System.out.println("Polaczenie nawiazane");
                    outToServer = new DataOutputStream(clientSocket.getOutputStream());
                    inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    
                    // Wczytanie liczby procedur
                    int number = inFromServer.read();
                    numberOfProcedures = number - 48;
                    //System.out.print(numberOfProcedures);
                    for(int i = 0; i < numberOfProcedures; i++)
                    {
                        String buffer = "";
                        int character = 0;
                        // Wczytywanie nazwy procedury do momentu otrzymania znaku nowej linii
                        while(true)
                        {
                            character = inFromServer.read();
                            if(character == 10) break;
                            else buffer += String.valueOf((char)character);
                        }
                        procedureNames.add(buffer);
                        //System.out.println(i);
                    }
            
                jList1.setListData(procedureNames);
                jList1.setEnabled(true);
                jTextField1.setBackground(Color.GREEN);
                jTextField7.setBackground(Color.GREEN);
                jButton1.setEnabled(false);
                
             }
             catch (Exception e) {
                    System.err.println( e.getMessage() );
                    e.printStackTrace();
                    jList1.setEnabled(false);
                    jButton2.setEnabled(false);
                    jTextField2.setEnabled(false);
                    jTextField3.setEnabled(false);
                    jTextField4.setEnabled(false);
                    jTextField5.setEnabled(false);
                    jTextField6.setEnabled(false);
                    jTextField1.setBackground(Color.red);
                    jTextField7.setBackground(Color.red);
                }
            }
        });
        t.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    // DESCRIPTION
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        
        Thread valueOfList = new Thread(new Runnable() {
            public void run() {
            if(!jList1.getValueIsAdjusting()){
            int index = jList1.getSelectedIndex();
                selectedProcedure=index;
                System.out.println("selected: "+index);
                jLabel12.setText("");
                try
                {
                    outToServer.write('0');
                    String indexStr = String.valueOf(index);
                    System.out.println(indexStr);
                    outToServer.write(indexStr.charAt(0));
                    String description = "";
                        
                    int character = 0;
                    character = inFromServer.read();
                        
                    numberOfArguments = character - '0';
                    System.out.println(numberOfArguments);
                    character = inFromServer.read();
                    while(true)
                    {
                        character = inFromServer.read();
                        if (character != 10) {
                            description += String.valueOf((char)character);
                        }
                        else break;
                    }
                    // display description
                    jLabel12.setText(description);
            
                    jButton2.setEnabled(true);
                    jTextField2.setEnabled(true);
                    jTextField3.setEnabled(true);
                    jTextField4.setEnabled(true);
                    jTextField5.setEnabled(true);
                    jTextField6.setEnabled(true);
                    
                }        
                catch (Exception e) {
                    System.err.println( e.getMessage() );
                    e.printStackTrace();
                }                
            }
            }
    });
        
    valueOfList.start();
//        if(!valueOfList.isInterrupted() && !executor.isInterrupted()){
//            valueOfList.start();
//            valueOfList.interrupt();
//          executor.interrupt();
//        }
    }//GEN-LAST:event_jList1ValueChanged

  //  // EXECUTE
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    Thread executor = new Thread(new Runnable(){
        public void run(){
            Vector<String> arguments = new Vector<>();
                arguments.add(procedureNames.elementAt(selectedProcedure));
                arguments.add(jTextField2.getText());
                arguments.add(jTextField3.getText());
                arguments.add(jTextField4.getText());
                arguments.add(jTextField5.getText());
                arguments.add(jTextField6.getText());
        
                try
                {
                    System.out.println("Wykonanie procedury");
                    outToServer.write('1');                    
                    
                    // SEND ARGUMENTS
                    for (int i = 0; i < numberOfArguments+1; i++) {
                        for (int j = 0; j < arguments.get(i).length(); j++) {
                            outToServer.write(arguments.get(i).charAt(j));
                        }
                        outToServer.write('\0');
                        outToServer.write('\n');
                    }
                    
                    outToServer.write('\0');
                    outToServer.write('\n');
                    
                    // READ RESULT
                    String result = "";
                    int character = 0;
                    while(true)
                    {
                        character = inFromServer.read();
                        if (character != 10) {
                            result += String.valueOf((char)character);
                        }
                        else break;
                    }
                    jLabel10.setText(result);
                }        
                catch (Exception e) {
                    System.err.println( e.getMessage() );
                    e.printStackTrace();
                    jLabel10.setText("");
                }
            }
    });
    executor.start();
// TODO add your handling code here:
//        executor.start();
    }//GEN-LAST:event_jButton2MouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
   /* public Thread valueOfList = new Thread(new Runnable() {
        public void run() {
            int index = jList1.getSelectedIndex();
                selectedProcedure=index;
                System.out.println("selected: "+index);
                jLabel12.setText("");
                try
                {
                    outToServer.write('0');
                    String indexStr = String.valueOf(index);
                    System.out.println(indexStr);
                    outToServer.write(indexStr.charAt(0));
                    String description = "";
                        
                    int character = 0;
                    character = inFromServer.read();
                        
                    numberOfArguments = character - '0';
                    System.out.println(numberOfArguments);
                    character = inFromServer.read();
                    while(true)
                    {
                        character = inFromServer.read();
                        if (character != 10) {
                            description += String.valueOf((char)character);
                        }
                        else break;
                    }
                    // display description
                    jLabel12.setText(description);
            
                    jButton2.setEnabled(true);
                    jTextField2.setEnabled(true);
                    jTextField3.setEnabled(true);
                    jTextField4.setEnabled(true);
                    jTextField5.setEnabled(true);
                    jTextField6.setEnabled(true);
                    
                }        
                catch (Exception e) {
                    System.err.println( e.getMessage() );
                    e.printStackTrace();
                }                
            }
    });*/
    
  /*  public Thread executor = new Thread(new Runnable(){
        public void run(){
            Vector<String> arguments = new Vector<>();
                arguments.add(procedureNames.elementAt(selectedProcedure));
                arguments.add(jTextField2.getText());
                arguments.add(jTextField3.getText());
                arguments.add(jTextField4.getText());
                arguments.add(jTextField5.getText());
                arguments.add(jTextField6.getText());
        
                try
                {
                    outToServer.write('1');                    
                    
                    // SEND ARGUMENTS
                    for (int i = 0; i < numberOfArguments+1; i++) {
                        for (int j = 0; j < arguments.get(i).length(); j++) {
                            outToServer.write(arguments.get(i).charAt(j));
                        }
                        outToServer.write('\0');
                        outToServer.write('\n');
                    }
                    
                    outToServer.write('\0');
                    outToServer.write('\n');
                    
                    // READ RESULT
                    String result = "";
                    int character = 0;
                    while(true)
                    {
                        character = inFromServer.read();
                        if (character != 10) {
                            result += String.valueOf((char)character);
                        }
                        else break;
                    }
                    jLabel10.setText(result);
                }        
                catch (Exception e) {
                    System.err.println( e.getMessage() );
                    e.printStackTrace();
                    jLabel10.setText("");
                }
            }
    });*/
    
    private int selectedProcedure;
    private int numberOfProcedures;
    private int numberOfArguments;
    private Vector<String> procedureNames = new Vector<>();
    private Socket clientSocket;
    private DataOutputStream outToServer;
    private BufferedReader inFromServer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables

}