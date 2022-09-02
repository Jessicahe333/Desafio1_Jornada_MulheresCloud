package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        // Gravar a idade:
        System.out.println("Informa sua idade: \n");
        pessoa1.setIdade(teclado.nextInt());
        System.out.println("A idade da pessoa e" + pessoa1.getIdade());

        // Gravar o sexo:
        System.out.println("Informa seu sexo: \n1 - Feminino; \n2 - Maculino; \n3 - Outros.");
        int sexo = teclado.nextInt();
        switch (sexo){
            case 1:
                pessoa1.setSexo(sexo);
                break;
            case 2:
                pessoa1.setSexo(sexo);
                break;
            case 3:
                pessoa1.setSexo(sexo);
                break;
            default:
                pessoa1.setSexo(3);
        }
        System.out.println("Seu sexo e " + pessoa1.getSexo());

        // Gravar a opção:
        System.out.println("Informa seu status: \n1 - Calma; \n2 - Nervosa; \n3 - Agressiva.");
        int opcao = teclado.nextInt();
        switch (opcao){
            case 1:
                pessoa1.setOpcao(opcao);
                break;
            case 2:
                pessoa1.setOpcao(opcao);
                break;
            case 3:
                pessoa1.setOpcao(opcao);
                break;
            default:
                pessoa1.setOpcao(3);
        }
        System.out.println("Sua opcao e " + pessoa1.getOpcao());

        teclado.close();
    }
}
