package com.company;

public class Pessoa {
    private int idade;
    private int sexo;
    private int opcao; // Temperamento

    public Pessoa(int i, int s, int o) {
        this.setIdade(i);
        this.setSexo(s);
        this.setOpcao(o);
    }

    public int getIdade() {
        return idade;
    }

    public int getSexo() { return sexo; }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(int sexo) { this.sexo = sexo; }

    public void exibirSexo(){
        switch (this.getSexo()){
            case 1:
                System.out.println("Seu sexo e feminino. ");
                break;
            case 2:
                System.out.println("Seu sexo e masculino.");
                break;
            case 3:
                System.out.println("Seu sexo e outros. ");
                break;
        }
        /*
        if (this.getSexo() == 1){
            System.out.println("Seu sexo e feminino. ");
        } else if (this.getSexo() == 2){
            System.out.println("Seu sexo e masculino.");
        } else{
            System.out.println("Seu sexo e outros. ");
        }

         */
    }

    public void exibirOpcao(){
        switch (this.getOpcao()){
            case 1:
                System.out.println("Voce e uma pessoa calma.\n");
                break;
            case 2:
                System.out.println("Voca e uma pessoa nervosa.\n");
                break;
            case 3:
                System.out.println("Voce e uma pessoa agressiva.\n");
                break;
        }
        /*
        if (this.getOpcao() == 1){
            System.out.println("Voce e uma pessoa calma.\n");
        } else if (this.getOpcao() == 2){
            System.out.println("Voca e uma pessoa nervosa.\n");
        } else{
            System.out.println("Voce e uma pessoa agressiva.\n");
        }*/
    }

    public void exibirPessoa(){
        System.out.println("Sua idade e: " + this.getIdade());
        this.exibirSexo();
        this.exibirOpcao();
    }
}
