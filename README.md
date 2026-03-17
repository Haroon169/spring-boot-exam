# Spring Boot Product API

This project is a REST API for managing products. It was built using Spring Boot. There is no database, products are stored in a list in memory.

## How to Run

run this command in the project folder:

```
mvn spring-boot:run
```

it will start on http://localhost:8080

## API Endpoints

| Method | URL | What it does |
|--------|-----|-------------|
| GET | /api/products | get all products |
| GET | /api/products/{id} | get product by id |
| POST | /api/products | add a new product |
| PUT | /api/products/{id} | update a product |
| DELETE | /api/products/{id} | delete a product |

## Testing with curl

Open a terminal and try these commands while the app is running on port 8080.

```
# Create a product
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Laptop","category":"Electronics","price":999.99,"quantity":10}'

# Get all products
curl http://localhost:8080/api/products

# Get a specific product
curl http://localhost:8080/api/products/1

# Update a product
curl -X PUT http://localhost:8080/api/products/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Laptop Pro","category":"Electronics","price":1299.99,"quantity":5}'

# Delete a product
curl -X DELETE http://localhost:8080/api/products/1

# Confirm it's gone - should return 404
curl -v http://localhost:8080/api/products/1

# Search products by name keyword
curl http://localhost:8080/api/products/search?keyword=laptop

# Get products by category
curl http://localhost:8080/api/products/category/Electronics
```

## Sample Responses

POST response:
```
{"id":1,"name":"Laptop","category":"Electronics","price":999.99,"quantity":10}
```

GET all response:
```
[{"id":1,"name":"Laptop","category":"Electronics","price":999.99,"quantity":10}]
```

GET by id response:
```
{"id":1,"name":"Laptop","category":"Electronics","price":999.99,"quantity":10}
```

PUT response:
```
{"id":1,"name":"Laptop Pro","category":"Electronics","price":1299.99,"quantity":5}
```

DELETE returns 204 which means it worked but no response body
