/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Customer extends javax.swing.JFrame {

    ArrayList<Customer_1> customerList = new ArrayList<>();
    String userTemp = "";
    
    public Customer(ArrayList<Customer_1> customerList) {
        
        this.customerList = customerList;
        
        initComponents();
        
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        int count = 0;
        for(int i = 0; i < customerList.size(); i++) {
            model.insertRow(count, new Object[] { customerList.get(i).getUsername(), customerList.get(i).getPassword(), customerList.get(i).getPhone()});
            count++;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        cusIDTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVENTORY MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUSTOMER PRODUCT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("CustId");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Name");

        nameTF.setText("\n");

        cusIDTF.setText("\n");
        cusIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusIDTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Phone");

        phoneTF.setText("\n");
        phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.setActionCommand("LOGIN");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(0, 153, 153));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("EDIT");
        editBtn.setActionCommand("LOGIN");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(0, 153, 153));
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("HOME");
        homeBtn.setActionCommand("LOGIN");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 153, 153));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.setActionCommand("LOGIN");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        customerTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustId", "Name", "Phone"
            }
        ));
        customerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        customerTable.setRowHeight(25);
        customerTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(customerTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("CUSTOMERS LIST");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        updateBtn.setBackground(new java.awt.Color(0, 153, 153));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE");
        updateBtn.setActionCommand("LOGIN");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cusIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cusIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusIDTFActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTFActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String username = cusIDTF.getText();
        String password= nameTF.getText();
        String phone = phoneTF.getText();

        boolean flag = true;
        for(int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getUsername().equals(username)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            customerList.add(new Customer_1(username, password, phone));
            System.out.println("Successfully created.");
            FileWriter fw;
            try {
                fw = new FileWriter("customer.txt");
                for(int i = 0; i < customerList.size(); i++) {
                    fw.write(customerList.get(i).getUsername() + "\t" + customerList.get(i).getPassword() + "\t" + customerList.get(i).getPhone() + "\n");
                }
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            System.out.println("Username already exist. Please try again");
        }
        
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        int count = 0;
        for(int i = 0; i < customerList.size(); i++) {
            model.insertRow(count, new Object[] { customerList.get(i).getUsername(), customerList.get(i).getPassword(), customerList.get(i).getPhone()});
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
        int row = customerTable.getSelectedRow();
        userTemp = customerTable.getModel().getValueAt(row, 0).toString();
        
        int index = -1;
        for(int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getUsername().equals(userTemp)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Username doesn't exist");
        }
        else {
            cusIDTF.setText(customerList.get(index).getUsername());
            nameTF.setText(customerList.get(index).getPassword());
            phoneTF.setText(customerList.get(index).getPhone());
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.setVisible(false);
        try {
            new HomeForm().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int row = customerTable.getSelectedRow();
        String username = customerTable.getModel().getValueAt(row, 0).toString();

        int index = -1;
        for(int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getUsername().equals(username)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Username doesn't exist");
        }
        else {
            customerList.remove(index);
            System.out.println("User successfully Deleted.");
        }

        FileWriter fw;
        try {
            fw = new FileWriter("customer.txt");
            for(int i = 0; i < customerList.size(); i++) {
                fw.write(customerList.get(i).getUsername() + "\t" + customerList.get(i).getPassword() + "\t" + customerList.get(i).getPhone() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        int count = 0;
        for(int i = 0; i < customerList.size(); i++) {
            model.insertRow(count, new Object[] { customerList.get(i).getUsername(), customerList.get(i).getPassword(), customerList.get(i).getPhone()});
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String username = cusIDTF.getText();
        String password= nameTF.getText();
        String phone = phoneTF.getText();

        int index = -1;
        for(int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getUsername().equals(userTemp)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Product doesn't exist");
        }
        else {
            customerList.get(index).setUsername(username);
            customerList.get(index).setPasword(password);
            customerList.get(index).setPhone(phone);
            System.out.println("Successfully Updated.");
        }
        
        FileWriter fw;
        try {
            fw = new FileWriter("customer.txt");
            for(int i = 0; i < customerList.size(); i++) {
                fw.write(customerList.get(i).getUsername() + "\t" + customerList.get(i).getPassword() + "\t" + customerList.get(i).getPhone() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        int count = 0;
        for(int i = 0; i < customerList.size(); i++) {
            model.insertRow(count, new Object[] { customerList.get(i).getUsername(), customerList.get(i).getPassword(), customerList.get(i).getPhone()});
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField cusIDTF;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
