# 💳 Finance API

A **production-ready Finance API** built with **Spring Boot** that provides secure REST APIs for loan management, EMI calculation, repayment schedules, and customer management. The project follows enterprise-level development practices with clean architecture and scalable design.

---

## 🚀 Features

- 🔐 JWT Authentication & Authorization
- 👤 Customer Management
- 💰 Loan Management
- 📊 EMI Calculation
- 📅 Repayment Schedule Generation
- 💵 Interest Calculation
- 📈 Loan Status Tracking
- ✅ Request Validation
- ⚠️ Global Exception Handling
- 📝 Logging
- 📖 Swagger/OpenAPI Documentation
- 🧪 Unit & Integration Testing

---

## 🛠️ Tech Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| Spring Boot | 3.x |
| Spring Security | Latest |
| Spring Data JPA | Latest |
| PostgreSQL | Latest |
| Maven | Latest |
| JWT | Latest |
| Lombok | Latest |
| Swagger (OpenAPI) | Latest |
| JUnit 5 | Latest |
| Mockito | Latest |

---

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── entity
│   │   ├── dto
│   │   ├── mapper
│   │   ├── security
│   │   ├── config
│   │   ├── exception
│   │   └── util
│   └── resources
│       ├── application.properties
│       └── static
└── test
```

---

## 📌 API Modules

- Authentication
- Customer Management
- Loan Management
- EMI Calculator
- Repayment Schedule
- Interest Calculator

---

## ⚙️ Getting Started

### Clone the Repository

```bash
git clone https://github.com/shashikant-38/finance-api.git
```

### Navigate to the Project

```bash
cd finance-api
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/finance_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

### Run the Application

```bash
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## 📖 API Documentation

Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🗺️ Roadmap

- [x] Spring Boot Setup
- [ ] User Authentication
- [ ] Customer APIs
- [ ] Loan APIs
- [ ] EMI Calculator
- [ ] Repayment Schedule
- [ ] Email Notifications
- [ ] Docker Support
- [ ] Redis Caching
- [ ] Kafka Integration
- [ ] CI/CD with GitHub Actions
- [ ] Kubernetes Deployment

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Open a Pull Request.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Shashikant Patil**

- GitHub: https://github.com/shashikant-38

---

⭐ If you found this project useful, consider giving it a star!
