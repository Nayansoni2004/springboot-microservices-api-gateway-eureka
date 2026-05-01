# Spring Boot Microservices with API Gateway & Eureka

This project demonstrates a **Microservices Architecture** using:
- Spring Boot
- Spring Cloud Gateway
- Netflix Eureka (Service Registry)

---

## Project Modules

### 1. Eureka Server (m7-Eureka-Server)
- Acts as **Service Registry**
- All microservices register here
- Runs on: `http://localhost:8761`

---

### 2. Microservice A (m7a)
- Sample service 1
- Registers with Eureka
- Exposes APIs (example: `/pro`)

---

### 3. Microservice B (m7b)
- Sample service 2
- Registers with Eureka
- Exposes APIs (example: `/info`)
- Can run **multiple instances** (load balancing)

---

### 4. API Gateway (m8_API_GATEWAY)
- Single entry point for all client requests
- Uses **Spring Cloud Gateway**
- Routes requests to microservices using Eureka

#### Routing Configuration:
- `/pro` → m7a
- `/info` → m7b

---

## Architecture Flow

Client → API Gateway → Eureka → Microservice

1. Client sends request to API Gateway
2. Gateway checks route
3. Gateway asks Eureka for service instance
4. Request forwarded to appropriate microservice
5. Response sent back to client

---

## How to Run

### Step 1: Start Eureka Server
Run m7-Eureka-Server

Open:

http://localhost:8761

---

### Step 2: Start Microservices

Run m7a
Run m7b

(Optional: Run multiple instances of m7b on different ports)

---

### Step 3: Start API Gateway

Run m8_API_GATEWAY

---

##  Testing APIs

Use browser or Postman:

### Test m7a via Gateway

http://localhost:45454/pro


### Test m7b via Gateway

http://localhost:45454/info

---

## ⚙️ Tech Stack

- Java 21
- Spring Boot 4
- Spring Cloud 2025
- Eureka Server
- Spring Cloud Gateway
- Maven

---

## Key Concepts

- Service Discovery using Eureka
- API Gateway Routing
- Load Balancing (via multiple instances)
- Microservices Communication

---

## Future Enhancements

- Add Security (JWT)
- Add Config Server
- Add Logging & Monitoring

---

## Author

Nayan
