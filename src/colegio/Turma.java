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
public class Turma {

    private String director_turma, descricao, turno;
    private String numero;

    public String getDirector_turma() {
        return director_turma;
    }

    public void setDirector_turma(String director_turma) {
        this.director_turma = director_turma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String salvar() {
        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("turma.txt",true);
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
            pw.println("Descrição:"+this.getDescricao());
            pw.println("Número:"+this.getNumero());
            pw.println("Turno:"+this.getTurno());
            pw.println("Director de Turma:"+this.getDirector_turma());
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
