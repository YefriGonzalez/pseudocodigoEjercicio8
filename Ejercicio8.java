import java.util.*;
public class Ejercicio8{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String opcionSalir="a";
		int numero;
		while(!opcionSalir.equals("S")){
			numero=5*(int)(Math.random()*1000);
			System.out.println("Numero multiplo de 5: "+numero);
			System.out.println("Si desea cancelar presiona la letra: S, de lo contrario presione otra letra");
			opcionSalir=scanner.nextLine();
		}
	}
}