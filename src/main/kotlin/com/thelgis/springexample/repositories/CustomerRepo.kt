package com.thelgis.springexample.repositories

import com.thelgis.springexample.entities.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepo: CrudRepository<Customer, Long>