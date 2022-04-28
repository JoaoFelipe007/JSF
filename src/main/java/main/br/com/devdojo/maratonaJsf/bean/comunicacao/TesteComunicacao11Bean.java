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
import main.br.com.devdojo.maratonaJsf.util.ApplicationMapUtil;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicacao11Bean implements Serializable {    
    private List<Estudante> estudanteList = Estudante.estudanteList();

    public String editar(Estudante estudante){
         ApplicationMapUtil.setValueInApplicationMap("estudante", estudante);
        return "comunicacao12?faces-redirect=true";
    }
    
    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
    
    
}
