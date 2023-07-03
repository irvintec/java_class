package miniProyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Empleado {
   
	private ArrayList<String> empleados;
    private HashMap<String, Integer> edadd;
    private HashMap<String, Double> sueldo;
    private String NombEmp;
    private int EdadEmp;
    private double SueldoEmp
    ,salarioActual,aumento,nuevoSalario;
    private int edad;
    private double salario;
    Scanner sc = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);

   // ArrayList<> empleados= new ArrayList<>();
	public Empleado() {
		
		this.empleados = new ArrayList<>();
		this.edadd = new HashMap<>();
		this.sueldo = new HashMap<>();

		
	}

	public void contratar() {
		System.out.print("Ingrese el nombre del empleado a contratar: ");
        NombEmp = sc3.nextLine();
        
        System.out.print("Ingrese la edad del empleado: ");
        EdadEmp = sc.nextInt();
        
        System.out.print("Ingrese el sueldo del empleado: ");
        SueldoEmp = sc.nextDouble();
        
        empleados.add(NombEmp);
        edadd.put(NombEmp, EdadEmp);
        sueldo.put(NombEmp, SueldoEmp);
      	}

	public void despedir() {
		System.out.print("Ingrese el nombre del empleado");
        String NomEmpDes = sc3.nextLine();
        if (empleados.contains(NomEmpDes)) {
            empleados.remove(NomEmpDes);
            System.out.println("El empleado ha sido despedido.");
        
        } else {
            System.out.println("No se encontro el nombre del empleado.");
        
        }
	}

	public void aumentar() {
		System.out.print("Ingrese el nombre del empleado al que desea aumentar el salario: ");
        String NomEmpAu = sc3.nextLine();
        if (empleados.contains(NomEmpAu)) {
            System.out.print("Ingrese la cantidad para aumentar: ");
          aumento=sc.nextDouble();
          salarioActual = sueldo.get(NomEmpAu);
          nuevoSalario = aumento+ salarioActual;
            sueldo.put(NomEmpAu, nuevoSalario);
            System.out.println("El aumento del salario de " + NomEmpAu + " es de " + aumento + ".");
            System.out.println("Nuevo salario: " + nuevoSalario );
        } else {
            System.out.println("No se encontro al empleado: " + NomEmpAu);
        }
        
	}

	public void mostrar() {
       for (String empleado : empleados) {
		
            edad = edadd.get(empleado);
            salario = sueldo.get(empleado);
            System.out.printf("Nombre:"+ empleado+"  Edad:"+edad+"  Salario:"+salario);
            System.out.println("");
        }
		/* for (int i = 0; i < empleados.size(); i++) {
			 String elemento2=empleados.get(i);
	            String elemento = empleados.get(edad);
	            //String elemento3=empleados.get(salario);
	            System.out.println(elemento+);
	        }
      */
	}
}