package main.br.com.devdojo.maratonaJsf.util;


import java.io.Serializable;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.SessionMap;
import javax.inject.Named;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gestão Tech
 */

public class ApplicationMapUtil{
    public static Object getValueFromApplicationMap(String key){
        return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get(key);
    }
   public static void setValueInApplicationMap(String key, Object value){
    FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put(key, value);
}
}