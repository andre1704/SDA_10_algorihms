package rekurencja;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-27.
 */
public class FibonaciRekur {
    public static ArrayList<Integer> soret(int x) {
        if (x == 1) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            return list;
        } else {
            if(x==2){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(1);
                return list;
            }else{
                ArrayList<Integer> pom=new ArrayList<Integer>();
                ArrayList<Integer> list=soret(x-1);
                int prev=list.get(list.size()-1);
                int prevprev=list.get(list.size()-2);
                int y=prev+prevprev;
                pom.add(y);
                return pom;
            }
        }

    }

    public static void wypisz(ArrayList<Integer> list) {
        for (Integer el : list) {
            System.out.println(el);
        }
    }

    public static void main(String[] args) {
        wypisz(soret(4));
    }
}
