package com.example.banksList.swbics;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public record SWBICS(
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String swbic,
        boolean defaultSWBIC
) {
}
