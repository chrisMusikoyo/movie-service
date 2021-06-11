package com.example.movie.domain;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "createdon")
    public LocalDateTime createdOn;
    @Column(name = "softDelete", columnDefinition = "boolean default false")
    public boolean softDelete;

    @PrePersist
    public void addData() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZoneId zoneId = ZoneId.of("Africa/Nairobi");
        ZonedDateTime kenya_zone = zonedDateTime.withZoneSameInstant(zoneId);
        this.createdOn = kenya_zone.toLocalDateTime();
        this.softDelete = false;
    }
}
