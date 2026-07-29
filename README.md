# 💳 Finance API - Microservices

A **production-ready Finance Platform** built using **Spring Boot Microservices**. The project follows a distributed architecture to manage loan processing, EMI calculation, customer management, authentication, and payments through independently deployable services.

## 🚀 Architecture

- API Gateway
- Service Registry (Eureka)
- Config Server
- Authentication Service
- Customer Service
- Loan Service
- EMI Service
- Payment Service
- Notification Service
- PostgreSQL
- Kafka (Event-Driven Communication)
- Docker
- Spring Cloud

---

## ✨ Features

- Secure JWT Authentication
- Loan Application & Processing
- EMI Calculation
- Repayment Schedule
- Customer Management
- Payment Management
- Service Discovery
- Centralized Configuration
- API Gateway Routing
- Distributed Logging
- Global Exception Handling
- OpenAPI Documentation

---

## 🛠 Tech Stack

- Java 21
- Spring Boot 3
- Spring Cloud
- Spring Security
- Spring Data JPA
- Spring Cloud Gateway
- Eureka Server
- Config Server
- PostgreSQL
- Kafka
- Docker
- Maven
- JWT
- Lombok
- Swagger/OpenAPI
- JUnit 5
- Mockito

---

## 📂 Microservices

```
finance-platform
│
├── api-gateway
├── service-registry
├── config-server
├── auth-service
├── customer-service
├── loan-service
├── emi-service
├── payment-service
├── notification-service
└── common-library
```

---

## 📡 Service Communication

- REST APIs
- Kafka Event Streaming
- Service Discovery using Eureka
- Centralized Configuration
- JWT-based Authentication

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/shashikant-38/finance-api.git
```

### Run Services

Start the services in the following order:

1. Config Server
2. Eureka Server
3. API Gateway
4. Auth Service
5. Customer Service
6. Loan Service
7. EMI Service
8. Payment Service
9. Notification Service

---

## 📖 API Documentation

Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🛣 Roadmap

- [x] Microservices Architecture
- [ ] Config Server
- [ ] Eureka Server
- [ ] API Gateway
- [ ] JWT Authentication
- [ ] Customer Service
- [ ] Loan Service
- [ ] EMI Service
- [ ] Payment Service
- [ ] Notification Service
- [ ] Kafka Integration
- [ ] Docker Compose


---

## 👨‍💻 Author

**Shashikant Patil**

GitHub: https://github.com/shashikant-38

---

⭐ If you find this project useful, consider giving it a star.
