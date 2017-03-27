package Mapy;

import jAVA8.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Created by RENT on 2017-03-21.
 */
public class Mapy {


    public static void main(String[] args) {
        Map<Person,Point> map=new HashMap<Person, Point>();
        map.put(new Person("ben","black","warsaw"),new Point(3,72));
        map.put(new Person("jen","venegberg","tamiza"),new Point(553,-222));
        map.put(new Person("jaskier","bard","london"),new Point(3,0));

        Set<Map.Entry<Person,Point>> entry=map.entrySet();
        for (Map.Entry<Person,Point> el:entry) {
            System.out.println(el.getKey().getCity());
            System.out.println(el.getValue().getX());

        }



//        Map<Person,Map<Point,String>> map2=new HashMap<>();
//        Map<Point,String > hashMap=new HashMap<Point,String>;
//        hashMap.put(new Point(12,44),"ABC");
//        map2.put(new Person("marta","adams","new york"),hashMap);
//        Set<Map.Entry<Person, Map<Point,String>>> entry2=map2.entrySet();
//        for(Map.Entry<Person,Map<Point,String>> el2:entry2){
//            System.out.println(el2.getKey().getFirsNae());
//            System.out.println(el2.getValue().g);
//        }



    }
}
