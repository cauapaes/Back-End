// Classe Principal que executa o programa
public class Main {
    public static void main(String[] args) {
        // 1. Instanciando os objetos
        Carro meuCarro = new Carro();
        Moto minhaMoto = new Moto();

        // 2. Chamando o método aumentarVelocidade para o Carro e para a Moto
        meuCarro.aumentarVelocidade(50);
        minhaMoto.aumentarVelocidade(40);

        // 3. Mostrando as velocidades resultantes na tela
        System.out.println("Velocidade atual do Carro: " + meuCarro.getVelocidade() + " km/h");
        System.out.println("Velocidade atual do Moto: " + minhaMoto.getVelocidade() + " km/h");
    }
}
