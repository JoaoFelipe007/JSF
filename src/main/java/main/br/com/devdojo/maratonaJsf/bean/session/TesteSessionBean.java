/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import main.br.com.devdojo.maratonaJsf.model.Estudante;

/**
 *
 * @author Gestão Tech
 */
@Named
@SessionScoped // O conceito desse Escopoe é que tudo o que está nesse bean vai ficar com essas variaveis vivas  enquanto a sessão estiver ativa(equanto o Browser estiver rodando) 
// A sessionScoped teve usada quando um determinado atributo precisar sem usada em outras beans/paginas. Como por exemplo o login eo carrinho de compras.
public class TesteSessionBean implements Serializable{
    
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    private Estudante estudante;

    @PostConstruct
    public void init(){
        personagens = asList("Sentinela", "Lobo", "Vigia");
        logar();
    }
    
    public void logar(){
    //  Fez consulta, verificou  se esta ok
    estudante = new Estudante();
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }
    
    public void selecionarPersonagem() {// metodo que gerará um numero aleaotrio que irá selcionar uma posição na Lista de personagens
        int index = ThreadLocalRandom.current().nextInt(3);
        String perso = personagens.get(index);
        personagemSelecionado.add(perso);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public Estudante getEstudante() {
        return estudante;
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
