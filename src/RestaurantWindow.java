import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestaurantWindow extends javax.swing.JFrame {

    int chickenNum, meatNum, waterNum, pepsiNum;
    double chickenPrice, meatPrice, waterPrice, pepsiPrice;
    final double CHICKEN_COST = 4.0, MEAT_COST = 4.0, WATER_COST = 1.0, PEPSI_COST = 3.0;
    double subTotal, tax, total;
    int customerCounter = 1;
    PrintWriter output;
    
    
    
    public RestaurantWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMeatCounter = new javax.swing.JSpinner();
        jMeatCheese = new javax.swing.JCheckBox();
        jMeatPrice = new javax.swing.JLabel();
        jChickenCounter = new javax.swing.JSpinner();
        jChickenCheese = new javax.swing.JCheckBox();
        jChickenPrice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jWaterCounter = new javax.swing.JSpinner();
        jWaterPrice = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPepsiCounter = new javax.swing.JSpinner();
        jPepsiPrice = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSubPrice = new javax.swing.JLabel();
        jTax = new javax.swing.JLabel();
        jTotalPrice = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        calculateBill = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Restaurant Management System");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Developed by Mohamed Hatem");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Food", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(461, 142));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Chicken Shawarma");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Meat Shawarma");

        jMeatCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jMeatCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMeatCounterStateChanged(evt);
            }
        });

        jMeatCheese.setText("Add Cheese");
        jMeatCheese.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMeatCheese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jMeatCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeatCheeseActionPerformed(evt);
            }
        });

        jMeatPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMeatPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMeatPrice.setText("0.0 EGP");

        jChickenCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jChickenCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jChickenCounterStateChanged(evt);
            }
        });

        jChickenCheese.setText("Add Cheese");
        jChickenCheese.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jChickenCheese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jChickenCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChickenCheeseActionPerformed(evt);
            }
        });

        jChickenPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jChickenPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jChickenPrice.setText("0.0 EGP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMeatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jChickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jChickenCheese)
                        .addGap(18, 18, 18)
                        .addComponent(jChickenPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jMeatCheese)
                        .addGap(18, 18, 18)
                        .addComponent(jMeatPrice)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jChickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChickenCheese)
                    .addComponent(jChickenPrice))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jMeatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMeatCheese)
                    .addComponent(jMeatPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Water");

        jWaterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jWaterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jWaterCounterStateChanged(evt);
            }
        });

        jWaterPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jWaterPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jWaterPrice.setText("0.0 EGP");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Pepsi");

        jPepsiCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPepsiCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jPepsiCounterStateChanged(evt);
            }
        });

        jPepsiPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPepsiPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPepsiPrice.setText("0.0 EGP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPepsiCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jWaterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jWaterPrice))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPepsiPrice)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jWaterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWaterPrice))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPepsiCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPepsiPrice))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jSubPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSubPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jSubPrice.setText("Price: 0.0 EGP");

        jTax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTax.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTax.setText("Tax: 0.0 EGP");

        jTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTotalPrice.setText("Total Price: 0.0 EGP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSubPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTax, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotalPrice))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSubPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jTotalPrice)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        calculateBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calculateBill.setText("Calculate");
        calculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBillActionPerformed(evt);
            }
        });

        saveBill.setText("Save Bill");
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });

        newBill.setText("New Bill");
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calculateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(saveBill)
                        .addGap(29, 29, 29)
                        .addComponent(newBill)))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBill)
                    .addComponent(newBill))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Bill No. 1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shawarma.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit)
                                .addGap(35, 35, 35)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel14))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(exit))
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2))
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jChickenCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChickenCheeseActionPerformed
        if (jChickenCheese.isSelected()) {
            chickenPrice += chickenNum;
        } else {
            chickenPrice -= chickenNum;
        }
        jChickenPrice.setText(chickenPrice + " EGP");
    }//GEN-LAST:event_jChickenCheeseActionPerformed

    private void jMeatCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeatCheeseActionPerformed
        if (jMeatCheese.isSelected()) {
            meatPrice += meatNum;
        } else {
            meatPrice -= meatNum;
        }
        jMeatPrice.setText(meatPrice + " EGP");
    }//GEN-LAST:event_jMeatCheeseActionPerformed

    private void calculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBillActionPerformed
        subTotal = chickenPrice + meatPrice + waterPrice + pepsiPrice;
        jSubPrice.setText("Price: " + subTotal + " EGP");
        tax = subTotal * 0.05;
        // Of course there is a function to be there 2 numbers after mark but i don't know it
        tax *= 100;
        tax = (double) ((int) tax);
        tax /= 100;
        jTax.setText("Tax: " + tax + " EGP");
        total = tax + subTotal;
        jTotalPrice.setText("Total Price: " + total + " EGP");
    }//GEN-LAST:event_calculateBillActionPerformed

    private void jChickenCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jChickenCounterStateChanged
        chickenNum = (int)jChickenCounter.getValue();
        chickenPrice = CHICKEN_COST * chickenNum;
        jChickenPrice.setText(chickenPrice + " EGP");
    }//GEN-LAST:event_jChickenCounterStateChanged

    private void jMeatCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMeatCounterStateChanged
        meatNum = (int)jMeatCounter.getValue();
        meatPrice = MEAT_COST * meatNum;
        jMeatPrice.setText(meatPrice + " EGP");
    }//GEN-LAST:event_jMeatCounterStateChanged

    private void jWaterCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jWaterCounterStateChanged
        waterNum = (int)jWaterCounter.getValue();
        waterPrice = WATER_COST * waterNum;
        jWaterPrice.setText(waterPrice + " EGP");
    }//GEN-LAST:event_jWaterCounterStateChanged

    private void jPepsiCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jPepsiCounterStateChanged
        pepsiNum = (int)jPepsiCounter.getValue();
        pepsiPrice = PEPSI_COST * pepsiNum;
        jPepsiPrice.setText(pepsiPrice + " EGP");
    }//GEN-LAST:event_jPepsiCounterStateChanged

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed
        try {
            output = new PrintWriter("Bill No." + customerCounter + ".txt");
            output.println("Bill number " + customerCounter);
            output.println("------------------------");
            if (chickenNum != 0) {
                output.print(chickenNum + " Chicken Shawarma");
                if (jChickenCheese.isSelected()) {
                    output.print(" with cheese");
                }
                output.println(" = " + chickenPrice + " EGP");
            }
            if (meatNum != 0) {
                output.print(meatNum + " Meat Shawarma");
                if (jMeatCheese.isSelected()) {
                    output.print(" with cheese");
                }
                output.println(" = " + meatPrice + " EGP");
            }
            if (waterNum != 0) {
                output.println(waterNum + " Water = " + waterPrice + " EGP");
            }
            if (pepsiNum != 0) {
                output.println(pepsiNum + " Pepsi = " + pepsiPrice + " EGP");
            }
            output.println("------------------------");
            output.println("Sum = " + subTotal + " EGP");
            output.println("Tax = " + tax + " EGP");
            output.println("Total = " + total + " EGP");
            output.println("*** Thank you for your order ***");
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RestaurantWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBillActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed
        if (total != 0) {
            
            jChickenCounter.setValue(0);
            jMeatCounter.setValue(0);
            jWaterCounter.setValue(0);
            jPepsiCounter.setValue(0);
            
            jChickenCheese.setSelected(false);
            jMeatCheese.setSelected(false);
            
            jSubPrice.setText("Price: 0.0 EGP");
            jTax.setText("Tax: 0.0 EGP");
            jTotalPrice.setText("Total: 0.0 EGP");
            
            subTotal = tax = total = 0;
            
            customerCounter++;
            jLabel14.setText("Bill No." + customerCounter);
            
        }
        
    }//GEN-LAST:event_newBillActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBill;
    private javax.swing.JButton exit;
    private javax.swing.JCheckBox jChickenCheese;
    private javax.swing.JSpinner jChickenCounter;
    private javax.swing.JLabel jChickenPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox jMeatCheese;
    private javax.swing.JSpinner jMeatCounter;
    private javax.swing.JLabel jMeatPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jPepsiCounter;
    private javax.swing.JLabel jPepsiPrice;
    private javax.swing.JLabel jSubPrice;
    private javax.swing.JLabel jTax;
    private javax.swing.JLabel jTotalPrice;
    private javax.swing.JSpinner jWaterCounter;
    private javax.swing.JLabel jWaterPrice;
    private javax.swing.JButton newBill;
    private javax.swing.JButton saveBill;
    // End of variables declaration//GEN-END:variables
}
