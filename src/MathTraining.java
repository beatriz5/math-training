/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.KeyEvent;

public class MathTraining extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Operation operation;
    Player player;

    public MathTraining(Operation op, Player player) {
        initComponents();
        this.operation = op;
        this.player = player;
    }

    int correctCount, wrongCount = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    //initComponents() TO DISPLAY IN WINDOW
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelScore = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPaneAnswer = new javax.swing.JEditorPane();
        jComboBoxLevel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxOperation = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabelScore.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabelScore.setText("0/0");

        jEditorPaneAnswer.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jEditorPaneAnswer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jEditorPaneAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEditorPaneAnswerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jEditorPaneAnswerKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jEditorPaneAnswer);
        jScrollPane2.setHorizontalScrollBarPolicy(jScrollPane2.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(jScrollPane2.VERTICAL_SCROLLBAR_NEVER);


        jComboBoxLevel.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jComboBoxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Starter", "Intermediate", "Advanced", "Impossible" }));
        jComboBoxLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLevelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Corbel Light", 0, 72)); // NOI18N
        //jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Math Training");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel2.setText("Choose a level");

        jComboBoxOperation.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jComboBoxOperation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Addition", "Subtract", "Multiply", "Divide" }));
        jComboBoxOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperationActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel8.setText("2.0");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel3.setText("Choose an operation");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel9.setText("HTM");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel4.setText("Score:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 54)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3 + 7 =");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Type your answer in the box and press enter");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(796, 796, 796)
                                                        .addComponent(jLabel9)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jLabel8))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jLabelScore)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jComboBoxOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(124, 124, 124)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)))))
                                .addGap(0, 84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabelScore))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBoxOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addComponent(jComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3))
                                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>


    //TO SHOW THE FIRST OPERATION
    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
        jLabel7.setText(operation.question());
    }

    private void jComboBoxLevelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


        try {
            String value = String.valueOf(jComboBoxLevel.getSelectedItem());

            //LEVEL
            switch (value) {
                case "Starter":
                    operation.setLevel(1);
                    break;
                case "Intermediate":
                    operation.setLevel(3);
                    break;
                case "Advanced":
                    operation.setLevel(11);
                    break;
                case "Impossible":
                    operation.setLevel(1856);
                    break;

            }
            jLabel7.setText(operation.question());
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }


    }

    private void jComboBoxOperationActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            //  Block of code to try
            String value = String.valueOf(jComboBoxOperation.getSelectedItem());
            //jLabel7.setText(value);

            //OPERATION
            switch (value) {
                case "Addition":
                    operation.setOperation(1);
                    break;
                case "Subtract":
                    operation.setOperation(2);
                    break;
                case "Multiply":
                    operation.setOperation(3);
                    break;
                case "Divide":
                    operation.setOperation(4);
                    break;
            }
            jLabel7.setText(operation.question());
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }


    }
    private void jEditorPaneAnswerKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

        try {
            //  Block of code to try
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int input = Integer.valueOf(jEditorPaneAnswer.getText()); // getting string to double


                // checking answer is correct or wrong
                if (input == operation.getCorrectResult()) {
                    //correctCount++; // increasing counter
                    player.oneMoreCorrect();
                    player.oneMoreRound();
                    jLabel4.setForeground(new Color(0,102,51));
                    jLabelScore.setForeground(new Color(0,102,51));
                } else {
                    jLabel4.setForeground(new Color(204, 0, 0));//204, 0, 0
                    jLabelScore.setForeground(new Color(204, 0, 0));//204, 0, 0
                    player.oneMoreRound();
                }
                //String stringCount = Integer.toString(correctCount); // getting integer to string
                //String total = Integer.toString(correctCount + wrongCount);


                jLabelScore.setText(Integer.toString(player.getCorrects()) + "/" + Integer.toString(player.getRounds()));
                jEditorPaneAnswer.setText(""); // clearing input after user entered answer
                jLabel7.setText(operation.question());//setting new question


            }
        }
        catch(Exception e) {
            jLabel1.setText("ONLY INTEGERS & NO SPACES");//setting new question

        }

    }

    private void jEditorPaneAnswerKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jEditorPaneAnswer.setText(""); // clearing input after user entered answer
        }
        //jLabelScore.setForeground(Color.black);
        //jLabel4.setForeground(Color.black);
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MathTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Player player1 = new Player("Beatriz");
                Operation op = new Operation();
                new MathTraining(op, player1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> jComboBoxLevel;
    private javax.swing.JComboBox<String> jComboBoxOperation;
    private javax.swing.JEditorPane jEditorPaneAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}
