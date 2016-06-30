package com.bridgelabz.service;
import com.bridgelabz.model.*;
public interface LoginService
{    
      public boolean checkLogin(String userName, String userPassword);
       public void addEmployee(Users user);
       public boolean checkEmail(String email);
       public boolean checkuserName(String userName);
}