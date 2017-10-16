/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolpicker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Kino
 */
public class RestService implements CommandLineRunner{
    private static void callService()
    {
        try {
            RestTemplate restTemp = new RestTemplate();
            Parent parent = restTemp.getForObject("http://localhost:8080/parent/read/", Parent.class);
            //System.out.println("Parent name " + parent.getName());
            }
            catch(Exception e)
            {
                System.out.println("Ntsako : "+e.getMessage());
                System.out.println("Error : "+ e.toString());
            }
    }


    @Override
    public void run(String... args) throws Exception {
        callService();
    }
    
}
