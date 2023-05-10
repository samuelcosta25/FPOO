package ListaExtraVetores;

public class Exercicios {

    public void exercicio1() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("Vetor B[" + i + "]= " + vetorB[i]);
            i++;
        }

    }

    public void exercicio2() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13, 15, 16, 17 };
        int vetorB[] = new int[8];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = 2 * vetorA[i];
            System.out.println("Vetor B[" + i + "]= " + vetorB[i]);
            i++;
        }
    }

    public void exercicio3() {
        int vetorA[] = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Vetor B[" + i + "]= " + vetorB[i]);
            i++;
        }
    }

    public void exercicio4() {
        double vetorA[] = new double[] { 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500,
                1600 };
        double vetorB[] = new double[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("Vetor B[" + i + "]= " + vetorB[i]);
            i++;
        }
    }

    public void exercicio5() {
        int vetorA[] = new int[] { 3, 4, 5, 6, 7, 9, 10, 11, 13, 15 };
        int vetorB[] = new int[10];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = i * vetorA[i];
            System.out.println("Vetor B[" + i + "]= " + vetorB[i]);
            i++;
        }
    }

    public void exercicio6() {
        int vetorA[] = new int[] { 3, 4, 5, 6, 7, 9, 10, 11, 13, 15 };
        int vetorB[] = new int[] { 2, 5, 7, 8, 9, 11, 12, 21, 33, 34 };
        int vetorC[] = new int[10];
        int i = 0;
        while (i < vetorA.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("Vetor C[" + i + "]= " + vetorC[i]);
            i++;
        }
    }
}
