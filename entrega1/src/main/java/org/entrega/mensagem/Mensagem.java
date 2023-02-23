package main.java.org.entrega.mensagem;
import main.java.org.entrega.usuario.Usuario;
public class Mensagem {
    private Usuario autor;

    public Mensagem(Usuario autor, Usuario data) {
        this.autor = autor;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

}
