package codegym.security;

import codegym.repository.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserService implements UserDetailsService {
    @Autowired
    IAppUserRepo iAppUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = iAppUserRepo.findByUsername(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add((GrantedAuthority) user.getRoles());

        UserDetails userDetails = new User(
                user.getUsername(),
                user.getPassword(),
                authorities
        );
        return userDetails;
    }

    public AppUser findByUsername(String username) {
        return iAppUserRepo.findByUsername(username);
    }

    public AppUser save(AppUser appUser) {
        return iAppUserRepo.save(appUser);
    }
}