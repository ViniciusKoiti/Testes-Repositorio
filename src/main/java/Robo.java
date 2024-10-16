public class Robo {

    public Direcao verificarDirecao(boolean sensorEsquerda, boolean sensorCentro, boolean sensorDireita) {
        // Lógica para verificar se o robô deve seguir em frente
        if (!sensorEsquerda && sensorCentro && !sensorDireita) {
            return Direcao.FRENTE;
        }
        // Lógica para verificar se o robô deve virar à esquerda
        else if (sensorEsquerda && !sensorCentro && !sensorDireita) {
            return Direcao.ESQUERDA;
        }
        // Lógica para verificar se o robô deve virar à direita
        else if (!sensorEsquerda && !sensorCentro && sensorDireita) {
            return Direcao.DIREITA;
        }
        // Lógica para verificar se o robô deve parar
        else if (!sensorEsquerda && !sensorCentro && !sensorDireita) {
            return Direcao.PARADO;
        }
        // Lógica para outros casos (ajuste conforme necessário)
        else {
            // Lógica para tratar outras situações
            return Direcao.NAO_DEFINIDO;
        }
    }
}
