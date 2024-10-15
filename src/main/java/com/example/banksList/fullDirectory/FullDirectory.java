package com.example.banksList.fullDirectory;


import com.example.banksList.bicDirectoryEntry.BicDirectoryEntry;
import com.example.banksList.initialED.InitialED;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//Why would I make it a record? My guess is that these should be immutable entries. This whole thing should work as a dictionary.
@Entity
//@Table to specify table.
public record FullDirectory(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        int EDNo, //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date EDDate, //YYYY-MM-DD ex: 2023-05-18 //1
        String EDAuthor, // 1
        String EDReceiver,// 0..1
        String CreationReason,//1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        Date CreationDateTime, //YYYY-MM-DDtHH:MM:SS:TIMEZONE ex 2023-05-17T18:31:47Z //1
        String InfoTypeCode, //1
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date BusinessDay, //1
        Byte DirectoryVersion, //0...1
        InitialED InitialED, //0..1
        BicDirectoryEntry BicDirectoryEntry//0..n multiple to one huh

) {
        public int getEDNo() {
                return EDNo;
        }
        
        public Date EDDate() {
                return EDDate;
        }
        
        public String getEDAuthor() {
                return EDAuthor;
        }

        public String getEDReceiver() {
                return EDReceiver;
        }

         
        public String getCreationReason() {
                return CreationReason;
        }

         
        public Date getCreationDateTime() {
                return CreationDateTime;
        }

         
        public String getInfoTypeCode() {
                return InfoTypeCode;
        }

         
        public Date getBusinessDay() {
                return BusinessDay;
        }

         
        public Byte getDirectoryVersion() {
                return DirectoryVersion;
        }
}
