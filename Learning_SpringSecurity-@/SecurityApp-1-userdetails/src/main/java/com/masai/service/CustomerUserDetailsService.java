package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepository;

@Service
public class CustomerUserDetailsService implements UserDetailsService {
	
	
	@Autowired
	CustomerRepository customerRepository;
	@Override
	
//	 In this Example we have used the default implementation of UserDetails
//interface i.e. User class -----------------------------------
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
	Customer customer = customerRepository.findByEmail(username);

		if(customer!=null) {
			
			//Empty Authorities
			List<GrantedAuthority> authorities= new ArrayList<>();
			//authorities.add(new SimpleGrantedAuthority(customer.getRole()));
			
//			-----user pre-defined impl class ------------
//			return new User(customer.getEmail(), customer.getPassword(), authorities);
			
//			----------our custom made impl class-------
			return new CustomerUserDetails(customer);
			
			
		}else
			throw new BadCredentialsException("User Details not found with this username: "+username);
	}


}
