/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicacao10Bean implements Serializable {
    private String password;
    private List<Estudante> estudanteList = Estudante.estudanteList();

    public void remover(Estudante estudante){
        estudanteList.remove(estudante);
    }
    
    public void salvar(){
        System.out.println(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

    
}
