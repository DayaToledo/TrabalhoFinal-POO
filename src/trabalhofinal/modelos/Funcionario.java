/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal.modelos;

/**
 *
 * @author dayan
 */
public abstract class Funcionario {
    
    private String codigo;
    private String nome;
    private double salario;
    private String nivel;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario() {
        this.codigo = "vazio";
        this.nome = "vazio";
        this.salario = 0;
        this.nivel = "vazio";
    }

    public Funcionario(String codigo, String nome, double salario, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }
    
    public String exibir(){
        return "Código: " + codigo
             + "\nNome: " + nome
             + "\nSalário base: " + Constantes.dinheiro.format(salario)
             + "\nSalário final: " + Constantes.dinheiro.format(calcularSalario())
             + "\nNível: " + nivel;
    }
    
    public abstract float calcularSalario();
}


