/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.ajax;

import java.io.Serializable;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class AjaxTesteBean implements Serializable{
    private String nome;
    private String sobrenome;

    public void toUpperCase(AjaxBehaviorEvent event){
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
        System.out.println(nome);
        System.out.println(sobrenome);
    } 
    
    public void toUpperCase2(){
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
        System.out.println(nome);
        System.out.println(sobrenome);
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
