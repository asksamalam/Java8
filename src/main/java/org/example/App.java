package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> employees = new ArrayList<>();
        employees.add("Sameer Alam");
        employees.add("Rambo");
        employees.add("Kamal Rai");
        employees.add("Anil Kumble");
        employees.add("sunil kumar");
        System.out.println(employees);
        List<String> sName = employees.stream().filter(e -> e.toLowerCase().startsWith("s")).collect(Collectors.toList());
        System.out.println(sName);
    }
}
