/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdelivery;

/**
 *
 * @author Patrick
 */
public class AddProduct extends javax.swing.JDialog {
boolean cancel = false;
Model model;
int intQuant;
int intquantCost;
int price;
boolean addOn = false;
String product;

    /**
     * Creates new form AddProduct
     */
    public AddProduct(java.awt.Frame parent, boolean modal, String product, int price, int quantity, Model model){
        super(parent, modal);
        initComponents();
        this.model = model;
        this.price = price;
        this.product = product;
        lblProduct.setText(this.product);  
        lblPrice.setText((String.valueOf(price*quantity)));
        lblEquat.setText(this.toDisplayPrice(price));
        txtQuant.setText(String.valueOf(quantity));
        
    }
    boolean isCancelled(){
        return cancel;
    }
    String[] getOrder() {
        String[] details = new String[4];
        details[0] = (String)txtQuant.getText();
        details[1] = lblProduct.getText();
        details[2] = lblPrice.getText();
        details[3] = String.valueOf(price);
        
        return details;
    }
    int getPrice(){
        int tmpprice = (price*Integer.valueOf(txtQuant.getText()));
        return tmpprice;
    }
    String toDisplayPrice(int price){
        String displayPrice = ("x " + (price) + " = " );
        return displayPrice;
    }
    int getQuantity(){
        return Integer.valueOf(txtQuant.getText());
    }
    boolean isAdding(){
        System.out.println(addOn);
        return addOn;
    }
    String getProduct(){
        return this.product;
    }
    int getintPrice(){
        return this.price;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddtocart = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        lblEquat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProduct = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 250, 240));

        jLabel1.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 36)); // NOI18N
        jLabel1.setText("Enter Quantity");

        btnAddtocart.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        btnAddtocart.setText("Add to cart");
        btnAddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtocartActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblPrice.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        lblPrice.setText("<Price>");

        txtQuant.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        txtQuant.setText("Enter a Number");
        txtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantActionPerformed(evt);
            }
        });

        lblEquat.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        lblEquat.setText("<equation>");

        jLabel2.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        jLabel2.setText("PHP");

        btnAddon.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 0, 24)); // NOI18N
        btnAddon.setText("Add Add-ons");
        btnAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrice)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEquat)
                        .addComponent(lblPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(192, 18, 38));

        lblProduct.setFont(new java.awt.Font("Akzidenz-Grotesk BQ", 1, 48)); // NOI18N
        lblProduct.setForeground(new java.awt.Color(230, 175, 60));
        lblProduct.setText("<Name>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblProduct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProduct)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtocartActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAddtocartActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.cancel = true;
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantActionPerformed
       
        intquantCost = price * (Integer.valueOf(txtQuant.getText()));
        String displayPrice = (String.valueOf(intquantCost));
        lblPrice.setText(displayPrice);
       
    }//GEN-LAST:event_txtQuantActionPerformed

    private void btnAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddonActionPerformed
        this.addOn = true;
        System.out.println(addOn);
        this.dispose();
    }//GEN-LAST:event_btnAddonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddon;
    private javax.swing.JButton btnAddtocart;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEquat;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}