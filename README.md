# PicPay API
## simplified-picpay Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring**


## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Jason02gabriel/simplified-picpay.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**API USER**
```markdown
POST /users - Create a new user
GET /users - Retrieve all users
```

**BODY**
```json
{
  "firstName": "Pedro",
  "lastName": "Oliveira",
  "document": "123.456.789-10",
  "balance": 50,
  "email": "pedro@exemple.com",
  "password": "12345d",
  "userType": "COMMON"
}
```

**API TRANSACTION**
```markdown
POST /transaction - Create a new transaction
```

**BODY**
```json
{
  "value": 10,
  "senderId": 1,
  "receiverId": 2
}
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.





