import java.util.Scanner;

class ex003 {
  public static void main(String[] args) {

    double numero1, numero2, soma;
    
    System.out.println("Digite dois números:");

    Scanner teclado = new Scanner(System.in);
    
    numero1 = teclado.nextDouble();
    numero2 = teclado.nextDouble();
    teclado.close();
    
    soma = numero1 + numero2;
    System.out.println("A soma dos números é de: " + soma);

  }
}