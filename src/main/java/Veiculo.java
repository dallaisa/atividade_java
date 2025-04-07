public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0 || valorDiaria < 0) return 0.0;
        double custo = valorDiaria * dias;
        return (dias >= 7) ? custo * 0.9 : custo;
    }

    public double calcularMulta(int diasAtraso) {
        return (diasAtraso > 0) ? diasAtraso * valorDiaria * 1.5 : 0.0;
    }

    public boolean desconto(int dias) {
        return dias >= 7;
    }
}
