public class App {
    public static void main(String[] args) throws Exception {
        
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
        int[] numeros = {10,0,-5,5,15,2};
        System.out.println("Arreglo de numeros enteros");
        System.out.println("Estudiante Xavier Fajardo");
        System.out.println("Metodo Insercion");
        System.out.println("Arreglo Original:");
        insercion.printArray(numeros);
        System.out.println("Arreglo Ordenado ascendente:");
        insercion.sortInsertionAscendente(numeros, true);
        insercion.printArray(numeros);
        System.out.println("Arreglo Ordenado descendente:");
        insercion.sortInsertionDescendente(numeros, true);
        insercion.printArray(numeros);
        System.out.println();
         
        String[] nombres = {"Pedro","Ana","Maria","Luis","Juan"};
        System.out.println("Arreglo de cadenas (nombres)");
        System.out.println("Estudiante Xavier Fajardo");
        System.out.println("Metodo Insercion");
        System.out.println("Arreglo Original:");
        insercion.printArrayName(nombres);
        System.out.println("Arreglo Ordenado :");
        insercion.sortByName(nombres, true);
        insercion.printArrayName(nombres);
        System.out.println();
        

        
        System.out.println("Arreglo de Objeto Persona");

        Persona[] personas = new Persona[]{
            new Persona("Pedro",30),
            new Persona("Ana",25),
            new Persona("Maria",28), 
        };
        System.out.println("Arreglo de personas ordenado por edad usando insercion");
        System.out.println("Personas Original:");
        insercion.printArrayPersona(personas);
        System.out.println("Personas Ordenadas por edad:");
        insercion.sortByAge(personas);
        insercion.printArrayPersona(personas);
        System.out.println();
        personas = new Persona[]{
            new Persona("Pedro",30),
            new Persona("Ana",25),
            new Persona("Maria",28), 
        };
        System.out.println("Arreglo de personas ordenado por nombre usando insercion ");
        System.out.println("Personas Original:");
        insercion.printArrayPersona(personas);
        System.out.println("Personas Ordenadas por nombre:");
        insercion.sortByNamePersona(personas);
        insercion.printArrayPersona(personas);
    }
}
