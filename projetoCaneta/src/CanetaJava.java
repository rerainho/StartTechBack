import java.sql.SQLOutput;

public class CanetaJava {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    //tipos dos atributos

    //void significa "sem retorno"
    void rabiscar () {

        if(this.tampada == true) {
                System.out.println("Erro! A caneta está tampada!");

        }else {
                System.out.println("Estou rabiscando!");
        }

    }

    void tampar() {
        this.tampada = true; //mostrar a resposta a partir do this que é o nome do objeto que chamou
    }

    void destampar() {
        this.tampada = false; // mostrar no final
    }

    void estado(){

        System.out.println("Está caneta é do modelo: " + this.modelo);
        System.out.println("está caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a ponta: " + this.ponta);
        System.out.println("Esta caneta está com carga de: " + this.carga + "%");
        System.out.println("Esta caneta está tampada? " + this.tampada);
    }

    void pintar(){
        System.out.println("Está caneta é feita para pintar: " + this.modelo);
    }

    void desenhar(){
        System.out.println("Esta caneta está tampada? " + this.tampada);
        if(this.tampada == true) {
            System.out.println("Erro! A caneta está tampada!");

        }else {
            System.out.println("Comece a desenhar");
        }

    }





}
