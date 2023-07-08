

package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepository;

/*
*	-----yaha hm apna authentication class likh rhe ( if we impplement this)
*	---Not using daoauthentication
*	--isko use krne k liye  iski koi jrurt nhi hoga---CustomerUserDetailsService and  CustomerUserDetails
* 
* ------  we should not use this we use userdetails(recommmended)
* 
* ***********NOTE**********************
* 
* -May be our client have some unique requirement like only allow the users into the system whose age is more than 18 years. or only allows the user to login from the list of allowed countries. etc.
-  So whenever we want to perform some of our own custom authentication logic then we can write our own AuthhenticationProvider.
-  There can be multiple AP inside our application.
   scenarios to have the multiple APs:
   client may allow the users to get authentication by various approaches.
   like using:
   - Username and password.
   - Outh2 authentication (it is an advance authentication and authorization f/w )
   - OTP authentication
* 
* 
* 
* 
* */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private PasswordEncoder pEncoder;
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		System.out.println("Out Authentication Provider is used...");
		
		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();

		Customer customer = customerRepository.findByEmail(username);

		if (customer==null)
			throw new BadCredentialsException("No User registerd with this details");
		else {

		
			
			if (pEncoder.matches(pwd, customer.getPassword())) {

		List<GrantedAuthority> authorities = new ArrayList<>();
		//authorities.add(new SimpleGrantedAuthority(customer.getRole()));

		return new UsernamePasswordAuthenticationToken(username, pwd, authorities);

			} else
				throw new BadCredentialsException("Invalid Password");

		
		}
		
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
		
		
		
	}

}


