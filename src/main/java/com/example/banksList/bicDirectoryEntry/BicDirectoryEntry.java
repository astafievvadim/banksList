package com.example.banksList.bicDirectoryEntry;

import com.example.banksList.account.Accounts;
import com.example.banksList.part.PartInfo;
import com.example.banksList.participant.ParticipantInfo;
import com.example.banksList.rstrList.RstrList;
import com.example.banksList.swbics.SWBICS;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.List;
@Entity
public record BicDirectoryEntry(
        @org.springframework.data.annotation.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        @NonNull
        int bic,//1
        @Nullable
        String changeType,//0...1
        @NonNull
        ParticipantInfo participantInfo, //1
        @Nullable
        @OneToMany(mappedBy = "BicDirectoryEntry")
        HashSet<RstrList> rstrList,//0...n
        @Nullable
        @OneToMany(mappedBy = "BicDirectoryEntry")
        HashSet<SWBICS> swbics,//0...n
        @Nullable
        @OneToMany(mappedBy = "BicDirectoryEntry")
        HashSet<Accounts> accounts //0...n
) {


}
