package ru.urvanov.javaexamples.mbeans;
import java.util.Random;


public class Hello implements HelloMBean { 

    Random randomGenerator = new Random();

    public void sayHello() { 
        System.out.println("hello, world"); 
    } 
     
    public int add(int x, int y) { 
        return x + y; 
    } 
     
    public String getName() { 
        return this.name; 
    }  
     
    public int getCacheSize() { 
        return randomGenerator.nextInt(100);
    } 
     
    public synchronized void setCacheSize(int size) {
        this.cacheSize = size; 
        System.out.println("Cache size now " + this.cacheSize); 
    } 
     
    private final String name = "Reginald"; 
    private int cacheSize = DEFAULT_CACHE_SIZE; 
    private static final int 
        DEFAULT_CACHE_SIZE = 200; 
}