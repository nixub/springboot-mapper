package com.ithiema.service;

import com.ithiema.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {


   User findById(Integer id);
}
