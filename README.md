<h1>Documentação do Projeto:</h1>

<h2>Linguagens e Frameworks:  </h2><br/>
<h3>
Java<br/>
Spring Boot<br/>
Maven<br/>
</h3>

<br/><h2>EndPoints:</h2><br/>  

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

.[POST]/transaction:<br/>
http://localhost:8080/transaction<br/>
Content-Type: application/json<br/>

example:<br/>
{<br/>
  "value": {},<br/>
  "senderId": 0,<br/>
  "receiverId": 0<br/>
}<br/>
esse endpoint é resposavel per efetuar um nova trasferencia.<br/>

