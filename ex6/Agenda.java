import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private List<Contato> listaContatos = new ArrayList<Contato>();

    public void AddContato(String nome, String telefone)
    {
        listaContatos.add(new Contato(nome, telefone));
    }

    public Contato BuscarContato(String nome)
    {
        Optional<Contato> selecionado = this.listaContatos.stream()
            .filter(ctt -> ctt.getNome().equals(nome)).findFirst();
        return selecionado.get();
    }
}
