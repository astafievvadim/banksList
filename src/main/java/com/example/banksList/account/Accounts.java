package com.example.banksList.account;

import com.example.banksList.accountRestriction.AccRstrList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record Accounts(
        @org.springframework.data.annotation.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        String Account,
        String RegualtionAccountType,
        String CK,
        String AccountCBRBIC,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date DateIn, //YYYY-MM-DD ex: 2023-05-18 //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date DateOut, //YYYY-MM-DD ex: 2023-05-18 //1
        String AccountStatus,
        AccRstrList AccRstrList //0..n
) {
}
