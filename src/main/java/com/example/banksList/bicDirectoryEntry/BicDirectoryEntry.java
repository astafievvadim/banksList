package com.example.banksList.bicDirectoryEntry;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record BicDirectoryEntry(
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        int BIC,//1
        String ChangeType//0...1
) {


}
