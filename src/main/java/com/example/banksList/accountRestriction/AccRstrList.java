package com.example.banksList.accountRestriction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
public record AccRstrList (
        @org.springframework.data.annotation.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String AccRstr,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date AccRstrDate, //YYYY-MM-DD ex: 2023-05-18 //1
        int SuccessorBIC
){
    
}
