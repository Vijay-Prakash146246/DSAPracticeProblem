package com.vijay.Dao;

import com.vijay.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer>
{
}
