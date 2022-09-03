package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

        for (int i=1; i<=3; i++) {
            System.out.println("Registrar pessoa " + i + ":");

            // Gravar a idade:
            int idade;
            do {
                System.out.println("Informa sua idade:");
                idade = teclado.nextInt();
            } while (idade > 150);


            // Gravar o sexo:
            int sexo;
            System.out.println("Informa seu sexo: 1 - Feminino; 2 - Maculino; 3 - Outros.");
            sexo = teclado.nextInt();
            while (sexo > 3) {
                System.out.println("Informacao invalida!!! Tenta novamente!!!\n");
                System.out.println("Informa seu sexo: 1 - Feminino; 2 - Maculino; 3 - Outros.");
                sexo = teclado.nextInt();
            }

            // Gravar a opção:
            int opcao;
            do {
                System.out.println("Informa seu status: 1 - Calma; 2 - Nervosa; 3 - Agressiva.");
                opcao = teclado.nextInt();
            } while (opcao > 3);


            // Salvar uma nova pessoa:
            Pessoa p = new Pessoa(idade, sexo, opcao);
            listaPessoa.add(p);

            // Exibir dados da pessoa:
            System.out.println("Pessoa " + i + ": ");
            p.exibirPessoa();

        }

        int calmas = 0, mNervosas = 0,hAgressivos = 0,oCalmos = 0,n40 = 0,c18 = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            // NÚMERO DE PESSOAS CALMAS:
            if (listaPessoa.get(i).getOpcao() == 1){
                calmas++;
            }
            // NÚMERO DE MULHERES NERVOSAS:
            if (listaPessoa.get(i).getSexo()==1 && listaPessoa.get(i).getOpcao()==2){
                mNervosas++;
            }
            // NÚMERO DE HOMENS AGRESSIVOS:
            if (listaPessoa.get(i).getSexo()==1 && listaPessoa.get(i).getOpcao()==2){
                hAgressivos++;
            }
            // NÚMERO DE OUTROS CALMOS:
            if (listaPessoa.get(i).getSexo()==3 && listaPessoa.get(i).getOpcao()==1){
                oCalmos++;
            }
            // NÚMERO DE PESSOAS NERVOSAS COM MAIS DE 40 ANOS:
            if (listaPessoa.get(i).getIdade()>=40 && listaPessoa.get(i).getOpcao()==2){
                n40++;
            }
            // NÚMERO DE PESSOAS CALMAS COM MENOS DE 18 ANOS:
            if (listaPessoa.get(i).getIdade()<18 && listaPessoa.get(i).getOpcao()==1){
                c18++;
            }
        }
        System.out.println(calmas + " sao pessoas calmas.");
        System.out.println(mNervosas + " sao mulheres nervosas.");
        System.out.println(hAgressivos + " sao homens agressivos.");
        System.out.println(oCalmos + " sao outros calmos.");
        System.out.println(n40 + " sao pessoas nervosa com mais de 40 anos.");
        System.out.println(c18 + " sao pessoas calmas com menos de 18 anos.");
        teclado.close();

        /*
        // Numero de pessoas sao calmas:
        int calmas = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            if (listaPessoa.get(i).getOpcao() == 1){
                calmas++;
            }
        }
        System.out.println(calmas + " sao pessoas calmas.");


        // Numero de mulheres nervosas:
        int mNervosas = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            if (listaPessoa.get(i).getSexo()==1 && listaPessoa.get(i).getOpcao()==2){
                mNervosas++;
            }
        }
        System.out.println(mNervosas + " sao mulheres nervosas.");


        // Numero de homens agressivos:
        int hAgressivos = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            if (listaPessoa.get(i).getSexo()==1 && listaPessoa.get(i).getOpcao()==2){
                hAgressivos++;
            }
        }
        System.out.println(hAgressivos + " sao homens agressivos.");


        // Numero de outros calmos:
        int oCalmos = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            if (listaPessoa.get(i).getSexo()==3 && listaPessoa.get(i).getOpcao()==1){
                oCalmos++;
            }
        }
        System.out.println(oCalmos + " sao outros calmos.");


        // Numero de pessoas nervosas com mais de 40 anos:
        int n40 = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            if (listaPessoa.get(i).getIdade()>=40 && listaPessoa.get(i).getOpcao()==2){
                n40++;
            }
        }
        System.out.println(n40 + " sao pessoas nervosa com mais de 40 anos.");


        // Numero de pessoas calmas com menos de 18 anos:
        int c18 = 0;
        for (int i=0; i < listaPessoa.size(); i++){
            if (listaPessoa.get(i).getIdade()<18 && listaPessoa.get(i).getOpcao()==1){
                c18++;
            }
        }
        System.out.println(c18 + " sao pessoas calmas com menos de 18 anos.");
        */

        /*
        for (Pessoa i: listaPessoa){
            System.out.print(i);
        }

        for (int j = 0; j < listaPessoa.size(); j++){
            System.out.println(listaPessoa.get(j));
        }
         */


    }
}
