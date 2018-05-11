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
public class McDelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        ViewController viewcontroller = new ViewController(model);
        //allows ViewController to access model
        viewcontroller.setVisible(true);
    }
    
}
