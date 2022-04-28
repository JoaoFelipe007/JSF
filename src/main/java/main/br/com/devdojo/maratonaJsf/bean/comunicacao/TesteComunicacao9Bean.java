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
public class TesteComunicacao9Bean implements Serializable {

        private String value;

    public void init() {
        value = Faces.getRequestCookie("nome");
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
