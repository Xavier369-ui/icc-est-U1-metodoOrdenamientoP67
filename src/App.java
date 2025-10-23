public class App {
    public static void main(String[] args) throws Exception {
        //int[] numeros = {10,0,-5,5,15,2};
        String[] nombres = {"Pedro","Ana","Maria","Luis","Juan"};
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
        // SortSelection
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
        */
        // SortInsertion
        
        SortInsertion insercion = new SortInsertion();
        /* 
        System.out.println("Estudiante Xavier Fajardo");
        System.out.println("Metodo Insercion");
        System.out.println("Original");
        insercion.printArrayName(nombres);
        System.out.println("Ordenado Insercion Ascendente:");
        insercion.sortByName(nombres,true);
        insercion.printArrayName(nombres);
        insercion.printArray(numeros);
        System.out.println("Ordenado Insercion Ascendente:");
        insercion.sortInsertionAscendente(numeros,true);
        insercion.printArray(numeros);
        */

        Persona[] personas = new Persona[]{
            new Persona("Pedro",30),
            new Persona("Ana",25),
            new Persona("Maria",28),
           
            
        };
        System.out.println("Personas Original:");
        insercion.printArrayPersona(personas);
        System.out.println("Personas Ordenadas por edad:");
        insercion.sortByAge(personas);
        insercion.printArrayPersona(personas);
    }
}
