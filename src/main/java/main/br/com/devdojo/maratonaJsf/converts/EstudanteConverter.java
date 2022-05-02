/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.converts;

import java.util.List;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@FacesConverter(value = "estudanteConverter")
public class EstudanteConverter implements Converter{
private List<Estudante> estudanteList= Estudante.estudanteList();
    
    @Override //getAsObject responsavel por jogar dentro do model
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
      if(value != null || !value.matches("\\d+"))
        return null;
//            Estudante estudante = new Estudante();
//            estudante.setId(Integer.parseInt(value));
//            int index = estudanteList.indexOf(estudante);
//            return estudanteList.get(index);
    return this.getAttributesFrom(uiComponent).get(value);
    }

    @Override //getAsString reponsavel por criar o valor a ser selcionado no front
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if(value!=null && value.equals("")){
            Estudante estudante = (Estudante) value;
            if(estudante.getId() != null){
                    this.addAttribute(uiComponent, estudante);
                    return estudante.getId().toString();
            }
        }
        return null;
    }

   private Map<String, Object> getAttributesFrom(UIComponent component){
       return component.getAttributes();
   }
   
   private void addAttribute(UIComponent component,Estudante estudante){
       this.getAttributesFrom(component).put(estudante.getId().toString(), estudante);
   }
   
}
