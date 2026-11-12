public class Produto {
    String nome;
    String unidade;
    Double preco;
    int quantidade;

    public Produto(String nome, String unidade, double preco, int quantidade) {
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void Vender(int jei){
        if(jei>quantidade){
           System.out.println("Estoque Insufuciente");
        }
        else{
            this.quantidade-=jei;
        }
    }

    public int reabastecer(int jei){
        if(jei>0){
            return quantidade+=jei;
        }
        else{
            return -1;

        }

    }

    public double calcularValorEstoque(){
        return quantidade * preco;
    }


    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(calcularValorEstoque());
    }






}
