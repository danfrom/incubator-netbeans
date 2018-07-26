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

package org.netbeans.modules.j2ee.ddloaders.multiview.ui;

import org.netbeans.modules.xml.multiview.ui.SectionNodeInnerPanel;
import org.netbeans.modules.xml.multiview.ui.SectionNodeView;

import javax.swing.*;

/**
 * @author pfiala
 */
public class EntityOverviewForm extends SectionNodeInnerPanel {

    /**
     * Creates new form EntityOverviewForm
     */
    public EntityOverviewForm(SectionNodeView sectionNodeView) {
        super(sectionNodeView);
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        primaryKeyFieldLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ejbNameTextField = new javax.swing.JTextField();
        persistenceTypeTextField = new javax.swing.JTextField();
        abstractSchemaNameTextField = new javax.swing.JTextField();
        primaryKeyFieldComboBox = new javax.swing.JComboBox();
        primaryKeyClassComboBox = new javax.swing.JComboBox();
        primaryKeyClassTextField = new javax.swing.JTextField();
        reentrantCheckBox = new javax.swing.JCheckBox();
        spacerLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setLabelFor(ejbNameTextField);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "LBL_EjbName")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 6);
        add(jLabel1, gridBagConstraints);

        jLabel2.setLabelFor(persistenceTypeTextField);
        jLabel2.setText(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "LBL_PersistenceType")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 6);
        add(jLabel2, gridBagConstraints);

        jLabel3.setLabelFor(abstractSchemaNameTextField);
        jLabel3.setText(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "LBL_AbstractSchemaName")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 6);
        add(jLabel3, gridBagConstraints);

        primaryKeyFieldLabel.setLabelFor(primaryKeyFieldComboBox);
        primaryKeyFieldLabel.setText(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "LBL_PrimaryKeyField")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 6);
        add(primaryKeyFieldLabel, gridBagConstraints);

        jLabel5.setLabelFor(primaryKeyClassComboBox);
        jLabel5.setText(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "LBL_PrimaryKeyClass")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 6);
        add(jLabel5, gridBagConstraints);

        jLabel6.setLabelFor(reentrantCheckBox);
        jLabel6.setText(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "LBL_Reentrant")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 6);
        add(jLabel6, gridBagConstraints);

        ejbNameTextField.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(ejbNameTextField, gridBagConstraints);
        ejbNameTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSD_EJB_Name")); // NOI18N

        persistenceTypeTextField.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(persistenceTypeTextField, gridBagConstraints);
        persistenceTypeTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSD_Persist_Type")); // NOI18N

        abstractSchemaNameTextField.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(abstractSchemaNameTextField, gridBagConstraints);
        abstractSchemaNameTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSD_Schema_Name")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(primaryKeyFieldComboBox, gridBagConstraints);
        primaryKeyFieldComboBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSD_PK")); // NOI18N

        primaryKeyClassComboBox.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(primaryKeyClassComboBox, gridBagConstraints);
        primaryKeyClassComboBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSD_PK_Class")); // NOI18N

        primaryKeyClassTextField.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(primaryKeyClassTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        add(reentrantCheckBox, gridBagConstraints);
        reentrantCheckBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSN_Reentrant")); // NOI18N
        reentrantCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EntityOverviewForm.class, "ACSD_Reentrant")); // NOI18N

        spacerLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(spacerLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abstractSchemaNameTextField;
    private javax.swing.JTextField ejbNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField persistenceTypeTextField;
    private javax.swing.JComboBox primaryKeyClassComboBox;
    private javax.swing.JTextField primaryKeyClassTextField;
    private javax.swing.JComboBox primaryKeyFieldComboBox;
    private javax.swing.JLabel primaryKeyFieldLabel;
    private javax.swing.JCheckBox reentrantCheckBox;
    private javax.swing.JLabel spacerLabel;
    // End of variables declaration//GEN-END:variables

    public JTextField getAbstractSchemaNameTextField() {
        return abstractSchemaNameTextField;
    }

    public JTextField getEjbNameTextField() {
        return ejbNameTextField;
    }

    public JTextField getPersistenceTypeTextField() {
        return persistenceTypeTextField;
    }

    public JComboBox getPrimaryKeyClassComboBox() {
        return primaryKeyClassComboBox;
    }

    public JLabel getPrimaryKeyFieldLabel() {
        return primaryKeyFieldLabel;
    }

    public JComboBox getPrimaryKeyFieldComboBox() {
        return primaryKeyFieldComboBox;
    }

    public JCheckBox getReentrantCheckBox() {
        return reentrantCheckBox;
    }

    public JLabel getSpacerLabel() {
        return spacerLabel;
    }

    public JComponent getErrorComponent(String errorId) {
        return null;
    }

    public void setValue(JComponent source, Object value) {
    }

    public void linkButtonPressed(Object ddBean, String ddProperty) {
    }

    public JTextField getPrimaryKeyClassTextField() {
        return primaryKeyClassTextField;
    }
}
