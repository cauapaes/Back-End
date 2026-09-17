// Classe Carro com o atributo velocidade e métodos necessários
class Carro {
    private int velocidade; // Atributo encapsulado (boa prática)

    // Construtor para iniciar o carro parado
    public Carro() {
        this.velocidade = 0;
    }

    // Método solicitado pelo enunciado
    public void aumentarVelocidade(int incremento) {
        this.velocidade += incremento;
    }

    // Método para ler o valor da velocidade
    public int getVelocidade() {
        return this.velocidade;
    }
}
