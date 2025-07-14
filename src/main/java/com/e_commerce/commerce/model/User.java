package com.e_commerce.commerce.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.e_commerce.commerce.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@Builder //Nesneyi rahat bir şekilde oluşturmak için builder desing pattern i kullanıyoruz.
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails{
	private static final long serialVersionUID = -394763907708792463L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nameSurname;
	
	private String username;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	Role role;

	@Override // User nesnemizin kullanıcılarını döndürür
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return List.of(new SimpleGrantedAuthority(role.name()));
	}
	

	@Override // kullanıcının hesap süresinin dolup dolmağını belirten bir metod
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override // Kullanıcı hesabı kilitlimi değilmi belirtir
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override // kullanıcının süresi doldu mu dolmadımı diye belirten metod
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override // kullanıcının aktif mi ya da pasif olup olmadığını belirtir
	public boolean isEnabled() {

		return true;
	}

	
}
