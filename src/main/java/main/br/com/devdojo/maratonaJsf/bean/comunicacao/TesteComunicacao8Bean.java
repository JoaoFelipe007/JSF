/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import org.omnifaces.util.Faces;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicacao8Bean implements Serializable {

    private String key;
    private String value;

    public void init() {
       Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
System.out.println(Faces.getRequestCookie("nome"));
       System.out.println(requestCookieMap);
    }

    public String salvar() {
        System.out.println(key);
        System.out.println(value);
        Faces.addResponseCookie(key, value, -1);
        return "comunicacao9?faces-redirect=true";
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    
}
