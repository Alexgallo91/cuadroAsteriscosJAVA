import java.util.Scanner;

public class Cuadrado {
	
	public static void main(String []args)
	{
		int numeroAsteriscos = 0;
		int filas;
		int columnas;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa Cuadrado Asteriscos\n");
		
		while(numeroAsteriscos == 0)
		{
			System.out.println("Ingrese el numero de asteriscos para imprimir el cuadrado:");
			numeroAsteriscos = input.nextInt();
			
			if(numeroAsteriscos < 0)
			{
				System.out.println("Tiene que ser un numero positivo, intenta de nuevo.\n");
				numeroAsteriscos = 0;
			}
			else if(numeroAsteriscos > 45)
			{
				System.out.println("Tiene que ser un numero menor a 45, intenta de nuevo.\n");
				numeroAsteriscos = 0;
			}
		}
		
		//filas y columnas tendra el mismo numero de numeroAsteriscos
		filas = numeroAsteriscos;
		columnas = numeroAsteriscos;
		
		System.out.println();
		
		//recorremos filas
		for(int i = 0; i < filas; i++)
		{
			//recorremos columnas
			for(int j = 0; j < columnas; j++)
			{
				if(i == i && j == 0)
				{
					System.out.printf("%s ", "*");
				}
				else if(i == i && j == columnas-1)
				{
					System.out.printf("%s ", "*");
				}
				else if(i == 0 || i == filas-1)
				{
					System.out.printf("%s ", "*");
				}
				else
				{
					System.out.printf("%s ", " ");
				}
			}
			System.out.println();
		}
	}

}
