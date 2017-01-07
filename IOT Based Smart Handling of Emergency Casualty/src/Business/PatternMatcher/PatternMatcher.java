/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author test
 */
public class PatternMatcher {
    public static boolean validateName(String name){
Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$");
Matcher matcher = pattern.matcher(name);
if(matcher.matches()) {
     return true;
}
else {
    return false;
}

}
    public static boolean validateUserName(String name){
Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
Matcher matcher = pattern.matcher(name);
if(matcher.matches()) {
     return true;
}
else {
    return false;
}

}
    public static boolean validatePassword(String password)
    {
    Pattern pattern = Pattern.compile("^.*(?=.{4,})(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!#$%&? \"]).*$");
Matcher matcher = pattern.matcher(password);
if(matcher.matches()) {
     return true;
}
else {
    return false;
}
    }
    
   public static boolean validateLocation(String location)
    {
  Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$");
Matcher matcher = pattern.matcher(location);
if(matcher.matches()) {
     return true;
}
else {
    return false;
}
    }
    public static boolean validatePhoneNumber(String number){
String regex = ("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$");
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(number);
if(matcher.matches()) {
     return true;
}
else {
    return false;
}

}
     public static boolean validateStreet(String number){
String regex = ("^[a-zA-Z0-9\\s]+$");
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(number);
if(matcher.matches()) {
     return true;
}
else {
    return false;
}

}
}
