
package exercicioordenacao.View;

import exercicioordenacao.Presenter.OrdenaPresenter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;


public class View extends javax.swing.JFrame {

   
    public View() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblSemOrdem = new javax.swing.JLabel();
        lblOrdenados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSemOrdem = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrdenados = new javax.swing.JTextArea();
        lblMetodoOrdenacao = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        btnCarregarArquivo = new javax.swing.JButton();
        rbtnCrescente = new javax.swing.JRadioButton();
        rbtnDecrescente = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblOrdem = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSemOrdem.setText("Elementos a serem Ordenados");

        lblOrdenados.setText("Elementos Ordenados");

        lstSemOrdem.setColumns(20);
        lstSemOrdem.setRows(5);
        jScrollPane2.setViewportView(lstSemOrdem);

        lstOrdenados.setColumns(20);
        lstOrdenados.setRows(5);
        jScrollPane3.setViewportView(lstOrdenados);

        lblMetodoOrdenacao.setText("Método de Ordenação");

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnCarregarArquivo.setText("Carregar Arquivo ...");

        rbtnCrescente.setText("Crescente");
        rbtnCrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCrescenteActionPerformed(evt);
            }
        });

        rbtnDecrescente.setText("Decrescente");

        jLabel1.setText("Tempo: ");

        lblTempo.setText("0 ms");

        lblOrdem.setText("Ordem");

        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BubbleSort", "SelectionSort" }));
        cmbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSemOrdem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rbtnCrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnDecrescente, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(lblOrdem))
                            .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(370, 370, 370)
                            .addComponent(lblMetodoOrdenacao))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(btnCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(lblTempo)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemOrdem)
                    .addComponent(lblOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMetodoOrdenacao)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOrdem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnCrescente)
                        .addGap(27, 27, 27)
                        .addComponent(rbtnDecrescente)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCarregarArquivo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblTempo)))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void rbtnCrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCrescenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCrescenteActionPerformed

    private void cmbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMetodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
                try{
                    View window = new View();
                    window.setPresenter(new OrdenaPresenter(window));
                    window.frame.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        
       btnCarregarArquivo.addActionListener((ActionEvent e) ->{
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			chooser.showOpenDialog(frame);
			File f = chooser.getSelectedFile();
			this.caminhoArquivo = f.getPath();
			presenter.lerArquivo(this.caminhoArquivo);
		});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMetodoOrdenacao;
    private javax.swing.JLabel lblOrdem;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblSemOrdem;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JTextArea lstOrdenados;
    private javax.swing.JTextArea lstSemOrdem;
    private javax.swing.JRadioButton rbtnCrescente;
    private javax.swing.JRadioButton rbtnDecrescente;
    // End of variables declaration//GEN-END:variables

    frame.getContentPane().add(btnCarregarArquivo);
    btnCarregarArquivo.addActionListener((ActionEvent e) ->{
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			chooser.showOpenDialog(frame);
			File f = chooser.getSelectedFile();
			this.caminhoArquivo = f.getPath();
			presenter.lerArquivo(this.caminhoArquivo);
		});
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    public JButton getBtnCarregarArquivo() {
        return btnCarregarArquivo;
    }

    public void setBtnCarregarArquivo(JButton btnCarregarArquivo) {
        this.btnCarregarArquivo = btnCarregarArquivo;
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    public void setBtnOrdenar(JButton btnOrdenar) {
        this.btnOrdenar = btnOrdenar;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JComboBox<String> getCmbMetodo() {
        return cmbMetodo;
    }

    public void setCmbMetodo(JComboBox<String> cmbMetodo) {
        this.cmbMetodo = cmbMetodo;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JLabel getLblMetodoOrdenacao() {
        return lblMetodoOrdenacao;
    }

    public void setLblMetodoOrdenacao(JLabel lblMetodoOrdenacao) {
        this.lblMetodoOrdenacao = lblMetodoOrdenacao;
    }

    public JLabel getLblOrdem() {
        return lblOrdem;
    }

    public void setLblOrdem(JLabel lblOrdem) {
        this.lblOrdem = lblOrdem;
    }

    public JLabel getLblOrdenados() {
        return lblOrdenados;
    }

    public void setLblOrdenados(JLabel lblOrdenados) {
        this.lblOrdenados = lblOrdenados;
    }

    public JLabel getLblSemOrdem() {
        return lblSemOrdem;
    }

    public void setLblSemOrdem(JLabel lblSemOrdem) {
        this.lblSemOrdem = lblSemOrdem;
    }

    public JLabel getLblTempo() {
        return lblTempo;
    }

    public void setLblTempo(JLabel lblTempo) {
        this.lblTempo = lblTempo;
    }

    public JTextArea getLstOrdenados() {
        return lstOrdenados;
    }

    public void setLstOrdenados(JTextArea lstOrdenados) {
        this.lstOrdenados = lstOrdenados;
    }

    public JTextArea getLstSemOrdem() {
        return lstSemOrdem;
    }

    public void setLstSemOrdem(JTextArea lstSemOrdem) {
        this.lstSemOrdem = lstSemOrdem;
    }

    public JRadioButton getRbtnCrescente() {
        return rbtnCrescente;
    }

    public void setRbtnCrescente(JRadioButton rbtnCrescente) {
        this.rbtnCrescente = rbtnCrescente;
    }

    public JRadioButton getRbtnDecrescente() {
        return rbtnDecrescente;
    }

    public void setRbtnDecrescente(JRadioButton rbtnDecrescente) {
        this.rbtnDecrescente = rbtnDecrescente;
    }

    






}
