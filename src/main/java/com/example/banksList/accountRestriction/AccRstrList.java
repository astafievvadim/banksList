package com.example.banksList.accountRestriction;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record AccRstrList (
    String AccRstr,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date AccRstrDate, //YYYY-MM-DD ex: 2023-05-18 //1
    int SuccessorBIC
){
    
}
