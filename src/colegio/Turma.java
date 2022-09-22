/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanueldemarao
 */
public class Turma {

    private String director_turma, descricao, turno;
    private int numero;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String salvar(ArrayList<Turma> turm) {
        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("turma.txt");
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
                String Turma_save ="";
            for(Turma t: turm) {
                Turma_save += t.getDescricao()+"*"+t.getNumero()
                        +"*"+t.getTurno()+"*"+t.getDirector_turma()+"\n";
            }
            pw.println(Turma_save);
            
            pw.flush();//Enviar os dados do formulário no momento que é feito e
            // não armazenar em um buffer
            fw.close();
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Actualizações feitas com sucesso";
    }
    
    public ArrayList<Turma> ler() {
        Reader r = null;
        String caminho = "";
        ArrayList<Turma> listaTurma = new ArrayList<>();
        
        try { 
            caminho = "turma.txt";
            r = new FileReader(caminho);
            BufferedReader bf = new BufferedReader(r);
            
            String myBuffer,currentLine;
            
            int c;
            String sep = "\\*";
               String[] myTurma1 = new String[4];
            do {
                currentLine = bf.readLine();
                //System.out.println(currentLine);
                       myTurma1 = currentLine.split(sep);
                
                       Turma T1 = new Turma();
                       T1.setDescricao(myTurma1[0]);
                       T1.setNumero(Integer.parseInt(myTurma1[1]));
                       T1.setTurno(myTurma1[2]);
                       T1.setDirector_turma(myTurma1[3]);
                       
                       
                    // Emanuel*18*Masculino*1.74*70.0*Casado*Nenhum**1  
                       
                       listaTurma.add(T1);
                       
            }while(currentLine !=null);
            
        } catch (Exception ex) {
            System.out.println(caminho + " nao existe.");
        }  finally {
            try {
                if (r != null) {
                    r.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo " + caminho);
            }
        }
            

    return listaTurma;
    }

  

}
