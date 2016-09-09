//********************************************************************************
// STUDENT NAME:  [Chris Vega]
// STUDENT ID:  [4000709]
// FIU EMAIL: [Cvega050@fiu.edu]
// CLASS: COP 2210 – [2015]
// ASSIGNMENT # [5]
// DATE: [11/30/2015]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else, except as outlined in the 
// assignment instructions.
//********************************************************************************
package TicTacToe;

import java.util.Random;
import javax.swing.JOptionPane;

public class testerGUI extends javax.swing.JFrame {

    public testerGUI() {
        initComponents();
        refesh();
    }
    ai ai = new ai();
    int player;
    int end;
    String name = "NA";

    public void push(int p) {
        //Method for when the player selects a spot
        if (ai.winnerwinnerchikendinner()) {
            ai = new ai();
            refesh();
            end = JOptionPane.showConfirmDialog(null, "Play again?", null, end);
            if (end == JOptionPane.YES_OPTION) {
                turn();
                return;
            } else {
                System.exit(0);
            }
        }
        ai.bestmove();

        if (ai.grid[0] == 3) {
            j0.setEnabled(false);
            j0.setText("O");
        }
        if (ai.grid[1] == 3) {
            j1.setEnabled(false);
            j1.setText("O");
        }
        if (ai.grid[2] == 3) {
            j2.setEnabled(false);
            j2.setText("O");
        }
        if (ai.grid[3] == 3) {
            j3.setEnabled(false);
            j3.setText("O");
        }
        if (ai.grid[4] == 3) {
            j4.setEnabled(false);
            j4.setText("O");
        }
        if (ai.grid[5] == 3) {
            j5.setEnabled(false);
            j5.setText("O");
        }
        if (ai.grid[6] == 3) {
            j6.setEnabled(false);
            j6.setText("O");
        }
        if (ai.grid[7] == 3) {
            j7.setEnabled(false);
            j7.setText("O");
        }
        if (ai.grid[8] == 3) {
            j8.setEnabled(false);
            j8.setText("O");
        }
        if (ai.winnerwinnerchikendinner()) {
            ai = new ai();
            refesh();
            end = JOptionPane.showConfirmDialog(null, "Play again?", null, end);
            if (end == JOptionPane.YES_OPTION) {
                turn();
                return;
            } else {
                System.exit(0);
            }
        }

    }

    public void refesh() {
        //Resets the game
        j0.setEnabled(true);
        j0.setText(" ");
        j1.setEnabled(true);
        j1.setText(" ");
        j2.setEnabled(true);
        j2.setText(" ");
        j3.setEnabled(true);
        j3.setText(" ");
        j4.setEnabled(true);
        j4.setText(" ");
        j5.setEnabled(true);
        j5.setText(" ");
        j6.setEnabled(true);
        j6.setText(" ");
        j7.setEnabled(true);
        j7.setText(" ");
        j8.setEnabled(true);
        j8.setText(" ");
    }

    public void turn() {
        int ra = 1 + r.nextInt(2);
        if (ra == 2) {
            push(2);
            JOptionPane.showMessageDialog(null, "Computer goes first");
        } else {
            JOptionPane.showMessageDialog(null, name + " goes first");
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

        jTextField1 = new javax.swing.JTextField();
        j0 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j0.setText("jButton2");
        j0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0ActionPerformed(evt);
            }
        });

        j1.setText("jButton3");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j2.setText("jButton4");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j5.setText("jButton4");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j3.setText("jButton2");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j4.setText("jButton3");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j8.setText("jButton4");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j6.setText("jButton2");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j7.setText("jButton3");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(j5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(j8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0ActionPerformed
        //player=1;
        j0.setEnabled(false);
        j0.setText("x");
        ai.grid[0] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j0ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        //player=1;    
        j2.setEnabled(false);
        j2.setText("x");
        ai.grid[2] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j2ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        //player=1; 
        j6.setEnabled(false);
        j6.setText("x");
        ai.grid[6] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j6ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        //player=1; 
        j1.setEnabled(false);
        j1.setText("x");
        ai.grid[1] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j1ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        //player=1;       
        j3.setEnabled(false);
        j3.setText("x");
        ai.grid[3] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        //player=1;    
        j4.setEnabled(false);
        j4.setText("x");
        ai.grid[4] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        //player=1; 
        j5.setEnabled(false);
        j5.setText("x");
        ai.grid[5] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j5ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        //player=1;  
        j7.setEnabled(false);
        j7.setText("x");
        ai.grid[7] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        //player=1;     
        j8.setEnabled(false);
        j8.setText("x");
        ai.grid[8] = 1;
        ai.turn--;
        player = 2;
        push(2);

    }//GEN-LAST:event_j8ActionPerformed

    /**
     * @param args the command line arguments
     */
    Random r = new Random();

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
            java.util.logging.Logger.getLogger(testerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        testerGUI ass = new testerGUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                ass.setVisible(true);
            }
        });
        ass.name = JOptionPane.showInputDialog(null, "What's your name?");
        ass.turn();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j0;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}