package com.thelgis.springexample.entities

import javax.persistence.*

@Entity
@Table(name = "customers")
class Customer (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    var id: Long = 0,
    var name: String = "",
    var surname: String = ""
)