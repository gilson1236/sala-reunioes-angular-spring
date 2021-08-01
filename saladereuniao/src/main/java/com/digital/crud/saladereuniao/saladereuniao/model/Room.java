package com.digital.crud.saladereuniao.saladereuniao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="meetingroom")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name="name", nullable = false)
    private String name;

    @Column(name="date", nullable = false)
    private String date;

    @Column(name="startHour", nullable = false)
    private String startHour;

    @Column(name="endHour", nullable = false)
    private String endHour;
}
