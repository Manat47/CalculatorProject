import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class Calculator ที่เป็นหน้าต่างแสดงผลและทำงานของเครื่องคิดเลข
class Calculator extends JFrame{
    // กำหนด Label, TextField, และ Button ต่างๆ
    JLabel label1,label2,resultLabel;
    JTextField num1,num2;
    JButton addBtn,subBtn,mulBtn,divBtn;

    // Constructor ของ Class Calculator
    Calculator(){
        // กำหนดการปิดหน้าต่างเมื่อปิดโปรแกรม
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // กำหนด Layout ของหน้าต่างเป็น null
        setLayout(null);

        // สร้าง Label และกำหนดค่าต่างๆ
        label1 = new JLabel("General Calculator");
        label1.setFont(new Font("Times new Roman",Font.BOLD,30));
        label1.setForeground(Color.BLUE);
        label1.setBounds(60,10,300,30);
        add(label1);

        // สร้าง TextField สำหรับรับค่าตัวเลข
        num1 = new JTextField(60);
        num2 = new JTextField(60);
        // กำหนดตำแหน่งของ TextField
        num1.setBounds(100,60,120,30);
        num2.setBounds(100,100,120,30);

        // สร้าง Button สำหรับการคำนวณ
        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");

        // กำหนดตำแหน่งของ Button
        addBtn.setBounds(100,140,60,30);
        subBtn.setBounds(160,140,80,30);
        mulBtn.setBounds(100,180,70,30);
        divBtn.setBounds(180,180,70,30);

        // สร้าง Label สำหรับแสดงผลลัพธ์
        resultLabel = new JLabel("");
        resultLabel.setBounds(100,220,200,30);
        add(resultLabel);

        // เพิ่ม Component ต่างๆ เข้าไปในหน้าต่าง
        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(num1);
        add(num2);

        // กำหนด Action Listener สำหรับการคำนวณแต่ละประเภท
        addBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    resultLabel.setText("Result of addition is " + (number1 + number2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter only numbers");
                }
            }
        });

        subBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
         //           resultLabel สำหรับแสดงผลลัพธ์การลบ
                    resultLabel.setText("Result of subtraction is " + (number1 - number2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter only numbers");
                }
            }
        });    mulBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    resultLabel.setText("Result of multiplication is " + (number1 * number2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter only numbers");
                }
            }
        });

        divBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    if(number2 == 0){
                        resultLabel.setText("Cannot divide by zero");
                    }
                    else{
                        resultLabel.setText("Result of division is " + (number1 / number2));
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter only numbers");
                }
            }
        });

        // กำหนดขนาดและตำแหน่งของหน้าต่าง
        setSize(400,300);
    }
}
// Class SimpleCalculator สำหรับเรียกใช้งาน Class Calculator
class SimpleCalculator{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setBounds(400,200,400,300);
        calculator.setVisible(true);
    }
}