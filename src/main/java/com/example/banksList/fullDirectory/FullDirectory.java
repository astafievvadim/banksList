package com.example.banksList.fullDirectory;


import com.example.banksList.bicDirectoryEntry.BicDirectoryEntry;
import com.example.banksList.initialED.InitialED;
import com.example.banksList.part.PartInfo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;
import java.util.List;

//Why would I make it a record? My guess is that these should be immutable entries. This whole thing should work as a dictionary.
@Entity
//@Table to specify table.
public record FullDirectory(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int Id,
        @NonNull
        int EDNo, //1
        @NonNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date EDDate, //YYYY-MM-DD ex: 2023-05-18 //1
        @NonNull
        String EDAuthor, // 1
        @Nullable
        String EDReceiver,// 0..1
        @NonNull
        String CreationReason,//1
        @NonNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        Date CreationDateTime, //YYYY-MM-DDtHH:MM:SS:TIMEZONE ex 2023-05-17T18:31:47Z //1
        @NonNull
        String InfoTypeCode, //1
        @NonNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date BusinessDay, //1
        @Nullable
        Byte DirectoryVersion, //0...1
        @Nullable
        PartInfo PartInfo, //0..1
        @Nullable
        InitialED InitialED, //0..1
        @Nullable
        List<BicDirectoryEntry> BicDirectoryEntry//0..n multiple to one huh

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
