package org.entrega.mensagem;
import org.entrega.usuario.Usuario;

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
        if (usuario == null || usuario.isEmpty()) {
            throw new IllegalArgumentException("Usuário inválido");
        }
        this.usuario = usuario;
    }
        
}
