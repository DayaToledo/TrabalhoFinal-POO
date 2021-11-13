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
public class FuncDocSubstituto extends FuncionarioDocente{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public FuncDocSubstituto() {
        super("vazio", "vazio", 0, "vazio", "vazio");
        this.cargaHoraria = 0;
    }

    public FuncDocSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria) {
        super(codigo, nome, salario, nivel, titulacao);
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String exibir(){
        return super.exibir() 
                + "\nCarga Horária: " + cargaHoraria 
                + "\n--------------------------\n\n";
    }
    
    @Override
    public float calcularSalario() {
        double valNivel = 0.0;

        if (super.getNivel().equals("S1")) {
            valNivel = Constantes.S1;
        } else if (super.getNivel().equals("S2")) {
            valNivel = Constantes.S2;
        }

        return (float) (super.getSalario() + (super.getSalario() * valNivel));
    }   
    
}