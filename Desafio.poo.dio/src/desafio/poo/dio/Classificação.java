package desafio.poo.dio;

public abstract class Classificação {

    protected static final double Xp_padrao = 10;

    private String nome;
    private int numero;

    public abstract int verClassificacao();

    public void ShowAtualXP() {
        System.out.println(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}