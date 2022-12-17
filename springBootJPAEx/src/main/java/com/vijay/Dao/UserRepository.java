package com.vijay.Dao;

import com.vijay.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//public interface UserRepository  extends CrudRepository<User,Integer>
//{
//}
public interface UserRepository  extends JpaRepository<User,Integer>
{

    //We are Writing Custom finder method here
    public List<User> findByName(String name);
    public List<User> findByCity(String city);
    public  List<User> findByNameAndCity(String name,String city);
    public  List<User>findByNameOrCity(String name,String city);
    public  List<User>findByNameStartingWith(String prefix);
    public  List<User>findByNameEndingWith(String suffix);
    public  List<User>findByNameContaining(String words);

    //we can also fire the Query manually(Custom written Query)
    @Query("select u from User u")
    public  List<User>getAllUser();
    @Query("select u from User u where u.name=:n")
    public  List<User>getUserByName(@Param("n") String name);

    @Query("select u from User u where u.name=:n and u.city=:c")
    public  List<User>getUserByNameAndCity(@Param("n") String name,@Param("c") String city);

//Firing the native Query
    @Query(value = "select * from user",nativeQuery = true)
    public  List<User>getUsers();
}