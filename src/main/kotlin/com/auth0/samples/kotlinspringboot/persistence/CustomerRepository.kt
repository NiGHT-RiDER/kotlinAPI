package com.auth0.samples.kotlinspringboot.persistence

import com.auth0.samples.kotlinspringboot.model.Customer
import org.springframework.data.repository.CrudRepository

/**
 * Created by stefan on 7/11/17.
 */
interface CustomerRepository : CrudRepository<Customer, Long>
