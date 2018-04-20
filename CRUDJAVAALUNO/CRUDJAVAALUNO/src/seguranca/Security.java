/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguranca;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Guinho
 */
public class Security {
    
    
    public static String criptarsenha(String valor) throws NoSuchAlgorithmException, UnsupportedEncodingException{
       
         
       
        //Escolher o Algoritmo de criptografia
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte messageDigest[] = md.digest(valor.getBytes("UTF-8"));
        
        StringBuilder sb = new StringBuilder();
        
        for (byte b : messageDigest){
            sb.append(String.format("%02X", 0xFF &b));
        }
        
       return sb.toString();
    }
    
}
