package tw.com.simpleFactory.enumeration;

public enum PizzaType {
	GreekPizza("GreekPizza"),
	CheesePizza("CheesePizza"),
	PepperoniPizza("PepperoniPizza");

    private String type;

    private PizzaType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
