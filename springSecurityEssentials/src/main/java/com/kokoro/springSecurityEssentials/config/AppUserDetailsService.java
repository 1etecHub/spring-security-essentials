package com.kokoro.springSecurityEssentials.config;


import com.kokoro.springSecurityEssentials.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppUserDetailsService implements UserDetailsService {
    private final CustomerRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .map(AppUserDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException("User not in Database"));
    }
}
