package Fonte;

public class Carro extends Veiculo{

    private int passageiros;
    private int portas;
    private double quilometros;
    private boolean arCondicionado;


    public Carro(String placa, int ano, double valor, int passageiros, int portas, double quilometros, boolean arCondicionado){
        super(placa, ano, valor);
        this.passageiros = passageiros;
        this.portas = portas;
        this.quilometros = quilometros;
        this.arCondicionado = arCondicionado;

    }


    Carro(String placa){
        super (placa);
    }

    public int getPassageiros(){
        return passageiros;
    }

    public int getPortas(){
        return portas;
    }

    public double getQuilometros(){
        return quilometros;
    }

    public boolean getArCondicionado(){
        return arCondicionado;
    }


    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    public void setQuilometros(double quilometros){
        this.quilometros = quilometros;
    }

    public void setArCondicionado(boolean arCondicionado){
        this.arCondicionado = arCondicionado;
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString() +
                " Passageiros: " + passageiros +
                " Portas: " + portas +
                " Quilometros: " + quilometros +
                " ArCondicionado: " + arCondicionado;
    }
}
