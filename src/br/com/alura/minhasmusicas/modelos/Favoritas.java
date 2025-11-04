package br.com.alura.minhasmusicas.modelos;

public class Favoritas {
    public void inclui(Audio audio){
        if (audio.getClassificao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " um dos que todo mundo está curtindo!");
        }
    }
}
