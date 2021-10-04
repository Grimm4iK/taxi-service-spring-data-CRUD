package ru.digitalleague.taxiservicespringdata.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "taxi_drive_info")
public class TaxiDriveInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "taxi_driver_seq")
    @SequenceGenerator(name = "taxi_driver_seq",sequenceName = "taxi_driver_seq", allocationSize = 1)
    @Column(name = "driver_id")
    private long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "level")
    private int level;

    @Column(name = "car_model")
    private String carModel;

    @Column(insertable = false)
    private Date createdttm;
}
