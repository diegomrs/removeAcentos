/*
 recebe uma string e remove todos os acentos
 */
package com.mycompany.removeracentos;

import java.util.Scanner;


public class RemoveAcento {

    
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void main(String[] args) {
        
        Scanner acento = new Scanner(System.in);
        System.out.println("Digite a frase.");
        String frase = acento.nextLine();
        System.out.println(frase.replaceAll("[,.;:/~^´`!@#$%¨&*=+'|]", ""));
        /* o método replaceAll realliza a retirada de caracters especiais (acentos)*/
  // /u*  aterado com suces
       
        }
  }
    












