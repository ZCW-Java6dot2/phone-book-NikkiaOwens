package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

     Map<String, List<String>> phonebook;



    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
         phonebook = new TreeMap<String, List<String>>();


    }

    public void add(String name, String phoneNumber) {
//        if (!phonebook.containsKey(name)) return;
//        List<String> numbers = phonebook.get(name);
//        if(numbers == null) {
//             numbers = Arrays.asList(phoneNumber);
//        }
//        //TOXIC
//        numbers.add(phoneNumber);
//        phonebook.put(name, numbers);
        List<String> phoneNum = new ArrayList<>();
        phoneNum.add(phoneNumber);
        phonebook.put(name, phoneNum);

    }
    public void addAll(String name, String... phoneNumbers) {
          List<String> phoneNum = new ArrayList<>();
        phoneNum = Arrays.asList(phoneNumbers);
        if(!phonebook.containsKey(name)){
            phonebook.put(name, phoneNum);
        }
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
       List<String> numbers = phonebook.get(name);
       if(numbers != null && numbers.contains(phoneNumber)){
           return true;
        }
        else
            return false;

    }
    public Boolean hasEntry(String name) {
       return phonebook.containsKey(name);

    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for(String str : phonebook.keySet()) {
           List<String> numbers =  phonebook.get(str);
           if(numbers.contains(phoneNumber)) {
               return str;
           }
        }
         return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
