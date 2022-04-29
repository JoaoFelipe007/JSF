/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.loginBean;

import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Locale;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */

@Named
@SessionScoped
public class LoginBean implements Serializable{
    private String nome;
    private String senha;
    private Estudante estudante;
    private List<Locale> localeList = asList(new Locale("en"), new Locale("pt"));
    private String language;
    private int qtdMessages;
    
    public String login(){
        if(nome.equals("w")&& senha.equals("1")){
            estudante = new Estudante();
            qtdMessages++;
            return "/restricted/iniciosistema.xhtml?faces-redirect=true";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usario com senha ou Login Invalido","") );
        return null;
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login.xhtml?faces-redirect=true";
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<Locale> getLocaleList() {
        return localeList;
    }

    public void setLocaleList(List<Locale> localeList) {
        this.localeList = localeList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getQtdMessages() {
        return qtdMessages;
    }

    public void setQtdMessages(int qtdMessages) {
        this.qtdMessages = qtdMessages;
    }

        
    
    
}
