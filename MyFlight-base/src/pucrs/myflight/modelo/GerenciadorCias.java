package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {empresas = new ArrayList<>();}

	public void inserir(CiaAerea a){
		empresas.add(a);
	}
	public void inserir2(String codigo, String nome){
		CiaAerea a = new CiaAerea(codigo, nome);
		empresas.add(a);
	}

	public void listar() {
		System.out.println("\nCia Aérea:");
		for (CiaAerea a : empresas) {
			System.out.println(a.toString());
		}
	}


	public CiaAerea pesquisar(String codigo) {
		for (CiaAerea c: empresas) {
			if (c.getCodigo() == codigo)
				return c;
		}
		return null;

	}

	public CiaAerea pesquisar2(String nome) {
		for (CiaAerea c: empresas)	 {
			if (c.getNome()/*.toLowerCase()*/ == nome/*.toLowerCase()*/)
				return c;
		}
		return null;

	}
}
