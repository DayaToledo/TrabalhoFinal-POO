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
public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario funcionarios[];
    int MAX = 50;
    int cont;

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

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.cont = 0;
        this.funcionarios = new Funcionario[MAX];
    }

    public Departamento() {
        this.codigo = "vazio";
        this.nome = "vazio";
        this.cont = 0;
        this.funcionarios = new Funcionario[MAX];
    }
    
    public void addFuncionario(Funcionario f){
        if(cont < MAX){
            funcionarios[cont] = f;
            cont++;
        }
    }
    
    public Funcionario buscaFuncNome(String nome){
        for(int i = 0; i < cont; i++){
            if(funcionarios[i].getNome().equals(nome))return funcionarios[i];
        }
        return null;
    }
    
    public Funcionario buscaFuncCod(String cod){
        for(int i = 0; i < cont; i++){
            if(funcionarios[i].getCodigo().equals(cod))return funcionarios[i];
        }
        return null;
    }
    
    public String exibir(){
        return "\nCódigo: " + codigo
             + "\nNome: " + nome
             + "\nQuantidade de funcionários: " + cont
             + "\nGasto total: " + Constantes.dinheiro.format(gastoTotal())   
             + "\n--------------------------\n\n";
    }
    
    public String exibirTodosFuncionarios(){
        String funcs = "";
        for(int i = 0; i < cont; i++){
            funcs = funcs + funcionarios[i].exibir();
        }
        return funcs;
    }
    
    public String listarDocentes(){
        String docs = "";
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof FuncionarioDocente)
                docs = docs + funcionarios[i].exibir();
        }
        return docs;
    }
    
    public String listarEfetivos(){
        String efe = "";
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof FuncDocEfetivo)
                efe = efe + funcionarios[i].exibir();
        }
        return efe;
    }
    
    public String listarSubstitutos(){
        String sub = "";
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof FuncDocSubstituto)
                sub = sub + funcionarios[i].exibir();
        }
        return sub;
    }
    
    public String listarTecnicos(){
        String tecnicos = "";
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof FuncionarioTecnico)
                tecnicos = tecnicos + funcionarios[i].exibir();
        }
        return tecnicos;
    }
    
    public String faixaSalarial(double min, double  max){
        String funcs = "";
        float salario = (float) 0.0;
        for(int i = 0; i < cont; i++){
            salario = funcionarios[i].calcularSalario();
            if((salario <= max)&&(salario >= min)){
                funcs = funcs + funcionarios[i].exibir();
            }
        }
        return funcs;
    }
    
    public String faixaGastoTotal(float min, float max){
        String deptos = "";
        float gasTot = gastoTotal();
        if((gasTot <= max)&&(gasTot >= min)){
            deptos = deptos + exibir();
        }
        return deptos;
    }
    
    public float gastoTotal(){
        float soma = 0;
        for(int i = 0; i < cont; i++){
            soma = soma + funcionarios[i].calcularSalario();
        }
        return soma;
    }
}
