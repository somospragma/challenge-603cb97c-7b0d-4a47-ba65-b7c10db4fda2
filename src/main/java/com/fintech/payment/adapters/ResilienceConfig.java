package com.fintech.payment;

import com.fintech.payment.adapters.TransactionRepository;
import com.fintech.payment.domain.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class TransactionServiceTest {
    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    public void testSaveTransaction() {
        Transaction transaction = new Transaction("123", "API", 100.0);
        Mono<Transaction> savedTransaction = transactionRepository.save(transaction);

        StepVerifier.create(savedTransaction)
               .expectNextMatches(t -> t.getUniqueId().equals("123"))
               .verifyComplete();
    }
}