/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.application;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@ApplicationScoped// esse escopo serve para quando você quer deixar algo vivo enquanto enquanto a aplicação estiver viva 
public class TesteApplicationBean implements Serializable{
     private List<String> categorias;

    @PostConstruct
    public void init(){
        categorias = asList("Asa Noturna", "Robin", "Batman");
    }

    public void mudarLista(){
        categorias = asList("Asa Noturna", "Robin", "Batman","Coringa");
    }
    
    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }
    
   
}
