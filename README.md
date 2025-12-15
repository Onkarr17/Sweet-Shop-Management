🍬 Sweet Shop Management System – Backend API

A secure and scalable Spring Boot REST API for managing a Sweet Shop.
This backend implements JWT-based authentication, follows a clean layered architecture, and fulfills all core requirements of the Sweet Shop Management System.

🚀 Features
🔐 Authentication & Security
1. JWT Authentication & Authorization
2. User Registration & Login
3. Secure password storage using BCrypt
4. Database integration using Spring Data JPA
5. Clean project structure with separation of concerns
6. Configurable using application.properties
7. RESTful API design
8. In-memory H2 database for easy local testing

🍭 Sweet Shop Core Functionality
1. Add a new sweet with name, category, price, and quantity
2. View all available sweets
3. Search sweets by name, category, or price range
4. Update sweet details
5. Delete sweets
6. Purchase sweets (decreases quantity)
7. Restock sweets (increases quantity)
   
🧱 Architecture & Quality
1. Clean separation of concerns (Controller / Service / Repository)
2. Spring Data JPA with Hibernate
3. Configurable via application.properties
4. RESTful API design
5. In-memory H2 database for easy local testing
6. APIs tested using Postman

🛠️ **Tech Stack**

1. Language -    Java 17,
2. Framework -   Spring Boot 4,
3. Security	-    Spring Security + JWT,
4. ORM      -    Spring Data JPA (Hibernate),
5. Database	-    H2 (In-memory),
6. Build Tool -  Maven,
7. API Testing	- Postman

📂 Project Structure

src/main/java/com/sweetshop/sweetshop_api
├── controller  
│   ├── AuthController.java        # User registration & login APIs  
│   └── SweetController.java       # Sweet CRUD & inventory APIs  
│
├── dto  
│   ├── LoginRequest.java  
│   ├── RegisterRequest.java  
│   └── JwtResponse.java  
│
├── entity  
│   ├── User.java                  # User entity  
│   └── Sweet.java                 # Sweet entity  
│
├── repository  
│   ├── UserRepository.java  
│   └── SweetRepository.java  
│
├── security  
│   ├── JwtAuthFilter.java  
│   ├── JwtService.java  
│   └── SecurityConfig.java  
│
├── service  
│   └── SweetService.java          # Business logic layer  
│
└── SweetshopApiApplication.java   # Application entry point


🚀 **How to Run the Project Locally**

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

🔐 **Authentication & Security (JWT)**
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

🍬 Sweet APIs (Protected – JWT Required)
🔹 Add Sweet
POST /api/sweets

               {
                   "name": "Kaju Katli",
                    "category": "Indian",
                    "price": 500,
                    "quantity": 10
               }
🔹 Get All Sweets :
GET /api/sweets

🔹 Search Sweets :
GET /api/sweets/search?name=Kaju&category=Indian

🔹 Update Sweet :
PUT /api/sweets/{id}

🔹 Delete Sweet :
DELETE /api/sweets/{id}

🔹 Purchase Sweet :
POST /api/sweets/{id}/purchase

🔹 Restock Sweet :
POST /api/sweets/{id}/restock


🧪 **API Testing with Postman**

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
              server.port=${PORT:8080}

🧪 Testing Approach

The application was designed with testability in mind, keeping business logic
inside the service layer.
Due to time constraints, functionality was validated through manual API testing
using Postman with real-world request flows and edge cases.
Service-level unit tests can be added using JUnit and Mockito following a
TDD (Test-Driven Development) approach.

👨‍💻 Author: 
  **Onkar Hadgaonkar** :  
  Backend Developer | Java | Spring Boot


