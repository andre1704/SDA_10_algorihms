package jAVA8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-03-18.
 */
public class LambdaPerson {
    public static void main(String[] args) {
//        List<Person> personList=new ArrayList<>();
//        personList.add(new Person("Jack","Sparow","Black"));
//        personList.add(new Person("Ada","Krii","Black"));
//        personList.add(new Person("Mack","Parot","Warszawa"));
//        personList.stream().filter(x->x.getCity()=="Warszawa").forEach(x-> System.out.println(x.toString()));

        ArrayList<Person> personArrayList=new ArrayList<>();
        personArrayList.add(new Person("ann","hathway","boston"));
        personArrayList.add(new Person("emma","stone","boston"));
        personArrayList.add(new Person("emma","watson","london"));
        personArrayList.add(new Person("emma","watson","london"));


//        Map<String,List<Person>> collect=personArrayList.stream().collect(Collectors.groupingBy(p->p.getCity()));
//        collect.entrySet().stream().forEach(entry-> {
//            System.out.println(entry.getKey());
//            System.out.println();
//            System.out.println(entry.getValue());
//            System.out.println();
//        });
//        Map<String,List<Person>> collect2=personArrayList.stream().collect(Collectors.groupingBy(p->p.getCity()));
//        collect2.entrySet().stream().forEach(x->{
//            int o= (int) x.getValue().stream().count();
//            System.out.println(x.getKey());
//            System.out.println(o);
//        });
        HashSet<String> hashSet=new HashSet();

        Map<String,List<Person>> collect3=personArrayList.stream().collect(Collectors.groupingBy(p->p.getCity()));
        collect3.entrySet().stream().forEach(x->x.getValue().stream().forEach(z-> z.getFirsNae()));



    }
}
