# Proyecto Indra
Retos Indra
Estos retos están divididos en 4 Carpitas, las cuales son:

    1. BBDD: Proyecto de bases de datos.
    
    2. Html-Css: Proyecto de Lenguaje de marcas.
    
    3. Programación: Proyecto de programación.
    
    4. Sistemas informáticos: Proyecto de sistemas.
    
    
1. BBDD
   
     Esta carpeta contiene un archivo SQL con el script para la creación de la base de datos. También incluye un PDF 
     con toda la información sobre las entidades, atributos y un diagrama Entidad-Relación.
   
3. Html-css
   
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

5. Programación

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
   
     Por ejemplo: Crear Usuarios

       static void crearUsuario() {
    	
        System.out.print("Nombre de usuario ");
        usuarioNombre[usuarioCount] = scanner.nextLine();
        System.out.print("Correo del usuario ");
        usuarioCorreo[usuarioCount] = scanner.nextLine();
        
        System.out.println("Usuario creado con ID " + usuarioCount);
        usuarioCount++;
        
    	}

7. Sistemas informaticos

     La carpeta contiene un pdf con la instalación de windows 10 pro y creación de un server local con XAMPP

   
   






     
     
