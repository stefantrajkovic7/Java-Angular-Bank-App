package com.userfront.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Stefan on 08/08/17.
 */
public class Authority implements GrantedAuthority{

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}