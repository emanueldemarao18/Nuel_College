/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
public class Estudante extends Pessoa {

    private int numero_estudante;
    private String turma, curso, Caminho;

    
    public int getNumero_estudante() {
        return numero_estudante;
    }

    public void setNumero_estudante(int numero_estudante) {
        this.numero_estudante = numero_estudante;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Arquivo

    public String salvar(ArrayList<Estudante> estud) {

        
        try {
            //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("estudante.txt");
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
            String Student_Save="" ;
            for(Estudante e: estud) {
                Student_Save += e.getNome() + "*" + e.getIdade()+ "*"
                + e.getGenero()+ "*" + e.getAltura()+ "*" + e.getPeso()+ "*"
                + e.getEstado_civil()+ "*" + e.getTurma()+ "*" + e.getCurso() + "*"
                +e.getNumero_estudante() + "\n";
            }
            pw.println(Student_Save);
             
            /*
            pw.println("Nome:" + this.getNome());
            pw.println("Idade:" + this.getIdade());
            pw.println("Gênero:" + this.getGenero());
            pw.println("Altura:" + this.getAltura());
            pw.println("Peso:" + this.getPeso());
            pw.println("Estado Civil:" + this.getEstado_civil());
            pw.println("Turma:" + this.getTurma());
            pw.println("Peso:" + this.getCurso());
            pw.println("Número:" + this.getNumero_estudante());
            pw.println("_____________________________________________________");
*/
            pw.flush();//Enviar os dados do formulário no momento que é feito e
            // não armazenar em um buffer
            pw.close();
            fw.close();
            

        } catch (IOException ex) {
            Logger.getLogger(Estudante.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "Actualizações feitas com sucesso";
    }
    
    
      
    

    public ArrayList<Estudante> ler() {
        Reader r = null;
        String caminho = "";
        ArrayList<Estudante> listaEstudantes = new ArrayList<>();
        
        try { 
            caminho = "estudante.txt";
            r = new FileReader(caminho);
            BufferedReader bf = new BufferedReader(r);
            
            String myBuffer,currentLine;
            
            int c;
            String sep = "\\*";
               String[] myStudent1 = new String[9];
            do {
                currentLine = bf.readLine();
                //System.out.println(currentLine);
                       myStudent1 = currentLine.split(sep);
                
                       Estudante E1 = new Estudante();
                       E1.setNome(myStudent1[0]);
                       E1.setIdade(Integer.parseInt(myStudent1[1]));
                       E1.setGenero(myStudent1[2]);
                       E1.setAltura(myStudent1[3]);
                       E1.setPeso(myStudent1[4]);
                       E1.setEstado_civil(myStudent1[5]);
                       E1.setTurma(myStudent1[6]);
                       E1.setCurso(myStudent1[7]);
                       E1.setNumero_estudante(Integer.parseInt(myStudent1[8]));
                       
                    // Emanuel*18*Masculino*1.74*70.0*Casado*Nenhum**1  
                       
                       listaEstudantes.add(E1);
                       
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
            

    return listaEstudantes;
    }
    
}