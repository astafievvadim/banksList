package com.example.banksList.initialED;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

public record InitialED(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        int eDNo, //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        int eDDate, //1
        String eDAuthor //1
) {

}
