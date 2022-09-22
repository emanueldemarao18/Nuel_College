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
public class Disciplina {

    private String descricao, curso,professor;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
     /*  pw.println("Descrição:" + this.getDescricao());
            pw.println("Carga Horária:" + this.getCargaHoraria());*/
     public String salvar(ArrayList<Disciplina> disc) {
        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("disciplina.txt");
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
                String Disciplina_save ="";
            for(Disciplina d:disc) {
                Disciplina_save += d.getDescricao()+"*"+d.getCargaHoraria()+"*"
                        +d.getCurso()+"*"+d.getProfessor()+"\n";
            }
            pw.println(Disciplina_save);
            
            pw.flush();//Enviar os dados do formulário no momento que é feito e
            // não armazenar em um buffer
            fw.close();
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Actualizações feitas com sucesso";
    } public ArrayList<Disciplina> ler() {
        Reader r = null;
        String caminho = "";
        ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
        
        try { 
            caminho = "disciplina.txt";
            r = new FileReader(caminho);
            BufferedReader bf = new BufferedReader(r);
            
            String myBuffer,currentLine;
            
            int c;
            String sep = "\\*";
               String[] mydisciplina1 = new String[4];
            do {
                currentLine = bf.readLine();
                //System.out.println(currentLine);
                       mydisciplina1 = currentLine.split(sep);
                
                       Disciplina d1 = new Disciplina();
                       d1.setDescricao(mydisciplina1[0]);
                       d1.setCargaHoraria(Integer.parseInt(mydisciplina1[1]));
                       d1.setCurso(mydisciplina1[2]);
                       d1.setProfessor(mydisciplina1[3]);
                      
                       
                    // Emanuel*18*Masculino*1.74*70.0*Casado*Nenhum**1  
                       
                       listaDisciplina.add(d1);
                       
            }while(currentLine !=null);
            
        } catch (Exception ex) {
        
        }  finally {
            try {
                if (r != null) {
                    r.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo " + caminho);
            }
        }
        return listaDisciplina;
      }
    

    

}
