package Proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class proyectoIndra {
	//Número de usuarios y eventos
		static int usuarioCount = 0, organizadorCount = 0 ,eventoCount = 0;
		
		//Array de Usuarios
		static String[] usuarioNombre = new String[100];
		static String[] usuarioCorreo = new String [100];
		
		
		//Array Organizador
		static String[] organizadorNombre = new String[100];
		static String[] organizadorCorreo = new String[100];
		static String[] organizadorContrasena = new String[100];
	 	
		//Array de Eventos
		static String[] nombreEvento = new String[100];
		static String[] fechaEvento = new String[100];
		static String[] ubicacionEvento = new String[100];
		static String[] categoriaEvento = new String[100];
		
	 	static boolean[] eventoActivo = new boolean[100];
	 	static int[][] eventoRegistrado = new int[100][100];
	 	static int[] eventoOrganizador = new int[100];
	 	
	 	//Para que también afecte a los métodos
		static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
        	
            System.out.println("1. Crear usuario\n2. Crear organizador\n3. Crear evento\n4. Modificar evento\n5. Cancelar evento\n6. Registrar usuario\n7. Cancelar registro\n8. Mostrar eventos\n0. Salir");
            
            int option = scanner.nextInt();
            
           
            scanner.nextLine();
            switch (option) {
            case 1:
				crearUsuario();
				break;
			case 2:
				crearOrganizador();
				break;
			case 3:
				crearEvento();
				break;
			case 4:
				modificarEvento();
				break;
			case 5:
				cancelarEvento();
				break;
			case 6:
				registrarUsuarioEvento();
				break;
			case 7:
				cancelarResgistro();
				break;
			case 8:
				mostrarEventos();
				break;
			case 0:
				return;
				default:
					System.out.println("Opción no validad");
			
            }
        }
    }
    //Creacion del usuario 
    static void crearUsuario() {
    	
        System.out.print("Nombre de usuario ");
        usuarioNombre[usuarioCount] = scanner.nextLine();
        System.out.print("Correo del usuario ");
        usuarioCorreo[usuarioCount] = scanner.nextLine();
        
        System.out.println("Usuario creado con ID " + usuarioCount);
        usuarioCount++;
        
    }
    //Creacion de la organizacion 
    static void crearOrganizador() {
    	
        System.out.print("Nombre de la organizacion ");
        organizadorNombre[organizadorCount] = scanner.nextLine();
        System.out.print("Correo de la organizacion");
        organizadorCorreo[organizadorCount] = scanner.nextLine();
        System.out.print("Contrasena de la organizacion");
        organizadorContrasena[organizadorCount] = scanner.nextLine();
        
        System.out.println("Organizador creado con ID " + organizadorCount);
        organizadorCount++;
        
    }
    //Crear evento
    static void crearEvento() {
    	
        System.out.print("ID del organizador ");
        int organizadorId = scanner.nextInt();
        scanner.nextLine();
        
        if (organizadorId >= organizadorCount) {
            System.out.println("Solo los organizadores pueden crear eventos");
            return;
        }
        
        System.out.print("Contraseña del organizador ");
        String pass = scanner.nextLine();
        
        if (!pass.equals(organizadorContrasena[organizadorId])) {
            System.out.println("Contraseña incorrecta");
            return;
        }
        
        System.out.print("Nombre del evento ");
        nombreEvento[eventoCount] = scanner.nextLine();
        System.out.print("Fecha del evento ");
        fechaEvento[eventoCount] = scanner.nextLine();
        System.out.print("Ubicación ");
        ubicacionEvento[eventoCount] = scanner.nextLine();
        System.out.print("Categoria ");
        
        categoriaEvento[eventoCount] = scanner.nextLine();
        eventoOrganizador[eventoCount] = organizadorId;
        eventoActivo[eventoCount] = true;
        
        System.out.println("Evento creado con ID " + eventoCount);
        eventoCount++;
    }
    
    //Modificar evento
    static void modificarEvento() {
    	
        System.out.print("ID del organizador ");
        int organizadorId = scanner.nextInt();
        System.out.print("ID del evento a modificar ");
        int eventoId = scanner.nextInt();
        
        scanner.nextLine();
        
        if (organizadorId < organizadorCount && eventoId < eventoCount && eventoActivo[eventoId] && eventoOrganizador[eventoId] == organizadorId) {
            System.out.print("Contrasena del organizador ");
            
            String password = scanner.nextLine();
            
            if (!password.equals(organizadorContrasena[organizadorId])) {
                System.out.println("Contrasena incorrecta");
                return;
            }
            
            System.out.print("Nuevo nombre del evento ");
            nombreEvento[eventoId] = scanner.nextLine();
            System.out.print("Nueva fecha del evento ");
            fechaEvento[eventoId] = scanner.nextLine();
            System.out.print("Nueva ubicación ");
            ubicacionEvento[eventoId] = scanner.nextLine();
            System.out.print("Nueva categoria ");
            categoriaEvento[eventoId] = scanner.nextLine();
            System.out.println("Evento modificado exitosamente");
            
        } else {
            System.out.println("No tienes permisos para modificar este evento o el evento no existe");
        }
    }
    
    //Cancelar evento
    static void cancelarEvento() {
    	
        System.out.print("ID del organizador ");
        int organizerId = scanner.nextInt();
        System.out.print("ID del evento a cancelar ");
        
        int eventId = scanner.nextInt();
        
        scanner.nextLine();
        
        if (organizerId < organizadorCount && eventId < eventoCount && eventoOrganizador[eventId] == organizerId) {
        	
            System.out.print("Contraseña del organizador ");
            
            String password = scanner.nextLine();
            
            if (!password.equals(organizadorContrasena[organizerId])) {
            	
                System.out.println("Contraseña incorrecta");
                return;
            }
            
            eventoActivo[eventId] = false;
            System.out.println("Evento cancelado exitosamente");
        } else {
            System.out.println("No tienes permisos para cancelar este evento o el evento no existe");
        }
    }
    
    //Registrar un usuario a un evento
    static void registrarUsuarioEvento() {
    	
        System.out.print("ID de usuario ");
        int userId = scanner.nextInt();
        System.out.print("ID del evento ");
        
        int eventId = scanner.nextInt();
        
        scanner.nextLine();
        
        if (userId < usuarioCount && eventId < eventoCount && eventoActivo[eventId]) {
        	
            eventoRegistrado[eventId][userId] = 1;
            System.out.println("Usuario " + usuarioNombre[userId] + " inscrito en " + nombreEvento[eventId]);
            
        } else {
            System.out.println("Datos inválidos o evento cancelado");
        }
    }
    
    //Cancelar registro
    static void cancelarResgistro() {
    	
        System.out.print("ID de usuario ");
        int usuarioId = scanner.nextInt();
        System.out.print("ID del evento ");
        
        int eventoId = scanner.nextInt();
        
        scanner.nextLine();
        
        if (usuarioId < usuarioCount && eventoId < eventoCount && eventoRegistrado[eventoId][usuarioId] == 1) {
        	
            eventoRegistrado[eventoId][usuarioId] = 0;
            System.out.println("Inscripción cancelada para el evento " + nombreEvento[eventoId]);
            
        } else {
            System.out.println("No estás registrado en este evento o los datos son incorrectos");
        }
    }
    
    //Mostrar los eventos
    static void mostrarEventos() {
    	
        System.out.println("Lista de eventos");
        
        for (int i = 0; i < eventoCount; i++) {
            if (eventoActivo[i]) {
            	
                System.out.println("ID " + i + " - Nombre " + nombreEvento[i] + " - Fecha " + fechaEvento[i] + " - Ubicación " + ubicacionEvento[i] + " - Categoria " + categoriaEvento[i]);
                
            }
        }
    }
}
 	
 	
