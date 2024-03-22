public class Livro {
    public String Titulo;
    public String Autor;
    public int Ano;

    public Livro(String titulo, String autor, int ano)
    {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Ano = ano;
    }

    public void ExibirInfo()
    {
        System.out.println("Título: " + this.Titulo);
        System.out.println("Autor: " + this.Autor);
        System.out.println("Ano: " + this.Ano);
    }
}
