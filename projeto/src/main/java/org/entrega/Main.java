package org.entrega;

import org.entrega.mensagem.Mensagem;
import org.entrega.mensagem.Mensagem_arquivo;
import org.entrega.mensagem.Mensagem_texto;
import org.entrega.usuario.Usuario;
import main.java.org.entrega.mensagem.Mensagem;


import java.util.ArrayList;
import java.util.List;
import java.until.Scanner;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Isabelle", "isabelle@gmail.com" , "999999999");
        Mensagem mensagem = new Mensagem(usuario);
        Mensagem_texto mensagem_texto = new Mensagem_texto("Olá, tudo bem?", usuario);
        Mensagem_arquivo mensagem_arquivo = new Mensagem_arquivo("imagem.jpg", "audio.mp3", usuario);

        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Autor: " + mensagem.getAutor());
        System.out.println("Mensagem de texto: " + mensagem_texto.getTexto());
        System.out.println("Mensagem de arquivo: " + mensagem_arquivo.getImagem());     


        }

    }
