Ao realizar os testes foi possível notar que notes de limite onde realizamos

    @Test
    public void testCashbackPrataTierLimit500() {
        double totalPurchases = 500.00;
        double expectedCashback = 75.00; // 10% de 500.00 + 5% de aumento
        String loyaltyLevel = "Prata";

        
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

É possível perceber que recebemos considerado um valor invalido na implementação do código, visto que isso é retornando no prompt e isso é notado em múltiplos testes diferentes, por esse motivo é perceptível que há um erro de implementação.

@Test
public void testCashbackBronzeTierLimit500() {
double totalPurchases = 500.00;

        double expectedCashback = 50.00; // 10% de 500.00
        String loyaltyLevel = "Bronze";
        double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
        assertEquals(expectedCashback, actualCashback, 0.01);
    }

Valor inválido!
java.lang.AssertionError:
Expected :50.0
Actual   :0.0


Esse teste abaixo os tiveram problemas extremamente

@Test
public void testCashbackOuroTierBelowLimit500() {
double totalPurchases = 499.99;
double expectedCashback = 75.00; // 10% de 499.99 + 10% de aumento
String loyaltyLevel = "Ouro";
double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
assertEquals(expectedCashback, actualCashback, 0.01);
}

Valor inválido!

java.lang.AssertionError:
Expected :75.0
Actual   :0.0
<Click to see difference>

@Test
public void testCashbackPrataTierBelowLimit500() {
double totalPurchases = 499.99;
double expectedCashback = 75.00; // 10% de 499.99 + 5% de aumento
String loyaltyLevel = "Prata";
double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
assertEquals(expectedCashback, actualCashback, 0.01);
}


outro teste com erro foi causando

@Test
public void testCashbackPrataTierAbove100() {
double totalPurchases = 100.01;
double expectedCashback = 15; // 10% de 100.01 + 5% de aumento
String loyaltyLevel = "Prata";
double actualCashback = SimuladorCashBack.calculaCashBack(totalPurchases, loyaltyLevel);
assertEquals(expectedCashback, actualCashback, 0.01);
}

Valor inválido!

java.lang.AssertionError:
Expected :15.0
Actual   :0.0




