// package com.example.SpringSec.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;

// import com.example.SpringSec.model.User;
// import com.example.SpringSec.repo.UserRepo;

// public class MyUserDetailService implements UserDetailsService {

//     @Autowired
//     private UserRepo userRepo;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//         User user=userRepo.findByUserName(username) ;
//         if(user==null){
//             System.out.println("User Not found");
//             throw new UsernameNotFoundException("User Not Found");

//         }
  
      
//     }

// }
