import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variavel = 0;
        while(variavel!=3) {
            System.out.println("Qual dos dois desafios você quer testar?\n1--Desafio do Fibonacci\n2--Desafio da letra A\n3--Fechar");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Digite um número: ");
                    int numero = scanner.nextInt();

                    boolean isFibonacci = trueFibonacci(numero);

                    System.out.println(isFibonacci ? "O número " + numero + " pertence a sequência de Fibonacci"
                            : "O número " + numero + " não pertence a sequência de Fibonacci");
                    continue;
                case 2:
                    System.out.println("Digite o texto:");
                    Scanner sc = new Scanner(System.in);
                    String texto = sc.nextLine();

                    int contador = 0;

                    for(int i = 0; i <texto.length(); i++){
                        char caractere = texto.charAt(i);

                        if(Character.toLowerCase(caractere) == 'a'){
                            contador++;
                        }
                    }
                    System.out.println(contador>0 ?"A letra 'a' aparece " + contador + " vezes na string."
                            : "A letra 'a' não foi encontrada na string.");
                    continue;
                case 3:
                    variavel = 3;
                    break;
                default:
                    System.out.println("Número inválido, tente novamente :)");
                    break;
            }
        }
        scanner.close();
    }

    private static boolean trueFibonacci(int numero){
        if(numero == 0 || numero == 1){
            return true;
        }
        int num1 = 0, num2 = 1;
        int numeroSeguinte = num1 + num2;

        while(numeroSeguinte <= numero){
            if(numeroSeguinte == numero){
                return true;
            }
            num1 = num2;
            num2 = numeroSeguinte;
            numeroSeguinte = num1 + num2;
        }
        return false;
    }
}