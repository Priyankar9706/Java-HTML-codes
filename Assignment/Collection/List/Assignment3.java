package com.practice.demo;
import com.practice.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;


	public class Assignment3 {

		public static void main(String[] args) {
		
		 
		        Vector<Integer> v = new Vector<Integer>();
		 
		     
		        v.add(1);
		        v.add(2);
		        v.add(3);
		        v.add(4);
		      
		        Enumeration e = v.elements();
		        System.out.println("Using Enumeration: ");
		        while (e.hasMoreElements()) {
		 
		            System.out.println(e.nextElement());
		        }
		        
		        Iterator i=v.iterator();
		        System.out.println("Using Iterator: ");
		        while(i.hasNext()) {
		        	System.out.println(i.next());
		        }
		        ListIterator<Integer>
                iterator = v.listIterator();
		        System.out.println("Using ListIterator: ");
		        while(iterator.hasNext()) {
		        	System.out.println(iterator.next());
		        }
		    }
		

	}