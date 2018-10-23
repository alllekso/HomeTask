package automationPractce;

public class TestRunner {
    public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("safary", "http://automationpractice.com/index.php");
        cartTests.testAddDressToCart();
    }
}
