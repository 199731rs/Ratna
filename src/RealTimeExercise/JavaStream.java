package RealTimeExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream{
	
		//@Test
		public void regular() 
		{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Adam");
		names.add("Abhi");
		names.add("ram");
		
		int count=0;
		for(int i=0;i<5;i++) {
			
			String actual=names.get(i);
			
			if(actual.startsWith("A")) {
				
				count++;
			}
		}		
		System.out.println(count);
		}
		
		//@Test
		public void streamFilter() {
			ArrayList<String> names=new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Adam");
			names.add("Abhi");
			names.add("ram");
			//there is no life for intermediate option if there is no terminal option
			//terminal operation will execute only if further option (filter) return true
			//we can Create stream
			//how to use filter in stream in stream Api
			Long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			long d=Stream.of("Abhijeet","Don","Adamht","Abhi","ram").filter(s->
			{
				s.startsWith("A");
				return true;
				
			}).count();
			System.out.println(d);
			//print all the names of ArrayList
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
			
		}
		
		//@Test
		public void streamMap() {
			
			ArrayList<String> names1=new ArrayList<String>();
			names1.add("Aman");
			names1.add("Deep");
			names1.add("rash");
			names1.add("rani");
			names1.add("amit");
			
			//print names of length>4 with Uppercase			
			//Stream.of("Abhijeet","Don","Adamhta","Abhi","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			//.forEach(s->System.out.println(s));
			//print names which have first letter as a with uppercase and sorted
			//convert Arrays into list
			List<String> names=Arrays.asList("Abhijeet","Don","Adamhta","Abhi","rama");
			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//Merging 2 diff lists
			Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
			//newStream.sorted().forEach(s->System.out.println(s));
			
			
			boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Abhi"));
			System.out.println(flag);
			Assert.assertTrue(flag);
			
		}
		
		@Test
		public void streamCollect() {
			List<String> ls= Stream.of("Abhijeet","Don","Adamhta","Abhi","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			System.out.println(ls.get(0));
			
			//
			
			List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		//	values.stream().distinct().forEach(s->System.out.println(s));
			
			List<Integer> li =values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(2));
		}
		
		
		
		

}