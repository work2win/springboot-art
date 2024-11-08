package com.workwin.art.config.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.workwin.art.model.User;

public class CustomerUserDetails implements UserDetails{
	
	private String username;
	private String password;
	private List<GrantedAuthority> authorities;
	
	
	public CustomerUserDetails(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		if(this.username.equalsIgnoreCase("test")) {
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			//bCryptPasswordEncoder.encode(user.getPassword());
			System.out.println(bCryptPasswordEncoder.encode(user.getPassword()));
			//this.password = "$2a$12$FuKK4Ni2ILqIdDgxoxhpZuFfhZvmctnPCBYZ7DCLL5S2sgzqalyEq";
			this.password = bCryptPasswordEncoder.encode(user.getPassword());
		}
		
		this.authorities = Arrays.stream(user.getRole().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
