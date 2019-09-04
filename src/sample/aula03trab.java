package sample;

        import java.util.Scanner;

public class aula03trab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasproduzidas, pecasdefeituosas;
        System.out.println("Iforme a quantidade de peças produzidas: ");
        pecasproduzidas = sc.nextInt();
        System.out.println("Informe a quantidade de peças defeituosas: ");
        pecasdefeituosas = sc.nextInt();
        if(pecasdefeituosas > (pecasproduzidas * 0.1)){
            System.out.println("Máquina precisa de manutenção");
        }else{
            System.out.println("Máquina não precisa de manutenção");
        }
    }
}
