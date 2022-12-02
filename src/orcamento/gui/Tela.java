/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamento.gui;

import orcamento.code.Calculo;
import orcamento.code.Formatter;
import orcamento.code.SystemClipboard;

/**
 *
 * @author Ellen
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form jpOrcamento
     */
    
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupITCD = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpITBI = new javax.swing.JPanel();
        jlValorAvaliacaoITBI = new javax.swing.JLabel();
        jlItbi = new javax.swing.JLabel();
        jlEscrituraITBI = new javax.swing.JLabel();
        jlRegistroITBI = new javax.swing.JLabel();
        jlTotalITBI = new javax.swing.JLabel();
        jtfValorAvaliacaoITBI = new javax.swing.JTextField();
        jtfItbi = new javax.swing.JTextField();
        jtfEscrituraiITBI = new javax.swing.JTextField();
        jtfRegistroITBI = new javax.swing.JTextField();
        jtfTotalITBI = new javax.swing.JTextField();
        jbCalcularITBI = new javax.swing.JButton();
        jbCopiarITBI = new javax.swing.JButton();
        jpITCD = new javax.swing.JPanel();
        jlValorAvaliacaoITCD = new javax.swing.JLabel();
        jlITCD = new javax.swing.JLabel();
        jlEscrituraITCD = new javax.swing.JLabel();
        jlRegistroITCD = new javax.swing.JLabel();
        jlTotalITCD = new javax.swing.JLabel();
        jtfValorAvaliacaoITCD = new javax.swing.JTextField();
        jtfITCD = new javax.swing.JTextField();
        jtfEscrituraiITCD = new javax.swing.JTextField();
        jtfRegistroITCD = new javax.swing.JTextField();
        jtfTotalITCD = new javax.swing.JTextField();
        jbCalcularITCD = new javax.swing.JButton();
        jbCopiarITCD = new javax.swing.JButton();
        jrbDoacao = new javax.swing.JRadioButton();
        jrbInventario = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orçamento");
        setAlwaysOnTop(true);
        setResizable(false);

        jpITBI.setBackground(new java.awt.Color(255, 255, 255));
        jpITBI.setName(""); // NOI18N
        jpITBI.setPreferredSize(new java.awt.Dimension(300, 300));

        jlValorAvaliacaoITBI.setText("Valor da Avaliação:");

        jlItbi.setText("ITBI (2%):");

        jlEscrituraITBI.setText("Escritura:");

        jlRegistroITBI.setText("Registro:");

        jlTotalITBI.setText("Total:");

        jtfValorAvaliacaoITBI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfValorAvaliacaoITBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorAvaliacaoITBIActionPerformed(evt);
            }
        });
        jtfValorAvaliacaoITBI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfValorAvaliacaoITBIKeyPressed(evt);
            }
        });

        jtfItbi.setEditable(false);
        jtfItbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfItbiActionPerformed(evt);
            }
        });

        jtfEscrituraiITBI.setEditable(false);
        jtfEscrituraiITBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEscrituraiITBIActionPerformed(evt);
            }
        });

        jtfRegistroITBI.setEditable(false);
        jtfRegistroITBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRegistroITBIActionPerformed(evt);
            }
        });

        jbCalcularITBI.setText("Calcular");
        jbCalcularITBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularITBIActionPerformed(evt);
            }
        });

        jbCopiarITBI.setText("Copiar");
        jbCopiarITBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCopiarITBIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpITBILayout = new javax.swing.GroupLayout(jpITBI);
        jpITBI.setLayout(jpITBILayout);
        jpITBILayout.setHorizontalGroup(
            jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpITBILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlValorAvaliacaoITBI)
                    .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlEscrituraITBI)
                        .addComponent(jlItbi)
                        .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlTotalITBI)
                            .addComponent(jlRegistroITBI))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfValorAvaliacaoITBI, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jtfItbi)
                    .addComponent(jtfRegistroITBI)
                    .addComponent(jtfEscrituraiITBI)
                    .addComponent(jtfTotalITBI)
                    .addGroup(jpITBILayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbCalcularITBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCopiarITBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jpITBILayout.setVerticalGroup(
            jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpITBILayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorAvaliacaoITBI)
                    .addComponent(jtfValorAvaliacaoITBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlItbi)
                    .addComponent(jtfItbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEscrituraITBI)
                    .addComponent(jtfEscrituraiITBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegistroITBI)
                    .addComponent(jtfRegistroITBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jpITBILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotalITBI)
                    .addComponent(jtfTotalITBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbCalcularITBI)
                .addGap(5, 5, 5)
                .addComponent(jbCopiarITBI)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ITBI", jpITBI);

        jpITCD.setBackground(new java.awt.Color(255, 255, 255));
        jpITCD.setName(""); // NOI18N
        jpITCD.setPreferredSize(new java.awt.Dimension(300, 300));

        jlValorAvaliacaoITCD.setText("Valor da Avaliação:");

        jlITCD.setText("ITCD:");

        jlEscrituraITCD.setText("Escritura:");

        jlRegistroITCD.setText("Registro:");

        jlTotalITCD.setText("Total:");

        jtfValorAvaliacaoITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorAvaliacaoITCDActionPerformed(evt);
            }
        });
        jtfValorAvaliacaoITCD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfValorAvaliacaoITCDKeyPressed(evt);
            }
        });

        jtfITCD.setEditable(false);
        jtfITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfITCDActionPerformed(evt);
            }
        });

        jtfEscrituraiITCD.setEditable(false);
        jtfEscrituraiITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEscrituraiITCDActionPerformed(evt);
            }
        });

        jtfRegistroITCD.setEditable(false);
        jtfRegistroITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRegistroITCDActionPerformed(evt);
            }
        });

        jtfTotalITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalITCDActionPerformed(evt);
            }
        });

        jbCalcularITCD.setText("Calcular");
        jbCalcularITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularITCDActionPerformed(evt);
            }
        });

        jbCopiarITCD.setText("Copiar");
        jbCopiarITCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCopiarITCDActionPerformed(evt);
            }
        });

        buttonGroupITCD.add(jrbDoacao);
        jrbDoacao.setSelected(true);
        jrbDoacao.setText("Doação (3%)");
        jrbDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDoacaoActionPerformed(evt);
            }
        });

        buttonGroupITCD.add(jrbInventario);
        jrbInventario.setText("Inventário (4%)");
        jrbInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpITCDLayout = new javax.swing.GroupLayout(jpITCD);
        jpITCD.setLayout(jpITCDLayout);
        jpITCDLayout.setHorizontalGroup(
            jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpITCDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlValorAvaliacaoITCD)
                    .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlEscrituraITCD)
                        .addComponent(jlITCD)
                        .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlTotalITCD)
                            .addComponent(jlRegistroITCD))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfValorAvaliacaoITCD, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jtfITCD)
                    .addComponent(jtfRegistroITCD)
                    .addComponent(jtfEscrituraiITCD)
                    .addComponent(jtfTotalITCD)
                    .addGroup(jpITCDLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbCalcularITCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCopiarITCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbDoacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jpITCDLayout.setVerticalGroup(
            jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpITCDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorAvaliacaoITCD)
                    .addComponent(jtfValorAvaliacaoITCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbDoacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlITCD)
                    .addComponent(jtfITCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbInventario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEscrituraITCD)
                    .addComponent(jtfEscrituraiITCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegistroITCD)
                    .addComponent(jtfRegistroITCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jpITCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotalITCD)
                    .addComponent(jtfTotalITCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbCalcularITCD)
                .addGap(5, 5, 5)
                .addComponent(jbCopiarITCD)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ITCD", jpITCD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfValorAvaliacaoITBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorAvaliacaoITBIActionPerformed
        /*if(jtfValorAvaliacaoITBI){
            
        }*/
    }//GEN-LAST:event_jtfValorAvaliacaoITBIActionPerformed

    private void jtfValorAvaliacaoITBIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorAvaliacaoITBIKeyPressed

    }//GEN-LAST:event_jtfValorAvaliacaoITBIKeyPressed

    private void jtfItbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfItbiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfItbiActionPerformed

    private void jtfEscrituraiITBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEscrituraiITBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEscrituraiITBIActionPerformed

    private void jtfRegistroITBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRegistroITBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRegistroITBIActionPerformed

    private void jbCalcularITBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularITBIActionPerformed
        Calculo calc = new Calculo();
        Formatter form = new Formatter();
        
        double itbi;
        double escritura;
        double registro;
        double valorAvaliacao = Double.parseDouble(jtfValorAvaliacaoITBI.getText());

        //calc.CalcularITBI(valorAvaliacao);

        jtfValorAvaliacaoITBI.setText(form.format(valorAvaliacao));

        //ITBI
        itbi = calc.calculoITBI(valorAvaliacao);
        jtfItbi.setText(form.format(itbi));

        //Escritura
        escritura = calc.calculoEscritura(valorAvaliacao);
        jtfEscrituraiITBI.setText(form.format(escritura));

        //Registro
        registro = calc.calculoRegistro(valorAvaliacao);
        jtfRegistroITBI.setText(form.format(registro));

        //Total
        double total = itbi + escritura + registro;
        jtfTotalITBI.setText(form.format(total));

    }//GEN-LAST:event_jbCalcularITBIActionPerformed

    private void jbCopiarITBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCopiarITBIActionPerformed
        // Botão Copiar
        String stringCopiada = new String();

        stringCopiada = "Avaliação: "+ jtfValorAvaliacaoITBI.getText() + "\n" +
        "ITBI (2%): " + jtfItbi.getText()+ "\n" +
        "Escritura: " + jtfEscrituraiITBI.getText()+ "\n" +
        "Registro: " + jtfRegistroITBI.getText()+ "\n\n" +
        "Total: " + jtfTotalITBI.getText() + "\n";

        SystemClipboard.copiar(stringCopiada);

    }//GEN-LAST:event_jbCopiarITBIActionPerformed

    private void jtfValorAvaliacaoITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorAvaliacaoITCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorAvaliacaoITCDActionPerformed

    private void jtfValorAvaliacaoITCDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorAvaliacaoITCDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorAvaliacaoITCDKeyPressed

    private void jtfITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfITCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfITCDActionPerformed

    private void jtfEscrituraiITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEscrituraiITCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEscrituraiITCDActionPerformed

    private void jtfRegistroITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRegistroITCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRegistroITCDActionPerformed

    private void jbCalcularITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularITCDActionPerformed
        double itcd = 0;
        double escritura;
        double registro;
        double valorAvaliacao = Double.parseDouble(jtfValorAvaliacaoITCD.getText());
        Calculo calc = new Calculo();
        Formatter form = new Formatter();

        jtfValorAvaliacaoITCD.setText(form.format(valorAvaliacao));

        //ITCD
        /*if (jrbDoacao.isEnabled()){
            itcd = calc.calculoITCD3(valorAvaliacao);
        } else {  
            itcd = calc.calculoITCD4(valorAvaliacao);  
        } */
           
        
        jtfITCD.setText(form.format(itcd));

        //Escritura
        escritura = calc.calculoEscritura(valorAvaliacao);
        jtfEscrituraiITCD.setText(form.format(escritura));

        //Registro
        registro = calc.calculoRegistro(valorAvaliacao);
        jtfRegistroITCD.setText(form.format(registro));

        //Total
        double total = itcd + escritura + registro;
        jtfTotalITCD.setText(form.format(total));
    }//GEN-LAST:event_jbCalcularITCDActionPerformed

    private void jbCopiarITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCopiarITCDActionPerformed
        // Botão Copiar
        String stringCopiada = new String();


        stringCopiada = "Avaliação: "+ jtfValorAvaliacaoITCD.getText() + "\n" +
        "ITCD: " + jtfITCD.getText()+ "\n" +
        "Escritura: " + jtfValorAvaliacaoITCD.getText()+ "\n" +
        "Registro: " + jtfRegistroITCD.getText()+ "\n\n" +
        "Total: " + jtfTotalITCD.getText() + "\n";
    }//GEN-LAST:event_jbCopiarITCDActionPerformed

    private void jtfTotalITCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalITCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalITCDActionPerformed

    private void jrbDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDoacaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbDoacaoActionPerformed

    private void jrbInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInventarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupITCD;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbCalcularITBI;
    private javax.swing.JButton jbCalcularITCD;
    private javax.swing.JButton jbCopiarITBI;
    private javax.swing.JButton jbCopiarITCD;
    private javax.swing.JLabel jlEscrituraITBI;
    private javax.swing.JLabel jlEscrituraITCD;
    private javax.swing.JLabel jlITCD;
    private javax.swing.JLabel jlItbi;
    private javax.swing.JLabel jlRegistroITBI;
    private javax.swing.JLabel jlRegistroITCD;
    private javax.swing.JLabel jlTotalITBI;
    private javax.swing.JLabel jlTotalITCD;
    private javax.swing.JLabel jlValorAvaliacaoITBI;
    private javax.swing.JLabel jlValorAvaliacaoITCD;
    private javax.swing.JPanel jpITBI;
    private javax.swing.JPanel jpITCD;
    private javax.swing.JRadioButton jrbDoacao;
    private javax.swing.JRadioButton jrbInventario;
    private javax.swing.JTextField jtfEscrituraiITBI;
    private javax.swing.JTextField jtfEscrituraiITCD;
    private javax.swing.JTextField jtfITCD;
    private javax.swing.JTextField jtfItbi;
    private javax.swing.JTextField jtfRegistroITBI;
    private javax.swing.JTextField jtfRegistroITCD;
    private javax.swing.JTextField jtfTotalITBI;
    private javax.swing.JTextField jtfTotalITCD;
    private javax.swing.JTextField jtfValorAvaliacaoITBI;
    private javax.swing.JTextField jtfValorAvaliacaoITCD;
    // End of variables declaration//GEN-END:variables
}
