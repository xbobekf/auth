package com.springbootapp.auth.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;

	private String password;

	@Transient
	private String passwordConfirm;

	@ManyToMany
	private Set<Role> roles;


}
