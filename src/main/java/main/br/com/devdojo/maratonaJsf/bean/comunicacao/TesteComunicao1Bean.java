/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicao1Bean implements Serializable{
    private String nome;
    private String sobrenome;
    private Date data = new Date();
    
        public void imprimirAtributos(){
       String initParameter = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("images.location");
        System.out.println(initParameter);
    }

    public String save(){
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(data);
        return "comunicacao2?faces-redirect=true&nome="+nome+"&sobrenome="+sobrenome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
 
}
