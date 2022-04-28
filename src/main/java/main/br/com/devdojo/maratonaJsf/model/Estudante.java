/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.model;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import main.br.com.devdojo.maratonaJsf.model.enums.Turno;

/**
 *
 * @author Gestão Tech
 */
public class Estudante {
    private String nome ="João Felipe";
    private String sobrenome ="de Paula Silva";
    private double nota1 =10;
    private double nota2;
    private Turno turno = Turno.MATUTINO;
    private double nota3 =30;

    public Estudante() {
    }

    public Estudante(String nome, String sobrenome, double nota1) {
        this.nome= nome;
        this.sobrenome= sobrenome;
        this.nota1= nota1;
    }

    public static List<Estudante> estudanteList(){
    return new ArrayList<>(asList(new Estudante ("João","de Paula",10),
      new Estudante ("João","Henrique",10),
      new Estudante ("Rainne","Souza",10)));
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    
}
