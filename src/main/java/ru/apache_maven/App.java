package ru.apache_maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AppBean bean = new AppBean("Maven");
        System.out.println(bean.nonExistingMethod());
    }
}
