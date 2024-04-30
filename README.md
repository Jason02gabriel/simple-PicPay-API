Documentação do Projeto:  

Linguagens e Frameworks:  
.Java
.Spring Boot
.Maven

EndPoints:  

.[GET]/users:
http://localhost:8080/users
retorna todos os usuarios cadastrados no banco.

.[POST]/users:
http://localhost:8080/users
Content-Type: application/json

example:
{
  "firstName": "",
  "lastName": "",
  "document": "",
  "balance": {},
  "email": "",
  "password": "",
  "userType": "COMMON"
}
esse endpoint é resonsavel pelo cadastro de novos usuarios.

.[POST]/transaction:
http://localhost:8080/transaction
Content-Type: application/json

example:
{
  "value": {},
  "senderId": 0,
  "receiverId": 0
}
esse endpoint é resposavel per efetuar um nova trasferencia.

