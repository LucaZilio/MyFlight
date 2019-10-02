package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {


    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
    	this.rota = rota;
    	this.datahora = datahora;
    	this.duracao = duracao;
    }

	public Voo(Rota rota, Rota rotafinal, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.rotafinal = rotafinal;
		this.datahora = datahora;
		this.duracao = duracao;
	}

	public Voo(LocalDateTime dh){
        this.datahora = dh;
        this.status = Status.CONFIRMADO;
    }





	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	private Rota rotafinal;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao, Status status) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	
	public Rota getRota() {return rota;}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}

	//public abstract Rota getRota();
	//public abstract Duration getDuracao();
	
	public Duration getDuracao() {return duracao;}
	
	public Status getStatus() {return status;}
	
	public void setStatus(Status novo) {this.status = novo;}

	public String toString() {
		//return "Voo: \n" + rota + datahora + duracao + status + "\n------------------------\n";}
        return status+" "+datahora;}
}

