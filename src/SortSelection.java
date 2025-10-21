public class SortSelection {

    public SortSelection() {
    }
    public void sortAscendente(int[] numeros){
        int n = numeros.length;
        for(int i = 0; i < n ; i++){
            int indiceMenor = i;
            for(int j = i + 1; j < n; j++){
                if(numeros[j] < numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if(indiceMenor != i){
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
            }
            
        }
    
    }
    public void sortDescendente(int[] numeros){
        int n = numeros.length;
        for(int i = 0; i < n ; i++){
            int indiceMenor = i;
            for(int j = i + 1; j < n; j++){
                if(numeros[j] > numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if(indiceMenor != i){
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
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
