## CRUD de Produtos com Spring Boot

Projeto desenvolvido com o objetivo de estudo e consulta, consistindo em uma API REST para cadastro de produtos, utilizando Java com Spring Boot, integração com banco de dados e aplicação dos principais métodos HTTP.

## Tecnologias Utilizadas

Java

* Spring Boot

* Spring Data JPA

* Spring Web

* Banco de Dados: H2

* Maven

* JPA / Hibernate

## Funcionalidades 

✅ Cadastrar produtos

🔍 Listar todos os produtos

🔎 Buscar produto por ID

✏️ Atualizar produto

🗑️ Remover produto

API seguindo o padrão CRUD e arquitetura RESTful.

## Endpoints da API 

| Método | Endpoint         | Descrição                |
| ------ | ---------------- | ------------------------ |
| POST   | `/produtos`      | Cadastra um novo produto |
| GET    | `/produtos`      | Lista todos os produtos  |
| GET    | `/produtos/{id}` | Busca um produto por ID  |
| PUT    | `/produtos/{id}` | Atualiza um produto      |
| DELETE | `/produtos/{id}` | Remove um produto        |

## Configuração do banco de dados

No arquivo application.properties ou application.yml, configure as credenciais do banco:

<pre>
spring:

  application:
  
    name: Produtos
    
  datasource:
  
    url: jdbc:h2:mem:produtos
    
    username: seuUserName
    
    password: seuPassword
    
  jpa:
  
    database-platform: org.hibernate.dialect.H2Dialect
    
  H2:
  
    console:
    
    enabled: true
    
    path: /h2-console
   </pre>

## Como executar o projeto 

1. Clone o repositório:
   
 `git clone https://github.com/juulianarb/CRUD-Produtos-JavaSpring.git`

2. Importe o projeto em sua IDE (IntelliJ, Eclipse, VS Code)

3. Configure o banco de dados

4. Execute a aplicação:

 `mvn spring-boot:run`

5. Acesse:

 `http://localhost:8080`

 ## Testes de API

 Os endpoints podem ser testados utilizando ferramentas como:

* Postman

* Insomnia

## Objetivo do projeto

Este projeto foi desenvolvido com fins educacionais, visando praticar:

* Criação de APIs REST com Spring Boot

* Uso de Spring Data JPA

* Conexão com banco de dados

* Operações CRUD

* Boas práticas de organização de código

## 👩‍💻 Autora

Juliana Rodrigues Brito






