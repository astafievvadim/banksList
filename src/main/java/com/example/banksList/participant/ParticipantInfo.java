package com.example.banksList.participant;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record ParticipantInfo (
        @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String nameP, //1
        String englName,//1
        String regN,//1
        String cntrCd,
        String rgn,
        String ind,
        String tnp,
        String nnp,
        String adr,
        int prntBIC,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date dateIn, //YYYY-MM-DD ex: 2023-05-18 //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date dateOut, //YYYY-MM-DD ex: 2023-05-18 //1
        String ptType,
        char srvcs,
        char xchType,
        String uid,
        String participantStatus

    ){
}
