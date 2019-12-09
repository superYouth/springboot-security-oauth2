//package com.wistron.auth.config;
//
//import com.xuecheng.auth.service.UserJwt;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.oauth2.provider.token.DefaultUserAuthenticationConverter;
//import org.springframework.stereotype.Component;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@Component
//public class CustomUserAuthenticationConverter extends DefaultUserAuthenticationConverter {
//    @Autowired
//    @Qualifier("userDetailsServiceImpl")
//    UserDetailsService userDetailsService;
//
//    @Override
//    public Map<String, ?> convertUserAuthentication(Authentication authentication) {
//        LinkedHashMap response = new LinkedHashMap();
//        String name = authentication.getName();
//        response.put("user_name", name);
//
//        return response;
//    }
//
//
//}
