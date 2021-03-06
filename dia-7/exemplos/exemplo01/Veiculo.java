package exemplos.exemplo01;

public class Veiculo {
    // atributos privados
    private String marca, modelo;
    private double consumo; // só pode ser usando dentro da classe
    // metodos public

    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if (novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
