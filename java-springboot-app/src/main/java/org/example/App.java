package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }


    //getallawstools
    @GetMapping("/getallawstools")
    List<String> getAllAwsTools(){
        ArrayList arrayList=new ArrayList();
        arrayList.add("ec2");
        arrayList.add("s3");
        return arrayList;
    }

    @GetMapping("/getalldevopstools")
    List<String> getAllDevopsTools(){
        ArrayList arrayList=new ArrayList();
        arrayList.add("git");
        arrayList.add("java");
        arrayList.add("maven");
        arrayList.add("sonar");
        arrayList.add("nexus");
        return arrayList;
    }

}
