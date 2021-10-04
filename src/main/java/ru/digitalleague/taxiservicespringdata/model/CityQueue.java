package ru.digitalleague.taxiservicespringdata.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "city_queue")
public class CityQueue {

    @Id
    @SequenceGenerator(name = "city_queue_seq",sequenceName = "city_queue_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "city_queue_seq")
    @Column(name = "city_id")
    private long id;

    @Column(name = "name")
    private String name_city;

    @Column(name = "queue")
    private String queue;
}