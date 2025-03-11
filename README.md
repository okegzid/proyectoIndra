# Proyecto Indra
Retos Indra
Estos retos están divididos en cuatro carpetas, las cuales son:
---

1. [BBDD: Proyecto de bases de datos](#bbdd-proyecto-de-bases-de-datos)  
2. [HTML-CSS: Proyecto de lenguaje de marcas](#html-css-proyecto-de-lenguaje-de-marcas)  
3. [Programación: Proyecto de programación](#programacion-proyecto-de-programacion)  
4. [Sistemas Informáticos: Proyecto de sistemas](#sistemas-informaticos-proyecto-de-sistemas)  

---    

## BBDD: Proyecto de bases de datos  

Esta carpeta contiene un archivo SQL con el script para la creación de la base de datos. También incluye un PDF 
con toda la información sobre las entidades, atributos y un diagrama Entidad-Relación.

   ![Proyecto drawio](https://github.com/user-attachments/assets/061f7f76-d7ee-4a07-8623-5368a1fdbfef)

Tabla organizador

	create table organizador(
	idOrganizador int unsigned primary key auto_increment,
	nombre varchar(25) not null,
	tipoOrganizador enum('empresa','institución','independiente')
	);
 Tabla tipos

 	create table tipos(
	idTipos int unsigned primary key auto_increment,
	nombre varchar(50) not null
	);
 Tabla eventos
 
	create table evento(
	idEvento int unsigned primary key auto_increment,
	nombre varchar(25) not null,
	fecha date not null,
	duracion int not null,
	ubicacion varchar(50) not null,
	idTipo int unsigned not null,
	idOrganizador int unsigned null,
	foreign key (idTipo) references tipos(idTipos) on delete cascade on update cascade ,
	foreign key (idOrganizador) references organizador(idOrganizador)
	);

 Tabla usuarios

 	create table usuarios(
	idUsuarios int unsigned primary key auto_increment,
	nombre varchar(25) not null,
	correo varchar(50) not null,
	contraseña varchar(50) not null
	);

 Tabla inscripciones

	create table inscripciones(
	idInscripciones int unsigned primary key auto_increment,
	idUsuarios int unsigned not null,
	idEvento int unsigned not null,
	foreign key (idUsuarios) references usuarios(idUsuarios) on delete cascade on update cascade,
	foreign key (idEvento) references evento(idEvento) on delete cascade on update cascade
	);
 Tabla contactos

 	create table contactos(
	idContactos int unsigned primary key auto_increment,
	idOrganizador int unsigned not null,
	tipoContacto enum('teléfono','correo') not null,
	valor varchar(25) not null,
	foreign key (idOrganizador) references organizador(idOrganizador) on delete cascade on update cascade
	);
 
## HTML-CSS: Proyecto de lenguaje de marcas  
   
IMPORTANTE: La página debe abrirse con un Live Server para funcionar correctamente.
   
![image](https://github.com/user-attachments/assets/3828a3de-d0f1-4c78-a72f-c8e666e3d8d1)

Esta carpeta contiene tres subcarpetas: html, css e img. En la carpeta html se encuentran las diferentes páginas.
   
![image](https://github.com/user-attachments/assets/c165ab12-ee46-48ef-a536-041212688566)

Dentro del archivo index.html encontrarás la página principal con un menú que incluye: Inicio, Tabla y Contacto.

![image](https://github.com/user-attachments/assets/45a4c6e8-5de5-41a2-86a9-aa8b086ea2fc)

Contiene el título de la página y un menú con diferentes enlaces.

![image](https://github.com/user-attachments/assets/760c61d4-df06-49d3-83bf-7dbcde6a61b9)

También incluye una descripción de la página y los diferentes eventos, con un breve resumen de cada uno.

![image](https://github.com/user-attachments/assets/1d04927d-1d31-4d95-a558-0069d5c24175)

La tabla muestra información sobre todos los eventos: nombre, fecha y hora, y lugar.
   
![image](https://github.com/user-attachments/assets/748bb54b-48ff-4c6d-9c8a-bdf564ba3f4c)

Dentro del apartado de contacto hay un formulario donde puedes escribir al personal para obtener más información.
El formulario funciona cuando rellenas los campos y presionas Enviar.

![image](https://github.com/user-attachments/assets/b218477a-8640-41f3-b88a-c307980df86b)

Una vez enviado, recibiré tu información y comentario.

![image](https://github.com/user-attachments/assets/42cd9901-f8f8-47cb-ae9b-fb7b7f7b588b)

![image](https://github.com/user-attachments/assets/7fdeff4b-cba5-439e-84d6-340164e5e48a)

![image](https://github.com/user-attachments/assets/a4ac0669-9f1a-47b5-b811-d48bb9aefce4)

Cada evento tiene su propia página, donde se muestra información como nombre, fechas y ubicación.
   
![image](https://github.com/user-attachments/assets/08580c4e-a04a-404d-b940-9ba1bc54f30c)

## Programacion: Proyecto de programacion  

La carpeta contien un .java con el código.
   	
Los array funcionan en todo el código porque se encuentra dentro del public class proyectoIndra.

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

He usado un while y dentro un switch para acceder a las opciones 
         
       while (true) {
        	
            System.out.println("1. Crear usuario\n2. Crear organizador\n3. Crear evento\n4. Modificar evento\n5.     
            Cancelar evento\n6. Registrar usuario\n7. Cancelar registro\n8. Mostrar eventos\n0. Salir");
            
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
   
Cada opción te dirige a un método.
   
Por ejemplo: Crear Usuarios que tiene dos array uno nombre y otro correo

       static void crearUsuario() {
    	
        System.out.print("Nombre de usuario ");
        usuarioNombre[usuarioCount] = scanner.nextLine();
        System.out.print("Correo del usuario ");
        usuarioCorreo[usuarioCount] = scanner.nextLine();
        
        System.out.println("Usuario creado con ID " + usuarioCount);
        usuarioCount++;
        
    	}

Creacion de la organizador donde se guarda (Nombre, Correo y Contraseña)

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

Creación de evento donde te pide la contaseña del organizador para poder crear un evento

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

Modificar un evento primero te pide ID del Organizador y su contraseña para poder modificar un evento 

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

Cancelar un evento esto solo lo puede hacer un organizador conuna contraseña

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

Registrer un usuario a un evento, para registrar un usuario es necesario la id del usuario

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

Cancelar un registro se necesita un Id y el usuario

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

y Mostrar los evento usando un for-each

	static void mostrarEventos() {
    	
        System.out.println("Lista de eventos");
        
        for (int i = 0; i < eventoCount; i++) {
            if (eventoActivo[i]) {
            	
                System.out.println("ID " + i + " - Nombre " + nombreEvento[i] + " - Fecha " + fechaEvento[i] + " - Ubicación " + ubicacionEvento[i] + " - Categoria " + categoriaEvento[i]);
                
            }
        }
    }
    
## Sistemas Informaticos: Proyecto de sistemas  

La carpeta contiene un pdf con la instalación de windows 10 pro y creación de un server local con XAMPP

   
   






     
     
