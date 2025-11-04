package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Favoritas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Butter");
        musica1.setArtista("BTS");
        musica1.setGenero("Pop coreano");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcast ep = new Podcast();
        ep.setTitulo("Os maiores da indústria");
        ep.setHost("Army");

        for (int i = 0; i < 5000; i++) {
            ep.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            ep.curtir();
        }

        Favoritas preferidas = new Favoritas();
        preferidas.inclui(ep);
        preferidas.inclui(musica1);
    }
}
