/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import GUI.AddCustomerForm;
import GUI.DeleteCustomerForm;
import GUI.SearchCustomerForm;
import GUI.UpdateCustomerForm;
import GUI.ViewCustomerForm;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        
        new AddCustomerForm().setVisible(true);
        new SearchCustomerForm().setVisible(true);
        new DeleteCustomerForm().setVisible(true);
        new UpdateCustomerForm().setVisible(true);
        new ViewCustomerForm().setVisible(true);
        
        
    }
         
}
