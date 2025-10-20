public class SortBubble {

    public SortBubble() {


    }

    public void sortAscendente(int[] numeros){
        int contCambios = 0;
        int contPregunta = 0;
        for(int i = 0; i< numeros.length -1; i++ ){
            for(int j =0; j < numeros.length -1 -i; j++){
                contPregunta++;
                if(numeros[j] > numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                }
            }
        }
       
    }
    public void sortDescendente(int[] numeros){
        int contCambios = 0;
        int contPregunta = 0;
        for(int i = 0; i< numeros.length -1; i++ ){
            for(int j =0; j < numeros.length -1 -i; j++){
                contPregunta++;
                if(numeros[j] < numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                }
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

    

    
}
