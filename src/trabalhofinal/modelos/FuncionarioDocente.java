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
public abstract class FuncionarioDocente extends Funcionario{
    private String titulacao;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public FuncionarioDocente() {
        super("vazio", "vazio", 0, "vazio");
        this.titulacao = "vazio";
    }

    public FuncionarioDocente(String codigo, String nome, double salario, String nivel, String titulacao) {
        super(codigo, nome, salario, nivel);
        this.titulacao = titulacao;
    }
    
    @Override
    public String exibir(){
        return super.exibir() 
                + "\nTitulação: " + titulacao;
    }
    
    @Override
    public abstract float calcularSalario();
}
