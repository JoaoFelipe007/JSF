/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.estudante;

import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "eh", "Brabo"};
    private List<String> nomesLista = asList("Joao", "Rainne", "JH");
    private Set<String> nomesSet = new HashSet<>(asList("Cassio ", "Willian ", "Renato Augusto "));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotaas;
    private boolean mostrarTexto;
    private boolean mostrarLink;

    public void calcularQuadrado(LambdaExpression le, long value){
    long result =(long)le.invoke(FacesContext.getCurrentInstance().getELContext(),value);
        System.out.println(result);
    }
    
    
    
    {
        nomesMap.put(" Homem aranha", "Força de Vontade");
        nomesMap.put(" Capitão America", "Fidelidade");
        nomesMap.put(" Homem de Ferro", "Playboy");

//        for(Map.Entry<String, String> entry: nomesMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }

    public void executaar(String param) {
        System.out.println("Fazendo busca no banco de dados");
        System.out.println("processando banco de dados");
        System.out.println("Exibindo dados");
        System.out.println("Retornando com o parametro: " + param);
    }

    public String irPara() {
        return "index2?faces-redirect=true";
    }

    public String executarRetorno(String param) {
        return "Meu nome é " + param;
    }

    public void exibirNotas() {
        this.mostrarNotaas = true;
    }

    public void esconderNotas() {
        this.mostrarNotaas = false;
    }
    public void exibirTexto() {
        this.mostrarTexto = true;
    }

    public void esconderTexto() {
        this.mostrarTexto = false;
    }
    public void exibirLink() {
        this.mostrarLink = true;
    }

    public void esconderLink() {
        this.mostrarLink = false;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public boolean isMostrarNotaas() {
        return mostrarNotaas;
    }

    public void setMostrarNotaas(boolean mostrarNotaas) {
        this.mostrarNotaas = mostrarNotaas;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public void setNomesLista(List<String> nomesLista) {
        this.nomesLista = nomesLista;
    }

    public List<String> getNomesLista() {
        return nomesLista;
    }

    public void setNomesList(List<String> nomesLista) {
        this.nomesLista = nomesLista;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public boolean isMostrarTexto() {
        return mostrarTexto;
    }

    public void setMostrarTexto(boolean mostrarTexto) {
        this.mostrarTexto = mostrarTexto;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    
}
