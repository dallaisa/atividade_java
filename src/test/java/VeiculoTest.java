import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCustoSemDesconto() {
        Veiculo v = new Veiculo("Celta", 80);
        assertEquals(240.0, v.calcularCusto(3), 0.01);
    }

    @Test
    public void testCustoComDesconto() {
        Veiculo v = new Veiculo("Uno", 100);
        assertEquals(900.0, v.calcularCusto(10), 0.01);
    }

    @Test
    public void testMulta() {
        Veiculo v = new Veiculo("Gol", 100);
        assertEquals(150.0, v.calcularMulta(1), 0.01);
    }

    @Test
    public void testCustoComValorNegativo() {
        Veiculo v = new Veiculo("Palio", -50);
        assertEquals(0.0, v.calcularCusto(5), 0.01);
    }
    @Test
    public void testCustoZeroDias() {
        Veiculo v = new Veiculo("Civic", 150);
        assertEquals(0.0, v.calcularCusto(0), 0.01);
    }

}
