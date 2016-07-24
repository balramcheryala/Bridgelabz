package com.bridgelabz.ipl.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.bridgelabz.ipl.example.dto.UserRegistrationForm;
import com.bridgelabz.ipl.exception.UserAlreadyExistAuthenticationException;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 28/3/16
 */
public interface UserService {

    public UserDetails registerNewUser(UserRegistrationForm UserRegistrationForm)throws UserAlreadyExistAuthenticationException;

}
