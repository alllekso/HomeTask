package automationPractce;

import automationPractce.model.EntityDress;

public class CartTests {

    private String browser;
    private String baseUrl;

    public void init(String browser, String baseUrl) {
        this.browser = browser;
        this.baseUrl = baseUrl;
    }

    public void testAddDressToCart() {
        beforeTest();
        System.out.println("Click more");
        EntityDress entityAdded = readCurrentEntityFromUI();

        System.out.println(String.format("Add entity '%s' to cart", entityAdded));
        System.out.println("Go to cart");

        System.out.println("Click '+' to increase the amount of entity by 1");
        EntityDress entityAmount = readCurrentEntityFromUI();

        EntityDress entityFromCart = readEntityFromCart();
        System.out.println(String.format("Read entity '%s' from cart", entityFromCart));


        System.out.println("Assert equals added entity and read entity");
        assert entityAdded.equals(entityFromCart);
        System.out.println("Finish 'testAddDressToCart'");
    }

    private EntityDress readEntityFromCart() {
        EntityDress entityFromCart = new EntityDress();
        entityFromCart.setName("Printed Dress");
        entityFromCart.setModel("demo_3");
        entityFromCart.setSize("S");
        entityFromCart.setColor("Orange");
        entityFromCart.setPrice(26.00);
        entityFromCart.setAmount(2);
        entityFromCart.setTotalPrice(26.00*2);
        return entityFromCart;
    }

    private EntityDress readCurrentEntityFromUI() {
        EntityDress entityAdded = new EntityDress();
        entityAdded.setName("Printed Dress");
        entityAdded.setModel("demo_3");
        entityAdded.setSize("S");
        entityAdded.setColor("Orange");
        entityAdded.setPrice(26.00);
        entityAdded.setAmount(2);
        entityAdded.setTotalPrice(26.00*2);
        return entityAdded;
    }

    public void beforeTest() {
        System.out.println("Start 'testAddDressToCart'");
        System.out.println(String.format("Open browser '%s'", browser));
        System.out.println(String.format("Go to '%s'", baseUrl));
        System.out.println("Go to 'Dresses' category");
    }
}