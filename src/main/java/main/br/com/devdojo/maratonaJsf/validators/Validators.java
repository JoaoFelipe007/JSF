/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.validators;

import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.bean.loginBean.LoginBean;

/**
 *
 * @author Gestão Tech
 */
@Named
@RequestScoped
public class Validators implements Serializable{
     private List<String> emailsDb = asList("Willian.suane@gmail.com.br", "joaofelipe@gmail.com", "contato@pessoal@gmail.com");

    @Inject
    private LoginBean loginBean;
    
    
    public void ValidateDuplicatedEmail(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
//        System.out.println(loginBean.getLanguage());
        String email = (String) o;
        if (emailsDb.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email já foi cadastrado", "");
            throw new ValidatorException(message);
        }

    }
}
