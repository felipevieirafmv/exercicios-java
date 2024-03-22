public class Jogador {
    private String nome;
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    private int pontuacao;
    public int getPontuacao()
    {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao)
    {
        this.pontuacao = pontuacao;
    }

    private int nivel;
    public int getNivel()
    {
        return nivel;
    }
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public Jogador(String nome)
    {
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 0;
    }

    public void exibirInformacoes()
    {
        System.out.println();
        System.out.println(this.nome);
        System.out.println(this.pontuacao);
        System.out.println(this.nivel);
    }
}
