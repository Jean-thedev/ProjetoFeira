public class Feira {
    String nomeFeira;
    String nomeMunicipio;
    int totalDeBarracas = 0;
    Barraca[] barracas = new Barraca[5];

    public Feira(String nomeFeira, String nomeMunicipio) {
        this.nomeFeira = nomeFeira;
        this.nomeMunicipio = nomeMunicipio;
    }
    public void adicionarBarraca(Barraca barr){
        if(totalDeBarracas<5){
            barracas[totalDeBarracas] = barr;
            totalDeBarracas++;
        }
        else{
            System.out.println("Lista de Barracas cheias");
        }
    }
    public double calcularValorTotalFeira(){
        double total = 0;
        for(int i = 0; i<totalDeBarracas; i++){
            total += barracas[i].somarTotalDeTodosProdutos();
        }
        return total;
    }

    public Barraca barracaMaisValiosa() {
    if (totalDeBarracas == 0) {
        return null;
    }

    Barraca campea = barracas[0];
    double maiorValor = campea.somarTotalDeTodosProdutos();

    for (int i = 1; i < totalDeBarracas; i++) {
        double valorAtual = barracas[i].somarTotalDeTodosProdutos();
        
        if (valorAtual > maiorValor) {
            maiorValor = valorAtual;
            campea = barracas[i];
        }
    }

    return campea;
}
public void exibirRelatorio(){
    System.out.println("Relatorio");
    System.out.println("Feira: "+ nomeFeira +"Municipio: "+nomeMunicipio);
    System.out.println("");
    for(int i = 0; i<totalDeBarracas;i++){
        System.out.println("Barraca: "+barracas[i].nomeDaBarraca);
        System.out.println("Responsável: " + barracas[i].nomeDoDono);
        System.out.println("Setor: " + barracas[i].Setor);
    }
    calcularValorTotalFeira();
}
}
