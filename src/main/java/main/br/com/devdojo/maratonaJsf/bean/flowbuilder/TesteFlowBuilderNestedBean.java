/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.flowbuilder;

import main.br.com.devdojo.maratonaJsf.bean.flow.*;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@FlowScoped("newpendencies")
public class TesteFlowBuilderNestedBean implements Serializable {

    private String userName;
    private String userSurname;

    public String validarUsuario() {
        System.out.println("Fazendo Consulta no sersa");
        System.out.println("Fazendo Consulta no sersa");

        if (true) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Usuario não passou nas pendencias", "Algum Detalhe util"));
            return null;
        }
        return "goToNewRegistration3";
    }
//    public String salvar(){
//        System.out.println("Lendo dados");
//        System.out.println("Processando Dados");
//        System.out.println("Salvando no Banco");
//        return;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

}
