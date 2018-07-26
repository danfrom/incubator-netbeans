/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.netbeans.modules.j2ee.ddloaders.web.multiview;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.openide.util.NbBundle;

/**
 * Editor panel for selecting security roles.
 *
 * @author  ptliu
 */
public class SecurityRolesEditorPanel extends javax.swing.JPanel {
    
    /** Creates new form SecurityRolesEditorPanel */
    public SecurityRolesEditorPanel(String [] allRoles, String[] selectedRoles) {
        initComponents();
        
        initTable(allRolesTable, getRemainingRoles(allRoles, selectedRoles),
                NbBundle.getMessage(SecurityConstraintPanel.class,"LBL_AllSecurityRoles"));
        initTable(selectedRolesTable, selectedRoles,
                NbBundle.getMessage(SecurityConstraintPanel.class,"LBL_AllSecurityRoles"));
    }
    
    public String[] getSelectedRoles() {
        DefaultTableModel model = (DefaultTableModel) selectedRolesTable.getModel();
        int rowCount = model.getRowCount();
        String[] selectedRoles = new String[rowCount];
        
        for (int i = 0; i < rowCount; i++) {
            selectedRoles[i] = (String) model.getValueAt(i, 0);
        }
        
        return selectedRoles;
    }
    
    private void initTable(JTable table, String[] data, String columnName) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        model.addColumn(columnName);
         
        for (int i = 0; i < data.length; i++) {
            model.addRow(new Object[] {data[i]});
        }
        
        table.setModel(model);
    }
        
    private String[] getRemainingRoles(String[] allRoles, String[] selectedRoles) {
        ArrayList result = new ArrayList();
        
        for (int i = 0; i < allRoles.length; i++) {
            String roleName = allRoles[i];
            boolean found = false;
            
            for (int j = 0; j < selectedRoles.length; j++) {
                if (roleName.equals(selectedRoles[j])) {
                    found = true;
                    break;
                }
            }
            
            if (!found) result.add(roleName);
        }
        
        String[] remainingRoles = new String[result.size()];
        return (String[]) result.toArray(remainingRoles);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allRolesTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedRolesTable = new javax.swing.JTable();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ddloaders/web/multiview/Bundle"); // NOI18N
        addButton.setText(bundle.getString("LBL_AddSecurityRole")); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText(bundle.getString("LBL_RemoveSecurityRole")); // NOI18N
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        allRolesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(allRolesTable);

        selectedRolesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(selectedRolesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(addButton)
                        .addGap(35, 35, 35)
                        .addComponent(removeButton)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int[] selectedRows = selectedRolesTable.getSelectedRows();
        DefaultTableModel allRolesTableModel = (DefaultTableModel) allRolesTable.getModel();
        DefaultTableModel selectedRolesTableModel = (DefaultTableModel) selectedRolesTable.getModel();
        
        // Get the list of selected role names
        for (int i = 0; i < selectedRows.length; i++) {
            String roleName = (String) selectedRolesTableModel.getValueAt(selectedRows[i], 0);
            allRolesTableModel.addRow(new Object[] {roleName});
        }
        
        // Now remove the selected rows from the allRolesTable
        for (int i = selectedRows.length-1; i >=0; i--) {
            selectedRolesTableModel.removeRow(selectedRows[i]);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int[] selectedRows = allRolesTable.getSelectedRows();
        DefaultTableModel allRolesTableModel = (DefaultTableModel) allRolesTable.getModel();
        DefaultTableModel selectedRolesTableModel = (DefaultTableModel) selectedRolesTable.getModel();
        
        // Get the list of selected role names
        for (int i = 0; i < selectedRows.length; i++) {
            String roleName = (String) allRolesTableModel.getValueAt(selectedRows[i], 0);
            selectedRolesTableModel.addRow(new Object[] {roleName});
        }
        
        // Now remove the selected rows from the allRolesTable
        for (int i = selectedRows.length-1; i >=0; i--) {
            allRolesTableModel.removeRow(selectedRows[i]);
        }
    }//GEN-LAST:event_addButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable allRolesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    private javax.swing.JTable selectedRolesTable;
    // End of variables declaration//GEN-END:variables
    
}
