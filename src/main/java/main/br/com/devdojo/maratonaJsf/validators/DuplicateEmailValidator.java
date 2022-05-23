/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.validators;

import static java.util.Arrays.asList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.servlet.http.Part;
import main.br.com.devdojo.maratonaJsf.bean.loginBean.LoginBean;

/**
 *
 * @author
 */
@FacesValidator
public class DuplicateEmailValidator implements Validator {

    private List<String> emailsDb = asList("Willian.suane@gmail.com.br", "joaofelipe@gmail.com", "contato@pessoal@gmail.com");

    @Inject
    private LoginBean loginBean;

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
//        System.out.println(loginBean.getLanguage());
        String email = (String) o;
        if (emailsDb.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email já foi cadastrado", "");
            throw new ValidatorException(message);
        }

    }

    public void validateArquivo(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        Part file = (Part) o;

        try {
                validateFileNameLength(file);
                validateContentType(file);
                validateFileSize(file);
        } catch (RuntimeException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "");

            throw new ValidatorException(message);
        }

    }

    public void validateFileNameLength(Part file) {
        if (file.getSubmittedFileName().length() > 10) {
            throw new RuntimeException("O nome + extenção ultrapassam 10 car");
        }
    }

    public void validateContentType(Part file) {
        String contentType = file.getContentType();
        if (!contentType.equals("image/png") && !contentType.equals("image/jpge")) {
            throw new RuntimeException("O arquivo enviado não é uma Imagem PNG ou JPGE");
        }
    }

    public void validateFileSize(Part file) {
        if (file.getSize() > 1048576) {
            throw new RuntimeException("O arquivo não pode exceder 1Mb");
        }
    }

}
