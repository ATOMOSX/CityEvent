#!/bin/bash

echo "CityEvent"

echo "CityEvent es una plataforma diseñada para facilitar la compra de entradas a eventos en diversas ciudades. Los usuarios pueden registrarse, explorar eventos, comprar entradas, aplicar cupones de descuento y mucho más. La plataforma está orientada a la gestión eficiente de eventos, permitiendo a los administradores crear y gestionar eventos, generar reportes de ventas, y configurar cupones promocionales."

echo "Funcionalidades principales:"
echo "- Registro y autenticación de usuarios con validación por correo electrónico."
echo "- Filtrado de eventos por nombre, tipo o ciudad."
echo "- Carrito de compras que persiste entre sesiones."
echo "- Redención de cupones de descuento en la compra de entradas."
echo "- Generación de reportes de ventas para los administradores."
echo "- Pasarela de pagos integrada (MercadoPago, PayU, Stripe, etc.)."
echo "- Sistema de administración para gestionar eventos, cupones y reportes."

echo "Tecnologías utilizadas:"
echo "- Backend: Spring Boot"
echo "- Build Tool: Gradle"
echo "- Frontend: Angular"
echo "- Base de datos: MongoDB (contenedorizado con Docker)"
echo "- Almacenamiento de imágenes: Cloudinary"

echo "## Instalación"

echo "1. Clona este repositorio:"
git clone https://github.com/tu-usuario/cityEvent.git

echo "2. Levanta el contenedor de MongoDB con Docker:"
docker run --name cityevent-mongo -d -p 27017:27017 mongo

echo "3. Configura las credenciales de Cloudinary en el archivo de configuración (src/main/resources/application.yml o .properties):"
echo 'cloudinary:'
echo '  cloud_name: tu-cloud-name'
echo '  api_key: tu-api-key'
echo '  api_secret: tu-api-secret'

echo "4. Navega al directorio del backend y ejecuta los siguientes comandos para instalar dependencias y levantar el servidor con Gradle:"
cd backend
./gradlew clean build
./gradlew bootRun

echo "5. Navega al directorio del frontend y ejecuta el siguiente comando para instalar las dependencias y levantar el servidor de desarrollo:"
cd ../frontend
npm install
ng serve

echo "6. Accede a la aplicación desde tu navegador en http://localhost:4200."

echo "## Uso de Docker para la base de datos"
echo "El contenedor MongoDB se levanta con la configuración predeterminada en el puerto 27017. Asegúrate de que tu aplicación esté configurada para conectarse a MongoDB en localhost:27017."

echo "## Contribuciones"
echo "¡Las contribuciones son bienvenidas! Si deseas contribuir, por favor haz un fork de este repositorio y crea un pull request con tu propuesta."
