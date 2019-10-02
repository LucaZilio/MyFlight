package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {

    private Rota rotaFinal;


    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao ){
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;
    }
    private Rota r2;
    private Rota r2F;


    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao, Rota r2, Rota r2F) {
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;
        this.r2 = r2;
        this.r2F = r2F;
    }




    public Rota getRota2(){return r2;}
    public Rota getRota2F(){return r2F;}
    public Rota getRotaFinal(){return rotaFinal;}

    public Rota getRota() {
        return null;
    }

    public Duration getDuracao() {
        return null;
    }


    @Override
    public String toString(){
        //return "Status: "+getStatus()+"\nHorário: "+getDatahora()+"("+getDuracao()+")"+"\nRota: "+getRota()+" --> "+rotaFinal;
        return super.toString() + " --> "+rotaFinal;
    }

}
