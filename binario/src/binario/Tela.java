package binario;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
        
        /**
         * O comando "setExtendedState(MAXIMIZED_BOTH)" deixa o programa em tela cheia
         */
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    /**
     * Função que recebe um número n em String e define o 
     * campo na tela o valor correspondente em binário
     * @param n 
     */
    public void intToBin(String n){
        
        String antes = "";
        for(int c=0; c<32-n.length(); c++){
            antes += "0";
        }
        
        /**
         * Converte a string do número em inteiro em binário
         * O segundo argumento na função "parseInt", serve para indicar
         * o tipo de conversão, nesse caso o binário
         */
        int numero = Integer.parseInt(antes + n, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
        System.out.println(numero);
        
        resultInt.setText(numero+"");
        
    }
    
    
    /**
     * Função que converte números binários para inteiros
     * @param n 
     */
    public void binToInt(String n){
        try{
            String bin = Integer.toBinaryString(Integer.parseInt(n));
            String str = "";
            int faltaP32 = 32 - bin.length();
            if(faltaP32 != 0){
                for(int c=0; c<faltaP32; c++){
                    str+="0";
                }
            }
            bin = str + bin;
            resultBin.setText(bin);
            //System.out.println("int = "+n+" | binario = "+bin+"\n");
            DefaultTableModel dtm = (DefaultTableModel) tabelaBinario.getModel();
            dtm.setNumRows(0);
            dtm.addRow(new Object[]{
                bin.charAt(0),
                bin.charAt(1),
                bin.charAt(2),
                bin.charAt(3),
                bin.charAt(4),
                bin.charAt(5),
                bin.charAt(6),
                bin.charAt(7),
                bin.charAt(8),
                bin.charAt(9),
                bin.charAt(10),
                bin.charAt(11),
                bin.charAt(12),
                bin.charAt(13),
                bin.charAt(14),
                bin.charAt(15),
                bin.charAt(16),
                bin.charAt(17),
                bin.charAt(18),
                bin.charAt(19),
                bin.charAt(20),
                bin.charAt(21),
                bin.charAt(22),
                bin.charAt(23),
                bin.charAt(24),
                bin.charAt(25),
                bin.charAt(26),
                bin.charAt(27),
                bin.charAt(28),
                bin.charAt(29),
                bin.charAt(30),
                bin.charAt(31)
            });
            tabelaBinario.setModel(dtm);
            
            
            tabelaBinario.setColumnSelectionAllowed(true);
            //tabelaBinario.addColumnSelectionInterval(0, 1);
            tabelaBinario.setRowSelectionInterval(0, 0);
            tabelaBinario.setColumnSelectionInterval(faltaP32, bin.length()-1);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ops :(\nParece que há algo errado com este número!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro\n"+e);
            System.out.println("Erro "+e);
        }
    }
    
    
    /**
     * Função para validar teclas nos campos,
     * só aceita "Ctrl+c", "Ctrl+C", "Ctrl+v", "Ctrl+V", "1" e "0"
     * @param evt 
     */
    private void validacaoNumeros(KeyEvent evt, JTextField campo) {
        /**
         * Validação para aceitar teclas de atalho
         * "Ctrl+c", "Ctrl+C", "Ctrl+v", "Ctrl+V" e 
         * somente os números "0", "1", "2", "3", "4", "5", "6", "7", "8" e "9"
         */
        if(evt.getKeyChar() == '0' || evt.getKeyChar() == '1' || 
                evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || 
                evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || 
                evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || 
                evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || 
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_CONTROL || 
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_V || 
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_C){
            campo.setText(campo.getText().replace("v", ""));
            campo.setText(campo.getText().replace("V", ""));
            campo.setText(campo.getText().replace("c", ""));
            campo.setText(campo.getText().replace("C", ""));
        }else{
            evt.consume();
        }
    }
    
    
    /**
     * Função para validar teclas nos campos,
     * só aceita "Ctrl+c", "Ctrl+C", "Ctrl+v", "Ctrl+V", "1" e "0"
     * @param evt 
     */
    private void validacao01(KeyEvent evt, JTextField campo) {
        /**
         * Validação para aceitar teclas de atalho
         * "Ctrl+c", "Ctrl+C", "Ctrl+v", "Ctrl+V" e 
         * somente os números "1" e "0"
         */
        if(!(evt.getKeyChar() == '0' || evt.getKeyChar() == '1')){
            evt.consume();
        }
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBinario = new javax.swing.JTable();
        nInt = new javax.swing.JTextField();
        numeroInteiro = new javax.swing.JLabel();
        convertToBin = new javax.swing.JButton();
        resultBin = new javax.swing.JTextField();
        titulo2 = new javax.swing.JLabel();
        numeroBinario = new javax.swing.JLabel();
        nBin = new javax.swing.JTextField();
        resultInt = new javax.swing.JTextField();
        convertToInt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo1.setText("Inteiro para Binário");

        jScrollPane1.setBorder(null);

        tabelaBinario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabelaBinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
            },
            new String [] {
                "2147483648", "1073741824", "536870912", "268435456", "134217728", "67108864", "33554432", "16777216", "8388608", "4194304", "2097152", "1048576", "524288", "262144", "131072", "65536", "32768", "16384", "8192", "4096", "2048", "1024", "512", "256", "128", "64", "32", "16", "8", "4", "2", "1"
            }
        ));
        tabelaBinario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelaBinario.setEnabled(false);
        tabelaBinario.setRowMargin(0);
        tabelaBinario.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaBinario);

        nInt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nInt.setToolTipText("");
        nInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nIntActionPerformed(evt);
            }
        });
        nInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nIntKeyTyped(evt);
            }
        });

        numeroInteiro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        numeroInteiro.setText("Número inteiro");

        convertToBin.setBackground(new java.awt.Color(255, 255, 255));
        convertToBin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        convertToBin.setText("Converter");
        convertToBin.setFocusPainted(false);
        convertToBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convertToBinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convertToBinMouseExited(evt);
            }
        });
        convertToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertToBinActionPerformed(evt);
            }
        });

        resultBin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        resultBin.setToolTipText("");
        resultBin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resultBinKeyTyped(evt);
            }
        });

        titulo2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo2.setText("Binário para Inteiro");

        numeroBinario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        numeroBinario.setText("Número binário");

        nBin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nBin.setToolTipText("");
        nBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nBinActionPerformed(evt);
            }
        });
        nBin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nBinKeyTyped(evt);
            }
        });

        resultInt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        resultInt.setToolTipText("");
        resultInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resultIntKeyTyped(evt);
            }
        });

        convertToInt.setBackground(new java.awt.Color(255, 255, 255));
        convertToInt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        convertToInt.setText("Converter");
        convertToInt.setFocusPainted(false);
        convertToInt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convertToIntMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convertToIntMouseExited(evt);
            }
        });
        convertToInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertToIntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                            .addComponent(resultBin)
                            .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nBin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                            .addComponent(numeroInteiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nInt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(convertToBin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultInt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(545, 545, 545))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convertToInt)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titulo1)
                .addGap(40, 40, 40)
                .addComponent(numeroInteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(convertToBin)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(titulo2)
                .addGap(40, 40, 40)
                .addComponent(numeroBinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertToInt)
                .addGap(18, 18, 18)
                .addComponent(resultInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertToBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertToBinActionPerformed
        /**
         * Chama a função "binToInt" passando como argumento
         * o texto do campo "nInt"
         */
        binToInt(nInt.getText());
    }//GEN-LAST:event_convertToBinActionPerformed

    private void convertToBinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertToBinMouseEntered
        convertToBin.setBackground(new Color(50, 170, 255));
    }//GEN-LAST:event_convertToBinMouseEntered

    private void convertToBinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertToBinMouseExited
        convertToBin.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_convertToBinMouseExited

    private void nIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nIntActionPerformed
        /**
         * Chama a função "binToInt" passando como argumento
         * o texto do campo "nInt"
         */
        binToInt(nInt.getText());
    }//GEN-LAST:event_nIntActionPerformed

    private void nBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nBinActionPerformed
        /**
         * Chama a função "intToBin" passando como argumento
         * o texto do campo "nBin"
         */
        intToBin(nBin.getText());
    }//GEN-LAST:event_nBinActionPerformed

    private void convertToIntMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertToIntMouseEntered
        convertToInt.setBackground(new Color(50, 170, 255));
    }//GEN-LAST:event_convertToIntMouseEntered

    private void convertToIntMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertToIntMouseExited
        convertToInt.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_convertToIntMouseExited

    private void convertToIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertToIntActionPerformed
        /**
         * Chama a função "intToBin" passando como argumento
         * o texto do campo "nBin"
         */
        intToBin(nBin.getText());
    }//GEN-LAST:event_convertToIntActionPerformed

    private void nBinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nBinKeyTyped
        /**
         * Chama a função para validar as teclas
         */
        validacao01(evt, nBin);
    }//GEN-LAST:event_nBinKeyTyped

    private void nIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nIntKeyTyped
        /**
         * Chama a função para validar as teclas
         */
        validacaoNumeros(evt, nInt);
    }//GEN-LAST:event_nIntKeyTyped

    private void resultBinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultBinKeyTyped
        //Consumindo event para não digitar nada no campo
        evt.consume();
    }//GEN-LAST:event_resultBinKeyTyped

    private void resultIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultIntKeyTyped
        //Consumindo event para não digitar nada no campo
        evt.consume();
    }//GEN-LAST:event_resultIntKeyTyped

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertToBin;
    private javax.swing.JButton convertToInt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nBin;
    private javax.swing.JTextField nInt;
    private javax.swing.JLabel numeroBinario;
    private javax.swing.JLabel numeroInteiro;
    private javax.swing.JTextField resultBin;
    private javax.swing.JTextField resultInt;
    private javax.swing.JTable tabelaBinario;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables

}
