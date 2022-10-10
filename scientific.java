class NumberListener implements ActionListener 
{ 

public void actionPerformed(ActionEvent event) 
{ 

String digit = event.getActionCommand(); 

if (number) 
{ 

textfield.setText(digit); 

number = false; 

}
 else 
{ 

textfield.setText(textfield.getText() + digit); 

} 

} 

} 

public class CalculatorOp 
{ 

private int total; 

public CalculatorOp() 
{ 

total = 0; 

} 

public String getTotalString() { 

return ""+total; 

} 

public void setTotal(String n) 
{ 

total = convertToNumber(n); 

} 

public void add(String n) 
{ 

total += convertToNumber(n); 

} 

public void subtract(String n)
 { 

total -= convertToNumber(n); 

} 

public void multiply(String n) 
{ 

total *= convertToNumber(n); 

} 

public void divide(String n) 
{ 

total /= convertToNumber(n); 

} 

private int convertToNumber(String n)
 { 

return Integer.parseInt(n); 

} 

} 

} 