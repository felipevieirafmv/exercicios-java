package ex7;
public class Produto
{
    private String Nome;
    public String getNome()
    {
        return Nome;
    }
    public void setNome(String nome)
    {
        Nome = nome;
    }

    private int Codigo;
    public int getCodigo()
    {
        return Codigo;
    }
    public void setCodigo(int codigo)
    {
        Codigo = codigo;
    }

    private float Preco;
    public float getPreco()
    {
        return Preco;
    }
    public void setPreco(float preco)
    {
        Preco = preco;
    }

    private int Quantidade;
    public int getQuantidade()
    {
        return Quantidade;
    }
    public void setQuantidade(int quantidade)
    {
        Quantidade = quantidade;
    }
    
    public Produto(String nome, int codigo, float preco, int quantidade)
    {
        Nome = nome;
        Codigo = codigo;
        Preco = preco;
        Quantidade = quantidade;
    }

    public void AddEstoque(int quant)
    {
        this.Quantidade += quant;
    }

    public void RemoveEstoque(int quant)
    {
        this.Quantidade -= quant;
    }

    public void ShowInfo()
    {
        System.out.println(this.Nome);
        System.out.println(this.Codigo);
        System.out.println("R$" + this.Preco);
        System.out.println(this.Quantidade);
        System.out.println("R$" + this.Quantidade * this.Preco);
    }
}