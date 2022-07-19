package com.github.jeffersonrolino.api.service;

import com.github.jeffersonrolino.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
