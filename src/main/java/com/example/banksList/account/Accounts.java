package com.example.banksList.account;

import com.example.banksList.accountRestriction.AccRstrList;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
@Entity
public record Accounts(
        @org.springframework.data.annotation.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String account,
        String regualtionAccountType,
        String cK,
        String accountCBRBIC,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date dateIn, //YYYY-MM-DD ex: 2023-05-18 //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date dateOut, //YYYY-MM-DD ex: 2023-05-18 //1
        String accountStatus,
        List<AccRstrList> accRstrList //0..n
) {
}
