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
public class Disciplina {
    private String descricao;
    private int cargaHoraria;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
     public String salvar() {
        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("disciplina.txt",true);
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
            pw.println("Descrição:"+this.getDescricao());
            pw.println("Carga Horária:"+this.getCargaHoraria());
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
