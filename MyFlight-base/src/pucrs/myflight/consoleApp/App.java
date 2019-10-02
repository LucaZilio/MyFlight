package pucrs.myflight.consoleApp;
import pucrs.myflight.modelo.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("MyFlight project...");

		GerenciadorAeronaves gerenA = new GerenciadorAeronaves();

		Aeronave a1 =new Aeronave("733","Boeing 737-300",140);
		Aeronave a2 =new Aeronave("73G","Boeing 737-700",126);

		gerenA.inserir(a1);
		gerenA.inserir(a2);

		gerenA.inserir2("380", "Airbus Industrie A380", 644);
		gerenA.inserir2("764","Boeing 767-400",304);

		gerenA.listar();

		gerenA.pesquisar("733");

		System.out.println("*****************************************************");

		GerenciadorCias gerenC = new GerenciadorCias();

		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");

		gerenC.inserir(c1);
		gerenC.inserir(c2);
		gerenC.inserir2("TP", "TAP Portugal");
		gerenC.inserir2("AD", "Azul Linhas Aéreas");

		gerenC.listar();

		gerenC.pesquisar("JJ");
		gerenC.pesquisar2("Gol Linhas Aéreas SA");
		//gerenC.pesquisar2("GOL LINHAS AÉREAS SA");

		System.out.println("*****************************************************");

		GerenciadorAeroportos gerenAP = new GerenciadorAeroportos();

		Geo gap1 = new Geo(-29.9939, -51.1711);
		Geo gap2 = new Geo(-23.4356, -46.4731);
		Geo gap3 = new Geo(38.7742, -9.1342);
		Geo gap4 = new Geo(25.7933, -80.2906);

		Aeroporto ap1 = new Aeroporto("POA", "Salgado Filho Intl Apt", gap1);
		Aeroporto ap2 = new Aeroporto("GRU", "Sao Paulo Guarulhos Intl Apt", gap2);

		gerenAP.inserir(ap1);
		gerenAP.inserir(ap2);
		gerenAP.inserir2("LIS", "Lisbon", gap3);
		gerenAP.inserir2("MIA", "Miami International Apt", gap4);

		gerenAP.listar();

		gerenAP.pesquisar("LIS");

		System.out.println("*****************************************************");

		GerenciadorRotas gerenR = new GerenciadorRotas();

		gerenA.inserir2("738", "Boeing 737-800", 160);
		gerenA.inserir2("332", "Airbus A330-200", 234);
		Geo gap5 = new Geo(-22.8134, -43.2494);
		gerenAP.inserir2("GIG", "Aeroporto Internacional do Rio de Janeiro Galeão", gap5);
		gerenA.inserir2("320", "Airbus A320", 156);

		Rota r1 = new Rota(gerenC.pesquisar("G3"), gerenAP.pesquisar("GRU"), gerenAP.pesquisar("POA"), gerenA.pesquisar("738"));
		Rota r2 = new Rota(c2, ap1, ap2, gerenA.pesquisar("738"));

		gerenR.inserir(r1);
		gerenR.inserir(r2);
		gerenR.inserir2(gerenC.pesquisar("TP"), gerenAP.pesquisar("MIA"), gerenAP.pesquisar("LIS"), gerenA.pesquisar("332"));
		gerenR.inserir2(c1, ap2, gerenAP.pesquisar("GIG"), gerenA.pesquisar("320")	);

		gerenR.listar();

		System.out.println("*****************************************************");

		GerenciadorVoos gerenV = new GerenciadorVoos();

		Rota rotaV = new Rota(gerenC.pesquisar("G3"), gerenAP.pesquisar("GRU"), gerenAP.pesquisar("GIG"), gerenA.pesquisar("738"));
		Geo locV = new Geo(-34.558, -58.417);

		Voo v1 = new Voo(r2, LocalDateTime.of(2016, 8, 10,8,0), Duration.ofMinutes(90), Voo.Status.ATRASADO);
		Voo v2 = new Voo(rotaV, LocalDateTime.of(2016, 8, 10, 15, 0 ), Duration.ofMinutes(120), Voo.Status.CONFIRMADO);
		Aeroporto apV = new Aeroporto("AEP", "Aeroporto Jorge Newbery", locV);

		gerenV.inserir(v1);
		gerenV.inserir(v2);
		gerenV.inserir2(rotaV, LocalDateTime.of(2016, 8, 15, 12, 0), Duration.ofMinutes(120), Voo.Status.CANCELADO);

		gerenV.listar();

        System.out.println("*****************************************************");




        VooEscalas ve1 = new VooEscalas(r1, r2, LocalDateTime.of(2016, 10, 25, 10, 30), Duration.ofMinutes(120));

        gerenV.inserir(ve1);

        gerenV.listar();

		System.out.println("*****************************************************");

		VooVáriasEscalas vve1 = new VooVáriasEscalas(r1, r2, LocalDateTime.of(2016, 10, 25, 12, 30), Duration.ofMinutes(120), r1, r2);

        System.out.println("*****************************************************");

        Voo vooTeste = new Voo(r1, LocalDateTime.of(2016, 10, 25, 12, 30), Duration.ofMinutes(120));
        vooTeste = new VooEscalas(r1, r2, LocalDateTime.of(2016, 10, 20, 12, 30), Duration.ofMinutes(100));
        //vooTeste = new VooVariasEscalas();

		if(vooTeste instanceof VooEscalas){
			System.out.println("Tem duas Escalas");
		}
		else{
			System.out.println("Tratamento Normal");
		}

		Voo vT1 = new VooEscalas(r1, r2, LocalDateTime.of(2016, 8, 12, 12, 30), Duration.ofMinutes(240));
		System.out.println("Voo: "+vT1);

		gerenV.inserir(v1);
		gerenV.inserir(ve1);
		gerenV.inserir(vooTeste);

		System.out.println("*****************************************************");














	}
}
