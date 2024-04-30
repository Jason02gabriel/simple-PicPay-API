package com.example.picpay.controller;


import com.example.picpay.domain.transaction.Transaction;
import com.example.picpay.dtos.TransactionDTO;
import com.example.picpay.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transactionDTO) {
        Transaction transaction = transactionService.createTransaction(transactionDTO);
        return ResponseEntity.ok(transaction);

    }


}
