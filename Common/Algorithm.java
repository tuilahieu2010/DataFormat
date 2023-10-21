/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author hieu
 */
public class Algorithm {
    Library l;
    Validation val;

    public Algorithm() {
        l = new Library();
        val = new Validation();
    }
    
    public void checkPhoneNumber() {
        String s = l.getString("Phone number: ");
        while (val.checkPhoneNumber(s) == null) {
            System.out.println("Invalid format. Please input again.");
            s = l.getString("Phone number: ");
        }
        System.out.println("Successful");
    }
    public void checkEmail() {
        String s = l.getString("Email: ");
        while (val.checkEmail(s) == null) {
            System.out.println("Invalid format. Please input again.");
            s = l.getString("Email: ");
        }
        System.out.println("Successful");
    }
    public void checkDate() {
        String s = l.getString("Date: ");
        while (val.checkDate(s) == null) {
            System.out.println("Invalid format (dd/mm/yyyy). Please input again.");
            s = l.getString("Date: ");
        }
        System.out.println("Successful");
    }
}

