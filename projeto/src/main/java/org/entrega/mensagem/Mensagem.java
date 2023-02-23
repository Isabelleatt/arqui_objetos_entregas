package org.entrega.mensagem;
import org.entrega.usuario.Usuario;

public class Mensagem {
    private Usuario autor;
    private String data;

    public Mensagem(Usuario autor, Usuario data) {
        this.autor = autor;
        this.data = data;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Autor inválido");
        }
        this.autor = autor;
    }

    public Usuario getData() {
        return data;
    }

    public void setData(Usuario data) {
        // restrições de data sem usar isempty

        this.data = data;
    }


    
}
