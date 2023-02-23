package org.entrega.mensagem;
import org.entrega.usuario.Usuario;
public class mensagem_arquivo {
    private String imagem;
    private String audio;
    private Usuario usuario;
    
    public mensagem_arquivo(String imagem, String audio, Usuario usuario) {
        this.imagem = imagem;
        this.audio = audio;
        this.usuario = usuario;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        if (imagem == null || imagem.isEmpty()) {
            throw new IllegalArgumentException("Imagem inválida");
        }
        this.imagem = imagem;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        if (audio == null || audio.isEmpty()) {
            throw new IllegalArgumentException("Audio inválido");
        }
        this.audio = audio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
