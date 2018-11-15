package ba.unsa.etf.rpr.tutorijal05;
import javafx.beans.property.SimpleStringProperty;

import javafx.event.ActionEvent;

public class Controller {
    private  double operand1;
    private  double operand2;
    private SimpleStringProperty result;
    private  String operator = "=";
    public Controller(){
        result=new SimpleStringProperty();
        result.set("0");
    }
    public SimpleStringProperty resultProperty(){
        return result;
    }
    public String getResult(){
        return result.get();
    }
    private double getNumber(String str){
        return  Double.parseDouble(str);
    }
    public void number(String str){
        if(result.get().equals("0")) result.set("");
        result.set(getResult()+str);
    }
    private void operation(String str){
        if(str.equals("=")){
            operand2=getNumber(result.get());
            if(operator.equals("+")) {
                double result1 = operand1 + operand2;
                result.set("" + result1);
            }
            else if(operator.equals("-")) {
                double result2 = operand1 - operand2;
                result.set("" + result2);
            }
            else if(operator.equals("x")) {
                double result3 = operand1 * operand2;
                result.set("" + result3);
            }
            else if(operator.equals("/")) {
                double result4 = operand1 / operand2;
                result.set("" + result4);
            }
            else if(operator.equals("%")){
                    double result5 = operand1 % operand2;
                    result.set("" + result5);
            }
            operand1=0;
            operand2=0;
        } else {
            operand1=getNumber(getResult());
            result.set("");
            operator=str;
        }
    }
    public void point(ActionEvent actionEvent){
        number(".");
    }
    public void button0(ActionEvent actionEvent){
        number("0");
    }
    public void button1(ActionEvent actionEvent){
        number("1");
    }
    public void button2(ActionEvent actionEvent){
        number("2");
    }
    public void button3(ActionEvent actionEvent){
        number("3");
    }
    public void button4(ActionEvent actionEvent){
        number("4");
    }
    public void button5(ActionEvent actionEvent){
        number("5");
    }
    public void button6(ActionEvent actionEvent){
        number("6");
    }
    public void button7(ActionEvent actionEvent){
        number("7");
    }
    public void button8(ActionEvent actionEvent){
        number("8");
    }
    public void button9(ActionEvent actionEvent){
        number("9");
    }
    public void equals (ActionEvent actionEvent){
        operation("=");
    }
    public void add (ActionEvent actionEvent){
        operation("+");
    }
    public void sub(ActionEvent actionEvent){
        operation("-");
    }
    public void mul (ActionEvent actionEvent){
        operation("x");
    }
    public void div (ActionEvent actionEvent){
        operation("/");
    }
    public void mod (ActionEvent actionEvent){
        operation("%");
    }
}
