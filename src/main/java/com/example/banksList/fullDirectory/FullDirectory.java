package com.example.banksList.fullDirectory;


import com.example.banksList.bicDirectoryEntry.BicDirectoryEntry;
import com.example.banksList.initialED.InitialED;
import com.example.banksList.part.PartInfo;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

//Why would I make it a record? My guess is that these should be immutable entries. This whole thing should work as a dictionary.
@Entity
//@Table to specify table.
public record FullDirectory(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long Id,
        @NonNull
        int eDNo, //1
        @NonNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date eDDate, //YYYY-MM-DD ex: 2023-05-18 //1
        @NonNull
        String eDAuthor, // 1
        @Nullable
        String eDReceiver,// 0..1
        @NonNull
        String creationReason,//1
        @NonNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        Date creationDateTime, //YYYY-MM-DDtHH:MM:SS:TIMEZONE ex 2023-05-17T18:31:47Z //1
        @NonNull
        String infoTypeCode, //1
        @NonNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Date businessDay, //1
        @Nullable
        Byte directoryVersion, //0...1
        @Nullable
        PartInfo partInfo, //0..1
        @Nullable
        InitialED initialED, //0..1
        @Nullable
        @OneToMany(mappedBy = "fullDirectory")
        HashSet<BicDirectoryEntry> bicDirectoryEntry//0..n multiple to one huh

) {
        public FullDirectory(
                Long Id, @NonNull
                int eDNo, @NonNull
                @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                Date eDDate, @NonNull
                String eDAuthor, @Nullable
                String eDReceiver, @NonNull
                String creationReason, @NonNull
                @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                Date creationDateTime, @NonNull
                String infoTypeCode, @NonNull
                @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                Date businessDay, @Nullable
                Byte directoryVersion, @Nullable
                PartInfo partInfo, @Nullable
                InitialED initialED, @Nullable
                HashSet<BicDirectoryEntry> bicDirectoryEntry) {
                this.Id = Id;
                this.eDNo = eDNo;
                this.eDDate = eDDate;
                this.eDAuthor = eDAuthor;
                this.eDReceiver = eDReceiver;
                this.creationReason = creationReason;
                this.creationDateTime = creationDateTime;
                this.infoTypeCode = infoTypeCode;
                this.businessDay = businessDay;
                this.directoryVersion = directoryVersion;
                this.partInfo = partInfo;
                this.initialED = initialED;
                this.bicDirectoryEntry = bicDirectoryEntry;
        }

        public FullDirectory() {
        }

        public int getEDNo() {
                return eDNo;
        }
        
        public Date EDDate() {
                return eDDate;
        }
        
        public String getEDAuthor() {
                return eDAuthor;
        }

        public String getEDReceiver() {
                return eDReceiver;
        }


        public String getCreationReason() {
                return creationReason;
        }

         
        public Date getCreationDateTime() {
                return creationDateTime;
        }

         
        public String getInfoTypeCode() {
                return infoTypeCode;
        }

         
        public Date getBusinessDay() {
                return businessDay;
        }

         
        public Byte getDirectoryVersion() {
                return directoryVersion;
        }
}
