public class Barraca {
String nomeDaBarraca;
String nomeDoDono;
String Setor;
int totalDeProdutos = 0;
Produto[] lista = new Produto[10];

public void adicionarProduto(Produto prod){
    if(totalDeProdutos<lista.length){
        lista[totalDeProdutos] = prod;
        totalDeProdutos++;
    }
    else{
        System.out.println("Lista ta cheia");
    }
}

public double somarTotalDeTodosProdutos() {
    double total = 0;
    for (int i = 0; i < totalDeProdutos; i++) {
        total += lista[i].calcularValorEstoque();
    }
    return total;
}
public void buscarProduto(String nomeDoProduto) {
    if (lista.length > 0) {
        for (Produto produto : lista) {
            if (produto == null) {
                continue;
            }
            if (produto.nome.equalsIgnoreCase(nomeDoProduto)) {
                produto.exibirDados();
                return;
            }
        }
        System.out.println("Produto não encontrado");
    } else {
        System.out.println("Lista vazia ou null");
    }
}
}
