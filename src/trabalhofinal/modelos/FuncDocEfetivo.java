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
public class FuncDocEfetivo extends FuncionarioDocente{
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public FuncDocEfetivo(String area) {
        super("vazio", "vazio", 0, "vazio", "vazio");
        this.area = "vazia";
    }

    public FuncDocEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area) {
        super(codigo, nome, salario, nivel, titulacao);
        this.area = area;
    }
    
    @Override
    public String exibir(){
        return super.exibir() 
                + "\nÁrea: " + area 
                + "\n--------------------------\n\n";
    }
    
    @Override
    public float calcularSalario() {
        double valNivel = 0.0;
        
        if (super.getNivel().equals("D1")) {
            valNivel = Constantes.D1;
        } else if (super.getNivel().equals("D2")) {
            valNivel = Constantes.D2;
        } else if (super.getNivel().equals("D3")) {
            valNivel = Constantes.D3;
        }
        
        float sal = (float) (super.getSalario() + (super.getSalario() * valNivel));
        
        return (sal + (sal*(float)(Constantes.EFETIVO)));
    }  
}
