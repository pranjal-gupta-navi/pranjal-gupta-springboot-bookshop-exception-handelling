package com.bootcamp.bookshop.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class CreateUserRequest {
    private final String email;
    private final String password;
}
