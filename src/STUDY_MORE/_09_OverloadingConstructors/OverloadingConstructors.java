package STUDY_MORE._09_OverloadingConstructors;

public class OverloadingConstructors {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerella","pepperoni");

        System.out.println("Here are the ingredients of your pizza : ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println();

        // 인수가 3개면 불가능...
        // Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella");
        // 오버로딩을 통해 실행 가능
        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping); // nulll
        System.out.println();

        Pizza pizza3 = new Pizza("thicc crust", "tomato");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese); // null
        System.out.println(pizza3.topping); // nulll
        System.out.println();

    }
}
