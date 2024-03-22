public class Carro {
    private String marca;
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    private String modelo;
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    private int ano;
    public int getAno()
    {
        return ano;
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }

    private String placa;
    public String getPlaca()
    {
        return placa;
    }
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    private float velocidadeAtual;
    public float getVelocidadeAtual()
    {
        return velocidadeAtual;
    }
    
    public Carro(String marca, String modelo, int ano, String placa)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void Acelerar()
    {
        this.velocidadeAtual += 10;
        System.out.println("Velocidade atual: " + this.velocidadeAtual + "Km/h");
    }

    public void Frear()
    {
        this.velocidadeAtual -= 10;
        if(this.velocidadeAtual < 0)
            this.velocidadeAtual = 0;
        System.out.println("Velocidade atual: " + this.velocidadeAtual + "Km/h");
    }

    public void ExibirInfo()
    {
        System.out.println();
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.placa);
        System.out.println(this.velocidadeAtual);
    }
}
