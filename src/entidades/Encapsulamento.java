package entidades;

public class Encapsulamento {
    private String nome;
    private int idade;
    private int matricula;
    private double salarioFixo;
    private int quantidadeVendas;

    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        salarioFixo = 1400.00;
        gerarMatricula();
    }

    private void gerarMatricula(){
        
        
        matricula = (int)(Math.random()*500);
        for(int i = 0; i < nome.length(); i++){
            char c = nome.charAt(i);
            matricula = matricula + c;
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade<0 || idade>127){
            System.out.println("Erro");
        }else{

            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }    

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void efetuarVenda(int quantia){
        // boolean pagamentoEfetuado = REQUISICAO()
        // if(pagamentoEfetuado){
            quantidadeVendas += quantia;
        // }
    }

    


    

    

}