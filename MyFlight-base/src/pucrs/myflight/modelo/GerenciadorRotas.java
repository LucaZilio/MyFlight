package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){rotas = new ArrayList<>();}

    public void inserir(Rota a){rotas.add(a);}

    public void inserir2(CiaAerea ciaAerea, Aeroporto origem, Aeroporto destino, Aeronave aeronave){
        Rota nova = new Rota(ciaAerea, origem, destino, aeronave);
        rotas.add(nova);
    }

    public void listar() {
        System.out.println("\nRotas:");
        for (Rota a : rotas) {
            System.out.println(a.toString());
        }
    }


    public Rota pesquisar(Aeroporto origem) {
        for (Rota a: rotas) {
            if (a.getOrigem() == origem)
                return a;
        }
        return null;

    }

    public Rota pesquisar2(Aeroporto destino) {
        for (Rota a: rotas) {
            if (a.getDestino() == destino)
                return a;
        }
        return null;

    }

}
