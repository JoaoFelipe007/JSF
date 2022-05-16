/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.ajax;

import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class AjaxTesteBean implements Serializable {

    private String nome;
    private String sobrenome;
    private Map<String, List<String>> personagensQuadrinhoMap;
    private List<String> personagens;
    private String editora;
    private String personagemSelecionado;
    {
        personagensQuadrinhoMap = new TreeMap<>();
        personagensQuadrinhoMap.put("Marvel", asList("Homem Aranha", "Duende Verde", "Sentinela"));
        personagensQuadrinhoMap.put("DC", asList("Batman", "Super Man", "Coringa"));
        personagensQuadrinhoMap.put("Image", asList("Invencível", "Omini Men", "RexTotal"));
    }

    public void toUpperCase(AjaxBehaviorEvent event) {
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
        System.out.println(nome);
        System.out.println(sobrenome);
    }

    public void selectEditora() {
        if(editora == null){
            this.personagens = null;
            return;
        }
        personagens = personagensQuadrinhoMap.get(editora);
    }

    public void toUpperCase2() {
        this.nome = this.nome.toUpperCase();
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

    public Map<String, List<String>> getPersonagensQuadrinhoMap() {
        return personagensQuadrinhoMap;
    }

    public void setPersonagensQuadrinhoMap(Map<String, List<String>> personagensQuadrinhoMap) {
        this.personagensQuadrinhoMap = personagensQuadrinhoMap;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(String personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
