import br.edu.ordenacao.Ordenacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 1500;
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = tamanho - i;
        }
        Ordenacao ordem = new Ordenacao();
        // Menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exibir vetor de 1500 posições em ordem decrescente");
            System.out.println("5. Sair");

            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
                    ordem.quickSort(vetor1, 0, vetor1.length-1);
                    exibir(vetor1);
                    break;
                case 2:
                    int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
                    ordem.quickSort(vetor2, 0, vetor2.length-1);
                    exibir(vetor2);

                    break;
                case 3:
                    int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
                    ordem.quickSort(vetor3, 0, vetor3.length-1);
                    exibir(vetor3);


                    break;
                case 4:
                    int[] arrayBubbleSort = array.clone();
                    int[] arrayMergeSort = array.clone();
                    int[] arrayQuickSort = array.clone();

                    // Calcula o tempo de execução para o Bubble Sort
                    long startTime = System.nanoTime();
                    ordem.bubbleSort(arrayBubbleSort);
                    long endTime = System.nanoTime();
                    long durationBubbleSort = endTime - startTime;

                    // Calcula o tempo de execução para o Merge Sort
                    startTime = System.nanoTime();
                    ordem.mergeSort(arrayMergeSort, 0, 1499);
                    endTime = System.nanoTime();
                    long durationMergeSort = endTime - startTime;

                    // Calcula o tempo de execução para o Quick Sort
                    startTime = System.nanoTime();
                    ordem.quickSort(arrayQuickSort, 0, 1499);
                    endTime = System.nanoTime();
                    long durationQuickSort = endTime - startTime;

                    // Exibe os tempos de execução
                    System.out.println("Tempo de execução do Bubble Sort: " + durationBubbleSort + " nanosegundos");
                    System.out.println("Tempo de execução do Merge Sort: " + durationMergeSort + " nanosegundos");
                    System.out.println("Tempo de execução do Quick Sort: " + durationQuickSort + " nanosegundos");

                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
    public static void exibir(int[] vetor){
        for(int indice: vetor){
            System.out.print(indice+ " ");
        }
    }
}
