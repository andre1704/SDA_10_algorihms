import serwerapi.Customer;

/**
 * Created by RENT on 2017-03-25.
 */
public class ClassAnionim {
    public static void main(String[] args) {
        Customer customer=new Customer(){
            @Override
            public String toString() {
                return "cos" ;
            }
        };


        System.out.println(customer);
    }


}
