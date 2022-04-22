/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.flowbuilder;

import main.br.com.devdojo.maratonaJsf.bean.flow.*;
import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author Gestão Tech
 */
@Named
@FlowScoped(value = "newregistration")
public class TesteFlowBuilderBean implements Serializable{
    private String nome;
    private String sobrenome;
    private String endereco;

    public void salvar(){
        System.out.println("Salvando noo Banco");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(endereco);
            //return "exitToInicioFlow";
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
