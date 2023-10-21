/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Common.Algorithm;
import View.Menu;
/**
 *
 * @author hieu
 */
public class ManagerMenu extends Menu<String>{
    static String[] options = {"Check phone number", "Check email", "Check date", "Exit"};
    Algorithm ar;
    public ManagerMenu() {
        super("===== VALIDATE PROGRAM =====", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: ar.checkPhoneNumber();
            case 2: ar.checkEmail();
            case 3: ar.checkDate();
            case 4: System.exit(0);
        }
    }
}