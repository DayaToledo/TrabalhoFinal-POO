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
public class FuncionarioTecnico extends Funcionario{
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public FuncionarioTecnico() {
        super("vazio", "vazio", 0, "vazio");
    }

    public FuncionarioTecnico(String codigo, String nome, double salario, String nivel, String funcao) {
        super(codigo, nome, salario, nivel);
        this.funcao = funcao;
    }
    
    @Override
    public String exibir(){
        return super.exibir() 
                + "\nFunção: " + funcao 
                + "\n--------------------------\n\n";
    }
    
    @Override
    public float calcularSalario() {
        double valNivel = 0.0;

        if (super.getNivel().equals("T1")) {
            valNivel = Constantes.T1;
        } else if (super.getNivel().equals("T2")) {
            valNivel = Constantes.T2;
        }

        return (float) (super.getSalario() + (super.getSalario() * valNivel));
    }
}
