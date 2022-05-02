/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.converter;

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
public class ConverterTesteBean implements Serializable {

    private Estudante estudante = new Estudante();
    private List<Estudante> estudanteList = Estudante.estudanteList();
    
    public void save() {
        System.out.println("Salvando");
        System.out.println(estudante.getEmail());
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

    
    
}
