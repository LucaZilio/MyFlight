package pucrs.myflight.modelo;

import jdk.net.SocketFlow;

import java.lang.reflect.GenericArrayType;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos (){voos = new ArrayList<>();}

    public void inserir(Voo a){
        voos.add(a);
    }

    public void inserir2(Rota rota, LocalDateTime datahora, Duration duracao, Voo.Status status){
        Voo nova = new Voo(rota, datahora, duracao, status);
        voos.add(nova);
    }

    public void listar() {
        System.out.println("\nVoos:");
        for (Voo a : voos) {
            System.out.println(a.toString());
        }
    }


    public Voo pesquisar(LocalDateTime data) {
        for (Voo a: voos) {
            if (a.getDatahora() == data)
                return a;
        }
        return null;

    }

}
