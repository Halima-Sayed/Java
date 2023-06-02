package class14;

public class Main {
String nameOfCountry;
String capital;
int populationSize;

void print(String a) {
    System.out.println(a);


}
    public static void main(String[] args) {
    Main obj=new Main();
    obj.print(obj.nameOfCountry="USA");
    obj.print(obj.capital="Washington DC");
    obj.print(String.valueOf(obj.populationSize=330_000_000));


    Main obj2=new Main();
    obj2.nameOfCountry="Kazakhstan";
    obj2.capital="Astana";
    obj2.populationSize=18500000;
    }
}

