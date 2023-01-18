package Fonte;
import java.util.Date;

public class Locacao{
    public static int codigo = 0;
    public Cliente cliente;
    public Veiculo veiculo;
    public boolean seguro;
    public String dataIncial;
    public String dataFinal;

    public Locacao(Cliente cliente, Veiculo veiculo, boolean seguro, String dataIncial, String dataFinal) {
        this.codigo = codigo++;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.seguro = seguro;
        this.dataIncial = dataIncial;
        this.dataFinal = dataFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public String getDataIncial() {
        return dataIncial;
    }

    public void setDataIncial(String dataIncial) {
        this.dataIncial = dataIncial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", veiculo=" + veiculo +
                ", seguro=" + seguro +
                ", dataIncial=" + dataIncial +
                ", dataFinal=" + dataFinal +
                '}';
    }
}