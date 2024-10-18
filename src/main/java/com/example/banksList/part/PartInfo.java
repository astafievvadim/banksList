package com.example.banksList.part;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record PartInfo(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        int partNo, //1
        int partQuantity, //1
        String partAggregateID//1 //it's up to fucking 27 digits, so must be a string, idk maybe rethink it later #TODO
) {
}
