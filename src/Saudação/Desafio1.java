package Saudação;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (graus>= 0 && graus < 90 || graus ==360) {
                System.out.println("Bom Dia!!");
            }
            if (graus >= 90 && graus < 180){
                System.out.println("Boa Tarde!!");
            }
            if (graus >= 180 && graus <= 269){
                System.out.println("Boa Noite!!");
            }
            if (graus > 269 && graus < 360){
                System.out.println("De Madrugada!!");
            }
        }

    }
}
