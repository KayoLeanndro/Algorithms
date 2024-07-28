import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(binarySearch(array, 1));

    }

    public static int binarySearch(int[] array, int item) {

        // Primeiro numero do array
        int low = 0;
        // Ultimo numero do array
        int high = array.length - 1;

        // Percorre o array
        while (low < high) {
            // Divide o array em 2 e pega o numero da divisão
            int mid = (low + high) / 2;
            int kick = mid;

            // Se o item for igual ao numero recebido pela
            // divisão dos numeros, retorna o item.
            if (kick == item) {
                return kick;
            }
            // Verifica se o numero a posição do array é maior
            // que o numero escolhido, caso sim, percorre para
            // frente, caso não, percorre para trás.
            if (kick > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}