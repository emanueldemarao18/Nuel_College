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
public class Estudante extends Pessoa {

    private int numero_estudante;

    public int getNumero_estudante() {
        return numero_estudante;
    }

    public void setNumero_estudante(int numero_estudante) {
        this.numero_estudante = numero_estudante;
    }
    //Arquivo
    public String salvar() {
        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("estudante.txt",true);
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
            pw.println("Nome:"+this.getNome());
            pw.println("idade:"+this.getIdade());
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
