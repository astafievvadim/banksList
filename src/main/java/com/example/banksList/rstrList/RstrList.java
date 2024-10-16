package com.example.banksList.rstrList;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record RstrList(
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        String Rstr,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date RstrDate //1
) {
}
