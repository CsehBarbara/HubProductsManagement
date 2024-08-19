# Hub Products Management API

This project is a backend API for managing products using Spring Boot. The API allows you to:
- Add a product (Admin only)
- Retrieve a product
- Change product price (Admin only)
- View all products

## Requirements

- Java 17
- Maven

## Setup

1. Clone the repository
2. Run `mvn clean install`
3. Run `mvn spring-boot:run`

## Authentication

- **Admin**: Username: `admin`, Password: `password`
- **User**: Username: `user`, Password: `password`

## API Endpoints

- `POST /api/products/add`: Add a new product (Admin access required). Body:
  {
  "name": "Sample Product",
  "price": 29.99
  }
- `GET /api/products/{id}`: Get a product by ID
- `PUT /api/products/change-price/{id}`: Change product price (Admin access required)
- `GET /api/products/`: Get all products
``
