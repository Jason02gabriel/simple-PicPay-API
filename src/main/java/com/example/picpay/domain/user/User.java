package com.example.picpay.domain.user;


import com.example.picpay.dtos.UserDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fistName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String document;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User(UserDTO user) {
        this.fistName = user.firstName();
        this.lastName = user.lastName();
        this.email = user.email();
        this.document = user.document();
        this.password = user.password();
        this.balance = user.balance();
        this.userType = user.userType();
    }
}
