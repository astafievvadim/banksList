package com.example.banksList.participant;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record ParticipantInfo (
        @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id,
        String NameP, //1
        String EnglName,//1
        String RegN,//1
        String CntrCd,
        String Rgn,
        String Ind,
        String Tnp,
        String Nnp,
        String Adr,
        int PrntBIC,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date DateIn, //YYYY-MM-DD ex: 2023-05-18 //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date DateOut, //YYYY-MM-DD ex: 2023-05-18 //1
        String PtType,
        char Srvcs,
        char XchType,
        String UID,
        String ParticipantStatus

    ){
}
