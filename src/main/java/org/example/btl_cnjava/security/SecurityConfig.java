//package org.example.btl_cnjava.security;
//
//import com.example.demo.model.entity.User;
//import com.example.demo.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.Optional;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Autowired
//    private UserRepository userRepository;
//        @Bean
//        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests(authorizeRequests ->
//                            authorizeRequests
//                                    .requestMatchers("/admin/login","/admin/user").permitAll()
//                                    .requestMatchers("/admin/**").hasAnyRole("ADMIN", "EDITOR","USER")
//                                    .anyRequest().permitAll()
//                    )
//                    .formLogin(formLogin ->
//                            formLogin
//                                    .loginPage("/admin/login")
//                                    .loginProcessingUrl("/admin/login")
//                                    .failureUrl("/admin/logout")
//                                    .defaultSuccessUrl("/admin/customer", true)
//                    )
//                    .logout(logout ->
//                            logout.permitAll()
//                    );
//
//            return http.build();
//        }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//
//        return email -> {
//            Optional<User> userOptional = userRepository.findByEmail(email);
//
//            if (userOptional.isPresent()) {
//                User user = userOptional.get();
//                return org.springframework.security.core.userdetails.User
//                        .withUsername(user.getEmail())
//                        .password(user.getPassword())
//                        .roles(user.getRole())
//                        .build();
//            } else {
//                throw new UsernameNotFoundException("Email not found: " + email);
//            }
//        };
//    }
//
//        @Bean
//        public PasswordEncoder passwordEncoder() {
//            return new BCryptPasswordEncoder();
//        }
//}
//
//
