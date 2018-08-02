package com.company;

public class Queue {
    int[] array=new int[3];
    int counter=0;
    // your code is here
    public void push(int pushedElement){
        array[counter]=pushedElement;
        counter++;
        //your code is here
    }
    public void pop(){
        System.out.println(array[0]);
        for (int i=0;i<2;i++){
            array[i]=array[i+1];
        }
        array[counter-1]=0;
        counter--;
        //your code is here
    }
    public void display(){
        for(int j=0;j<counter;j++){
            System.out.println(array[j]);
        }
    }
}
