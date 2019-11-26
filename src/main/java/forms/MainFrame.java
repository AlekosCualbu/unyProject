package forms;

import java.util.Enumeration;
import javax.swing.*;
import usage.LibreriaLibri;
import usage.Libri;

/**
 *
 * @author Kasane
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    LibreriaLibri libreria = new LibreriaLibri();
    public MainFrame() {
        initComponents();
        this.setResizable(false);
        this.mainTxtArea.setEditable(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        btnGroup = new javax.swing.ButtonGroup();
        inseriscibtn = new javax.swing.JButton();
        rimuovibtn = new javax.swing.JButton();
        visualizzatuttibtn = new javax.swing.JButton();
        cancellabtn = new javax.swing.JButton();
        abilitaRicerca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTxtArea = new javax.swing.JTextArea();
        isbnField = new javax.swing.JTextField();
        autoreField = new javax.swing.JTextField();
        titoloField = new javax.swing.JTextField();
        prezzoField = new javax.swing.JTextField();
        genereCB = new javax.swing.JComboBox<>();
        notDispRadio = new javax.swing.JRadioButton();
        eDispRadio = new javax.swing.JRadioButton();
        cercabtn = new javax.swing.JButton();
        idField = new javax.swing.JTextField();

        btnGroup.add(eDispRadio);
        btnGroup.add(notDispRadio);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        abilitaRicerca.setText("Abilita");
         abilitaRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abilitaRicercaActionPerformed(evt);
            }
        });

        inseriscibtn.setText("Inserisci");
        inseriscibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inseriscibtnActionPerformed(evt);
            }
        });

        rimuovibtn.setText("Rimuovi");
        rimuovibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rimuovibtnActionPerformed(evt);
            }
        });

        visualizzatuttibtn.setText("Visualizza Tutti");
        visualizzatuttibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizzatuttibtnActionPerformed(evt);
            }
        });

        cancellabtn.setText("Cancella");
        cancellabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellabtnActionPerformed(evt);
            }
        });
        mainTxtArea.setColumns(20);
        mainTxtArea.setRows(5);
        jScrollPane1.setViewportView(mainTxtArea);

        isbnField.setText("Isbn");
        isbnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnFieldActionPerformed(evt);
            }
        });

        autoreField.setText("Autore");

        titoloField.setText("Tirolo");

        prezzoField.setText("Prezzo");

        genereCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saggio", "giallo", "fantascienza" }));

        notDispRadio.setText("Non Disponibile");

        eDispRadio.setText("Disponibile");

        cercabtn.setText("Cerca ");
        cercabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercabtnActionPerformed(evt);
            }
        });

        idField.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(eDispRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                                .addComponent(notDispRadio))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(titoloField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(autoreField)
                                                        .addComponent(prezzoField)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(isbnField)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(inseriscibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                /**/

//                                                                .addGroup(layout.createSequentialGroup()
//                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                                                                                .addGroup(layout.createSequentialGroup()
//                                                                                        .addComponent(abilitaRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                                        .addGap(18, 18, 18)

                                                                /**/
                                                                .addComponent(rimuovibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(cercabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(abilitaRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(visualizzatuttibtn)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(cancellabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(28, 28, 28))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(genereCB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(autoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(titoloField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(prezzoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(inseriscibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rimuovibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(visualizzatuttibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cancellabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                        .addComponent(abilitaRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eDispRadio)
                                        .addComponent(notDispRadio))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(genereCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cercabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(abilitaRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isbnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_isbnFieldActionPerformed

    private void inseriscibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inseriscibtnActionPerformed
        try {
            libreria.inserisci(libreria.getMap(),
                    new Libri(Long.parseLong(isbnField.getText()),
                            autoreField.getText(), Integer.parseInt(prezzoField.getText()),
                            titoloField.getText(), genereCB.getSelectedItem().toString(),
                            controllo()), isbnField);
        }catch (NumberFormatException ex) {
            System.out.println(ex);
            /*popup*/
            JOptionPane.showMessageDialog(this,"Price and isbn must be a number");
        }catch (NullPointerException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Not correct or empty field!");
        }

    }

    private void visualizzatuttibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizzatuttibtnActionPerformed
        // TODO add your handling code here:
        libreria.visualizza_tutti(libreria.getMap(), mainTxtArea);

    }

    private void rimuovibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimuovibtnActionPerformed
        try {
            libreria.rimuovi(libreria.getMap(), Long.parseLong(isbnField.getText()));
        }catch (NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"l'isbn deve essere un numero");
        }catch (NullPointerException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"this id doesn't exist");
        }

    }

    private void cancellabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimuovibtnActionPerformed
        cancella();
    }

    private void abilitaRicercaActionPerformed(java.awt.event.ActionEvent event) {
        abilitaRicerca.setVisible(false);
        cercabtn.setVisible(true);
        idField.setVisible(true);
    }


    private void cercabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercabtnActionPerformed
        // TODO add your handling code here:
        try {
            libreria.cerca(libreria.getMap(), mainTxtArea, Long.parseLong(idField.getText()));
        }catch (Exception ex) {
            if(!ex.getClass().getName().equals(NumberFormatException.class.getName()))
                JOptionPane.showMessageDialog(this, "the id doesn't exist");
            else
                JOptionPane.showMessageDialog(this, "the ID is a number");

        }
    }//GEN-LAST:event_cercabtnActionPerformed
    public String controllo(){
        String tmp="";
        Enumeration<AbstractButton>elements = btnGroup.getElements();
        while(elements.hasMoreElements()){
            JRadioButton btn = (JRadioButton) elements.nextElement();
            if(btn.isSelected())
                tmp = btn.getText();
        }
        if(tmp.equals(""))
            JOptionPane.showMessageDialog(this, "the availability is not selected");

        return tmp;
    }

    public void cancella(){
        if(mainTxtArea.getText().equals(""))
            JOptionPane.showMessageDialog(this, "it is already empty");
        else
        mainTxtArea.setText("");
    }

    public String controllo2(){
        String tmp = "";
        if(eDispRadio.isSelected()) {
            tmp =  eDispRadio.getText().toString();
        }else if(notDispRadio.isSelected()){
           tmp =  notDispRadio.getText().toString();
        }
        return tmp;
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame main = new MainFrame();
                main.setVisible(true);
                main.cercabtn.setVisible(false);
                main.idField.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autoreField;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton cancellabtn;
    private javax.swing.JButton cercabtn;
    private javax.swing.JRadioButton eDispRadio;
    private javax.swing.JComboBox<String> genereCB;
    private javax.swing.JTextField idField;
    private javax.swing.JButton inseriscibtn;
    private javax.swing.JTextField isbnField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mainTxtArea;
    private javax.swing.JRadioButton notDispRadio;
    private javax.swing.JTextField prezzoField;
    private javax.swing.JButton rimuovibtn;
    private javax.swing.JTextField titoloField;
    private javax.swing.JButton visualizzatuttibtn;
    private javax.swing.JButton abilitaRicerca;
    // End of variables declaration//GEN-END:variables

    public LibreriaLibri getLibreria() {
        return libreria;
    }

    public void setLibreria(LibreriaLibri libreria) {
        this.libreria = libreria;
    }

    public JTextField getAutoreField() {
        return autoreField;
    }

    public void setAutoreField(JTextField autoreField) {
        this.autoreField = autoreField;
    }

    public ButtonGroup getBtnGroup() {
        return btnGroup;
    }

    public void setBtnGroup(ButtonGroup btnGroup) {
        this.btnGroup = btnGroup;
    }

    public JButton getCancellabtn() {
        return cancellabtn;
    }

    public void setCancellabtn(JButton cancellabtn) {
        this.cancellabtn = cancellabtn;
    }

    public JButton getCercabtn() {
        return cercabtn;
    }

    public void setCercabtn(JButton cercabtn) {
        this.cercabtn = cercabtn;
    }

    public JRadioButton geteDispRadio() {
        return eDispRadio;
    }

    public void seteDispRadio(JRadioButton eDispRadio) {
        this.eDispRadio = eDispRadio;
    }

    public JComboBox<String> getGenereCB() {
        return genereCB;
    }

    public void setGenereCB(JComboBox<String> genereCB) {
        this.genereCB = genereCB;
    }

    public JTextField getIdField() {
        return idField;
    }

    public void setIdField(JTextField idField) {
        this.idField = idField;
    }

    public JButton getInseriscibtn() {
        return inseriscibtn;
    }

    public void setInseriscibtn(JButton inseriscibtn) {
        this.inseriscibtn = inseriscibtn;
    }

    public JTextField getIsbnField() {
        return isbnField;
    }

    public void setIsbnField(JTextField isbnField) {
        this.isbnField = isbnField;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return mainTxtArea;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.mainTxtArea = jTextArea1;
    }

    public JTextField getjTextField4() {
        return prezzoField;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.prezzoField = jTextField4;
    }

    public JRadioButton getNotDispRadio() {
        return notDispRadio;
    }

    public void setNotDispRadio(JRadioButton notDispRadio) {
        this.notDispRadio = notDispRadio;
    }

    public JButton getRimuovibtn() {
        return rimuovibtn;
    }

    public void setRimuovibtn(JButton rimuovibtn) {
        this.rimuovibtn = rimuovibtn;
    }

    public JTextField getTitoloField() {
        return titoloField;
    }

    public void setTitoloField(JTextField titoloField) {
        this.titoloField = titoloField;
    }

    public JButton getVisualizzatuttibtn() {
        return visualizzatuttibtn;
    }

    public void setVisualizzatuttibtn(JButton visualizzatuttibtn) {
        this.visualizzatuttibtn = visualizzatuttibtn;
    }

}
