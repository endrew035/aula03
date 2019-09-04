package sample;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de cópias: ");
        int copias = sc.nextInt();
        double totalpago;
        if (copias <= 100){
            totalpago = copias*0.25;
        } else {
            totalpago = copias*0.20;
        }
     System.out.println("O valor pago é R$ "+totalpago);
    }
}
