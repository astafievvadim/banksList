package com.example.banksList.rstrList;

import com.example.banksList.bicDirectoryEntry.BicDirectoryEntry;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record RstrList(
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String rstr,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date rstrDate, //1
        @ManyToOne()
        BicDirectoryEntry bicDirectoryEntry
) {
}
