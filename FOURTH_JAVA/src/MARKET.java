import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.HashMap;

import javax.swing.*;

import java.awt.GridLayout;

public class MARKET implements ActionListener {

JFrame f1=new JFrame("CUSTOMER INFORMATION");

JLabel label1= new JLabel("Customer Phone ");

JTextField phone=new JTextField(10);

JLabel label2= new JLabel("Enter customer id");

JTextField cid=new JTextField(10);

JButton check=new JButton("Check cid ");

JLabel label3= new JLabel("#1 APPLE 150rs/Kg #2 Mango 200rs/kg #3 Orange 80rs/kg");

JLabel label4= new JLabel("Enter item Number you to purchase ");

JTextField item_id= new JTextField(5);

JButton submit=new JButton("submit");

JButton print=new JButton("print_bill");

JTextField am=new JTextField(100);

HashMap<String,Integer> hm=new HashMap<String,Integer>();

HashMap<Integer,Double> item= new HashMap<Integer,Double>();

double kg;

double price;

double discount;

double amount;

void add_cid()

{

hm.put("9741278570",121);

hm.put("9900726035",122);

hm.put("9900001111",123);

}

void add_item()

{

item.put(1,150.0);

item.put(2,200.0);

item.put(3,80.0);

//item.put(3,200.0);)

//hm.put("BANANA",40);

}

MARKET()

{

String uname=JOptionPane.showInputDialog(null,"Enter USERNAME=");

String psw=JOptionPane.showInputDialog(null,"Enter PASSWORD=");

add_cid();

add_item();

if(uname.equals("msrit123")&& psw.equals("ise123"))

{

JOptionPane.showMessageDialog(null, "LOGIN VALID");

f1.setSize(500,500);

f1.setVisible(true);

f1.setLayout(new FlowLayout());

f1.add(label1);

f1.add(phone);

f1.add(check);

f1.add(label2);

f1.add(cid);

f1.add(label3);

f1.add(label4);

f1.add(item_id);

f1.add(submit);

submit.addActionListener(this);

f1.add(print);

print.addActionListener(this);

f1.add(am);

check.addActionListener(this);

}

else

{

JOptionPane.showMessageDialog(null, "LOGIN INVALID");

}

}

public static void main(String[] args) {

   new MARKET();

}

@Override

public void actionPerformed(ActionEvent e)

{

if(e.getSource()==check)

{

String p1=phone.getText();

if(hm.containsKey(p1))

{

JOptionPane.showMessageDialog(null, "YOUR OLD CUSTEMER ID"+hm.get(p1));

cid.setText(Integer.toString(hm.get(p1)));

}

else

{

hm.put(p1,124);

JOptionPane.showMessageDialog(null, "NEW CUSTOMER new id="+"124");

cid.setText(Integer.toString(hm.get(p1)));

}

}

else if(e.getSource()==submit)

{

price=item.get(Integer.parseInt(item_id.getText()));

String kg1=JOptionPane.showInputDialog(null, "Item No= "+item_id.getText()+" Price per kg="+price+" Enter quantity=");

kg=Double.parseDouble(kg1);

String temp=JOptionPane.showInputDialog(null, "Enter Discount 10% to 30%");

discount=Double.parseDouble(temp);

amount=price*kg*(1-discount/100);

//

}

else

{

price=item.get(Integer.parseInt(item_id.getText()));

JOptionPane.showMessageDialog(null, "Item Id="+item_id.getText()+"\t per kg price"+price+"\t Quantity="+kg+"\t discount %="+discount+" final bill="+amount);

am.setText("Item Id="+item_id.getText()+" per kg price"+price+" Quantity="+kg+" discount %="+discount+" final bill="+amount);

}

}

}