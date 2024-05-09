import java.util.ArrayList;
import java.util.Scanner;

class LivroDeNotas {
    Scanner scanner = new Scanner(System.in);

    private int numeroAlunos;
    private ArrayList<double[]> notas;

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
        this.notas = new ArrayList<double[]>();
        for (int i = 0; i < numeroAlunos; i++) {
            notas.add(new double[3]); 
        }
    }

    public void calcularMediaDeCadaAluno() {
        for (int i = 0; i < numeroAlunos; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas.get(i)[j] = scanner.nextDouble(); 
               
            }

            double media = (notas.get(i)[0] + notas.get(i)[1] + notas.get(i)[2]) / 3;
            System.out.println("Média do aluno " + (i + 1) + ": " + media);
           
        }
    }

    public void calcularMediaDaTurma() {
        double total = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            total += (notas.get(i)[0] + notas.get(i)[1] + notas.get(i)[2]) / 3;
        }

        double mediaDaTurma = total / numeroAlunos;
        System.out.println("Média da turma: " + mediaDaTurma); 
        scanner.close();
    }
}