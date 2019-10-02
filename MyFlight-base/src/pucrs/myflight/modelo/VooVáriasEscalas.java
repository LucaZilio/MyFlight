package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooVáriasEscalas extends Voo {


    private Rota r2;
    private Rota r2F;
    private Rota rotafinal;

    public VooVáriasEscalas(Rota rota, Rota rotafinal, LocalDateTime datahora, Duration duracao, Rota r2, Rota r2F) {
        super(rota, datahora, duracao);
        this.rotafinal = rotafinal;
        this.r2 = r2;
        this.r2F = r2F;
    }




    public Rota getRota2(){return r2;}
    public Rota getRota2F(){return r2F;}
    public Rota getRotaFinal(){return rotafinal;}

    public String toString(){
        return super.toString()+"--->"+rotafinal+"\n"+r2+"---->"+r2F;
    }


}


