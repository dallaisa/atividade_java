public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Fusca", 100.0);
        System.out.println("Custo 5 dias: R$ " + v.calcularCusto(5));
        System.out.println("Custo 10 dias (com desconto): R$ " + v.calcularCusto(10));
        System.out.println("Multa 2 dias de atraso: R$ " + v.calcularMulta(2));
    }
}
