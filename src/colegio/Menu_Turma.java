/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanueldemarao
 */
public class Menu_Turma extends javax.swing.JFrame {
    ArrayList<Turma> turmas = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();
    ArrayList<Estudante> estudantes = new ArrayList<>();
    ArrayList<Docente> docentes = new ArrayList<>();
    /**
     * Creates new form Menu_Turma
     */
    public Menu_Turma() {
        initComponents();
        turmas = new Turma().ler();
        cursos = new Curso().ler();
         estudantes = new Estudante().ler();
         docentes = new Docente().ler();
         Transferir_Curso();
         Transferir_turma();
    }
    
    public void Transferir_turma() {
          for(Turma t: turmas) {
            combo_turma.addItem(t.getDescricao());
        }
    }
    
    public void Transferir_Curso() {
          for(Curso c: cursos) {
            combo_curso.addItem(c.getDescricao());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Painel_Turma = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        combo_turma = new javax.swing.JComboBox();
        combo_curso = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estud = new javax.swing.JButton();
        prof = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Painel_Turma.setBackground(new java.awt.Color(255, 255, 255));
        Painel_Turma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 4, 58));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LISTAGEM ESTUDANTE-PROFESSOR");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NUEL COLLEGE");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        sair.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setText("X");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sairMousePressed(evt);
            }
        });
        jPanel2.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 0, -1, -1));

        jPanel2.add(combo_turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jPanel2.add(combo_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CURSO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TURMA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        estud.setText("Listar Estudante");
        estud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudActionPerformed(evt);
            }
        });
        jPanel2.add(estud, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        prof.setText("Listar Professor");
        prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profActionPerformed(evt);
            }
        });
        jPanel2.add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Painel_Turma.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 200));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabela);

        Painel_Turma.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 790, 320));

        getContentPane().add(Painel_Turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMousePressed

    }//GEN-LAST:event_sairMousePressed

    private void estudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudActionPerformed
        DefaultTableModel t = (DefaultTableModel) Tabela.getModel();
        int linhas = t.getRowCount();

        for (int i = linhas - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        for (Estudante dados : estudantes) {
            if(combo_curso.getSelectedItem().equals(dados.getCurso()) && combo_turma.getSelectedItem().equals(dados.getTurma())){
                
           
            Object[] lista_estudante
                    = {
                        dados.getNome()
                    };
            t.addRow(lista_estudante);
        }
        }
    }//GEN-LAST:event_estudActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Principal p = new Principal();
        p.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profActionPerformed
         DefaultTableModel t = (DefaultTableModel) Tabela.getModel();
        int linhas = t.getRowCount();

        for (int i = linhas - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        for (Docente dados : docentes) {
            if( combo_turma.getSelectedItem().equals(dados.getTurma())){
                
           
            Object[] lista_docente
                    = {
                        dados.getNome()
                    };
            t.addRow(lista_docente);
            System.out.println(dados.getNome());
        }
        }
    }//GEN-LAST:event_profActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Turma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Turma;
    private javax.swing.JTable Tabela;
    private javax.swing.JComboBox combo_curso;
    private javax.swing.JComboBox combo_turma;
    private javax.swing.JButton estud;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton prof;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables
}
