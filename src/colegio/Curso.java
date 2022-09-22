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
public class Curso {

    private String descricao;
    private String coordenador;
    private int carga;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
     public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
     public String salvar(ArrayList<Curso> curs) {
        
        /*  */
          try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("curso.txt");
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
                String Cursos_save ="";
          for(Curso c: curs) {
                    Cursos_save += c.getDescricao() +"*"
                     + c.getCarga() +"*" +c.getCoordenador() + "\n";
                }   
            pw.println(Cursos_save);
            
            pw.flush();//Enviar os dados do formulário no momento que é feito e
            // não armazenar em um buffer
            fw.close();
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
          return "Actualizações feitas com sucesso";
    }
      
      public ArrayList<Curso> ler() {
        Reader r = null;
        String caminho = "";
        ArrayList<Curso> listaCursos = new ArrayList<>();
        
        try { 
            caminho = "curso.txt";
            r = new FileReader(caminho);
            BufferedReader bf = new BufferedReader(r);
            
            String myBuffer,currentLine;
            
            int c;
            String sep = "\\*";
               String[] myCurso1 = new String[3];
            do {
                currentLine = bf.readLine();
                //System.out.println(currentLine);
                       myCurso1 = currentLine.split(sep);
                
                       Curso c1 = new Curso();
                       c1.setDescricao(myCurso1[0]);
                       c1.setCarga(Integer.parseInt(myCurso1[1]));
                       c1.setCoordenador(myCurso1[2]);
                      
                       
                    // Emanuel*18*Masculino*1.74*70.0*Casado*Nenhum**1  
                       
                       listaCursos.add(c1);
                       
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
        return listaCursos;
      }} 

   

        

