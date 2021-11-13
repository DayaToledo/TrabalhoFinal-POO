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
public class Universidade {
    private String nome;
    private Departamento departamentos[];
    int MAX = 10;
    int cont;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public Universidade(String nome) {
        this.cont = 0;
        this.nome = nome;
        this.departamentos = new Departamento[MAX];
    }

    public Universidade() {
        this.cont = 0;
        this.departamentos = new Departamento[MAX];
        this.nome = "vazio";
    }
    
    public void addDepartamento(String cod, String nome){
        Departamento d = new Departamento(cod, nome);
        
        if(cont < MAX){
            departamentos[cont] = d;
            cont++;
        }
    }
    
    public float addTecnico(String codigo, String nome, double salario, String nivel, String funcao, String depart){
        FuncionarioTecnico t = new FuncionarioTecnico(codigo, nome, salario, nivel, funcao);
        Departamento d = buscaDeptoNome(depart);
        d.addFuncionario(t);
        
        return t.calcularSalario();
    }
    
    public float addEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, String depart){
        FuncDocEfetivo e = new FuncDocEfetivo(codigo, nome, salario, nivel, titulacao, area);
        Departamento d = buscaDeptoNome(depart);
        d.addFuncionario(e);
        
        return e.calcularSalario();
    }
    
    public float addSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int carga, String depart){
        FuncDocSubstituto s = new FuncDocSubstituto(codigo, nome, salario, nivel, titulacao, carga);
        Departamento d = buscaDeptoNome(depart);
        d.addFuncionario(s);
        
        return s.calcularSalario();
    }
    
    public Departamento buscaDeptoCod(String cod){
        for(int i = 0; i < cont; i++){
            if(departamentos[i].getCodigo().equals(cod))return departamentos[i];
        }
        return null;
    }
    
    public Departamento buscaDeptoNome(String nome){
        for(int i = 0; i < cont; i++){
            if(departamentos[i].getNome().equals(nome))return departamentos[i];
        }
        return null;
    }
    
    public String buscaDepto(String nome){
        for(int i = 0; i < cont; i++){
            if(departamentos[i].getNome().equals(nome))
                return "--------- DEPARTAMENTO --------"
                    + departamentos[i].exibir()
                    + "--------- Funcionários --------\n"
                    + departamentos[i].exibirTodosFuncionarios();
        }
        return null;
    }
    
    public String buscaFuncNome(String nome){
        Funcionario f = null;
        var salFinal = (float) 0.0;
        for(int i = 0; i < cont; i++){
            f = departamentos[i].buscaFuncNome(nome);
            if(f != null) {
                salFinal = f.calcularSalario();
                return f.exibir();
            }
        }
        return null;
    }
    
    public String buscaFuncCod(String cod){
        Funcionario f = null;
        float salFinal = (float) 0.0;
        for(int i = 0; i < cont; i++){
            f = departamentos[i].buscaFuncCod(cod);
            if(f != null) {
                salFinal = f.calcularSalario();
                return f.exibir();
            }
        }
        return null;
    }
    
    public String exibirTodosDepartamentos(){
        String Relatorio = "";
        for(int i = 0; i < cont; i++){
            Relatorio = Relatorio + departamentos[i].exibir();
        }
        return Relatorio;
    }
    
    public String exibirTodosDeptoFunc(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio = relatorio 
                    + "--------- DEPARTAMENTO --------"
                    + departamentos[i].exibir()
                    + "--------- Funcionários --------\n"
                    + departamentos[i].exibirTodosFuncionarios();
        }
        return relatorio;
    }
    
    public String exibirTodosFuncionarios(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + departamentos[i].exibirTodosFuncionarios();
        }
        return relatorio;
    }
    
    public String listarDocentes(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + departamentos[i].listarDocentes();
        }
        return relatorio;
    }
    
    public String listarEfetivos(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + departamentos[i].listarEfetivos();
        }
        return relatorio;
    }
    
    public String listarSubstitutos(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + departamentos[i].listarSubstitutos();
        }
        return relatorio;
    }
    
    public String listarTecnicos(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + departamentos[i].listarTecnicos();
        }
        return relatorio;
    }
    
    public String funcsFaixaSalarial(float min, float max){
        String funcs = "";
        for(int i = 0; i < cont; i++){
            funcs = funcs + departamentos[i].faixaSalarial(min, max);
        }
        return funcs;
    }
    
    public String deptosFaixaGasto(float min, float max){
        String deptos = "";
        for(int i = 0; i < cont; i++){
            deptos = deptos + departamentos[i].faixaGastoTotal(min, max);
        }
        return deptos;
    }
    
    public String[] nomesDepartamentos(){
        String dep[] = new String[cont];
        for(int i = 0; i < cont; i++){
            dep[i] = departamentos[i].getNome();
        }
        return dep;
    }
}
