package com.example.banksList.bicDirectoryEntry;

import com.example.banksList.account.Accounts;
import com.example.banksList.part.PartInfo;
import com.example.banksList.participant.ParticipantInfo;
import com.example.banksList.rstrList.RstrList;
import com.example.banksList.swbics.SWBICS;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public record BicDirectoryEntry(
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        @NonNull
        int BIC,//1
        @Nullable
        String ChangeType,//0...1
        @NonNull
        ParticipantInfo participantInfo, //1
        @Nullable
        RstrList RstrList,//0...n
        @Nullable
        SWBICS SWBICS,//0...n
        @Nullable
        Accounts accounts //0...n
) {


}
