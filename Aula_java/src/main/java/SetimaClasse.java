public class SetimaClasse {

    public static void main(String[] args) {
        int DiaSemana = 2;
        String NomeDia;

        switch (DiaSemana){
            case 1: NomeDia="Domingo";break;
            case 2: NomeDia="Quarta";break;
            default: NomeDia="Dia inválido";
        }


        System.out.println(NomeDia);
    }
}
