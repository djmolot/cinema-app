package cinema.security;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.UserService;
import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> userOptional = userService.findByEmail(userName);
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("User " + userName + " not found");
        }
        User user = userOptional.get();
        org.springframework.security.core.userdetails.User.UserBuilder builder =
                org.springframework.security.core.userdetails.User.withUsername(userName);
        builder.password(user.getPassword());
        builder.authorities(user.getRoles()
                .stream()
                .map(Role::getRoleName)
                .map(Role.RoleName::toString)
                .toArray(String[]::new));
        return builder.build();
    }
}
