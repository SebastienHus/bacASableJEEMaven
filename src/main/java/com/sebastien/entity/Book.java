package com.sebastien.entity;

public class Book {

	private String author;
	private String title;
	private String resume;


	public Book(String author, String title, String resume)
	{
		this.author = author;
		this.title = title;
		this.resume = resume;
	}



	//getters and setters


	public String getAuthor() {
		return this.author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return this.title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getResume() {
		return this.resume;
	}


	public void setResume(String resume) {
		this.resume = resume;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [author=");
		builder.append(this.author);
		builder.append(", title=");
		builder.append(this.title);
		builder.append(", resume=");
		builder.append(this.resume);
		builder.append("]");
		return builder.toString();
	}







}
