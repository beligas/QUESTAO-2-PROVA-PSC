import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        LivroDeNotas livroDeNotas = new LivroDeNotas();
        System.out.print("Número de alunos: ");
        livroDeNotas.setNumeroAlunos(scanner.nextInt());
        scanner.nextLine();
        livroDeNotas.calcularMediaDeCadaAluno();
        livroDeNotas.calcularMediaDaTurma();
        scanner.close();
    }
}