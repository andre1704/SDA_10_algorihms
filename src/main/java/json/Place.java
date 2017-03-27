package json;

import Mapy.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-22.
 */
public class Place {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        list.add(new Point(12,44));
        list.add(new Point(9,77));
        list.add(new Point(1,0));

        Place nova=new Place("grunwald","wroclaw",list);
        System.out.println(toJsonFormat(nova));
    }



    String name;
    String city;
    List<Point> points;

    public static String toJsonFormat(Place place){
        StringBuilder json=new StringBuilder();
        json.append("{");
        json.append("\n");
        json.append("name"+": "+place.name+",");
        json.append("\n");
        json.append("city"+": "+place.getCity()+",");
        json.append("points"+": ");
        json.append("[");
        for(int i=0;i<place.points.size();i++){
            json.append("   {");
            json.append("\n");
            json.append("       x: "+place.points.get(i).getX()+","+"\n");
            json.append("       y: "+place.points.get(i).getX()+"\n");
            if(i<place.points.size()-1){
                json.append("   },"+"\n");
            }else
                json.append("   }"+"\n");
        }
        json.append("]"+"\n"+"}");
        String stringJson=json.toString();
        return stringJson;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Place(){

    }
    public Place(String name, String city, List<Point> points) {

        this.name = name;
        this.city = city;
        this.points = points;
    }
}
