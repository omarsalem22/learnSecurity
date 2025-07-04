package com.example.SpringSec.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrenciple implements UserDetails {

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return null ;
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }
    @Override
    public boolean isEnabled() {
       return  true ;
    }
    
    

}
