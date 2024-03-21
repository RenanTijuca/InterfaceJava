package concessionaria;

import java.util.Arrays;

public class Carro extends Veiculo{
    public Carro(String cor, String marca, String nome, String motor) {
        super(cor, marca, nome, motor);
    }

    private Integer portas;

    private String cambio;

    private boolean alarme;

    private boolean turbo;
    public Carro(){
        super();

    }
    public Carro(String cor, String marca, String nome, String motor, Integer portas, String cambio, boolean alarme, boolean turbo) {
        super(cor, marca, nome, motor);
        this.portas = portas;
        this.cambio = cambio;
        this.alarme = alarme;
        this.turbo = turbo;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome=" + getNome() +
                ", marca=" + getMarca() +
                ", cor=" + getCor() +
                ", motor=" + getMotor() +
                ", portas=" + getPortas() +
                ", cambio='" + getCambio() + '\'' +
                ", alarme=" + isAlarme() +
                ", turbo=" + isTurbo() +
                '}';
    }
}
