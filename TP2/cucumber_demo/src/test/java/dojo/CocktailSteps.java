package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String x) {
        order = new Order();
        order.declareOwner(x);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String target) {
        order.declareTarget(target);
    }

    @Then("there are {int} cocktails in the order")
    public void there_are_cocktails_in_the_order(int count) {
        for (int i = 0; i < count; i++) {
            order.addCocktail("Cocktail" + (i + 1)); 
        }
        List<String> cocktails = order.getCocktails();
        assertEquals(count, cocktails.size()); 
    }
}
