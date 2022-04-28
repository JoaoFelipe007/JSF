/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;
import main.br.com.devdojo.maratonaJsf.util.ApplicationMapUtil;

/**
 *
 * @author Gestão Tech
 */
@Named
@RequestScoped  
public class TesteComunicacao12Bean implements Serializable {    
  private Estudante estudante;
  private Estudante estudante2 = new Estudante();

    public void init(){
        System.out.println("entrou");
      estudante= (Estudante) ApplicationMapUtil.getValueFromApplicationMap("estudante");
    }

  public Estudante getEstudante() {
        return estudante;
    }

  public String voltar(){
      System.out.println(estudante2.getNome());
      System.out.println(estudante2.getSobrenome());
      return "comunicacao11?faces-redirect=true";
  }
    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Estudante getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante estudante2) {
        this.estudante2 = estudante2;
    }
  
  
}
