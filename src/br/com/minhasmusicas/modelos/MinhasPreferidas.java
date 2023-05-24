package br.com.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){

        if (audio.getClassiicacao() >= 9){
            System.out.println(audio.getTitulo() + " é sucesso absoluto!!!");
        } else {
            System.out.println(audio.getTitulo() + " também é muito bom!");
        }
    }
}
