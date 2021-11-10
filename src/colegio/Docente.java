/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author emanueldemarao
 */
public class Docente extends Pessoa {

    private int numero_docente;
    private String disciplina, funcao_exercida;
    private double salario;

    public int getNumero_docente() {
        return numero_docente;
    }

    public void setNumero_docente(int numero_docente) {
        this.numero_docente = numero_docente;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao_exercida() {
        return funcao_exercida;
    }

    public void setFuncao_exercida(String funcao_exercida) {
        this.funcao_exercida = funcao_exercida;
    }

}
