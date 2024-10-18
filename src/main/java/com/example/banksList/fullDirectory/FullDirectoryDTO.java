package com.example.banksList.fullDirectory;

import com.example.banksList.bicDirectoryEntry.BicDirectoryEntry;
import com.example.banksList.initialED.InitialED;
import com.example.banksList.part.PartInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;
import java.util.HashSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public record FullDirectoryDTO (

    int eDNo,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date eDDate,
    String eDAuthor,
    String eDReceiver,
    String creationReason,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date creationDateTime, //YYYY-MM-DDtHH:MM:SS:TIMEZONE ex 2023-05-17T18:31:47Z //1
    String infoTypeCode, //1
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date businessDay, //1
    Byte directoryVersion, //0...1
    PartInfo partInfo, //0..1
    InitialED initialED, //0..1
    @OneToMany(mappedBy = "fullDirectory")
    HashSet<BicDirectoryEntry> bicDirectoryEntry//0..n multiple to one huh

){

}
