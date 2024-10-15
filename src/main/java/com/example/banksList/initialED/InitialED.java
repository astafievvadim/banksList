package com.example.banksList.initialED;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

public record InitialED(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        int EDNo, //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        int EDDate, //1
        String EDAuthor //1
) {

}
