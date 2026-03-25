# Student Management System REST API

A Spring Boot-based REST API for managing student data, including CRUD operations.

---

## 🚀 Features
- Create a new student
- Retrieve all students
- Get student by ID
- Update student details
- Delete student
- Layered architecture (Controller, Service, Repository)

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL (or H2)
- Maven

---

## 📂 Project Structure
```
src/
 ├── controller
 ├── service
 ├── repository
 ├── entity
 └── resources
```

---

## ⚙️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/jeevansankar/Student-Management-System-REST-API.git
cd student
```

### 2. Configure Database
Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password
```

### 3. Run the project
```bash
mvn spring-boot:run
```

---

## 📡 API Endpoints

| Method | Endpoint           | Description          |
|--------|------------------|----------------------|
| GET    | /students        | Get all students     |
| GET    | /students/{id}   | Get student by ID    |
| POST   | /students        | Create student       |
| PUT    | /students/{id}   | Update student       |
| DELETE | /students/{id}   | Delete student       |

---

## 🧪 Testing
You can test APIs using:
- Postman
- cURL

---

## 📌 Future Improvements
- Add validation
- Add exception handling
- Add Swagger documentation
- Add authentication (JWT)

---

## 👨‍💻 Author
Jeevan
