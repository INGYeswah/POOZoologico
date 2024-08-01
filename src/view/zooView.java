/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Animales;
import controller.Habitats;
import controller.Zoo;
import controller.animales.Cocodrilo;
import controller.animales.Pajaro;
import controller.animales.Pulpo;
import controller.habitats.Acuario;
import controller.habitats.Aviario;
import controller.habitats.Cocodrilario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author w15hy
 */
public class zooView extends javax.swing.JFrame {

    static Zoo zooAndes;
    static Habitats acuario;
    static Habitats aviario;
    static Habitats cocodrilario;

    /**
     * Creates new form zooView
     */
    public zooView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        tf3 = new javax.swing.JTextField();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lb3 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        lb10 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lb8 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lb12 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zoologico");
        setResizable(false);

        p1.setBackground(new java.awt.Color(255, 255, 255));

        tf3.setToolTipText("Nombre");

        btn4.setText("Retirar");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("Retirar");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lb1.setText("Zoologico");

        btn1.setText("Agregar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn6.setText("Retirar");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        lb2.setText("Bienvenido al Zoologico ");

        btn3.setText("Agregar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        lb3.setText("Agregar pajaro");

        btn2.setText("Agregar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        lb10.setText("Retirar cocodrilo");

        lb6.setText("Nombre");

        lb5.setText("Agregar pulpo");

        lb9.setText("Retirar pajaro");

        lb7.setText("Nombre");

        lb4.setText("Agregar cocodrilo");

        tf2.setToolTipText("Nombre");
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        lb8.setText("Nombre");

        lb11.setText("Retirar pulpo");

        tf1.setToolTipText("Nombre");
        tf1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf1.setName(""); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        lb12.setText("Jugar en el aviario");

        lb13.setText("Jugar en el cocodrilario");

        lb14.setText("Jugar en el acuario");

        btn7.setText("Jugar");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("Jugar");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("Jugar");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb2)
                .addGap(130, 130, 130))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1)
                            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(p1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(lb3))
                                .addGroup(p1Layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(lb6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn2)
                                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lb4))
                                    .addGroup(p1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(lb7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb5)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lb8))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(35, 35, 35))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(lb1))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btn4)
                                        .addGap(42, 42, 42)
                                        .addComponent(btn5))
                                    .addGroup(p1Layout.createSequentialGroup()
                                        .addComponent(lb9)
                                        .addGap(32, 32, 32)
                                        .addComponent(lb10)))
                                .addGap(43, 43, 43)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb11)
                                    .addComponent(btn6))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn7)
                    .addComponent(lb12))
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(lb13)
                        .addGap(18, 18, 18))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb14)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn9)))
                .addGap(21, 21, 21))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(lb5)
                    .addComponent(lb4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb6)
                    .addComponent(lb7)
                    .addComponent(lb8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb9)
                    .addComponent(lb10)
                    .addComponent(lb11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn4)
                    .addComponent(btn6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb12)
                    .addComponent(lb13)
                    .addComponent(lb14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9))
                .addGap(76, 76, 76))
        );

        jMenu1.setText("Habitats");

        jMenuItem1.setText("Acuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Aviario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cocodrilario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jCheckBoxMenuItem1.setText("DarkMode");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String names = "";
        for (Animales name : aviario.ocupantesHabitat) {
            names += name.nombre() + ", ";
        }
        JOptionPane.showMessageDialog(null, "En el aviario estan los pajaros: " + names);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String names = "";
        for (Animales name : acuario.ocupantesHabitat) {
            names += name.nombre() + ", ";
        }
        JOptionPane.showMessageDialog(null, "En el acuario estan los pulpos: " + names);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String name = tf1.getText();
        tf1.setText("");
        String message = zooAndes.add(new Pajaro(name), aviario);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String name = tf2.getText();
        tf2.setText("");
        String message = zooAndes.add(new Cocodrilo(name), cocodrilario);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String name = tf3.getText();
        tf3.setText("");
        String message = zooAndes.add(new Pulpo(name), acuario);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btn3ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String names = "";
        for (Animales name : cocodrilario.ocupantesHabitat) {
            names += name.nombre() + ", ";
        }
        JOptionPane.showMessageDialog(null, "En el cocodrilario estan los cocodrilos: " + names);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        int x = 1;
        String message = "A cual animal deseas retirar: ";
        for (Animales name : aviario.ocupantesHabitat) {
            message += (x + ". " + name.nombre() + "\n");
            x++;
        }

        int selection = Integer.parseInt(JOptionPane.showInputDialog(message));
        message = zooAndes.retirar(aviario.ocupantesHabitat.get(selection - 1), aviario);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btn4ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        if (jCheckBoxMenuItem1.isSelected()) {
            p1.setBackground(Color.BLACK);
            lb1.setForeground(Color.WHITE);
            lb2.setForeground(Color.WHITE);
            lb3.setForeground(Color.WHITE);
            lb4.setForeground(Color.WHITE);
            lb5.setForeground(Color.WHITE);
            lb6.setForeground(Color.WHITE);
            lb7.setForeground(Color.WHITE);
            lb8.setForeground(Color.WHITE);
            lb9.setForeground(Color.WHITE);
            lb10.setForeground(Color.WHITE);
            lb11.setForeground(Color.WHITE);
            lb12.setForeground(Color.WHITE);
            lb13.setForeground(Color.WHITE);
            lb14.setForeground(Color.WHITE);
        } else {
            p1.setBackground(Color.WHITE);
            lb1.setForeground(Color.BLACK);
            lb2.setForeground(Color.BLACK);
            lb3.setForeground(Color.BLACK);
            lb4.setForeground(Color.BLACK);
            lb5.setForeground(Color.BLACK);
            lb6.setForeground(Color.BLACK);
            lb7.setForeground(Color.BLACK);
            lb8.setForeground(Color.BLACK);
            lb9.setForeground(Color.BLACK);
            lb10.setForeground(Color.BLACK);
            lb11.setForeground(Color.BLACK);
            lb12.setForeground(Color.BLACK);
            lb13.setForeground(Color.BLACK);
            lb14.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (!aviario.ocupantesHabitat.isEmpty()) {
            int x = 1;
            String message = "Con cual animal deseas jugar: ";
            for (Animales name : aviario.ocupantesHabitat) {
                message += (x + ". " + name.nombre() + "\n");
                x++;
            }

            int selection = Integer.parseInt(JOptionPane.showInputDialog(message));
            message = aviario.ocupantesHabitat.get(selection - 1).jugar();
            JOptionPane.showMessageDialog(null, message);
        } else {
            String message = ("No hay nadie con quien jugar en el aviario.");
            JOptionPane.showMessageDialog(null, message);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (!aviario.ocupantesHabitat.isEmpty()) {
            int x = 1;
            String message = "Con cual animal deseas jugar: ";
            for (Animales name : cocodrilario.ocupantesHabitat) {
                message += (x + ". " + name.nombre() + "\n");
                x++;
            }

            int selection = Integer.parseInt(JOptionPane.showInputDialog(message));
            message = cocodrilario.ocupantesHabitat.get(selection - 1).jugar();
            JOptionPane.showMessageDialog(null, message);
        } else {
            String message = ("No hay nadie con quien jugar en el cocodrilario.");
            JOptionPane.showMessageDialog(null, message);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (!aviario.ocupantesHabitat.isEmpty()) {
            int x = 1;
            String message = "Con cual animal deseas jugar: ";
            for (Animales name : acuario.ocupantesHabitat) {
                message += (x + ". " + name.nombre() + "\n");
                x++;
            }

            int selection = Integer.parseInt(JOptionPane.showInputDialog(message));
            message = acuario.ocupantesHabitat.get(selection - 1).jugar();
            JOptionPane.showMessageDialog(null, message);
        } else {
            String message = ("No hay nadie con quien jugar en el acuario.");
            JOptionPane.showMessageDialog(null, message);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        int x = 1;
        String message = "A cual animal deseas retirar: ";
        for (Animales name : cocodrilario.ocupantesHabitat) {
            message += (x + ". " + name.nombre() + "\n");
            x++;
        }

        int selection = Integer.parseInt(JOptionPane.showInputDialog(message));
        message = zooAndes.retirar(cocodrilario.ocupantesHabitat.get(selection - 1), cocodrilario);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        int x = 1;
        String message = "A cual animal deseas retirar: ";
        for (Animales name : acuario.ocupantesHabitat) {
            message += (x + ". " + name.nombre() + "\n");
            x++;
        }

        int selection = Integer.parseInt(JOptionPane.showInputDialog(message));
        message = zooAndes.retirar(acuario.ocupantesHabitat.get(selection - 1), acuario);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btn6ActionPerformed

    public static void main(String args[]) {

        zooAndes = new Zoo("Cundinamarca", "Zoologico de los andes");

        acuario = new Acuario();
        aviario = new Aviario();
        cocodrilario = new Cocodrilario();

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
            java.util.logging.Logger.getLogger(zooView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zooView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zooView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zooView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zooView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JPanel p1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
