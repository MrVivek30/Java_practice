package com.masai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.Repository.UserRepository;

@Service
public class UUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRep;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		
		Optional<com.masai.Entities.User> opt= userRep.findByEmail(email);

		if(opt.isPresent()) {
			
			com.masai.Entities.User user = opt.get();
			
			List<GrantedAuthority> authorities = new ArrayList<>();
		
				SimpleGrantedAuthority sga=new SimpleGrantedAuthority(user.getRole().toString());
				authorities.add(sga);
			
			return new User(user.getEmail(), user.getPassword(), authorities);
			
		}else
			throw new BadCredentialsException("User Details not found with this email: "+email);
		
	}
}
