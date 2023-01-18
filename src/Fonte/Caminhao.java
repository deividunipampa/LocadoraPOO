package Fonte;

public class Caminhao extends Veiculo {

    private int eixos;
    private double cargaMax;

    public Caminhao(String placa,int ano, double valor, int eixos, double cargaMax) {
        super(placa, ano, valor);
        this.eixos = eixos;
        this.cargaMax = cargaMax;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }
    public String toString(){
        return "Número de eixos: "+ eixos +" Carga máxima: " + cargaMax;
    }
}
