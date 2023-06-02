package Class17;

public class Food {
    String name="Pasta";

    void printFood(){
        String name="Burger";
        //Always local variables are preferred by Java if we remove this. we will get burger
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Food food=new Food();
        food.printFood();
    }
}
