package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog>  addBlog(Blog blog) throws IOException {
		list.add(blog);
		
		Collections.sort(list, new Comparator<Blog>() {

			@Override
			public int compare(Blog bg1, Blog bg2) {
				// TODO Auto-generated method stub
				LocalDate d1 = bg1.getDate();
				LocalDate d2 = bg2.getDate();
				
				
				if(d1.compareTo(d2) != 0)
					return d1.compareTo(d2);
				
				String title1 = bg1.getBlogTitle().toLowerCase();
				String title2 = bg2.getBlogTitle().toLowerCase();
				
				return title1.compareTo(title2);
	
			}});
		
		 System.out.println("After Adding "+list);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		return null;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		return null;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		return null;
		
	}
}
