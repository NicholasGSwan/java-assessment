package main.java;

import java.util.ArrayList;

public class Assessment {

    public static void main(String[] args){
        System.out.println(square(8));
        System.out.println(sum(235, 456));
        System.out.println(sum(14.2, 45.768));
        int[] toAverage = {75, 90, 100, 82, 78, 95};
        System.out.println(average(toAverage));
        ArrayList<User> users = new ArrayList<>();
//        Person Red = new Person("Red", null);
        users.add(new User("Nicholas", "Swan", false));
        users.add(new User("nicholas", "Swan", false));
        users.add(new User("Nicholas", "swan", true));
        users.add(new User("brandon", "gossen", false));
        printAllUsers(users);
        capitalizeRecords(users);
        printAllUsers(users);
        allUsersSayHello(users);
        allUsersIsAdmin(users);
    }

    public static long square(int number){
        return number*number;
    }
    public static int sum(int number1, int number2){
        return number1+number2;
    }
    public static double sum(double number1, double number2){
        return number1+number2;
    }
    public static int average(int[] numbers){
        int total = 0;
        for(int number: numbers){
            total+=number;
        }
        return total/numbers.length;
    }
    public static ArrayList<User> capitalizeRecords(ArrayList<User> users){
        for (User user: users){
            user.setFirstName(changeFirstLetterToCapital(user.getFirstName()));
            user.setLastName(changeFirstLetterToCapital(user.getLastName()));
        }
        return users;
    }
    //does the actual changing of the first letter
    public static String changeFirstLetterToCapital(String word){
        if (word.equals(word.toLowerCase())) {
            return word.substring(0, 1).toUpperCase() + word.substring(1);
        }else{
            return word;
        }

    }
    //prints all User first and last names from ArrayList of Users
    public static void printAllUsers (ArrayList<User> users){
        for(User user: users){
            System.out.println(user.getFirstName()+" "+user.getLastName());
        }
    }
    //Says Hello from all Users in ArrayList
    public static void allUsersSayHello(ArrayList<User> users){
        for(User user: users){
            System.out.println(user.sayHello());
        }
    }
    //Prints whether or not a User is an admin from ArrayList
    public static void allUsersIsAdmin(ArrayList<User> users){
        for(User user: users){
            if(user.isAdmin()){
                System.out.println(user.getFirstName()+" "+user.getLastName()+" is an Admin");
            }else {
                System.out.println(user.getFirstName() + " " + user.getLastName() + " is not an Admin");
            }
        }
    }

}
