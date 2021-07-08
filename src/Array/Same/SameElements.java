package Array.Same;
public class SameElements {
    void find(int size,int[]array1,int []array2){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(array1[i]==array2[j])
                    System.out.print(array1[i]+" ");
            }
        }
    }
    
}
