# 📦 Franquicia App

Aplicación de gestión de franquicias, sucursales y productos desarrollada con **Spring Boot** y **MySQL**.

---

## 🚀 Tecnologías

- Java 17  
- Spring Boot 3.2.4  
- MySQL  
- Maven  
- Docker  

---

## 📚 Endpoints API

| Recurso    | Método | Endpoint             |
|------------|--------|----------------------|
| Franquicias| GET    | /api/franquicias     |
| Franquicias| POST   | /api/franquicias     |
| Franquicias| PUT    | /api/franquicias/{id}|
| Sucursales | GET    | /api/sucursales      |
| Sucursales | POST   | /api/sucursales      |
| Sucursales | PUT    | /api/sucursales/{id} |
| Productos  | GET    | /api/productos       |
| Productos  | POST   | /api/productos       |
| Productos  | PUT    | /api/productos/{id}  |
| Productos  | DELETE | /api/productos/{id}  |

---

## ⚙️ Ejecución Local

1. Configura la base de datos en `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/franquicia_db
spring.datasource.username=root
spring.datasource.password=yourpassword


Montar el archivo de sql y montarlo a la db  

1. Abrir xamp para montar la db
2. Montar el archivo franquicia.sql a la db de MySQL
3. Arrancar el proyecto