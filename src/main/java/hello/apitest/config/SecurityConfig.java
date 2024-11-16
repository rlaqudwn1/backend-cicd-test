//package hello.apitest.config;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//import java.io.IOException;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/login", "/login/**", "/oauth2/**").permitAll()  // 로그인 경로 허용
//                                .anyRequest().authenticated()  // 나머지 요청은 인증 필요
//                )
//                .oauth2Login(oauth2 -> oauth2
//                        .loginPage("/login")  // 로그인 페이지 지정 (필요시)
//                        .successHandler(authenticationSuccessHandler()) // 로그인 성공 후 처리
//                );
//
//        return http.build();
//    }
//
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        return new InMemoryClientRegistrationRepository();  // OAuth2 클라이언트 등록
//    }
//
//    @Bean
//    public AuthenticationSuccessHandler authenticationSuccessHandler() {
//        return new AuthenticationSuccessHandler() {
//            @Override
//            public void onAuthenticationSuccess(HttpServletRequest request,
//                                                HttpServletResponse response,
//                                                Authentication authentication) throws IOException, ServletException, IOException {
//                // OAuth2 로그인 성공 후 처리할 로직
//                // 예: 사용자 정보를 로그에 출력하거나, 특정 페이지로 리다이렉트
//                response.sendRedirect("/home");  // 예시: 로그인 성공 후 홈 페이지로 리다이렉트
//            }
//        };
//    }
//}
