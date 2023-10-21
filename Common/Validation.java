/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author hieu
 */
public class Validation {
    public String checkPhoneNumber(String s) {
        if (s.matches("^[0-9]{10}$"))
            return s;
        return null;
    }
    
    public String checkEmail(String s) {
        if (s.matches("^[A-Za-z0-9.]+@gmail.com$"))
            return s;
        return null;
    }
    
    public Date checkDate(String s) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            return null;
        }
    }
}
