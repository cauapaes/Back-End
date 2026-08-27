import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<ItemPedido> itens;
    private double valorTotalPedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.valorTotalPedido = 0.0;
    }

    // Método que garante a composição: o ItemPedido é criado DENTRO do Pedido
    public void adicionarItem(String nomePrato, double preco) {
        ItemPedido novoItem = new ItemPedido(nomePrato, preco);
        this.itens.add(novoItem);
        this.valorTotalPedido += preco;
    }

    public void exibirResumo() {
        System.out.println("=== RESUMO DO PEDIDO #" + numeroPedido + " ===");
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            for (ItemPedido item : itens) {
                System.out.printf("- %s: R$ %.2f%n", item.getNomePrato(), item.getPreco());
            }
        }
        System.out.println("------------------------------");
        System.out.printf("Valor Total: R$ %.2f%n", valorTotalPedido);
        System.out.println("==============================\n");
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }
}
