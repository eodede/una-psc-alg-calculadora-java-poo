import java.util.Scanner;

public class CalculadoraPOO {
    public static void main(String[] args) throws Exception {
    POO poo = new POO();
    Scanner scanner = new Scanner(System.in);

    while(true){
    poo.Numero();
    poo.Soma();
    poo.Sub();
    poo.Multi();
    poo.Div();
    poo.Pot();
    poo.Raiz();
    System.out.println("Caso queira sair do programa digite (Q), Caso queira continuar digite qualquer tecla!");
    String Q = scanner.nextLine();

    if (Q.equalsIgnoreCase("Q")){
        System.out.println("Programa finalizado!");
        break;}
    else {}
    }
    scanner.close();}
}
