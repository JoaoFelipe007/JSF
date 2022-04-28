/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.comunicacao;

import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteComunicao6Bean implements Serializable {
private List<Estudante> estudanteList = Estudante.estudanteList();

public String editar(int index){
    Estudante estudante = estudanteList.get(index);
    Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash(); //escopo que fica vivo só durante a chamada
    flash.put("estudante", estudante);
     return "comunicacao7?faces-redirect=true";
}

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

        }
