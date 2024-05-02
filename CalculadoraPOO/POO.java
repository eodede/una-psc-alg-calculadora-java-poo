import java.util.Scanner;

public class POO {
    private Double num;
    private Double num2;
    private Double soma;
    private Double sub;
    private Double multi;
    private Double div;
    private Double pot;
    private Double raiz;
    private Double raiz2;

    Scanner scanner = new Scanner(System.in);

    public POO(){}

    public void Numero(){
        

        System.out.print("Digite o 1º número: ");
        num = scanner.nextDouble();
        System.out.print("Digite o 2º número: ");
        num2 = scanner.nextDouble(); 
        
    }
    

    public void Soma(){

        soma = num + num2;
        System.out.println("A soma dos 2 números é " + soma);
    }

    public void Sub(){

        sub = num - num2;
        System.out.println("A subtração dos 2 números é " + sub);
    }

    public void Multi(){

        multi = num * num2;
        System.out.println("A multiplicação dos 2 números é " + multi);
    }

    public void Div(){
        if (num2 == 0){
         System.out.println("Impossível realizar uma divisão por zero.");}
        else {
        div = num / num2;
        System.out.println("A divisão dos 2 números é " + div);}
    }

    public void Pot(){

        if (num2 == 0){
            System.out.println("Todo número elevado a zero será igual a 1.");}
           else {
        pot = Math.pow(num, num2);
        System.out.println("A potência é " + pot);}
    }

    public void Raiz(){
        if (num < 0 || num2 < 0){
            System.out.println("Não existe raiz de número negativo");}
           else {
        raiz = Math.sqrt(num);
        raiz2 = Math.sqrt(num2);

        System.out.println("A Raiz Quadrada do 1º número é " + raiz);
        System.out.println("A Raiz Quadrada do 2º número é " + raiz2);}
        
    }
    
}