package com.auth0.samples.kotlinspringboot.security

import com.auth0.spring.security.api.JwtWebSecurityConfigurer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

/**
 * Created by stefan on 7/11/17.
 */

// open allows for inheritance as every class in kotlin is final

@Configuration
@EnableWebSecurity
open class WebSecurity : WebSecurityConfigurerAdapter(){

	@Value("\${auth0.audience}")
	private val audience: String? = null

	@Value("\${auth0.issuer}")
	private val issuer: String? = null



	override fun configure(http: HttpSecurity) {
		http
				.authorizeRequests()
				.anyRequest()
				.authenticated()

		JwtWebSecurityConfigurer
				.forRS256(audience , issuer!!)
				.configure(http)
	}
}
