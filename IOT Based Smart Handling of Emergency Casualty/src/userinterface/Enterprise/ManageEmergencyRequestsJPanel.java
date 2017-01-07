/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Enterprise;

import Business.Area.Area;
import Business.Enterprise.Enterprise;
import Business.Sensor.Sensor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EHSWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author test
 */
public class ManageEmergencyRequestsJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private Enterprise enterprise;
private Area area;
private UserAccount userAccount;
    /**
     * Creates new form ManageEmergencyRequestsJPanel
     */
    public ManageEmergencyRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, Area area,UserAccount userAccount) throws InterruptedException {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.area = area;
        this.userAccount = userAccount;
        populateRandomValues();
        populateEHSRequests();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Area", "Longitude", "Latitude", "Impact", "Collision With", "Date", "Status", "Receiver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton2.setText("Process");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Emergency Requests By Sensors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();
       if(selectedRow < 0)
       {
       JOptionPane.showMessageDialog(null,"Please select a row from table", "warning", JOptionPane.WARNING_MESSAGE);
       return;
       }
       else
       {
        EHSWorkRequest ehs = (EHSWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if(ehs.getStatus()== "Case closed")
        {
        userAccount.getWorkQueue().getWorkRequestList().remove(ehs);
        JOptionPane.showMessageDialog(null,"The work request has been deleted successfully","Information",JOptionPane.WARNING_MESSAGE);
        populateEHSRequests();
        return;
        }
        else
        {
        JOptionPane.showMessageDialog(null,"The request cannot be deleted because it is not processed","Information",JOptionPane.WARNING_MESSAGE);
      //  populateEHSRequests();
        return;
        }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row from a table","Warning Message",JOptionPane.WARNING_MESSAGE);
            return;
        }
        EHSWorkRequest request = (EHSWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        //request.calculateDistance(WIDTH, WIDTH, WIDTH, WIDTH)
      if(request.getStatus().equalsIgnoreCase("Non Processed"))
      {
       AssignRequestsJPanel assignRequestsJPanel = new AssignRequestsJPanel(userProcessContainer, request,enterprise,userAccount);
       
       userProcessContainer.add("assignRequestsJPanel", assignRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
      }else
      {
      JOptionPane.showMessageDialog(null,"The request is already under process","Warning Message",JOptionPane.WARNING_MESSAGE);
      return;
      }
    }//GEN-LAST:event_jButton2ActionPerformed
@SuppressWarnings("empty-statement")
    private void populateRandomValues() 
    {    
    Timer timer = new Timer(300000,  new ActionListener() {
   
        @Override
        public void actionPerformed(ActionEvent e) {
         Sensor location = new Sensor(userAccount,enterprise); //To change body of generated methods, choose Tools | Templates.
        location.run();
        location.findRoute();
        location.findHosRoute();
        }
    });
    timer.setInitialDelay(0);
    timer.start();
   populateEHSRequests();
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateEHSRequests() {
        Timer timer = new Timer(300000,  new ActionListener() {
   
        @Override
        public void actionPerformed(ActionEvent e) {
       DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();    
        model.setRowCount(0);
           
              for (WorkRequest workRequest: userAccount.getWorkQueue().getWorkRequestList()) {
                  EHSWorkRequest request = (EHSWorkRequest)workRequest;
                    Object[] row = new Object[9];
                    row[0] = request;
                    row[1] = request.getLocation();
                    row[2] = request.getLongitude();
                    row[3] = request.getLatitude();
                    row[4] = request.getImpact();
                    row[5] = request.getCollisionWith();
                    row[6] = request.getRequestDate();
                    row[7] = request.getStatus();
                    if(request.getSender()!= null)
                    row[8] = request.getSender();
                    else
                        row[8] = "";
                    model.addRow(row);
              }
    }
   });
    timer.setInitialDelay(0);
    timer.start();
                }
}