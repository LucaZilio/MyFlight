package pucrs.myflight.modelo;

import java.util.*;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> listaAeronaves;

    public GerenciadorAeronaves() {
        listaAeronaves = new ArrayList<>();
    }

    public void inserir(Aeronave a) {
        listaAeronaves.add(a);
    }

    public void inserir2(String codigo, String descricao, int capacidade) {
        Aeronave nova = new Aeronave(codigo, descricao, capacidade);
        listaAeronaves.add(nova);
    }

    public void listar() {
        System.out.println("\nAeronaves:");
        for (Aeronave a : listaAeronaves) {
            System.out.println(a.toString());
        }
    }


    public Aeronave pesquisar(String codigo) {
        for (Aeronave a : listaAeronaves) {
            if (a.getCodigo() == codigo)
               //System.out.err("Você procurou por:\n" + a);
                return a;
        }
        return null;

    }

}







