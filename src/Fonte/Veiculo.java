package Fonte;

public abstract class Veiculo {
    private String placa;
    private int ano;
    private double valor;

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public Veiculo(String placa, int ano, double valor) {
        this.placa = placa;
        this.ano = ano;
        this.valor = valor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toStringResumo(){
        return toString();
    }
    @Override
    public String toString() {
        return "Placa: " + placa +
                " Ano:" + ano +
                " Valor:" + valor;
    }
}
