import java.util.Scanner;

public class App{
    private static double saldo = 3000.00;
    private static Scanner scanner = new Scanner(System.in);
     // Colores ANSI para resaltar el texto
     private static final String RESET = "\u001B[0m";
     private static final String ROJO = "\u001B[31m";
     private static final String VERDE = "\u001B[32m";
     private static final String AMARILLO = "\u001B[33m";
     private static final String BLANCO = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(BLANCO+"Bienvenido a su Cajero de confianza,¿Qué se te ofrece?");

        //Ingreso para el usuario
        System.out.print(AMARILLO+ "Ingrese su pin, claro si quiere, nadie lo obliga: ");
        String pin = scanner.nextLine();

        

        //Validación del pin u contraseña.
        if(!pin.equals("0101")){
            System.out.println(ROJO+ "Ah, este parcerito es un hakcer, abrite. "+RESET);
            return;
        }
        while (true) {
            mostrarMenu();
            int opcion= scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:
                    cambiarPin();
                    break;
                case 5:
                    System.out.println(ROJO+ "Abrite de aqui ome, ya me dio rabia que estés acá."+RESET);
                    return;
                default:
                    System.out.println(AMARILLO+ "Pero este parcero aparte de pobre aguevado."+RESET);
            }
            
        }
    }
    
    private static void mostrarMenu(){
        System.out.println("\n"+VERDE+ "---|MENÚ|----"+ RESET);
        System.out.println(AMARILLO+ "1)Consulte su chichigua "+ RESET);
        System.out.println(AMARILLO+ "2)Cosignar, depositar cash: $"+RESET);
        System.out.println(VERDE+ "3)Retirar su chichigua "+RESET);
        System.out.println(VERDE+ "4)Cambiar PIN "+ RESET);
        System.out.println(VERDE+ "5)Salir"+RESET);  
        System.out.println(BLANCO+ "Elegí una opción terroncito de azucar"+RESET);
        
    }
    private static void consultarSaldo(){
        System.out.println("Tu billete actual es: $"+saldo);

    }
    private static void retirarDinero(){
        System.out.print("¿Cuanta platica quieres retirar?");
        double cantidad = scanner.nextDouble();
        if(cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro exitoso papito, ahora si para donde las cariñosas");
        } else {
            System.out.println("No, pero este man si esta muy loco, usted no tiene todo ese billete papito");
        }
    }
    private static void depositarDinero(){
        System.out.println("¿Cuanto quieres cosignar ");
        double cantidad = scanner.nextDouble();
        saldo += cantidad;
        System.out.println("Acabaste de regalar tu platica, usted si no es más.... Depositoso exitoso, tienes: $" + saldo);

    } 
    private static void cambiarPin(){

        scanner.nextLine();

        System.out.println("Estás seguro que quieres cambiar tu pin?, Dame un nuevo: ");
        String nuevoPin = scanner.nextLine();
        System.out.println("Cambio de pin exitoso, no se le vaya olvidar otra vez papito");
        
    }
    
}
