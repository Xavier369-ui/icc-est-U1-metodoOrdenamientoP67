public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10,0,-5,5,15,2};

        SortBubble burbuja = new SortBubble();

        System.out.println("Array original:");
        burbuja.printArray(numeros);
        System.out.println(" Ordenado ascendente:");
        burbuja.sortAscendente(numeros);
        burbuja.printArray(numeros);
        System.out.println("Ordenado descendente:");
        burbuja.sortDescendente(numeros);
        burbuja.printArray(numeros);
    }
}
