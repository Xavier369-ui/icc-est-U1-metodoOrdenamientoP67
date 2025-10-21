public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10,0,-5,5,15,2};
        /* 
        SortBubble burbuja = new SortBubble();
        System.out.println(" Original:");
        burbuja.printArray(numeros);
        System.out.println(" Ordenado ascendente:");
        burbuja.sortAscendente(numeros);
        burbuja.printArray(numeros);
        System.out.println("Ordenado descendente:");
        burbuja.sortDescendente(numeros);
        burbuja.printArray(numeros);
        */

        SortSelection seleccion = new SortSelection();
        System.out.println("Estudiante Xavier Fajardo");
        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        seleccion.printArray(numeros);
        System.out.println("Ordenado ascendente:");
        seleccion.sortAscendente(numeros);
        seleccion.printArray(numeros);
        System.out.println("Ordenado descendente:");
        seleccion.sortDescendente(numeros);
        seleccion.printArray(numeros);
    }
}
