public class Contato {
    private String nome;
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    private String telefone;
    public String getTelefone()
    {
        return telefone;
    }
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public Contato(String nome, String telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void ExibirInfo()
    {
        System.out.println();
        System.out.println(this.nome);
        System.out.println(this.telefone);
    }
}
