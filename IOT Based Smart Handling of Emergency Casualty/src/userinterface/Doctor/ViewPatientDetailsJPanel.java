/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class ViewPatientDetailsJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private UserAccount userAccount;
private Organization organization;
private WorkRequest workRequest;
private Enterprise enterprise;
/**
     * Creates new form ViewPatientDetailsJPanel
     */
    public ViewPatientDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount,Organization organization,WorkRequest workRequest,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.workRequest = workRequest;
        this.enterprise = enterprise;
        populatePatientDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPatientid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRespiRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel1.setText("PatientID");

        txtPatientid.setEditable(false);

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel2.setText("Patient Name");

        txtPatientName.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setText("Patient Vital Signs");

        txtTemperature.setEditable(false);

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel9.setText("Respiratory Rate");
        jLabel9.setToolTipText("");

        txtRespiRate.setEditable(false);
        txtRespiRate.setToolTipText("");
        txtRespiRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespiRateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel6.setText("Blood Pressure");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel7.setText("Heart Rate");

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel8.setText("Temperature");

        txtBP.setEditable(false);
        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });

        txtHeartRate.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setText("List of Injuries as mentioned by Operator:");

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Injuries"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblList);

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAssign.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setText("Patient Status");

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel5.setText("Age");

        txtAge.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(btnAssign))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTemperature, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRespiRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRespiRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAssign))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populatePatientDetails()
    {
    HospitalWorkRequest hos = (HospitalWorkRequest) workRequest;
     HospitalEnterprise enterprise1 = (HospitalEnterprise) enterprise;
     for(Patient p2: enterprise1.getPatientDirectory().getPatientList() )
     {
      //   EHSWorkRequest ehs = (EHSWorkRequest) request;
          // HospitalWorkRequest workrequest = (HospitalWorkRequest) request;
    if(!hos.getPerson().getPd().getPatientList().isEmpty())
     {
    for(Patient patient : hos.getPerson().getPd().getPatientList())
    {
        System.out.println(patient.getPatientID());
    if(patient.getPatientID().equalsIgnoreCase(p2.getPatientID()))
    {
    txtPatientid.setText(patient.getPatientID());
    }
    }
     }
     }
    txtPatientName.setText(hos.getPerson().getFirstName());
    txtAge.setText(String.valueOf(hos.getPerson().getAge()));
    txtBP.setText(String.valueOf(hos.getPerson().getVitalSign().getSystolicBP()));
    txtHeartRate.setText(String.valueOf(hos.getPerson().getVitalSign().getHeartrate()));
    txtTemperature.setText(String.valueOf(hos.getPerson().getVitalSign().getTemperature()));
    txtRespiRate.setText(String.valueOf(hos.getPerson().getVitalSign().getRespiratoryrate()));
    DefaultTableModel model = (DefaultTableModel)tblList.getModel();
    model.setRowCount(0);
    for(String s :hos.getInjuriesList())
    {
    Object[] row = new Object[1];
    row[0] = s;
    model.addRow(row);
    }
    }
    private void txtRespiRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespiRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespiRateActionPerformed

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        HospitalWorkRequest hos = (HospitalWorkRequest) workRequest;
        if(hos.getReceiver()!= null)
        {
        JOptionPane.showMessageDialog(null,"The request is already assigned to:"+ hos.getReceiver().getEmployee().getId(),"Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
    /*    else if(hos.getStatus().equalsIgnoreCase("request accepted by hospital") && (hos.getReceiver()!= null))
        {
        JOptionPane.showMessageDialog(null,"The request is already assigned to:"+ hos.getReceiver().getEmployee().getId(),"Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }*/
        else
        {
     userAccount.getWorkQueue().getWorkRequestList().add(workRequest);
     HospitalWorkRequest hwr = (HospitalWorkRequest) workRequest;
     hwr.setReceiver(userAccount);
     JOptionPane.showMessageDialog(null,"The request has been added to your queue successfully","Information",JOptionPane.INFORMATION_MESSAGE);
      btnAssign.setEnabled(false);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
         
       Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[(componentArray.length) - 1];
       ViewReceptionistRequestsJPanel viewRequests = (ViewReceptionistRequestsJPanel) component;
        viewRequests.populatePatientRequests();
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientid;
    private javax.swing.JTextField txtRespiRate;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}