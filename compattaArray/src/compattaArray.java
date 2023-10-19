import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Quanti valori vuoi inserire: ");
        int n = Integer.parseInt(stdin.readLine());
        
        int []array = new int[n];
        
        System.out.print("Inserisci i numeri: ");
        for(int i = 0; i <n; i++)
        {
            array[i] = Integer.parseInt(stdin.readLine());
        }
        
        System.out.print("Quale numero vuoi compattare: ");
        int obbiettivo = Integer.parseInt(stdin.readLine());
        
        int j = 0;
        
        for(int i = 0; i<n; i++)
        {
            if(array[i] == obbiettivo)
            {
                j++;
                continue;
            }else{
                System.out.print(array[i]+" ");
            }
        }
        for(int i = 0; i<j; i++)
        {
            System.out.print(obbiettivo+" ");
        }
    }
}
