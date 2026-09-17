// Classe Principal que executa o programa
public class Main {

    public static void main(String[] args) {

        // ===== Exercício anterior =====
        Carro meuCarro = new Carro();
        Moto minhaMoto = new Moto();

        meuCarro.aumentarVelocidade(50);
        minhaMoto.aumentarVelocidade(40);

        System.out.println("Velocidade atual do Carro: " + meuCarro.getVelocidade() + " km/h");
        System.out.println("Velocidade atual da Moto: " + minhaMoto.getVelocidade() + " km/h");

        // ===== Novo exercício =====
        System.out.println("\n------------------------------");
        System.out.println("TESTE DO CARRO ELÉTRICO");
        System.out.println("------------------------------");

        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        System.out.println("Modelo: " + carro.getModelo());

        // Acelera até atingir o limite
        for (int i = 0; i < 7; i++) {
            carro.acelerar();
        }

        // Tenta carregar com o carro em movimento
        carro.carregarBateria();

        // Freia até parar
        while (carro.getVelocidadeAtual() > 0) {
            carro.frear();
        }

        // Carrega corretamente
        carro.carregarBateria();

        System.out.println("Velocidade Final: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Bateria Final: " + carro.getCargaBateria() + "%");
    }
}
