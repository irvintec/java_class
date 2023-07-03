package miniProyecto;
import java.util.*;
public class Principal {
	private static Empleado empleados= new Empleado();
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in); 
    int opcion;
	do {
        System.out.println("1.- Contratar empleado");
        System.out.println("2.- Despedir empleado");
        System.out.println("3.- Aumentar salario");
        System.out.println("4.- Mostrar todos los empleados");
        System.out.println("5.- Salir del programa");
        		
        
       System.out.println("Ingrese una opcion");
        opcion=scanner.nextInt();
        switch (opcion) {
            case 1:
            	empleados.contratar();;
            	 System.out.print("\033[H\033[2J");
                 System.out.flush();
                break;
            case 2:
                empleados.despedir();;
                break;
            case 3:
            	empleados.aumentar();
                break;
            case 4:
                empleados.mostrar();
                break;
            case 5:
                break;
            default:
           
                break;
        }
        
    } while (opcion != 5);
	
}
}