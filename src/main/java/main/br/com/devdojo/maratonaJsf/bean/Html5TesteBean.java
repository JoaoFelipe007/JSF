/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class Html5TesteBean implements Serializable {

    private String email;
    private Map<String, String> attributes = new HashMap<>();

    public void init() {
        attributes.put("type", "email");
        attributes.put("placeholder", "digite seu email");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

}