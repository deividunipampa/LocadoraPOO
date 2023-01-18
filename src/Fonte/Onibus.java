package Fonte;

public class Onibus extends Veiculo{
    private int numeroPassageiros;
    private boolean servicoWifi;
    private boolean arCondicionado;


    public Onibus(String placa, int ano, double valor, int numeroPassageiros, boolean servicoWifi, boolean arCondicionado) {
        super(placa, ano, valor);
        this.numeroPassageiros = numeroPassageiros;
        this.servicoWifi = servicoWifi;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public boolean isServicoWifi() {
        return servicoWifi;
    }

    public void setServicoWifi(boolean servicoWifi) {
        this.servicoWifi = servicoWifi;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    @Override
    public String toString() {
        return "Fonte.Onibus{" + "ano" + super.getAno() +
                ", numeroPassageiros=" + numeroPassageiros +
                ", servicoWifi=" + servicoWifi +
                ", arCondicionado=" + arCondicionado +
                '}';
    }
}
