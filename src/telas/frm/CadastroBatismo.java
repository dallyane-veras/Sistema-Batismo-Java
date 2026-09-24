/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.frm;

import java.sql.*;
import conexao.conexaobanco;
import java.awt.HeadlessException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
/**
 *
 * @author Dailiane
 */
public class CadastroBatismo extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public CadastroBatismo() {
        initComponents();
        conexao = conexaobanco.conector();
    }
   
    private void salvar(){
        String sql = "insert into cadastrobatismo(codigo_batismo,livro,folha,numero,notificacoes,nome,datatnascimento,localbatismo,databatismo,celebrante,horabatismo,nomepai,cursobatismopai,nomemae,cursobatismomae,nomepadrinho,cursobatismoparinho,nomemadrinha,cursobatismomadrinha,sexo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            java.util.Date brDate = new SimpleDateFormat("dd/MM/yyyy").parse(txt_datatnascimento.getText());
            String unDate = new SimpleDateFormat("yyyy/MM/dd").format(brDate);
            
            java.util.Date BrDate = new SimpleDateFormat("dd/MM/yyyy").parse(txt_dtbatismo.getText());
            String UnDate = new SimpleDateFormat ("yyyy/MM/dd").format(BrDate);
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_codigo.getText());
            pst.setString(2, txt_Livro.getText());
            pst.setString(3, txt_folha.getText());
            pst.setString(4, txt_numero.getText());
            pst.setString(5, txt_notificacoes.getText());
            pst.setString(6, txt_nome.getText());
            pst.setString(7, unDate);
            pst.setString(8, txt_local.getText());
            pst.setString(9, UnDate);
            pst.setString(10, txt_celebrante.getText());
            pst.setString(11, txt_hora.getText());
            pst.setString(12, txt_nomepai.getText());
            pst.setString(13, CB_cursopai.getSelectedItem().toString());
            pst.setString(14, txt_nomemae.getText());
            pst.setString(15, CB_cursomae.getSelectedItem().toString());
            pst.setString(16, txt_nomepadrinho.getText());
            pst.setString(17, CB_cursopadrinho.getSelectedItem().toString());
            pst.setString(18, txt_nomemadrinhaa.getText());
            pst.setString(19, CB_cursomadrinha.getSelectedItem().toString());
            pst.setString(20, CB_sexo.getSelectedItem().toString());
            
            
            
            //campos obrigatorios.
             if ((txt_codigo.getText().isEmpty())||(txt_Livro.getText().isEmpty())||(txt_folha.getText().isEmpty())||(txt_numero.getText().isEmpty())||(txt_nome.getText().isEmpty())||(txt_datatnascimento.getText().isEmpty())||(txt_local.getText().isEmpty())||(txt_dtbatismo.getText().isEmpty())
                     ||(txt_celebrante.getText().isEmpty())||(txt_nomepai.getText().isEmpty())||(txt_nomemae.getText().isEmpty())||(txt_nomepadrinho.getText().isEmpty())||(txt_nomemadrinhaa.getText().isEmpty())){
               JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            
             } else{
                 
                  // atualiza a tabela cadastrousuario
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                       JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                       txt_codigo.setText(null);
                       txt_Livro.setText(null);
                       txt_folha.setText(null);
                       txt_numero.setText(null);
                       txt_notificacoes.setText(null);
                       txt_nome.setText(null);
                       txt_datatnascimento.setText(null);
                       txt_local.setText(null);
                       txt_dtbatismo.setText(null);
                       txt_celebrante.setText(null);
                       txt_hora.setText(null);
                       txt_nomepai.setText(null);
                       CB_cursopai.setSelectedItem(null);
                       txt_nomemae.setText(null);
                       CB_cursomae.setSelectedItem(null);
                       txt_nomepadrinho.setText(null);
                       CB_cursopadrinho.setSelectedItem(null);
                       txt_nomemadrinhaa.setText(null);
                       CB_cursomadrinha.setSelectedItem(null);
                       CB_sexo.setSelectedItem(null);
                       
                   
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        txt_livro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_databatismo = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_nomemadrinha = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Livro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_folha = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_local = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_celebrante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_hora = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_notificacoes = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txt_nomepai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CB_cursopai = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txt_nomemae = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CB_cursomae = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txt_nomepadrinho = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        CB_cursopadrinho = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txt_nomemadrinhaa = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        CB_cursomadrinha = new javax.swing.JComboBox<>();
        btn_salvar1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        CB_sexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_datatnascimento = new javax.swing.JFormattedTextField();
        txt_dtbatismo = new javax.swing.JFormattedTextField();

        txt_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_livroActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Nome:");

        try {
            txt_databatismo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Celebrante:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Hora:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Nome da Mãe:");

        txt_nomemadrinha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nomemadrinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomemadrinhaActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagens/icones/OK.png"))); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagens/icones/Actions-list-add-user-icon.png"))); // NOI18N
        jLabel2.setText("Cadastro de Batismo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("*Codigo:");

        txt_codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("*Livro:");

        txt_Livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LivroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("*Folha:");

        txt_folha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_folhaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("*Numero:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("*Nome:");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("*Data nascimento:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Notificações:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("*Local:");

        txt_local.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_localActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("*Data batismo:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("*Celebrante:");

        txt_celebrante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_celebrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celebranteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Hora:");

        try {
            txt_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txt_notificacoes.setColumns(20);
        txt_notificacoes.setRows(5);
        jScrollPane1.setViewportView(txt_notificacoes);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("*Nome do Pai:");

        txt_nomepai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nomepai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomepaiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Curso de Batismo:");

        CB_cursopai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_cursopai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("*Nome da Mãe:");

        txt_nomemae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Curso de Batismo:");

        CB_cursomae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_cursomae.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("*Nome do Padrinho:");

        txt_nomepadrinho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Curso de Batismo:");

        CB_cursopadrinho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_cursopadrinho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));
        CB_cursopadrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_cursopadrinhoActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("*Nome da Madrinha:");

        txt_nomemadrinhaa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nomemadrinhaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomemadrinhaaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Curso de Batismo:");

        CB_cursomadrinha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_cursomadrinha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));
        CB_cursomadrinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_cursomadrinhaActionPerformed(evt);
            }
        });

        btn_salvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagens/icones/OK.png"))); // NOI18N
        btn_salvar1.setText("SALVAR");
        btn_salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("*Sexo:");

        CB_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));

        jLabel1.setText("*Campos obrigatórios");

        try {
            txt_datatnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_dtbatismo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel3))
                                .addGap(201, 201, 201)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Livro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nomemadrinhaa, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_local, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(txt_celebrante, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nomepai, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(txt_nomemae, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(txt_nomepadrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(CB_cursopadrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(CB_cursomadrinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(CB_cursopai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(CB_cursomae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_folha, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_datatnascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(txt_dtbatismo, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(CB_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_salvar1))
                        .addContainerGap(132, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_folha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel22))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CB_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_datatnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dtbatismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_celebrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_cursopai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_cursomae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nomepadrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_cursopadrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_cursomadrinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nomemadrinhaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_salvar1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_livroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_livroActionPerformed

    private void txt_LivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LivroActionPerformed

    private void txt_folhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_folhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_folhaActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_localActionPerformed

    private void txt_celebranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celebranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celebranteActionPerformed

    private void CB_cursopadrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_cursopadrinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_cursopadrinhoActionPerformed

    private void txt_nomemadrinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomemadrinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomemadrinhaActionPerformed

    private void txt_nomemadrinhaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomemadrinhaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomemadrinhaaActionPerformed

    private void CB_cursomadrinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_cursomadrinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_cursomadrinhaActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar1ActionPerformed
        salvar();
        
    }//GEN-LAST:event_btn_salvar1ActionPerformed

    private void txt_nomepaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomepaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomepaiActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroBatismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroBatismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroBatismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroBatismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroBatismo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_cursomadrinha;
    private javax.swing.JComboBox<String> CB_cursomae;
    private javax.swing.JComboBox<String> CB_cursopadrinho;
    private javax.swing.JComboBox<String> CB_cursopai;
    private javax.swing.JComboBox<String> CB_sexo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Livro;
    private javax.swing.JTextField txt_celebrante;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JFormattedTextField txt_databatismo;
    private javax.swing.JFormattedTextField txt_datatnascimento;
    private javax.swing.JFormattedTextField txt_dtbatismo;
    private javax.swing.JTextField txt_folha;
    private javax.swing.JFormattedTextField txt_hora;
    private javax.swing.JTextField txt_livro;
    private javax.swing.JTextField txt_local;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nomemadrinha;
    private javax.swing.JTextField txt_nomemadrinhaa;
    private javax.swing.JTextField txt_nomemae;
    private javax.swing.JTextField txt_nomepadrinho;
    private javax.swing.JTextField txt_nomepai;
    private javax.swing.JTextArea txt_notificacoes;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables
}