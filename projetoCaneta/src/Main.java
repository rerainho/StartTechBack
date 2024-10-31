
public class Main {
    public static void main(String[] args) {

        CanetaJava caneta1 = new CanetaJava();

        caneta1.modelo = "esferografica";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        //caneta1.tampada = false; //trocar para caneta1.tampar();

        caneta1.destampar();
        caneta1.estado();
        caneta1.rabiscar();
        caneta1.desenhar();
        caneta1.pintar();

        //System.out.println("");


    }
}