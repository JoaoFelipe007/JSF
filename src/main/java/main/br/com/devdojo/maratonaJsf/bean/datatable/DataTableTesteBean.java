/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.datatable;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class DataTableTesteBean implements Serializable{
    private List<Estudante> estudanteList = Estudante.estudanteList();
    private Set<Estudante> estudanteSet= new HashSet<>(Estudante.estudanteList());
    private List<Estudante> estudanteLinkedList= new LinkedList<>(Estudante.estudanteList());
    private Map<String,Estudante> estudanteMap= new HashMap<>();
    
    public void init(){
        estudanteMap.put("Estudante 1",new Estudante (1,"João","de Paula",10));
        estudanteMap.put("Estudante 2",new Estudante (2,"João","Henrique",10));
        estudanteMap.put("Estudante 3",new Estudante (3,"Rainne","Souza",10));
    }
    
    public void orderByNome(String ordem){
        if(ordem.equals("asc"))
            estudanteList.sort(Comparator.comparing(Estudante::getNome));
        else
            estudanteList.sort(Comparator.comparing(Estudante::getNome).reversed());
    }
    
    public void orderBySobrenome(String ordem){
        if(ordem.equals("asc"))
            estudanteList.sort(Comparator.comparing(Estudante::getSobrenome));
        else
            estudanteList.sort(Comparator.comparing(Estudante::getSobrenome).reversed());
    }
    
    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

    public Set<Estudante> getEstudanteSet() {
        return estudanteSet;
    }

    public void setEstudanteSet(Set<Estudante> estudanteSet) {
        this.estudanteSet = estudanteSet;
    }

    public List<Estudante> getEstudanteLinkedList() {
        return estudanteLinkedList;
    }

    public void setEstudanteLinkedList(List<Estudante> estudanteLinkedList) {
        this.estudanteLinkedList = estudanteLinkedList;
    }

    public Map<String, Estudante> getEstudanteMap() {
        return estudanteMap;
    }

    public void setEstudanteMap(Map<String, Estudante> estudanteMap) {
        this.estudanteMap = estudanteMap;
    }
    
    
}
