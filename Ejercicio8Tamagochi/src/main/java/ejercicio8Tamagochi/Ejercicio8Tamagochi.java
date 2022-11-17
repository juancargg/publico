package ejercicio8Tamagochi;

import java.util.Scanner;

public class Ejercicio8Tamagochi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String raza;
		String nombre;
		Byte hambre = 50;
		Byte sueño = 50;
		Byte diversion = 50;
		Byte tomarMate = 50;
		Byte accion;
		Byte contador=0;
		
		/*----------------ELECCIÓN DE RAZA-------------------------*/
		do {
			
			System.out.println("Elige una raza para tu tamagotchi: " 
					+ "\n\t1 - Perro." 
					+ "\n\t2 - Gato. "
					+ "\n\t3 - Hipopótamo. " 
					+ "\n\t4 - Carpincho. " 
					+ "\n Escriba la raza que quiera.");

			raza = sc.nextLine();
			raza = raza.toLowerCase(); /* Es para pasar el string a minúsculas y hacer menos comprobaciones abajo */

		} while (!((raza.equals("perro")) || (raza.equals("gato")) || (raza.equals("hipopotamo"))
				|| (raza.equals("carpincho"))));

		System.out.println("Has elegido un " + raza + ". ");

		/*----------------ELECCIÓN DE NOMBRE-------------------------*/
		do {
			System.out.println("Es hora de ponerle un nombre (sin usar numeros)");
			nombre = sc.nextLine();
			//nombre = nombre.toUpperCase().charAt(1); para que siempre ponga la primera letra del nombre
			//en mayusculas ??????
			
		} while (nombre.contains("1") || nombre.contains("2") || nombre.contains("3") || 
				nombre.contains("4") || nombre.contains("5") || nombre.contains("6") || 
				nombre.contains("7") || nombre.contains("8") || nombre.contains("9"));

		/*--------------------COMIENZA EL JUEGO---------------------*/
		do {
			contador++;
			System.out.println("El " + raza + " " + nombre 
				+"\n Quedan " + (20-contador) + " \"dias\" para que " + nombre + " muera de viejito." 
				+ "\n________________________"
				+ "\n Hambre - " + hambre
				+ "\n Sueño - " + sueño
				+ "\n Diversión - " + diversion
				+ "\n Tomar Mate - " + tomarMate 
				+"\n________________________"
				+ "\n ELIGE UNA OPCIÓN:"
				+ "\n\t1 - Comer. "
				+ "\n\t2 - Dormir. "
				+ "\n\t3 - Jugar. "
				+ "\n\t4 - Beber mater. "
				+ "\n\t5 - Matar al pequeño " + nombre);
			
			accion = Byte.parseByte(sc.nextLine());
			
			/*---------------------------ELECCION 1----------------------*/
			if ((accion==1) && (hambre<80)) {
				hambre=(byte)(hambre+20);
				sueño=(byte)(sueño-10);
				diversion=(byte)(diversion-10);
				tomarMate=(byte)(tomarMate-10);
				
				System.out.println("mmmm... Riquísimo");
				
			}else if ((accion==1) && (hambre>80)){
				hambre=100;
				sueño=(byte)(sueño-10);
				diversion=(byte)(diversion-10);
				tomarMate=(byte)(tomarMate-10);
				
				System.out.println("Estoy con el tanque lleno");
				
				/*---------------------------ELECCION 2----------------------*/
			}else if ((accion==2) && (sueño<=80)) {
				hambre=(byte)(hambre-10);
				sueño=(byte)(sueño+20);
				diversion=(byte)(diversion-10);
				tomarMate=(byte)(tomarMate-10);
			
				System.out.println("A mimir!");
				
			}else if ((accion==2) && (sueño>80)){
				hambre=(byte) (hambre-10);
				sueño= 100;
				diversion=(byte)(diversion-10);
				tomarMate=(byte)(tomarMate-10);
				
				System.out.println("Estoy con la energia a topeeeee!!");
				
				/*---------------------------ELECCION 3----------------------*/
			}else if((accion==3)&&(diversion<=80)) {
				hambre=(byte)(hambre-10);
				sueño=(byte)(sueño-10);
				diversion=(byte)(diversion+20);
				tomarMate=(byte)(tomarMate-10);
				
				System.out.println("Siuuuuuuu");
				
			}else if ((accion==3) && (diversion>80)){
				hambre=(byte)(hambre-10);
				sueño=(byte)(sueño-10);
				diversion=100;
				tomarMate=(byte)(tomarMate-10);
				
				System.out.println("Ya no me lo puedo pasar mejor");
				
				/*---------------------------ELECCION 4----------------------*/
			}else if((accion==4)&&(tomarMate<=80)) {
				hambre=(byte)(hambre-10);
				sueño=(byte)(sueño-10);
				diversion=(byte)(diversion-10);
				tomarMate=(byte)(tomarMate+20);
				
				System.out.println("Che boludo, que rico mate!");
				
			}else if ((accion==4) && (tomarMate>80)){
				hambre=(byte)(hambre-10);
				sueño=(byte)(sueño-10);
				diversion=(byte)(diversion-10);
				tomarMate=100;
				
				System.out.println("Me va a salir mate por las orejas");
			}
			
			System.out.println("Pulsa ENTER para seguir jugando...");
			sc.nextLine();
			
		}while((accion!=5) && ((hambre>0)&&(sueño>0)&&(diversion>0)&&(tomarMate>0)) && (contador<30));
		
		/*---------------------FIN DEL JUEGO---------------------------*/
		System.out.println("El pequeño pero gran " + nombre + " ha muerto... :'("
				+ "\n Fue un " + raza + " excepcional. DEP");
		
	}
}

