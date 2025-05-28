package com.mytest.refund;

import io.cucumber.java.en.*;


import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;


public class RefundSteps {
    private boolean ticketUsed;
    private int daysSincePurchase;
    private boolean refundApproved;
    private boolean isPromotional;

    @Given("the ticket has been {string}")
    public void the_ticket_has_been(String usedStatus) {
        ticketUsed = usedStatus.equalsIgnoreCase("used");
    }

    @Given("the ticket was purchased {int} days ago")
    public void the_ticket_was_purchased_days_ago(int days) {
        daysSincePurchase = days;
    }

    @When("the customer requests a refund")
    public void the_customer_requests_a_refund() {
        refundApproved = !ticketUsed && daysSincePurchase <= 30;
    }

    @Then("the refund should be {string}")
    public void the_refund_should_be(String expectedResult) {
        boolean expected = expectedResult.equalsIgnoreCase("approved");
        assertEquals("Refund result mismatch",expected, refundApproved );
    }

    @Given("the ticket has not been used")
    public void the_ticket_has_not_been_used() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }



    @Given("the ticket is a {string} promotional ticket")
    public void the_ticket_is_a_promotional_ticket(String promoStatus) {
        isPromotional = promoStatus.equalsIgnoreCase("promo");
    }

}

