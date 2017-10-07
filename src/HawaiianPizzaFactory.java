
public class HawaiianPizzaFactory extends AbstractPizzaFactory {


    public HawaiianPizzaFactory(String topping, String dough, int size) {

        super(topping, dough, size);
    }

    @Override
    public Pizza createPizza(String topping, String dough, int size) {
        System.out.println("Create Hawaiian");

        return new Hawaiian(size, topping, dough);
    }
}
