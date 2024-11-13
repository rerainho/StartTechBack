public class DecimaTerceira {

    public static void main(String[] args) {

        String ListaDeFilmes[] = {"O Fabuloso Destino de Amélie Poulain","Interestelar","Pobres Criaturas","Jogos Vorazes","Sessenta Segundos"};

        System.out.println("Na minha lista constam: " + ListaDeFilmes.length + "filmes preferidos");
        /*Arrays.sort(ListaDeLivros);*/
        for (String filmes: ListaDeFilmes) {
            System.out.println("Minha lista tem: " + filmes);
        }
    }
}
