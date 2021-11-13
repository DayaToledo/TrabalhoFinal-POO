/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal.controlador;


import trabalhofinal.modelos.Universidade;

/**
 *
 * @author dayan
 */
public class Controlador {
    private static Universidade uni = new Universidade("UNESP");
    
    //****************CADASTROS****************
    public void addDepartamento(String cod, String nome){
        uni.addDepartamento(cod, nome);
    }
    
    public float addTecnico(String codigo, String nome, double salario, String nivel, String funcao, String depart){
        return uni.addTecnico(codigo, nome, salario, nivel, funcao, depart);
    }
    
    public float addEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, String depart){
        return uni.addEfetivo(codigo, nome, salario, nivel, titulacao, area, depart);
    }
    
    public float addSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int carga, String depart){
        return uni.addSubstituto(codigo, nome, salario, nivel, titulacao, carga, depart);
    }
    
    
    //****************RELATÓRIOS****************
    public String all(){
        return uni.exibirTodosDeptoFunc();
    }

    public String allDepartamentos(){
        return uni.exibirTodosDepartamentos();
    }
    
    public String allFuncionarios(){
        return uni.exibirTodosFuncionarios();
    }
    
    public String allTecnicos(){
        return uni.listarTecnicos();
    }
    
    public String allDocentes(){
        return uni.listarDocentes();
    }
    
    public String allEfetivos(){
        return uni.listarEfetivos();
    }
    
    public String allSubstitutos(){
        return uni.listarSubstitutos();
    }
    
    
     //****************BUSCAS****************
    public String buscaFuncNome(String nome){
        return uni.buscaFuncNome(nome);
    }
    
    public String buscaFuncCod(String cod){
        return uni.buscaFuncCod(cod);
    }
    
    public String buscaDepartamento(String depart){
        return uni.buscaDepto(depart);
    }
    
    public String buscaDeptoFaixa(float min, float max){
        return uni.deptosFaixaGasto(min, max);
    }
    
    public String buscaFuncFaixa(float min, float max){
        return uni.funcsFaixaSalarial(min, max);
    }
    
     //****************OUTRAS****************
    public String[] getDepartamentos (){
        return uni.nomesDepartamentos();
    }
}
