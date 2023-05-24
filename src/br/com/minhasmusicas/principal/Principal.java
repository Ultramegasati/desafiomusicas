package br.com.minhasmusicas.principal;

import br.com.minhasmusicas.modelos.MinhasPreferidas;
import br.com.minhasmusicas.modelos.Musica;
import br.com.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 48; i++) {
            minhaMusica.curte();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 48; i++) {
            meuPodcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
