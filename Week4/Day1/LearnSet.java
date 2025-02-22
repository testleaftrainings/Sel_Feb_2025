package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		
		//EmptySet
		System.out.println("The set is : "+mentors);
		
		//add
        mentors.add("Bhuvanesh");
        mentors.add("Vinoth");
        mentors.add("Muthu");
        mentors.add("Harrish");
        
        System.out.println("Set is :"+mentors);
        
	}

}
