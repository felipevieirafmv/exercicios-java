public class Pizza
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

    private float Valor;
    public float getValor()
    {
        return Valor;
    }
    public void setValor(float valor)
    {
        Valor = valor;
    }

    private String Ingredientes;
    public String getIngredientes()
    {
        return Ingredientes;
    }
    public void setIngredientes(String ingredientes)
    {
        Ingredientes = ingredientes;
    }
    
    public Pizza(String nome, float valor, String ingredientes)
    {
        this.Nome = nome;
        this.Valor = valor;
        this.Ingredientes = ingredientes;
    }
}
