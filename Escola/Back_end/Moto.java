// Classe Moto com o atributo velocidade e métodos necessários
class Moto {
    private int velocidade; // Atributo encapsulado (boa prática)

    // Construtor para iniciar a moto parada
    public Moto() {
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
