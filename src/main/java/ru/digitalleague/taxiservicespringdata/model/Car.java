package ru.digitalleague.taxiservicespringdata.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "car")
public class Car {

    @Id
    @SequenceGenerator(name = "car_seq",sequenceName = "car_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "car_seq")
    @Column(name = "id")
    private long id;

    @Column(name = "model")
    private String carModel;

    @Column(insertable = false)
    private Date createdttm;
}