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
public class Docente extends Pessoa {

    private int numero_docente;
    private String disciplina, funcao_exercida, turma,salario;
     

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

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
     public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    

    public String getFuncao_exercida() {
        return funcao_exercida;
    }

    public void setFuncao_exercida(String funcao_exercida) {
        this.funcao_exercida = funcao_exercida;
    }

    public String salvar(ArrayList<Docente> doce) {
         

        try {
             //True serve para acrescentar o conteudo e nao substituido
            FileWriter fw = new FileWriter("docentes.txt");
            PrintWriter pw = new PrintWriter(fw);// escreve o conteúdo no arquivo
                String Docentes_save ="";
                for(Docente d: doce) {
                Docentes_save += d.getNome() + "*" + d.getIdade()+ "*" +
                d.getGenero() + "*" + d.getAltura()+"*" + d.getPeso() +"*"
                +d.getEstado_civil() + "*" + d.getNumero_docente() +"*" +
                d.getDisciplina() +"*" + d.getTurma() +"*" + d.getFuncao_exercida()
                +"*" + d.getSalario()+ "\n";
            }
            pw.println(Docentes_save);
            
            pw.flush();//Enviar os dados do formulário no momento que é feito e
            // não armazenar em um buffer
            fw.close();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
        }

         return "Actualizações feitas com sucesso";
    }
    public ArrayList<Docente> ler() {
        Reader r = null;
        String caminho = "";
        ArrayList<Docente> listaDocentes = new ArrayList<>();
        
        try { 
            caminho = "docentes.txt";
            r = new FileReader(caminho);
            BufferedReader bf = new BufferedReader(r);
            
            String myBuffer,currentLine;
            
            int c;
            String sep = "\\*";
               String[] myDocente1 = new String[11];
            do {
                currentLine = bf.readLine();
                //System.out.println(currentLine);
                       myDocente1 = currentLine.split(sep);
                
                       Docente D1 = new Docente();
                       D1.setNome(myDocente1[0]);
                       D1.setIdade(Integer.parseInt(myDocente1[1]));
                       D1.setGenero(myDocente1[2]);
                       D1.setAltura(myDocente1[3]);
                       D1.setPeso(myDocente1[4]);
                       D1.setEstado_civil(myDocente1[5]);
                       D1.setNumero_docente(Integer.parseInt(myDocente1[6]));
                       D1.setDisciplina(myDocente1[7]);
                       D1.setTurma(myDocente1[8]);
                       D1.setFuncao_exercida(myDocente1[9]);
                       D1.setSalario(myDocente1[10]);
                       
                       
                       
                    // Emanuel*18*Masculino*1.74*70.0*Casado*Nenhum**1  
                       
                       listaDocentes.add(D1);
                       
            }while(currentLine!=null);
            
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
            

    return listaDocentes;
    }

    
   
    
 

}
