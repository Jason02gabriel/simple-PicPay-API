Documentação do Projeto:  

Linguagens e Frameworks:  <br/>
.Java<br/>
.Spring Boot<br/>
.Maven<br/>

EndPoints:<br/>  

.[GET]/users:<br/>
http://localhost:8080/users<br/>
retorna todos os usuarios cadastrados no banco.<br/>

.[POST]/users:<br/>
http://localhost:8080/users<br/>
Content-Type: application/json<br/>

example:<br/>
{<br/>
  "firstName": "",<br/>
  "lastName": "",<br/>
  "document": "",<br/>
  "balance": {},<br/>
  "email": "",<br/>
  "password": "",<br/>
  "userType": "COMMON"<br/>
}<br/>
esse endpoint é resonsavel pelo cadastro de novos usuarios.<br/>

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

