package main.java.org.entrega.mensagem;
import main.java.org.entrega.usuario.Usuario;
public class Mensagem_texto {
    private String texto;
    private Usuario usuario;

    public Mensagem_texto(String texto, Usuario usuario) {
        this.texto = texto;
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto == null || texto.isEmpty() || texto.length() > 4000) {
            throw new IllegalArgumentException("Texto inválido");
        }
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
