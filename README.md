🍬 Sweet Shop Management System – Backend API

A secure and scalable Spring Boot REST API for managing a Sweet Shop application.
This backend implements JWT-based authentication, follows clean architecture, and demonstrates real-world backend development practices suitable for production-ready systems.

🚀 Features
1. JWT Authentication & Authorization
2. User Registration & Login
3. Secure password storage using BCrypt
4. Database integration using Spring Data JPA
5. Clean project structure with separation of concerns
6. Configurable using application.properties
7. RESTful API design
8. In-memory H2 database for easy local testing

🛠️ Tech Stack
Language - Java 17,
Framework -  Spring Boot 4,
Security	-  Spring Security + JWT,
ORM       -  Spring Data JPA (Hibernate),
Database	-  H2 (In-memory),
Build Tool - Maven,
API Testing	- Postman

📂 Project Structure
src/main/java/com/sweetshop/sweetshop_api
1. controller – REST controllers (AuthController, TestController)
2. dto – Request & response DTOs (LoginRequest, RegisterRequest, JwtResponse)
3. entity – JPA entities (User, Role)
4. repository – Spring Data JPA repositories
5. security – JWT, security filters & configuration
6. service – Business logic layer
7. SweetshopApiApplication.java – Application entry point

🚀 How to Run the Project Locally
**Prerequisites**
         Java 17 or higher
         Maven 3.9+
         IDE (IntelliJ IDEA / VS Code)
         Postman

           git clone https://github.com/Onkarr17/Sweet-Shop-Management.git
           cd sweetshop-api
           mvn clean install
           mvn spring-boot:run
           The application will start at : http://localhost:8080

🔐 Authentication & Security (JWT)
      This application uses stateless JWT authentication.
      Flow:
      User registers
      User logs in
      JWT token is generated
      Token is sent in the Authorization header
      Secured APIs validate the token

📬 API Endpoints
🔹 Register User
POST /auth/register
*Request Body*

            {
               "username": "onkar",
               "password": "password123"
            }
*Response*

            User registered successfully

🔹 Login User
POST /auth/login
*Request Body*

            {
               "username": "onkar",
               "password": "password123"
            }
*Response*

            {
              "token": "eyJhbGciOiJIUzI1NiJ9..."
            }

🔹 Access Secured API
GET /test/secure
*Header*

         Authorization: Bearer <JWT_TOKEN>
*Response*

         Access granted

🧪 API Testing with Postman
All APIs were tested using Postman.
Tested Scenarios
User registration
User login
JWT token generation
Accessing secured endpoints
403 Forbidden without JWT

**Postman Screenshots**
Screenshots/
├── register.png
├── login.png
├── token.png
└── secured.png
These demonstrate:
Successful registration
JWT token generation
Authorized access to protected endpoints

⚙️ Configuration
**application.properties**

              spring.datasource.url=jdbc:h2:mem:testdb
              spring.datasource.driverClassName=org.h2.Driver
              spring.datasource.username=sa
              spring.datasource.password=
              spring.jpa.hibernate.ddl-auto=update
              spring.jpa.show-sql=true
              jwt.secret=ThisIsASecretKeyForJwt1234567890
              jwt.expiration=86400000

🚀 Future Enhancements
1. Role-based authorization (ADMIN / USER)
2. Sweet items CRUD APIs
3. Order management
4. PostgreSQL integration
5. Docker deployment
6. Swagger/OpenAPI documentation

👨‍💻 Author
*Onkar Hadgaonkar*
Backend Developer | Java | Spring Boot


