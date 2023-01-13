
# Projeto: JavaFX e JDBC
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MarcosQuintino0/worshop-javafx-jdbc/blob/main/LICENSE) 

# Sobre o projeto
Este projeto desenvolvido em JavaFX e JDBC tem como objetivo criar um sistema de gerenciamento de departamentos e vendedores. Ele inclui funcionalidades completas de CRUD (criação, leitura, atualização e exclusão) para ambos os departamentos e vendedores. O sistema também permite a visualização dos departamentos e vendedores cadastrados
Além disso, foi utilizado as boas práticas de programação orientadas a objetos e o padrão de projeto MVC. Este projeto é útil para qualquer empresa que deseja gerenciar seus departamentos e equipe de vendas de maneira eficiente.
## Modelo conceitual
![Modelo Conceitual](https://github.com/MarcosQuintino0/Assets/blob/main/ModeloJFX.PNG)

## Funcionalidades
- Inserção de Vendedores: É possível inserir novos Vendedores em seus respectivos departamentos.

- Inserção de Departamentos: É possível inserir novos Vendedores em seus respectivos departamentos.

- Consulta de pedidos: Envia uma requisição GET para a rota /orders para obter a lista de todos os pedidos. É possível também enviar uma requisição GET para a rota /orders/{id} para obter os detalhes de um pedido específico.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postman
- H2
## Implantação em produção
- Back end: Heroku
obs: aplicação não esta mais em produção

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
1 - git clone https://github.com/MarcosQuintino0/workshop-springboot3-jpa.git

# entrar na pasta do projeto back end
2 -cd workshop-springboot3-jpa

# executar o projeto
3 -mvn spring-boot:run

4 -Abra o Postman ou outra ferramenta de sua preferência para enviar requisições HTTP para a aplicação.

5 -Para testar algumas funcionalidades da aplicação, envie as seguintes requisições HTTP:
◉ Criação de usuário: Envie uma requisição POST para a rota /users com os dados do usuário (name, email, phone, password) no formato JSON.
◉ Consulta de usuário: Envie uma requisição GET para a rota /users.

# Autor

Marcos André Quintino

https://www.linkedin.com/in/marcos-andre-quintino/
