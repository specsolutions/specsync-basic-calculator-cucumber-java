package eu.specsolutions.calculator.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eu.specsolutions.calculator.Calculator;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private Calculator calculator = new Calculator();

    @Given("I have entered {int} into the calculator")
    public void iHaveEnteredIntoTheCalculator(int operand)
    {
        calculator.enter(operand);
    }

    @When("I choose add")
    public void iChooseAdd() {
        calculator.add();
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedResult) {
        assertEquals(expectedResult, calculator.getResult());
    }

    @Given("I have entered the following numbers")
    public void iHaveEnteredTheFollowingNumbers(List<Map<String, String>> operandsList) {
        for (int i = 0; i < operandsList.size(); i++) {
            Map<String, String> operandRow = operandsList.get(i);
            calculator.enter(Integer.parseInt(operandRow.get("number")));
        }
    }
}
