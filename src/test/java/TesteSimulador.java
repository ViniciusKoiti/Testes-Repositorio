import org.junit.Test;
import paranavai.ifpr.edu.br.simulador.SimuladorCashBack;

import static org.junit.Assert.assertEquals;

public class TesteSimulador {

    @Test
    public void testCashbackBronzeTierBelowLimit100() {
        double totalPurchases = 99.99;
        double expectedCashback = 4.9995; // 5% de 99.99
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierBelowLimit100() {
        double totalPurchases = 99.99;
        double expectedCashback = 9.99; // 5% de 99.99 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierBelowLimit100() {
        double totalPurchases = 99.99;
        double expectedCashback = 24.9975; // 5% de 99.99 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    // Valor próximo ao limite superior da faixa 100.01-500 (499.99)
    @Test
    public void testCashbackBronzeTierBelowLimit500() {
        double totalPurchases = 499.99;
        double expectedCashback = 49.999; // 10% de 499.99
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierBelowLimit500() {
        double totalPurchases = 499.99;
        double expectedCashback = 75.00; // 10% de 499.99 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierBelowLimit500() {
        double totalPurchases = 499.99;
        double expectedCashback = 75.00; // 10% de 499.99 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackBronzeTierLowerLimit0() {
        double totalPurchases = 10.00;
        double expectedCashback = 0.00; // 0% de 0.00
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierLowerLimit0() {
        double totalPurchases = 0.00;
        double expectedCashback = 0.00; // 0% de 0.00 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierLowerLimit0() {
        double totalPurchases = 0.00;
        double expectedCashback = 0.00; // 0% de 0.00 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    // Margem Inferior: R$ 0,01
    @Test
    public void testCashbackBronzeTierAboveLowerLimit() {
        double totalPurchases = 0.01;
        double expectedCashback = 0.0005; // 5% de 0.01
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierAboveLowerLimit() {
        double totalPurchases = 0.01;
        double expectedCashback = 0.000525; // 5% de 0.01 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierAboveLowerLimit() {
        double totalPurchases = 0.01;
        double expectedCashback = 0.00025; // 5% de 0.01 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    // Valor Limite: R$ 100,00
    @Test
    public void testCashbackBronzeTierLimit100() {
        double totalPurchases = 100.00;
        double expectedCashback = 5.00; // 5% de 100.00
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierLimit100() {
        double totalPurchases = 100.00;
        double expectedCashback = 10.00; // 5% de 100.00 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierLimit100() {
        double totalPurchases = 100.00;
        double expectedCashback = 15.00; // 5% de 100.00 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    // Valor Limite: R$ 100,01
    @Test
    public void testCashbackBronzeTierAbove100() {
        double totalPurchases = 100.01;
        double expectedCashback = 10.001; // 10% de 100.01
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierAbove100() {
        double totalPurchases = 100.01;
        double expectedCashback = 15; // 10% de 100.01 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierAbove100() {
        double totalPurchases = 100.01;
        double expectedCashback = 20.00; // 10% de 100.01 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    // Valor Limite: R$ 500,00
    @Test
    public void testCashbackBronzeTierLimit500() {
        double totalPurchases = 500.00;

        double expectedCashback = 50.00; // 10% de 500.00
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierLimit500() {
        double totalPurchases = 500.00;
        double expectedCashback = 75.00; // 10% de 500.00 + 5% de aumento
        String loyaltyLevel = "Prata";


        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierLimit500() {
        double totalPurchases = 500.00;
        double expectedCashback = 100.00; // 10% de 500.00 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    // Valor Limite: R$ 500,01
    @Test
    public void testCashbackBronzeTierAbove500() {
        double totalPurchases = 500.01;
        double expectedCashback = 75.0015; // 15% de 500.01
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackPrataTierAbove500() {
        double totalPurchases = 500.01;
        double expectedCashback = 100; // 15% de 500.01 + 5% de aumento
        String loyaltyLevel = "Prata";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

    @Test
    public void testCashbackOuroTierAbove500() {
        double totalPurchases = 500.01;
        double expectedCashback = 125.00; // 15% de 500.01 + 10% de aumento
        String loyaltyLevel = "Ouro";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

}
