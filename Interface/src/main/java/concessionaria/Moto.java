package concessionaria;

public class Moto extends Veiculo{

    public Moto(String cor, String marca, String nome, String motor) {
        super(cor, marca, nome, motor);
    }

    private boolean carenagem;
    private Integer cilindradas;
    public Moto(){
        super();
    };

    public Moto(String cor, String marca, String nome, String motor, boolean carenagem, Integer cilindradas) {
        super(cor, marca, nome, motor);
        this.carenagem = carenagem;
        this.cilindradas = cilindradas;
    }

    public boolean isCarenagem() {
        return carenagem;
    }

    public void setCarenagem(boolean carenagem) {
        this.carenagem = carenagem;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome=" + getNome() +
                ", marca=" + getMarca() +
                ", cor=" + getCor() +
                ", motor=" + getMotor() +
                ", carenagem=" + carenagem +
                ", cilindradas=" + cilindradas +
                '}';
    }
}
