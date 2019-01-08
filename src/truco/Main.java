package truco;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Jogo jogo = new Jogo();
        System.out.println("\t\t*Bem vindo ao programa truco*");
        System.out.println("Quantos jogadores vao jogar ? [2 ou 4]");
        int numero = ler.nextInt();
        jogo.inicio(numero);
        jogo.inicio(numero);
    }
}

    

