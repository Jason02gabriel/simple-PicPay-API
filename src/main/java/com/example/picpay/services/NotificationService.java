package com.example.picpay.services;


import com.example.picpay.domain.user.User;
import com.example.picpay.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) {

        NotificationDTO notificationRequest = new NotificationDTO(user.getEmail(), message);
        String email = user.getEmail();
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc", notificationRequest, String.class);

        if (!(stringResponseEntity.getStatusCode() == HttpStatus.OK)) {
            throw new IllegalArgumentException("Error sending notification to " + email);
        }

    }
}
