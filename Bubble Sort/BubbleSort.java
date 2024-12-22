public class BubbleSort {
    public static void main(String[] args) {
        int[] v = new int[10];

        // Cria numeros aleatorios no array
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }

        // Bubble Sort
        for (int i = 0; i < v.length; i++) {
            // O J sempre vai ser i + 1, pois vai estar verificando uma
            // posiçâo a frente e os demais adjacentes do array
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    // Realiza a troca dos elementos adjacentes
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
