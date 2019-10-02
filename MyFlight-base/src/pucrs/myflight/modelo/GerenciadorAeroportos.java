package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> listaAeroportos;

    public GerenciadorAeroportos(){listaAeroportos = new ArrayList<>();}

    public void inserir(Aeroporto a){
        listaAeroportos.add(a);
    }

    public void inserir2(String codigo, String nome, Geo loc){
        Aeroporto nova = new Aeroporto(codigo, nome, loc);
        listaAeroportos.add(nova);
    }

    public void listar() {
        System.out.println("\nAeroportos:");
        for (Aeroporto a : listaAeroportos) {
            System.out.println(a.toString());
        }
    }


    public Aeroporto pesquisar(String codigo) {
        for (Aeroporto a: listaAeroportos) {
            if (a.getCodigo() == codigo)
                return a;
        }
        return null;

    }



}
