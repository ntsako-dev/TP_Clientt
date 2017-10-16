/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolpicker;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kino
 */
public class MyFrams 
{
    JFrame frame = new JFrame();
    
    public void msg()
    {
      JOptionPane.showMessageDialog(frame,"Benoni High School\n\n"
              + "Address: Cradock St, Actonville, Gauteng, 1501, South Africa\n"
              + "City: City of Benoni\n"
              + "Post Office box: 5048, Actonville, Benoni, 1506\n"
              + "Phone number: 011 421 1486\n"
              + "Fax: 011 421 5235\n"
              + "Categories: Primary Schools\n"
              + "Rating : 3/5\n", 
              "SELECTED SCHOOL DETAILS", JOptionPane.INFORMATION_MESSAGE);  
    }
    
     public void showMsg()
     {
            Object[] options = {"Reset Password","Register","Re-enter credentials"};
            int n = JOptionPane.showOptionDialog(frame,
           "School Details\n\n"
                   + "please select on of the options below to continue?",
           "Login Error",
           JOptionPane.YES_NO_CANCEL_OPTION,
           JOptionPane.WARNING_MESSAGE,
           null,
           options,
           options[2]);
     }
    
}
