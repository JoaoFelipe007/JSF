/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.teste;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.KeyGenerator;

/**
 *
 * @author Gestão Tech
 */
public class teste {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(256);
        String key = Base64.getEncoder().encodeToString(generator.generateKey().getEncoded());
        System.out.println(key);
        
    }
    
}
