package com.rocketseat.experts.club.passwordencoderbcrypt.security;

import com.rocketseat.experts.club.passwordencoderbcrypt.model.User;
import com.rocketseat.experts.club.passwordencoderbcrypt.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class UserAuthenticationService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User inDB = userRepository.findByUsername(username);
        if (inDB == null) {
            throw new UsernameNotFoundException("Usuário não cadastrado");
        }
        return new AppUser(inDB);
    }
}