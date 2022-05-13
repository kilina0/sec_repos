package ru.apache_maven;

int test = 2;
int test = 2;
public class AppBean 
{
	private String text; 
    public AppBean(final String text) {
        this.text = text;
    } 
    public String sayHello() {
        return "Hello " + text;
    } 
}
