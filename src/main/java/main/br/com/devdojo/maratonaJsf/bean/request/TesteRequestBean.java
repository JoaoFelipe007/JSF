/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@RequestScoped// usar quando tiver que exibir dados para o usuario, é tambem é um escopo que vai ficar vivo durantre a requisição http ou seja quando o usario for pegar alguma informação através dessa requição os todos esse dados estarão "vivo" porém depois que ele te retorno as informações eles "morrem"
public class TesteRequestBean implements Serializable {

    private List<String> personagens = asList("Woody", "mike wazowski", "Sr. Incrivel");
    private List<String> personagemSelecionado = new ArrayList<>();

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
