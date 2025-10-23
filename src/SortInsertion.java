public class SortInsertion {

    public SortInsertion(){

    }

    public void sortInsertionAscendente(int[] numeros, boolean pasos){
        for(int i =1; i < numeros.length;i++){
            int j = i -1;
            int aux = numeros[i];
            if(pasos){
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while(j >= 0 && numeros[j] > aux){
                if(pasos){
                    System.out.println("Compara aux: " + aux + "con numeros[" + j + "]: " + numeros[j]);
                }
                numeros[j + 1] = numeros[j];
                if(pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros [" + (j+1) + "]a numeros [" + (j+2) + "]");


            }
            numeros[j + 1] = aux;
            if ((pasos)) {
                System.out.println("Inserta aux: " + aux + "en la posicion " + (j+1));
                System.out.println("Estado actual");
                printArray(numeros);
            }
        }
    }
    public void sortByName(String[] nombre, boolean pasos){
        for(int i =1; i < nombre.length;i++){
            int j = i -1;
            String aux = nombre[i];
            if(pasos){
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while(j >= 0 && nombre[j].compareTo(aux)>0){
                if(pasos){
                    System.out.println("Compara aux: " + aux + "con nombre[" + j + "]: " + nombre[j]);
                }
                nombre[j + 1] = nombre[j];
                if(pasos)
                    printArrayName(nombre);
                j--;
                if (pasos)
                    System.out.println("Mueve nombre [" + (j+1) + "]a nombre [" + (j+2) + "]");


            }
            nombre[j + 1] = aux;
            if ((pasos)) {
                System.out.println("Inserta aux: " + aux + "en la posicion " + (j+1));
                System.out.println("Estado actual");
                printArrayName(nombre);
            }
        }

    }
    public void printArray(int[] numeros){
        System.out.print("[");
        for(int i=0; i< numeros.length;i++){
            if(i == numeros.length-1){
                System.out.print(numeros[i]);
            }else{
                System.out.print(numeros[i] + " ,  ");
            }     
        }
        System.out.println("]");
    }
    public void printArrayName(String[] nombre){
        System.out.print("[");
        for(int i=0; i< nombre.length;i++){
            if(i == nombre.length-1){
                System.out.print(nombre[i]);
            }else{
                System.out.print(nombre[i] + " ,  ");
            }     
        }
        System.out.println("]");
    }
    public void printArrayPersona(Persona[] personas){
        for(int i=0; i< personas.length;i++){
            System.out.println("Nombre: " + personas[i].getName() + ", Edad: " + personas[i].getAge());
        }
    }
    public void sortByAge(Persona[] personas){
        for(int i=1; i < personas.length;i++){
            int j = i -1;
            Persona aux = personas[i];
            while(j >= 0 && aux.getAge() < personas[j].getAge()){
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }
        
}