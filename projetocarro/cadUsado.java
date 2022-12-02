package com.mycompany.projetocarro;
//Matheus Duarte 2417820
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Matheuws Duarte
 */
public class cadUsado extends javax.swing.JFrame {

    
    private Usado u = new Usado();
    private static cadUsado cadastroUsado;
    
    
    private cadUsado() {
        initComponents();
    }
    
     public static cadUsado getcadUsado(){
        
        if(cadastroUsado == null){
            
            
            cadastroUsado = new cadUsado();
        }
        
        return cadastroUsado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblNserie = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblTempoUso = new javax.swing.JLabel();
        lblValorManutencao = new javax.swing.JLabel();
        txtAnocadUsado = new javax.swing.JTextField();
        txtValorcadUsado = new javax.swing.JTextField();
        txtSeriecadUsado = new javax.swing.JTextField();
        txtModelocadUsado = new javax.swing.JTextField();
        txtMarcacadUsado = new javax.swing.JTextField();
        txtTempoUsocadUsado = new javax.swing.JTextField();
        txtValorManutencaocadUsado = new javax.swing.JTextField();
        btnCadastrarcadUsado = new javax.swing.JButton();
        btnConsultarcadUsado = new javax.swing.JButton();
        btnAlterarcadUsado = new javax.swing.JButton();
        btnRemovercadUsado = new javax.swing.JButton();
        btnLimparcadUsado = new javax.swing.JButton();
        btnSaircadUsado = new javax.swing.JButton();
        ScrollPaneUsado = new javax.swing.JScrollPane();
        tabUsado = new javax.swing.JTable();
        comboUsado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setText("CADASTRO CARRO USADO");

        lblAno.setText("Ano");

        lblNserie.setText("Número de Serie");

        lblValor.setText("Valor");

        lblModelo.setText("Modelo");

        lblMarca.setText("Marca");

        lblTempoUso.setText("Tempo de Uso");

        lblValorManutencao.setText("Valor Manutenção");

        txtAnocadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnocadUsadoActionPerformed(evt);
            }
        });

        txtValorcadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorcadUsadoActionPerformed(evt);
            }
        });

        txtModelocadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelocadUsadoActionPerformed(evt);
            }
        });

        txtMarcacadUsado.setToolTipText("");
        txtMarcacadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcacadUsadoActionPerformed(evt);
            }
        });

        txtTempoUsocadUsado.setToolTipText("");
        txtTempoUsocadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempoUsocadUsadoActionPerformed(evt);
            }
        });

        txtValorManutencaocadUsado.setToolTipText("");
        txtValorManutencaocadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorManutencaocadUsadoActionPerformed(evt);
            }
        });

        btnCadastrarcadUsado.setText("Cadastrar");
        btnCadastrarcadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarcadUsadoActionPerformed(evt);
            }
        });

        btnConsultarcadUsado.setText("Consultar");
        btnConsultarcadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarcadUsadoActionPerformed(evt);
            }
        });

        btnAlterarcadUsado.setText("Alterar");
        btnAlterarcadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarcadUsadoActionPerformed(evt);
            }
        });

        btnRemovercadUsado.setText("Remover");
        btnRemovercadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovercadUsadoActionPerformed(evt);
            }
        });

        btnLimparcadUsado.setText("Limpar");
        btnLimparcadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparcadUsadoActionPerformed(evt);
            }
        });

        btnSaircadUsado.setText("Sair");
        btnSaircadUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaircadUsadoActionPerformed(evt);
            }
        });

        tabUsado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ano", "Serie", "Valor", "Modelo", "Marca", "Tempo Uso", "Valor Manutencao"
            }
        ));
        tabUsado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabUsadoMouseClicked(evt);
            }
        });
        ScrollPaneUsado.setViewportView(tabUsado);

        comboUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblModelo)
                                .addGap(174, 174, 174)
                                .addComponent(lblMarca))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrarcadUsado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultarcadUsado)
                                .addGap(14, 14, 14)
                                .addComponent(btnAlterarcadUsado)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemovercadUsado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAno)
                                    .addComponent(txtAnocadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSeriecadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNserie))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValor)
                                    .addComponent(txtValorcadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnLimparcadUsado)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaircadUsado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTempoUsocadUsado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(txtModelocadUsado, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblTempoUso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorManutencao)
                                    .addComponent(txtMarcacadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorManutencaocadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ScrollPaneUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblAno)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNserie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorcadUsado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAnocadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSeriecadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelocadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarcacadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempoUso)
                    .addComponent(lblValorManutencao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorManutencaocadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoUsocadUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarcadUsado)
                    .addComponent(btnConsultarcadUsado)
                    .addComponent(btnAlterarcadUsado)
                    .addComponent(btnRemovercadUsado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparcadUsado)
                    .addComponent(btnSaircadUsado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnocadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnocadUsadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnocadUsadoActionPerformed

    private void txtValorcadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorcadUsadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorcadUsadoActionPerformed

    private void txtModelocadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelocadUsadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelocadUsadoActionPerformed

    private void txtMarcacadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcacadUsadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcacadUsadoActionPerformed

    private void txtTempoUsocadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempoUsocadUsadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempoUsocadUsadoActionPerformed

    private void txtValorManutencaocadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorManutencaocadUsadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorManutencaocadUsadoActionPerformed

    private void tabUsadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUsadoMouseClicked
        selectTab();
    }//GEN-LAST:event_tabUsadoMouseClicked

    private void comboUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsadoActionPerformed
        selectComboUsado();
    }//GEN-LAST:event_comboUsadoActionPerformed

    private void btnCadastrarcadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarcadUsadoActionPerformed
       cadastrar();
       listTab();
       carregarCombUsado();
    }//GEN-LAST:event_btnCadastrarcadUsadoActionPerformed

    private void btnConsultarcadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarcadUsadoActionPerformed
        consUsadoSerie();
    }//GEN-LAST:event_btnConsultarcadUsadoActionPerformed

    private void btnAlterarcadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarcadUsadoActionPerformed
        altUsadoSerie();
        listTab();
        carregarCombUsado();
    }//GEN-LAST:event_btnAlterarcadUsadoActionPerformed

    private void btnRemovercadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovercadUsadoActionPerformed
        excUsadoSerie();
        listTab();
        carregarCombUsado(); 
    }//GEN-LAST:event_btnRemovercadUsadoActionPerformed

    private void btnLimparcadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparcadUsadoActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparcadUsadoActionPerformed

    private void btnSaircadUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaircadUsadoActionPerformed
        sair();
    }//GEN-LAST:event_btnSaircadUsadoActionPerformed

      public void cadastrar(){
        u = new Usado();
        
        try{    
            u.setAno(Integer.parseInt(txtAnocadUsado.getText()));
            u.setSerie(Integer.parseInt(txtSeriecadUsado.getText()));
            u.setValor(Double.parseDouble(txtValorcadUsado.getText()));
            u.setModelo(txtModelocadUsado.getText());
            u.setMarca(txtMarcacadUsado.getText());
            u.setTempoUso(Integer.parseInt(txtTempoUsocadUsado.getText()));
            u.setValorManutencao(Double.parseDouble(txtValorManutencaocadUsado.getText()));
        
        u = GerUsado.getGerUsado().cadUsado(u);
        
        if(u != null){
            JOptionPane.showMessageDialog(
                    null,
                    " Carro usado cadastrado com sucesso ",
                    "Cadastro Carro Usado",
                    JOptionPane.PLAIN_MESSAGE
                );
            limpar();
        }
        else{
                    JOptionPane.showMessageDialog(
                    null,
                    "Já existe um Carro com esse número de Serie.",
                    "Cadastro Carro Usado",
                    JOptionPane.ERROR_MESSAGE
                );
        }
    }
        catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                    null,
                    "O número de serie deve ser um int",
                    "Erro de preenchimento",
                    JOptionPane.ERROR_MESSAGE
                );
         }   
    }
     
     public void altUsadoSerie(){
        u = new Usado();
        u.setSerie(Integer.parseInt(txtSeriecadUsado.getText()));

             
        u = GerUsado.getGerUsado().atualizaUsadoCod(u);
        
        if(u != null){
            
            
            txtMarcacadUsado.setText(u.getMarca());
            JOptionPane.showMessageDialog(
                    null,
                    " Verifique os dados ",
                    " Atualização do Carro usado pelo número de serie",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
        else{
                   JOptionPane.showMessageDialog(
                    null,
                    "Não existe um Carro usado com este número de serie",
                    "Alteração do Carro usado pelo número de serie",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
     
     
       public void consUsadoSerie(){
        u = new Usado();
        u.setSerie(Integer.parseInt(txtSeriecadUsado.getText())); 
        
        u = GerUsado.getGerUsado().consUsadoCod(u);
        
        if(u != null){
            
           txtAnocadUsado.setText(Integer.toString(u.getAno()));  
           txtMarcacadUsado.setText(u.getMarca());        
           txtValorcadUsado.setText(Double.toString(u.getValor()));
           txtModelocadUsado.setText(u.getModelo());
           txtTempoUsocadUsado.setText(Integer.toString(u.getTempoUso()));
           txtValorManutencaocadUsado.setText(Double.toString(u.getValorManutencao()));
           
            JOptionPane.showMessageDialog(
                    null,
                    " Verifique os dados ",
                    "Consulta Carro usado pelo numero de serie",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
        else{
                   JOptionPane.showMessageDialog(
                    null,
                    "Não existe Carro usado com este numero de serie",
                    "Consulta Carro usado pelo numero de serie",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
       
       public void excUsadoSerie(){
           
        u = new Usado();
        u.setSerie(Integer.parseInt(txtSeriecadUsado.getText()));
        
       u = GerUsado.getGerUsado().removeUsadoCod(u);
        
        if(u == null){
            JOptionPane.showMessageDialog(
                    null,
                    " Carro usado excluído com sucesso",
                    "Remoção de Carro usado pelo numero de serie",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
        else{
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe Carro usado com este numero de serie",
                    "Remoção de Carro usado pelo numero de serie",
                    JOptionPane.ERROR_MESSAGE
            );
        }
            
    }
       
    public void limpar(){
        
        txtAnocadUsado.setText("");
        txtSeriecadUsado.setText("");
        txtValorcadUsado.setText("");
        txtModelocadUsado.setText("");
        txtMarcacadUsado.setText("");
        txtTempoUsocadUsado.setText("");
        txtValorManutencaocadUsado.setText("");
        
        txtAnocadUsado.requestFocus();
        
    }
    public void sair(){
            int respSair = JOptionPane.showConfirmDialog(
                        null,
                        "Deseja realmente sair?",
                        "Saida",
                        JOptionPane.YES_NO_OPTION
                );
        if(respSair == 0){
            //System.exit(0);
            dispose();
        }
    }
    
    public void listTab(){
      DefaultTableModel modelo = (DefaultTableModel)tabUsado.getModel();
      int posLin = 0;
      modelo.setRowCount(posLin);
      
      for(Usado u : GerUsado.getGerUsado().getbdUsado()){
          modelo.insertRow(posLin, new Object[]{u.getAno(),u.getSerie(), u.getValor(), u.getModelo(), u.getMarca(), u.getTempoUso(), u.getValorManutencao()});
          posLin++;
      }
   }
   
   public void selectTab(){
       String valLin = "";
       int posLin = tabUsado.getSelectedRow();
       
       for(int coluna = 0; coluna < tabUsado.getColumnCount();coluna++){
           valLin += tabUsado.getModel().getValueAt(posLin, coluna).toString();
           
           if(coluna+1 < tabUsado.getColumnCount()){
               valLin+=" - ";
           }
       }
       JOptionPane.showMessageDialog(
               null,
               "O carro usado selecionado foi: \n"+valLin,
               "Resultado da seleção",
               JOptionPane.INFORMATION_MESSAGE
       );
    }
    public void carregarCombUsado(){
        comboUsado.removeAllItems();
        comboUsado.addItem("Escolha um Carro: ");
        
        for(Usado u : GerUsado.getGerUsado().getbdUsado()){
            comboUsado.addItem(" Ano: "+u.getAno()+ " - Serie: "+u.getSerie() + " - Valor: "+u.getValor() + " - Modelo: "+u.getModelo() + " - Marca: "+u.getMarca() + " - Tempo uso: "+u.getTempoUso()+ " - Valor Manutencao: "+ u.getValorManutencao());
        }
    }
    
    public void selectComboUsado(){
        //String valLin = "";
        if(comboUsado.getSelectedIndex()>=1){
            String valLin = comboUsado.getSelectedItem().toString();
        JOptionPane.showMessageDialog(
                null,
                "Carro usado escolhido: \n"+valLin,
                "Seleção de Carro usado",
                JOptionPane.INFORMATION_MESSAGE                        
            );
        }
    }

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
            java.util.logging.Logger.getLogger(cadUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadUsado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneUsado;
    private javax.swing.JButton btnAlterarcadUsado;
    private javax.swing.JButton btnCadastrarcadUsado;
    private javax.swing.JButton btnConsultarcadUsado;
    private javax.swing.JButton btnLimparcadUsado;
    private javax.swing.JButton btnRemovercadUsado;
    private javax.swing.JButton btnSaircadUsado;
    private javax.swing.JComboBox<String> comboUsado;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNserie;
    private javax.swing.JLabel lblTempoUso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorManutencao;
    private javax.swing.JTable tabUsado;
    private javax.swing.JTextField txtAnocadUsado;
    private javax.swing.JTextField txtMarcacadUsado;
    private javax.swing.JTextField txtModelocadUsado;
    private javax.swing.JTextField txtSeriecadUsado;
    private javax.swing.JTextField txtTempoUsocadUsado;
    private javax.swing.JTextField txtValorManutencaocadUsado;
    private javax.swing.JTextField txtValorcadUsado;
    // End of variables declaration//GEN-END:variables
}
