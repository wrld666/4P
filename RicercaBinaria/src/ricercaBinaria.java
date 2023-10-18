import java.io.*;
public class ricercaBinaria {
	public static void main(String[] args)throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Quanti numeri vuoi inserire: ");
		int n = Integer.parseInt(stdin.readLine());
		
		int []array = new int[n];
		
		System.out.print("Inserisci i numeri in ordine crescente: ");
		for(int i = 0; i<n; i++)
		{
			array[i] = Integer.parseInt(stdin.readLine());
			System.out.print(" ");
		}
		
		System.out.print("Inserisci il numero da cercare: ");
		int obbiettivo = Integer.parseInt(stdin.readLine());
		
		int meta = n/2;
		boolean trovato = false;
		int primo = array[0];
		int ultimo = array[n-1];

		if(obbiettivo > ultimo)
		{
			trovato = false;
		}else if(obbiettivo == primo)
		{
			trovato = true;
			meta = 0;
		}else{
		for(int i = 0; i<meta+1; i++)
		{
			if(array[meta] == obbiettivo)
			{
					trovato = true;
					break;
			}else if(array[meta] > obbiettivo)
				meta = meta - 1;
			else
				meta = meta + 1;
		}
		}
		if(trovato == true)
		{
			System.out.println("Il numero "+obbiettivo+ " è stato trovato alla posizione "+(meta+1));
		}else
			System.out.println("Il numero non è stato trovato.");
			
	}
}