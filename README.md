# CityEvent

CityEvent es una plataforma diseñada para facilitar la compra de entradas a eventos en diversas ciudades. Los usuarios pueden registrarse, explorar eventos, comprar entradas, aplicar cupones de descuento y mucho más. La plataforma está orientada a la gestión eficiente de eventos, permitiendo a los administradores crear y gestionar eventos, generar reportes de ventas, y configurar cupones promocionales.

## Funcionalidades principales:
- Registro y autenticación de usuarios con validación por correo electrónico.
- Filtrado de eventos por nombre, tipo o ciudad.
- Carrito de compras que persiste entre sesiones.
- Redención de cupones de descuento en la compra de entradas.
- Generación de reportes de ventas para los administradores.
- Pasarela de pagos integrada (MercadoPago, PayU, Stripe, etc.).
- Sistema de administración para gestionar eventos, cupones y reportes.

## Tecnologías utilizadas:
- **Backend:** Spring Boot
- **Build Tool:** Gradle
- **Frontend:** Angular
- **Base de datos:** MongoDB (contenedorizado con Docker)
- **Almacenamiento de imágenes:** Cloudinary

## Instalación

1. Clona este repositorio y colabroa:
      ```bash
         git clone https://github.com/ATOMOSX/cityEvent.git
      ```
2. Levanta el contenedor de MongoDB con Docker:
     ```bash
      git clone https://github.com/ATOMOSX/cityEvent.git
     ```
3. Configura las credenciales de Cloudinary en el archivo de configuración (src/main/resources/application.yml o .properties):
     ```bash
   cloudinary:
    cloud_name: tu-cloud-name
    api_key: tu-api-key
    api_secret: tu-api-secret
    ```
4. Navega al directorio del backend y ejecuta los siguientes comandos para instalar dependencias y levantar el servidor con Gradle:
     ```bash
   cd backend
    ./gradlew clean build
    ./gradlew bootRun
    ```
5. Accede a la aplicación desde tu navegador en:
     ```bash
   http://localhost:4200
    ```
