package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListP {

    public static  void main(String[] args){
        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("mummbai");
        placeToVisit.add("kolkata");
        placeToVisit.add("patna");
        placeToVisit.add("guwalior");
        placeToVisit.add("siwan");
        placeToVisit.add("gopalpur");


        printList(placeToVisit);
        placeToVisit.add(1,"Chennai");
        placeToVisit.remove(4);




    }


    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting"+ i.next());
        }

    }

    private  static boolean addInorder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison==0){
                System.out.println("already present");
            }
            else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else{
                System.out.println("next entry");
            }
        }

        stringListIterator.add(newCity);
        return  true;

    }
}
