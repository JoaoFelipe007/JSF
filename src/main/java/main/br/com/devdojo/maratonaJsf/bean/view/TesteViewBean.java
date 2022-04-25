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
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.bean.dependent.TesteDependentBean;
import main.br.com.devdojo.maratonaJsf.bean.session.TesteSessionBean;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TesteViewBean implements Serializable{
     
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteViewBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }
    
    
    @PostConstruct
    public void init(){
        personagens = asList("Asa Noturna", "Robin", "Batman");
    }
    
    
    public void selecionarPersonagem() {// metodo que gerará um numero aleaotrio que irá selcionar uma posição na Lista de personagens
        int index = ThreadLocalRandom.current().nextInt(3);
        String perso = personagens.get(index);
        personagemSelecionado.add(perso);
        dependentBean.getPersonagemSelecionado().add(perso);
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

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

 
    }
    
    

