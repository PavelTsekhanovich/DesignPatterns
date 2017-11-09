package com.patterns.strategy.se.course.start;

import com.patterns.strategy.se.course.auth.UserChecker;
import com.patterns.strategy.se.course.strategy.DBAuth;
import com.patterns.strategy.se.course.strategy.FileAuth;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
