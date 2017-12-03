package com.thelgis.springexample.controllers

import com.thelgis.springexample.repositories.CustomerRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(val repo: CustomerRepo) {

    @GetMapping("/")
    fun findAll() = repo.findAll()

    @GetMapping("/{id}")
    fun findByLastName(@PathVariable id: Long) = repo.findById(id)

}