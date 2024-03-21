package concessionaria;

public class Veiculo {
    private String cor;
    private String marca;
    private String nome;
    private String motor;
    public Veiculo(){}
    public Veiculo(String cor, String marca, String nome, String motor) {
        this.cor = cor;
        this.marca = marca;
        this.nome = nome;
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
