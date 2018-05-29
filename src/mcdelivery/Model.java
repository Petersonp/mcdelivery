/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdelivery;


import java.util.Properties;
import java.util.Date;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author Patrick
 */
public class Model {
    private int finalCost;
    int orderCount = 0;
    
    Order[] orders = new Order[100];
    
    void sendEmail(String to, String first, String last, String subTotal,String deliveryCharge,String grandTotal){
        // Recipient's email ID needs to be mentioned.
      

      // Sender's email ID needs to be mentioned
                final String username = "noreplymcdelivery@gmail.com";
		final String password = "mcdelivery";
                Date date=java.util.Calendar.getInstance().getTime();  

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("noreplymcdelivery@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(to));
			message.setSubject("Mcdelivery - we have received your order!");
			message.setText(
                        "Dear " + first + " " +last + ", \n "
                        +"   We have received your order on "+date+"\n\n"
                        +"Your order details:\n"
                        + "--------------------------------\n"
                        +this.toEmail()
                        + "\n\n--------------BILL-------------\n"
                        + "      Sub Total: " + subTotal +"\n"
                        + "Delivery Charge: " + deliveryCharge +"\n"
                        + "--------------------------------\n"
                        + "    Grand Total: " + grandTotal);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
    
    public String toPrice(String price){
            return (price+" PHP");
    }
    
    public String toEmail(){
        String emailOrder = "";
        for (int i = 0; i < orderCount; i++){
            int Quantity = orders[i].getQuantity();
            String Product = orders[i].getProduct();
            int price = orders[i].getPrice();
            emailOrder += String.valueOf(Quantity) + "x "+ Product + " - " + String.valueOf((price) +"PHP\n");
        }
        return emailOrder;
    }
    void addProduct(String quantity, String product,  String price, String addons, String basePrice ){
        Order order = new Order();
        order.setProduct(product);
        order.setQuantity(Integer.valueOf(quantity));
        order.setPrice(Integer.valueOf(price));
        order.setBasePrice(Integer.valueOf(basePrice));
        order.setAddons(addons);
        orders[orderCount] = order;
        orderCount++;
    }
    String[] getOrders(){
    String[]  allOrders = new String[orderCount];
    for (int i = 0; i < orderCount; i++){
        allOrders[i] = orders[i].toString();
    }
    return allOrders;
}
    int getfinalPrice(){
        String[] priceList = new String[orderCount];
        int finalPrice = 0;
        for(int n = 0; n < orderCount; n++){
            finalPrice = finalPrice + (orders[n].getPrice());
        }
        return finalPrice;
    }
    void remove(int selectedIndex) {
        
        orders[selectedIndex].setPrice(0);
        orders[selectedIndex].setProduct("");
        orders[selectedIndex].setQuantity(0);
        orders[selectedIndex].setBasePrice(0);
        for(int n = selectedIndex; n<orderCount;n++){
            orders[n] = orders[n+1];
        }
        orderCount--;
    }
    void edit(int selectedIndex, int quantity, String addons, int price){
        orders[selectedIndex].setQuantity(quantity);
        orders[selectedIndex].setAddons(addons);
        orders[selectedIndex].setPrice(price);
        
        
    }
    String[] getEdit(int i){
        String[] tmpvalues = new String[3];
        tmpvalues[0] = orders[i].getProduct();
        tmpvalues[1] = String.valueOf(orders[i].getBasePrice());
        tmpvalues[2] = String.valueOf(orders[i].getQuantity());
        return tmpvalues;
    }
    
    
}
 
    
  
