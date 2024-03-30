import java.util.ArrayList;
import java.util.List;

public class Pedido
{
    private List<Pizza> Pizzas;

    private String EnderecoEntrega;
    public String getEnderecoEntrega()
    {
        return EnderecoEntrega;
    }
    public void setEnderecoEntrega(String enderecoEntrega)
    {
        this.EnderecoEntrega = enderecoEntrega;
    }

    private float ValorTotal;
    public float getValorTotal()
    {
        return ValorTotal;
    }
    
    public Pedido()
    {
        this.Pizzas = new ArrayList<>();
        this.EnderecoEntrega = "";
        this.ValorTotal = 0.0f;
    }

    public void AdicionarPizza(Pizza pizza)
    {
        this.Pizzas.add(pizza);
        this.ValorTotal += pizza.getValor();
    }

    public void RemoverPizza(Pizza pizza)
    {
        this.Pizzas.remove(pizza);
        this.ValorTotal -= pizza.getValor();
    }

    public void CancelarPedido()
    {
        this.Pizzas.clear();
        this.EnderecoEntrega = "";
        this.ValorTotal = 0.0f;
    }

    public void gerarRelatorio()
    {
        System.out.println(EnderecoEntrega);
        System.out.println("R$" + ValorTotal);

        for (Pizza pizza : Pizzas)
        {
            System.out.println("- " + pizza.getNome() + ": R$" + pizza.getValor());
        }
    }
}
