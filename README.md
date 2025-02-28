# Proyecto Indra
Retos Indra
Estos retos están divididos en 4 Carpitas las cuales son

    1. BBDD: proyecto de bases de datos
    
    2. Html-Css: proyecto de Lenguaje de marcas
    
    3. Programación: proyecto de programación
    
    4. Sistemas informáticos: proyecto de sistemas
    
    
1. BBDD
     Esta carpeta contiene un sql con el script para la creación de la base de datos.Tabién contiene un pdf con toda la
     información de las entidades, atributos y un diagrama Entidad-relación.
2. Html-css
     IMPORTANTE (La página tiene que ser abierta por un live-Server para funcionar correctamente)
   
     ![image](https://github.com/user-attachments/assets/3828a3de-d0f1-4c78-a72f-c8e666e3d8d1)

     Esta carpeta contiene tres carpetas un (html, css, img) en la html están las diferentes páginas.
     HTML
   
     ![image](https://github.com/user-attachments/assets/c165ab12-ee46-48ef-a536-041212688566)

     Dentro del index encontras la página principar con un menú (Inicio, Tabla, Contacto)

     ![image](https://github.com/user-attachments/assets/45a4c6e8-5de5-41a2-86a9-aa8b086ea2fc)

     contiene el titulo de la página y un menú con los diferentes enlaces.

     ![image](https://github.com/user-attachments/assets/760c61d4-df06-49d3-83bf-7dbcde6a61b9)

     y también contiene una descripción de la página con los diferentes eventos con un poco de informacón de cada uno.

     ![image](https://github.com/user-attachments/assets/1d04927d-1d31-4d95-a558-0069d5c24175)

     tabla contiene informacion de todos los eventos (Nombre , Fecha-Hora y lugar)

     ![image](https://github.com/user-attachments/assets/748bb54b-48ff-4c6d-9c8a-bdf564ba3f4c)

     dentro del formulario hay un formulario donde puedes contactar con el personal para más información.
     El formulario funciona cuando tú rellenas la información y presionas enviar

     ![image](https://github.com/user-attachments/assets/b218477a-8640-41f3-b88a-c307980df86b)

     me llegara tu informacion y el comentario.

     ![image](https://github.com/user-attachments/assets/42cd9901-f8f8-47cb-ae9b-fb7b7f7b588b)

     ![image](https://github.com/user-attachments/assets/7fdeff4b-cba5-439e-84d6-340164e5e48a)

     ![image](https://github.com/user-attachments/assets/a4ac0669-9f1a-47b5-b811-d48bb9aefce4)

     todos los eventos tienen una página la cual contiene información de la misma con (Nombre, Fechas y Ubicación)

     ![image](https://github.com/user-attachments/assets/08580c4e-a04a-404d-b940-9ba1bc54f30c)

3. Programación

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
   
     Cada opción te dirige a un método con su función ejemplo: Crear Usuarios

       static void crearUsuario() {
    	
        System.out.print("Nombre de usuario ");
        usuarioNombre[usuarioCount] = scanner.nextLine();
        System.out.print("Correo del usuario ");
        usuarioCorreo[usuarioCount] = scanner.nextLine();
        
        System.out.println("Usuario creado con ID " + usuarioCount);
        usuarioCount++;
        
    }
    
   






     
     
