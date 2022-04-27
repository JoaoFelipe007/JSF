/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicao4Bean implements Serializable {
    private String buttonName= "Nome do botão de bean";
    private Estudante estudante = new Estudante();
    public void execute(ActionEvent event){
       String nome= (String)event.getComponent().getAttributes().get("nome");
       String adjetivo= (String) event.getComponent().getAttributes().get("adjetivo");
       Estudante estudantte= (Estudante) event.getComponent().getAttributes().get("estudante");
       String testando= (String) event.getComponent().getAttributes().get("testando");
        System.out.println(nome);
        System.out.println(adjetivo);
        System.out.println(estudantte.getNome());
        System.out.println(testando);
    }
    
    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
    
}
