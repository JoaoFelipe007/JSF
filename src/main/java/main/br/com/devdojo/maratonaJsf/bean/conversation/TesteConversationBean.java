/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ConversationScoped // esse escopo é como se fosse uma sessão onde você tem o controle desse bean
// ele tem dois modos:
//Transient:Como se fosse em um tempo de espera
public class TesteConversationBean implements Serializable{
     private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

    @Inject
    private Conversation conversation;
    
    @PostConstruct
    public void init(){
        personagens = asList("Sentinela", "Lobo", "Vigia");
        if(conversation.isTransient()){
            //long Runnig
            conversation.begin();
            System.out.println("Iniciando conversation scopped, ID="+conversation.getId());
        }
    }
    
   public String endConversation(){
       if(!conversation.isTransient()){
           conversation.end();
       }
       return "conversation?faces-redirect=true";
   }
   
   public void selecionarPersonagem() {// metodo que gerará um numero aleaotrio que irá selcionar uma posição na Lista de personagens
        int index = ThreadLocalRandom.current().nextInt(3);
        String perso = personagens.get(index);
        personagemSelecionado.add(perso);
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
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
