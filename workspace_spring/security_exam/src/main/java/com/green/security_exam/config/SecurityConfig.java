package com.green.security_exam.config;

import com.green.security_exam.jwt.LoginFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration //객체 생성 + 해당 클래스에 설정 내용이 들어있음을 알려줌
@EnableWebSecurity //해당 클래스가 security 설정을 컨트롤할 수 있도록 세팅하는 어노테이션
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true) //메서드 보안 활성화
public class SecurityConfig {

  /*
  * 실제 시큐리티의 인증 & 인가에 대한 설정 코드를 작성하는 메서드
  * */
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationConfiguration authConfig) throws Exception{
    //AuthenticationManager : spring security에서 실제 로그인 검증을 진행하는 객체
    AuthenticationManager authenticationManager = authConfig.getAuthenticationManager();

    http.cors(Customizer.withDefaults()) //아래 설정한 cors 내용을 사용 하겠다.
            .csrf(csrf -> csrf.disable())
            .formLogin(form -> form.disable())
            .httpBasic(basic -> basic.disable())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            //인증 및 인가에 대한 설정 부분!!!
            .authorizeHttpRequests(auth -> //매개변수는끝..
//                auth.anyRequest().permitAll() //여기만 컨트롤 하면됨. 나머지는 복붙 ..
                  auth.requestMatchers("/test2", "/test1").authenticated()
                          .anyRequest().permitAll()
            );

    //원래 로그인 요청을 받는 UsernamePasswordAuthenticationFilter 대신
    //우리가 커스터마이징한 LoginFilter를 사용하도록 필터 교체!
    http.addFilterAt(new LoginFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class);

    return http.build();
  }

  //CORS 설정
  @Bean
  public CorsConfigurationSource corsConfigurationSource(){
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.addAllowedOrigin("http://localhost:5173"); //리액트에서 스프링으로 접근 허용
    config.addAllowedHeader("*"); //모든 헤더 정보 허용
    config.addAllowedMethod("*"); //get, post, put, delete, options 등 모든 메서드 허용

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config);
    return source;
  }

  //비밀번호 암호화 기능을 제공하는 객체 생성 메서드
  @Bean
  public PasswordEncoder getPasswordEncoder(){
    return new BCryptPasswordEncoder();
  }

}
