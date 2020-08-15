import java.io.*; 
import java.util.*; 

public class Main{
    
    public static void fill(char[] arr, int j, int i){
        
        if(arr[j] == '-' && arr[i] == 'B')
            return;
        if(arr[j] == 'A' && arr[i] == '-')
            return;
        if(arr[j] == 'A' && arr[i] == 'B')
            return;
        if(arr[j] == '-' && arr[i] == 'A')
        {
            while(j<i)
            {
                arr[j++] = 'A';
            }
            return;
        }
        if(arr[j] == 'B' && arr[i] == '-')
        {
            while(j<i)
            {
                arr[++j] = 'B';
            }
            return;
        }
        if(arr[j] == 'B' && arr[i] == 'A'){
            while( j!=i-1 && i != j)
            {
                arr[j++] = 'B';
                arr[i--] = 'A';
            }
            return;
        }
    }
    
     public static void main(String []args){
        char[] arr = { '-','-', 'A', 'B', '-', '-', 
                        'A', 'B', '-', '-', '-', 'A', '-', '-' };
        
        int j=0;
        for(int i=0;i<14;i++)
        {
            if( arr[i] == '-')
                continue;
            if( arr[i] == 'A' || arr[i] == 'B')
            {
                fill(arr, j, i);
                j = i;
            }
        }
        if(j != 13)
            fill(arr, j, 13);
        System.out.println(Arrays.toString(arr));
     }
}
