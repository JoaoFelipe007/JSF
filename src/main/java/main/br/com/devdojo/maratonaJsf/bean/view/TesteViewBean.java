/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteViewBean implements Serializable{
     
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

    @PostConstruct
    public void init(){
        personagens = asList("Asa Noturna", "Robin", "Batman");
    }
    
    
    public void selecionarPersonagem() {// metodo que gerará um numero aleaotrio que irá selcionar uma posição na Lista de personagens
        int index = ThreadLocalRandom.current().nextInt(3);
        String perso = personagens.get(index);
        personagemSelecionado.add(perso);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }
}
