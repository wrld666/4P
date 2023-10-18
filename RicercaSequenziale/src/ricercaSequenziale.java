import java.io.*;
public class ricercaSequenziale {
	public static void main(String[] args)throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Qaunti caratteri vuoi inserire: ");
		int n = Integer.parseInt(stdin.readLine());
		
		char[] caratteri1 = new char[n];
		
		for(int i = 0; i<n; i++)
		{
			System.out.print("Inserisci il "+(i+1)+ " carattere: ");
			caratteri1[i] = stdin.readLine().charAt(0);
		}
		
		System.out.print("Quale caratteri vuoi ricercare: ");
		char carattereScelto = stdin.readLine().charAt(0);
		
		for(int i = 0; i<n; i++)
		{
			if(carattereScelto == caratteri1[i]) {
				System.out.println("Il carattere scelto si trova alla posizione: "+(i+1));
				continue;
			}
			
		}	
	}
}
