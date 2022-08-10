package learn.springboot.springsecurityjb.services;

import learn.springboot.springsecurityjb.models.MyUserDetails;
import learn.springboot.springsecurityjb.models.UserEntity;
import learn.springboot.springsecurityjb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> user = userRepository.findByUsername(username);
        user.orElseThrow(()-> new UsernameNotFoundException("Not Found User on This Username : " + username));
        return user.map(MyUserDetails::new).get();
    }
}
