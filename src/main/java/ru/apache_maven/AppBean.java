package ru.apache_maven;

public class AppBean 
{
	private String text; 
    public AppBean(final String text) {
        this.text = text;
    } 
	public int sayHello() {
    	return "Hello " + text;  // ← incompatible types
	}

}
