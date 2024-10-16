package com.workwin.art.config.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.workwin.art.model.User;
import com.workwin.art.repository.UserRepository;

@Service
public class CustomerUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow(() -> (new UsernameNotFoundException("Not found"+username)));
		return user.map(CustomerUserDetails::new).get();
	}

}
