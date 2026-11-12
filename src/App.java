public class App {
    public static void main(String[] args) {
       
        Produto p1 = new Produto("Açaí", "litro", 18.00, 30);
        Produto p2 = new Produto("Farinha d'água", "kg", 10.00, 50);
        Produto p3 = new Produto("Castanha-do-Pará", "kg", 45.00, 15);
        Produto p4 = new Produto("Tucupi", "litro", 12.00, 20);
        Produto p5 = new Produto("Priprioca", "unidade", 25.00, 10);

       
        Barraca b1 = new Barraca();
        b1.nomeDaBarraca = "Barraca do Dono Jean";
        b1.nomeDoDono = "Dono Jean";
        b1.Setor = "Alimentos";
        b1.adicionarProduto(p1);
        b1.adicionarProduto(p2);
        b1.adicionarProduto(p4);

        Barraca b2 = new Barraca();
        b2.nomeDaBarraca = "Cheiro do Pará";
        b2.nomeDoDono = "Seu Raimundo";
        b2.Setor = "Ervas";
        b2.adicionarProduto(p3);
        b2.adicionarProduto(p5);

        
        Feira feira = new Feira("Complexo do Ver-o-Peso", "Belém");
        feira.adicionarBarraca(b1);
        feira.adicionarBarraca(b2);

        
        System.out.println("=== SIMULAÇÃO DA MANHÃ DE TRABALHO ===");
        
        System.out.println("-> Vendendo 5 litros de Açaí...");
        p1.Vender(5);

        System.out.println("-> Tentando vender 100 kg de Farinha d'água...");
        p2.Vender(100);

        System.out.println("-> Reabastecendo 10 unidades de Priprioca...");
        p5.reabastecer(10);
        System.out.println();


        System.out.println("=== BUSCANDO PRODUTO ===");
        b1.buscarProduto("Tucupi");
        System.out.println();


        feira.exibirRelatorio();

        Barraca campea = feira.barracaMaisValiosa();
        if (campea != null) {
            System.out.println("Barraca mais valiosa: " + campea.nomeDaBarraca);
        }
    }
}