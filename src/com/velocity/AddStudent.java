package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddStudent {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Manish");
		list.add("Subodh");
		list.add("Sandip");
		list.add("Shubham");
		list.add("Suraj");
		//System.out.println("List of Student>>" + list);
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
	

}
