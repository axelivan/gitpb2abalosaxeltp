package calculadora;

import java.util.Scanner;

public class MiCalculadora {
	 Scanner teclado = new Scanner(System.in);
	 Integer a;
	 Integer b;
	 Integer resultado;
	public void ingresar(){
		
		System.out.println("Ingrese el primer numero");
 		a = teclado.nextInt();
 		System.out.println("Ingrese el segundo numero");
 		b = teclado.nextInt();
	}
	public void sumar() {
			resultado = a + b;
 	 		System.out.println("El resultado es " + resultado.toString());
		
	}
	public void restar() {
		resultado = a - b;
	 		System.out.println("El resultado es " + resultado.toString());
	}
	
	
	public void multiplicar() {
		 resultado = a * b;
			System.out.println("El resultado es " + resultado.toString());
	}
	public void dividir() {
		if (b!=0&&a!=0) {
			resultado = a / b;
 			
		System.out.println("El resultado es " + resultado.toString());
		}else {System.out.println("esta cuenta no se puede hacer");}
	}
	
	
 public static void main(String[] args) {

 Integer opcion;
 MiCalculadora calcu = new MiCalculadora();
 Scanner teclado = new Scanner(System.in);
 	do{
 		System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir");
 		opcion = teclado.nextInt();
 	}
 	while (opcion < 1 && opcion > 4);
 		
 		calcu.ingresar();
 		
 		
 		switch(opcion){
 		case 1:
 			calcu.multiplicar();
 	
 			break;
 		case 2:
 			calcu.restar();
 			break;
 		case 3:		
 			calcu.sumar();
	
 		break;
 		case 4:
 			calcu.dividir();

 		
 	}
 }}
