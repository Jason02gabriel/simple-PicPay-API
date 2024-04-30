package com.example.picpay.services;
import com.example.picpay.domain.user.User;
import com.example.picpay.domain.user.UserType;
import com.example.picpay.dtos.UserDTO;
import com.example.picpay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount) {

        if (sender.getUserType() == UserType.MERCHANT) {
            throw new IllegalArgumentException("Merchant can't make transactions");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }

    }

    public User findUSerById(Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    public void saveUser(User user) {
        this.userRepository.save(user);
    }

    public User createUser(UserDTO user) {

        User newUser = new User(user);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }
}
