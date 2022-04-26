/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.cdi.Param;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicao2Bean implements Serializable{
    @Inject
    @Param
    private String nome;
    @Inject
    @Param
    private String sobrenome;

    
    public void init(){
//        Map<String, String> requestParameterMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
//        nome=requestParameterMap.get("nome");
//        sobrenome=requestParameterMap.get("sobrenome");
        System.out.println("nome");
        System.out.println("sobrenome");
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

    
}
