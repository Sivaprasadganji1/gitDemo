package com.mylibrarymanagementsystem.libraryms.dao;



import com.mylibrarymanagementsystem.libraryms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment findByUserEmail(String userEmail);
}