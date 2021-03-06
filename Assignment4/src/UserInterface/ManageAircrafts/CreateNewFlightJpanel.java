/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAircrafts;

import Business.Aircraft;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gulat
 */
public class CreateNewFlightJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJpanel
     */
    private JPanel cardSequenceJPanel;
    private Aircraft aircraft;
    private TravelAgency travelAgency;
    CreateNewFlightJpanel(JPanel cardSequenceJpanel, Aircraft aircraft) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJpanel;
        this.aircraft = aircraft;
        txtAirlinerName.setEnabled(false);
        txtAirlinerName.setText(aircraft.getAirlinerName());
    }
    
        public boolean checkString(String string){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(string);
        boolean b = m.matches();
        return b;
    }
    
    public boolean checkFlightNumber(String string){
        Pattern p = Pattern.compile("^[\\w]+-[\\w]+$");
        Matcher m = p.matcher(string);
        boolean b = m.matches();
        return b;
    }
    
    public boolean checkTimePattern(String string){
       Pattern p = Pattern.compile("^[0-9]+:[0-9]+$");
       Matcher m = p.matcher(string);
       boolean b = m.matches();
       return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        txtAirlinerName = new javax.swing.JTextField();
        txtFlightNumber = new javax.swing.JTextField();
        txtFlightDestination = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFlightDeparture = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFlightArrival = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalSeats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFlightSource = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        lblHeading.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("CREATE NEW FLIGHT");

        btnBack.setBackground(new java.awt.Color(245, 245, 246));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(78, 114, 175));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(245, 245, 246));
        btnCreate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(78, 114, 175));
        btnCreate.setText("Create Flight");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtAirlinerName.setEditable(false);
        txtAirlinerName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAirlinerName.setForeground(new java.awt.Color(78, 114, 175));
        txtAirlinerName.setEnabled(false);
        txtAirlinerName.setPreferredSize(new java.awt.Dimension(200, 30));

        txtFlightNumber.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightNumber.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightNumber.setPreferredSize(new java.awt.Dimension(200, 30));

        txtFlightDestination.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightDestination.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightDestination.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Destination:");

        txtFlightDeparture.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightDeparture.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightDeparture.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Flight Number:");

        txtFlightArrival.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightArrival.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightArrival.setPreferredSize(new java.awt.Dimension(200, 30));
        txtFlightArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightArrivalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Airliner Name :");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price Of Seat :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Seats :");

        txtTotalSeats.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTotalSeats.setForeground(new java.awt.Color(78, 114, 175));
        txtTotalSeats.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Departure Time:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Source:");

        txtFlightSource.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFlightSource.setForeground(new java.awt.Color(78, 114, 175));
        txtFlightSource.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Arrival Time:");

        txtprice.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtprice.setForeground(new java.awt.Color(78, 114, 175));
        txtprice.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(372, 372, 372)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtFlightArrival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtFlightDeparture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtFlightDestination, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addComponent(txtFlightSource, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtFlightNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtAirlinerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addComponent(txtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addContainerGap(372, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 593, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFlightNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFlightSource, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFlightDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFlightDeparture, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFlightArrival, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtprice, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTotalSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(138, 138, 138)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
        Component[] comps= cardSequenceJPanel.getComponents();
        for(Component c:comps)
        {
            if(c instanceof AircraftsMngWorkAreaJPanel)
            {
                AircraftsMngWorkAreaJPanel panel=(AircraftsMngWorkAreaJPanel) c;
                panel.calculateFleetSize();
                panel.populateAirlinersTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String airlinerName = txtAirlinerName.getText();
        String flightNumber = txtFlightNumber.getText();
        String source = txtFlightSource.getText();
        String destination = txtFlightDestination.getText();
        String departure = txtFlightDeparture.getText();
        String arrival = txtFlightArrival.getText();
        try{
            Double price = Double.parseDouble(txtprice.getText());
            int totalSeats = Integer.parseInt(txtTotalSeats.getText());
            
        if(!checkFlightNumber(flightNumber)){
            JOptionPane.showMessageDialog(null, "Please enter valid flight number : XX-XXXX");
        }
        else if(!checkTimePattern(departure)){
            JOptionPane.showMessageDialog(null, "Please enter valid departure time : XX:XX");
        }
        else if(!checkTimePattern(arrival)){
            JOptionPane.showMessageDialog(null, "Please enter valid arrival time : XX:XX");
        }
        else if(!checkString(source)){
            JOptionPane.showMessageDialog(null, "Please enter valid source");
        }
        else if(!checkString(destination)){
            JOptionPane.showMessageDialog(null, "Please enter valid destination");
        }
        else {
            aircraft.addFlight(airlinerName, flightNumber, source, destination, departure, arrival, price, totalSeats);
            txtFlightNumber.setText("");
            txtFlightSource.setText("");
            txtFlightDestination.setText("");
            txtFlightDeparture.setText("");
            txtFlightArrival.setText("");
            txtprice.setText("");
            txtTotalSeats.setText("");
            JOptionPane.showMessageDialog(null, "Flight successfully added");
        }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price and Total seats should be a number");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtFlightArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightArrivalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtFlightArrival;
    private javax.swing.JTextField txtFlightDeparture;
    private javax.swing.JTextField txtFlightDestination;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFlightSource;
    private javax.swing.JTextField txtTotalSeats;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
