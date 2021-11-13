/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     public String salvar() {
        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("docente.txt",true);
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
            pw.println("Nome:"+this.getNome());
            pw.println("Idade:"+this.getIdade());
            pw.println("Gênero:"+this.getGenero());
            pw.println("Altura:"+this.getAltura());
            pw.println("Peso:"+this.getPeso());
            pw.println("Gênero:"+this.getEstado_civil());
            pw.flush();//Enviar os dados do formulário no momento que é feito e
            // não armazenar em um buffer
            fw.close();
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Estudante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Dados salvos no arquivo";
    }

}
