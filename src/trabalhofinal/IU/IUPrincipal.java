/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal.IU;

import trabalhofinal.controlador.Controlador;

/**
 *
 * @author dayan
 */
public class IUPrincipal extends javax.swing.JFrame {
    Controlador control = new Controlador();
    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuControl = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        addDepartamento = new javax.swing.JMenuItem();
        addFuncionario = new javax.swing.JMenu();
        addTecnico = new javax.swing.JMenuItem();
        addDocente = new javax.swing.JMenu();
        addEfetivo = new javax.swing.JMenuItem();
        addSubstituto = new javax.swing.JMenuItem();
        menuBuscas = new javax.swing.JMenu();
        funcNome = new javax.swing.JMenuItem();
        funcCod = new javax.swing.JMenuItem();
        umDepartamento = new javax.swing.JMenuItem();
        faixaSalario = new javax.swing.JMenuItem();
        faixaGastos = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        relGeral = new javax.swing.JMenuItem();
        allDepartamentos = new javax.swing.JMenuItem();
        funcionarios = new javax.swing.JMenu();
        allFuncionarios = new javax.swing.JMenuItem();
        allTecnicos = new javax.swing.JMenuItem();
        docentes = new javax.swing.JMenu();
        allDocentes = new javax.swing.JMenuItem();
        allEfetivos = new javax.swing.JMenuItem();
        allSubstitutos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 400));

        jPanel1.setBackground(new java.awt.Color(232, 236, 251));

        jLabel2.setText("Aluna: Dayana Brito de Toledo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SISTEMA DE GERENCIAMENTO DE UNIVERSIDADE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        menuControl.setBackground(new java.awt.Color(220, 227, 251));
        menuControl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        menuControl.setBorderPainted(false);
        menuControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuControl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuControl.setMargin(new java.awt.Insets(2, 2, 2, 2));
        menuControl.setPreferredSize(new java.awt.Dimension(450, 50));

        menuCadastros.setBackground(new java.awt.Color(255, 255, 255));
        menuCadastros.setText("Cadastrar");
        menuCadastros.setFocusable(false);
        menuCadastros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuCadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCadastros.setIconTextGap(40);
        menuCadastros.setPreferredSize(new java.awt.Dimension(150, 24));
        menuCadastros.setRolloverEnabled(false);

        addDepartamento.setText("Departamento");
        addDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartamentoActionPerformed(evt);
            }
        });
        menuCadastros.add(addDepartamento);

        addFuncionario.setText("Funcionário");

        addTecnico.setText("Técnico");
        addTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTecnicoActionPerformed(evt);
            }
        });
        addFuncionario.add(addTecnico);

        addDocente.setText("Docente");

        addEfetivo.setText("Efetivo");
        addEfetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEfetivoActionPerformed(evt);
            }
        });
        addDocente.add(addEfetivo);

        addSubstituto.setText("Substituto");
        addSubstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubstitutoActionPerformed(evt);
            }
        });
        addDocente.add(addSubstituto);

        addFuncionario.add(addDocente);

        menuCadastros.add(addFuncionario);

        menuControl.add(menuCadastros);

        menuBuscas.setBackground(new java.awt.Color(255, 255, 255));
        menuBuscas.setText("Buscar");
        menuBuscas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuBuscas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuBuscas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuBuscas.setIconTextGap(50);
        menuBuscas.setPreferredSize(new java.awt.Dimension(150, 24));

        funcNome.setText("Funcionário pelo nome");
        funcNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcNomeActionPerformed(evt);
            }
        });
        menuBuscas.add(funcNome);

        funcCod.setText("Funcionário pelo código");
        funcCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcCodActionPerformed(evt);
            }
        });
        menuBuscas.add(funcCod);

        umDepartamento.setText("Informações de um departamento");
        umDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umDepartamentoActionPerformed(evt);
            }
        });
        menuBuscas.add(umDepartamento);

        faixaSalario.setText("Funcionários com salário em uma faixa");
        faixaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faixaSalarioActionPerformed(evt);
            }
        });
        menuBuscas.add(faixaSalario);

        faixaGastos.setText("Departamentos com gastos em uma faixa");
        faixaGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faixaGastosActionPerformed(evt);
            }
        });
        menuBuscas.add(faixaGastos);

        menuControl.add(menuBuscas);

        menuRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuRelatorios.setIconTextGap(40);
        menuRelatorios.setPreferredSize(new java.awt.Dimension(150, 24));

        relGeral.setText("Geral");
        relGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relGeralActionPerformed(evt);
            }
        });
        menuRelatorios.add(relGeral);

        allDepartamentos.setText("Departamentos");
        allDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDepartamentosActionPerformed(evt);
            }
        });
        menuRelatorios.add(allDepartamentos);

        funcionarios.setText("Funcionários");

        allFuncionarios.setText("Todos");
        allFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allFuncionariosActionPerformed(evt);
            }
        });
        funcionarios.add(allFuncionarios);

        allTecnicos.setText("Técnicos");
        allTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTecnicosActionPerformed(evt);
            }
        });
        funcionarios.add(allTecnicos);

        docentes.setText("Docentes");

        allDocentes.setText("Todos");
        allDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDocentesActionPerformed(evt);
            }
        });
        docentes.add(allDocentes);

        allEfetivos.setText("Efetivos");
        allEfetivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEfetivosActionPerformed(evt);
            }
        });
        docentes.add(allEfetivos);

        allSubstitutos.setText("Substitutos");
        allSubstitutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allSubstitutosActionPerformed(evt);
            }
        });
        docentes.add(allSubstitutos);

        funcionarios.add(docentes);

        menuRelatorios.add(funcionarios);

        menuControl.add(menuRelatorios);

        setJMenuBar(menuControl);

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

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(464, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDepartamentoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUAddDepartamento(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_addDepartamentoActionPerformed

    private void relGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relGeralActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("RESUMO GERAL", control.all());
        relatorio.setVisible(true);
    }//GEN-LAST:event_relGeralActionPerformed

    private void allDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDepartamentosActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("TODOS OS DEPARTAMENTOS", control.allDepartamentos());
        relatorio.setVisible(true);
    }//GEN-LAST:event_allDepartamentosActionPerformed

    private void addTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTecnicoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUAddTecnico(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_addTecnicoActionPerformed

    private void addEfetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEfetivoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUAddDocEfetivo(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_addEfetivoActionPerformed

    private void addSubstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubstitutoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUAddDocSubstituto(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_addSubstitutoActionPerformed

    private void allTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allTecnicosActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("TODOS OS TÉCNICOS", control.allTecnicos());
        relatorio.setVisible(true);
    }//GEN-LAST:event_allTecnicosActionPerformed

    private void allDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDocentesActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("TODOS OS DOCENTES", control.allDocentes());
        relatorio.setVisible(true);
    }//GEN-LAST:event_allDocentesActionPerformed

    private void allFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allFuncionariosActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("TODOS OS FUNCIONÁRIOS", control.allFuncionarios());
        relatorio.setVisible(true);
    }//GEN-LAST:event_allFuncionariosActionPerformed

    private void allEfetivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEfetivosActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("TODOS OS EFETIVOS", control.allEfetivos());
        relatorio.setVisible(true);
    }//GEN-LAST:event_allEfetivosActionPerformed

    private void allSubstitutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allSubstitutosActionPerformed
        // TODO add your handling code here:

        IURelatorios relatorio = new IURelatorios(null, true);
        relatorio.mostrarDados("TODOS OS SUBSTITUTOS", control.allSubstitutos());
        relatorio.setVisible(true);
    }//GEN-LAST:event_allSubstitutosActionPerformed

    private void funcNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcNomeActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBuscaFuncNome(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_funcNomeActionPerformed

    private void funcCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcCodActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBuscaFuncCod(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_funcCodActionPerformed

    private void umDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umDepartamentoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBuscaDepartamento(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_umDepartamentoActionPerformed

    private void faixaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faixaSalarioActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBuscaFuncFaixa(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_faixaSalarioActionPerformed

    private void faixaGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faixaGastosActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBuscaDeptoFaixa(null, true).setVisible(true);
            }
        });
    }//GEN-LAST:event_faixaGastosActionPerformed

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
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuItem addDepartamento;
    javax.swing.JMenu addDocente;
    javax.swing.JMenuItem addEfetivo;
    javax.swing.JMenu addFuncionario;
    javax.swing.JMenuItem addSubstituto;
    javax.swing.JMenuItem addTecnico;
    javax.swing.JMenuItem allDepartamentos;
    javax.swing.JMenuItem allDocentes;
    javax.swing.JMenuItem allEfetivos;
    javax.swing.JMenuItem allFuncionarios;
    javax.swing.JMenuItem allSubstitutos;
    javax.swing.JMenuItem allTecnicos;
    javax.swing.JMenu docentes;
    javax.swing.JMenuItem faixaGastos;
    javax.swing.JMenuItem faixaSalario;
    javax.swing.JMenuItem funcCod;
    javax.swing.JMenuItem funcNome;
    javax.swing.JMenu funcionarios;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel1;
    javax.swing.JMenu menuBuscas;
    javax.swing.JMenu menuCadastros;
    javax.swing.JMenuBar menuControl;
    javax.swing.JMenu menuRelatorios;
    javax.swing.JMenuItem relGeral;
    javax.swing.JMenuItem umDepartamento;
    // End of variables declaration//GEN-END:variables
}