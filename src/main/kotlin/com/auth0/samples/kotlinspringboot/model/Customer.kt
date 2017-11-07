package com.auth0.samples.kotlinspringboot.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by stefan on 7/11/17.
 */

@Entity
class Customer (
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = 0,
	var firstName: String = "",
	var lastName: String = ""
)
