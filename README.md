Documentação do Projeto:  Linguagens e Frameworks:  
Java
Spring Boot
Maven
Arquivos e Classes:  
UserDTO.java: Esta classe é um registro que representa um objeto de transferência de dados do usuário (DTO). Ela contém campos para o primeiro nome, último nome, documento, saldo, email, senha e tipo de usuário.  
User.java: Esta é a classe de domínio do usuário. Ela contém campos semelhantes ao UserDTO, mas também inclui um ID. Além disso, ela tem um construtor que aceita um UserDTO e preenche os campos apropriados.  
UserType.java: Esta é uma enumeração que define os tipos de usuários possíveis: COMUM e COMERCIANTE.  
ControllerExceptionHandler.java: Esta classe é um manipulador de exceções global para o controlador. Ela define métodos para lidar com DataIntegrityViolationException, EntityNotFoundException e Exception genérica. Cada método retorna uma ResponseEntity apropriada.
