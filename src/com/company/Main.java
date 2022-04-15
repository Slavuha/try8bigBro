package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("name1", 3, Enum.ADMIN);
        User user2 = new User("name2", 2, Enum.GUEST);
        User user3 = new User("name3", 1, Enum.PREMIUM);
        User user4 = new User("name4", 1, Enum.ADMIN);
        User user5 = new User("name1", 1, Enum.PREMIUM);
        User user6 = new User("name7", 1, Enum.AUTORIZED);
        User user7 = new User("name8", 1, Enum.GUEST);
        User user8 = new User("name99", 1, Enum.ADMIN);
        User user9 = new User("name777", 1, Enum.AUTORIZED);
        User user10 = new User("name666", 1, Enum.GUEST);

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);
        arrayList.add(user6);
        arrayList.add(user7);
        arrayList.add(user8);
        arrayList.add(user9);
        arrayList.add(user10);
        System.out.println(arrayList.hashCode());

        TreeSet<User> treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet);
    }
}

class User implements Comparable<User> {
    String name;
    Integer password;
    Enum getNumber;


    public User(String name, int password, Enum getNumber) {
        this.name = name;
        this.password = password;
        this.getNumber = getNumber;
    }

    @Override
    public int compareTo(User obgect) {
   int comperResult = this.getNumber.compareTo(obgect.getNumber);
   if (comperResult==0){
       return this.name.compareTo(obgect.name);
            }
else { return comperResult;}
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pasword=" + password +
                '}';
    }




}
