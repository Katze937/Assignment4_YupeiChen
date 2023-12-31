package FactoryDesignPattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class FactoryCalculatorUI extends javax.swing.JFrame {
    private String calculatorMode = "Basic";
    /**
     * Creates new form CalculatorUI
     */
    
    public FactoryCalculatorUI() {
        initComponents();
        updateCalculatorMode("Basic"); // Set initial mode
    }


    private void updateCalculatorMode(String mode) {
        this.calculatorMode = mode;
        
        // Toggle button visibility based on the mode
        boolean isBasicMode = "Basic".equalsIgnoreCase(mode);
        AdditionButton.setVisible(isBasicMode);
        subtractButton.setVisible(isBasicMode);
        MultiplyButton.setVisible(isBasicMode);
        DivideButton.setVisible(isBasicMode);
        PowerButton.setVisible(!isBasicMode);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        InputATextField = new javax.swing.JTextField();
        InputBTextField = new javax.swing.JTextField();
        InputALabel = new javax.swing.JLabel();
        InputBLabel = new javax.swing.JLabel();
        AdditionButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        MultiplyButton = new javax.swing.JButton();
        DivideButton = new javax.swing.JButton();
        PowerButton = new javax.swing.JButton();
        ModeToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputALabel.setText("Input A");

        InputBLabel.setText("Input B");

        AdditionButton.setText("+");
        AdditionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionButtonActionPerformed(evt);
            }
        });

        subtractButton.setText("-");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setText("*");
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        DivideButton.setText("/");
        DivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideButtonActionPerformed(evt);
            }
        });

        PowerButton.setText("^");
        PowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerButtonActionPerformed(evt);
            }
        });

        ModeToggleButton.setText("Scientific Mode");
        ModeToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(subtractButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DivideButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InputBTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(InputATextField)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(AdditionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MultiplyButton)))
                .addGap(112, 112, 112))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(PowerButton))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(ModeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ModeToggleButton)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputALabel))
                .addGap(33, 33, 33)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputBLabel))
                .addGap(32, 32, 32)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdditionButton)
                    .addComponent(MultiplyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PowerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtractButton)
                    .addComponent(DivideButton))
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdditionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionButtonActionPerformed
        // TODO add your handling code here:
        performOperation(Operation.Add);
    }//GEN-LAST:event_AdditionButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        // TODO add your handling code here:
        performOperation(Operation.Subtract);
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyButtonActionPerformed
        // TODO add your handling code here:
        performOperation(Operation.Multiply);
    }//GEN-LAST:event_MultiplyButtonActionPerformed

    private void DivideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideButtonActionPerformed
        // TODO add your handling code here:
        performOperation(Operation.Divide);
    }//GEN-LAST:event_DivideButtonActionPerformed

    private void PowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerButtonActionPerformed
        // TODO add your handling code here:
        performOperation(Operation.Power);
    }//GEN-LAST:event_PowerButtonActionPerformed

    private void ModeToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeToggleButtonActionPerformed
        // TODO add your handling code here:
            if (ModeToggleButton.isSelected()) {
        updateCalculatorMode("Scientific");
        ModeToggleButton.setText("Basic Mode");
    } else {
        updateCalculatorMode("Basic");
        ModeToggleButton.setText("Scientific Mode");
    }
    }//GEN-LAST:event_ModeToggleButtonActionPerformed

    private void performOperation(Operation operation) {
        try {
            int a = Integer.parseInt(InputATextField.getText());
            int b = Integer.parseInt(InputBTextField.getText());
            double result = 0;

            CalculatorInterface calculator = FactoryCalculator.getCalculator(calculatorMode);

            switch (operation) {
                case Add:
                    result = calculator.add(a, b);
                    break;
                // ... other cases for Subtract, Multiply, Divide
                case Power:
                    result = calculator.power(a, b);
                    break;
            }

            JOptionPane.showMessageDialog(this, "Result: " + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedOperationException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Enum for operations
    private enum Operation {
        Add, Subtract, Multiply, Divide, Power
    }
    
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
            java.util.logging.Logger.getLogger(FactoryCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactoryCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactoryCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactoryCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactoryCalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdditionButton;
    private javax.swing.JPanel Background;
    private javax.swing.JButton DivideButton;
    private javax.swing.JLabel InputALabel;
    private javax.swing.JTextField InputATextField;
    private javax.swing.JLabel InputBLabel;
    private javax.swing.JTextField InputBTextField;
    private javax.swing.JToggleButton ModeToggleButton;
    private javax.swing.JButton MultiplyButton;
    private javax.swing.JButton PowerButton;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
