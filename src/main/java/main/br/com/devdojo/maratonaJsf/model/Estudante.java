/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Objects;
import main.br.com.devdojo.maratonaJsf.model.enums.Turno;

/**
 *
 * @author Gestão Tech
 */
public class Estudante implements Serializable{
    private Integer id;
    private String nome ="João Felipe";
    private String sobrenome ="de Paula Silva";
    private double nota1 =10;
    private double nota2;
    private Turno turno = Turno.MATUTINO;
    private double nota3 =30;
    private String email;
    
    
    public Estudante () {
    }

    public Estudante(String nome, String sobrenome, double nota1) {
        this.nome= nome;
        this.sobrenome= sobrenome;
        this.nota1= nota1;
    }
    public Estudante(Integer id,String nome, String sobrenome, double nota1) {
        this.id = id;
        this.nome= nome;
        this.sobrenome= sobrenome;
        this.nota1= nota1;
    }

    public static List<Estudante> estudanteList(){
    return new ArrayList<>(asList(new Estudante (1,"João","de Paula",10),
      new Estudante (2,"João","Henrique",10),
      new Estudante (2,"João","Henrique",10),
      new Estudante (3,"Rainne","Souza",10)));
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudante other = (Estudante) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
