package eu.specsolutions.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> operands = new ArrayList<Integer>();

    public int getResult(){
        return operands.get(operands.size() - 1);
    }

    public void enter(int operand){
        operands.add(operand);
    }

    public void add(){
        operands.add(operands.get(operands.size() - 1) + operands.get(operands.size() - 2));
    }
}
