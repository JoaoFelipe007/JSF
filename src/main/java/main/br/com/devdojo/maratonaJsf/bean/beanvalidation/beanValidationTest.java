/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.beanvalidation;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class beanValidationTest implements Serializable {

    @Size(max = 10, message = "O nome deve conter entre três a dez caracteres")
    @NotNull(message = "O nome é obrigatorio")
    private String nome;
    @Pattern(regexp = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$", message="Digite um email válido")
    private String email;
    @DecimalMax(value = "30.50", message = "O numero decimal não pode ser maior que 30.50")
    @DecimalMin(value = "5.00", message = "O numero decimal não pode ser menor que 5.00")
    private double decimal;
    @Digits(integer = 3, fraction = 2, message = "O numero não pode ser maior que 999 e as casas decimias não podem ser maior que 2")
    private double numero;

    public void salvar() {
        System.out.println(nome.isEmpty());
        System.out.println(nome);
        System.out.println(email);
        System.out.println(decimal);
        System.out.println(numero);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
