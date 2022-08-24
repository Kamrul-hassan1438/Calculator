package Calcu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener {


    JFrame frame= new JFrame("Calculator");
    JPanel p1= new JPanel();
    JPanel p2= new JPanel();
    JPanel p3= new JPanel();
    JPanel p4= new JPanel();
    JPanel p5 = new JPanel();
    JPanel p6= new JPanel();
    JTextArea text = new JTextArea();
    JButton b1= new JButton("0");
    JButton b2= new JButton("1");
    JButton b3= new JButton("2");
    JButton b4= new JButton("3");
    JButton b5= new JButton("4");
    JButton b6= new JButton("5");
    JButton b7= new JButton("6");
    JButton b8= new JButton("7");
    JButton b9= new JButton("8");
    JButton b10= new JButton("9");
    JButton b11= new JButton("+");
    JButton b12= new JButton("-");
    JButton b13= new JButton("*");
    JButton b14= new JButton("/");
    JButton b15= new JButton("=");
    JButton b16= new JButton("AC");
    JButton b17= new JButton("Ans");
    JButton b18= new JButton("DEL");
    JButton b19= new JButton(".");
    JButton pi= new JButton("兀");

    JButton sin= new JButton("Sin");
    JButton cos= new JButton("Cos");
    JButton tan= new JButton("Tan");
    JButton ln= new JButton("ln");
    JButton X_pow= new JButton("X^n");
    JButton X_square= new JButton("X^2");
    JButton root= new JButton("√ ");
    JButton b20= new JButton("(");
    JButton b21= new JButton(")");


    public int Value1,Value2,Index;
    public double d_value1,d_value2 ,D_ANS;
    public int si=0,co=0,ta=0,LN=0,PI=0,pow1=0,pow2=0, ro=0;

    public Calculator(int width,int height) {
        try {
        frame.setSize(width, height);
        p1.setLayout(new GridLayout(3, 1));
        p3.setLayout(new GridLayout(4, 5));
        p2.setLayout(new GridLayout(3, 3));
        p4.setLayout(new GridLayout(3, 1));
        p5.setBackground(Color.LIGHT_GRAY);
        p6.setBackground(Color.LIGHT_GRAY);

        p4.add(p5);
        p4.add(text);
        p4.add(p6);

        p2.add(root);
        p2.add(X_square);
        p2.add(X_pow);

        p2.add(sin);
        p2.add(cos);
        p2.add(tan);

        p2.add(b20);
        p2.add(b21);
        p2.add(ln);


        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        p3.add(b18);
        p3.add(b16);

        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b13);
        p3.add(b14);

        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b11);
        p3.add(b12);

        p3.add(b1);
        p3.add(b19);
        p3.add(pi);
        p3.add(b17);
        p3.add(b15);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        pi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String val = text.getText();
                PI = val.length();
                if (PI == 0) {
                    text.setText("3.1416");
                } else {
                    text.setText(val + "兀");
                }

            }
        });


        sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                si = 1;
                text.setText("Sin");

            }
        });
        cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                co = 1;
                text.setText("Cos");

            }
        });
        tan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta = 1;
                text.setText("Tan");

            }
        });
        ln.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LN = 1;
                text.setText("ln");

            }
        });
        X_pow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String val = text.getText();
                pow1 = val.length();
                text.setText(val);

            }
        });
        X_square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String val = text.getText();
                pow2 = val.length();
                text.setText(val);

            }
        });
        root.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ro = 1;
                char ROOT = '√';
                text.setText(ROOT + "");

            }
        });
        b20.addActionListener(this);
        b21.addActionListener(this);


        p1.add(p4);
        p1.add(p2);
        p1.add(p3);
        frame.add(p1);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
        catch (Exception e)
        {
            text.setText("");
        }
    }
    public void actionPerformed(ActionEvent e) {
        String val= text.getText();
        if(e.getSource()==b1) {
            int val1 = 0;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b2)
        {
            int val1 = 1;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b3)
        {
            int val1 = 2;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b4)
        {
            int val1 = 3;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b5)
        {
            int val1 = 4;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b6)
        {
            int val1 = 5;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b7)
        {
            int val1 = 6;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b8)
        {
            int val1 = 7;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b9)
        {
            int val1 = 8;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b10)
        {
            int val1 = 9;
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b11)
        {
            char val1 = '+';
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b12)
        {
            char val1 = '-';
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b13)
        {
            char val1 = '*';
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b14)
        {
            char val1 = '/';
            text.setText(val + val1 + "");
        }
        else if (e.getSource()==b15)
        {
            String temp,temp1;
            char[] ch= val.toCharArray();
            int x=0,setValue=0,setValue1=0;
           for(int i=0; i<val.length(); i++)
            {
                if(si==1){
                    int c=0;
                    double a,b;
                    int k=val.length()-3;
                    char [] ch2= new char[k+1];
                    for (int j=3; j<val.length(); j++)
                    {
                        ch2[c]=ch[j];
                        c++;
                    }
                    temp=String.valueOf(ch2);
                    a=Math.toRadians(Double.parseDouble(temp));
                    b=Math.sin(a);
                    text.setText(val+"="+b+"");
                    D_ANS=b;
                    si=0;
                }

               else if(co==1){
                    int c=0;
                    double a,b;
                    int k=val.length()-3;
                    char [] ch2= new char[k+1];
                    for (int j=3; j<val.length(); j++)
                    {
                        ch2[c]=ch[j];
                        c++;
                    }
                    temp=String.valueOf(ch2);
                    a=Math.toRadians(Double.parseDouble(temp));
                    b=Math.cos(a);
                    text.setText(val+"="+b+"");
                    D_ANS=b;
                    co=0;
                }

                else if(ta==1){
                    int c=0;
                    double a,b;
                    int k=val.length()-3;
                    char [] ch2= new char[k+1];
                    for (int j=3; j<val.length(); j++)
                    {
                        ch2[c]=ch[j];
                        c++;
                    }
                    temp=String.valueOf(ch2);
                    a=Math.toRadians(Double.parseDouble(temp));
                    b=Math.tan(a);
                    text.setText(val+"="+b+"");
                    D_ANS=b;
                    ta=0;
                }
                else if(LN==1){
                    int c=0;
                    double a,b;
                    int k=val.length()-3;
                    char [] ch2= new char[k+1];
                    for (int j=3; j<val.length(); j++)
                    {
                        ch2[c]=ch[j];
                        c++;
                    }
                    temp=String.valueOf(ch2);
                    a=Double.parseDouble(temp);
                    b=Math.log(a);
                    text.setText(val+"="+b+"");
                    D_ANS=b;
                    LN=0;
                }

                else if(pow1>0){

                    int c=0;
                    double a,ans=1;
                    int b;
                    int k=val.length()-pow1;
                    char [] ch2= new char[pow1];
                    char[] ch3=new char[k];
                    for (int j=0; j<pow1; j++)
                    {
                        ch2[j]=ch[j];
                    }
                    temp=String.valueOf(ch2);
                    a=Double.parseDouble(temp);
                    for (int j=pow1; j<val.length(); j++)
                    {
                        ch3[c]=ch[j];
                        c++;
                    }
                    temp1=String.valueOf(ch3);
                    b=Integer.parseInt(temp1);
                    for (int f=1; f<=b; f++)
                    {
                        ans*=a;
                    }
                    text.setText(val+"="+ans+"");
                    D_ANS=ans;
                    pow1=0;
                }

                else if(pow2>0){

                    int c=0;
                    double a,ans=1;
                    int b;
                    char [] ch2= new char[pow2];
                    for (int j=0; j<pow2; j++)
                    {
                        ch2[j]=ch[j];
                    }
                    temp=String.valueOf(ch2);
                    a=Double.parseDouble(temp);
                    b=2;
                    for (int f=1; f<=b; f++)
                    {
                        ans*=a;
                    }
                    text.setText(val+"="+ans+"");
                    D_ANS=ans;
                    pow2=0;
                }

                else if(ro==1){
                    int c=0;
                    double a,b;
                    int k=val.length()-1;
                    char [] ch2= new char[k+1];
                    for (int j=1; j<val.length(); j++)
                    {
                        ch2[c]=ch[j];
                        c++;
                    }
                    temp=String.valueOf(ch2);
                    a=Double.parseDouble(temp);
                    if(a>0){
                    b=Math.sqrt(a);
                    text.setText(val+"="+b+"");
                    D_ANS=b;}
                    ro=0;
                }
                else if(PI>0){
                    int c=0;
                    double a,b;
                    char [] ch2= new char[PI];
                    for (int j=0; j<PI; j++)
                    {
                        ch2[j]=ch[j];
                    }
                    temp=String.valueOf(ch2);
                    a=Double.parseDouble(temp);
                    b=(a*3.1416);
                    text.setText(val+"="+b+"");
                    D_ANS=b;
                    PI=0;
                }

                else {
                    if (ch[i]=='+' || ch[i]=='-'|| ch[i]=='*' || ch[i]=='/')
                {
                    for(int y=0; y<i; y++)
                    {
                        if(ch[y]=='.')
                        {
                            setValue=1;
                            double a,b;
                            int k=val.length()-(i+1);
                            char [] ch2= new char[i];
                            char[] ch3=new char[k];
                            for (int j=0; j<i; j++)
                            {
                                ch2[j]=ch[j];
                            }
                            temp=String.valueOf(ch2);
                            a=Double.parseDouble(temp);
                            for (int j=i+1; j<val.length(); j++)
                            {
                                ch3[x]=ch[j];
                                x++;
                            }
                            temp1=String.valueOf(ch3);
                            b=Double.parseDouble(temp1);
                            setValue(a,b);
                            setIndex(i);
                        }

                    }
                    if(setValue==0)
                    {
                        int a,b;
                        int k=val.length()-(i+1);
                        char [] ch2= new char[i];
                        char[] ch3=new char[k];
                        for (int j=0; j<i; j++)
                        {
                            ch2[j]=ch[j];
                        }
                        //Char to String
                        temp=String.valueOf(ch2);
                        a=Integer.parseInt(temp);

                        for (int j=i+1; j<val.length(); j++)
                        {
                            ch3[x]=ch[j];
                            x++;
                            if(ch[j]=='.'){
                                setValue1=1;
                            }
                        }
                        temp1=String.valueOf(ch3);
                        if(setValue1==1)
                        {
                            d_value2=Double.parseDouble(temp1);
                            setIndex(i);
                            setValue_a(a);
                        }
                        else {
                            b=Integer.parseInt(temp1);
                            setValue(a,b);
                            setIndex(i);
                        }


                    }


                }}

            }
            int i=getIndex();


            if(ch[i]=='+')
            {
                if(setValue==1)
                {
                    double a=d_value1;
                    double b=d_value2;
                    double sum=a+b;
                    D_ANS=sum;
                    text.setText(val+"="+sum);
                }
                else if(setValue==0 && setValue1==1)
                {
                    int a=getValue_a();
                    double b=d_value2;
                    double sum=(double) a+b;
                    D_ANS=sum;
                    text.setText(val+"="+sum);
                }
                else {
                    int a=getValue_a();
                    int b=getValue_b();
                    int sum = a + b;
                    D_ANS=sum;
                    text.setText(val + "=" + sum);
                }

            }
            else if(ch[i]=='-')
            {
                if(setValue==1)
                {
                    double a=d_value1;
                    double b=d_value2;
                    double subtraction=a-b;
                    D_ANS=subtraction;
                    text.setText(val+"="+subtraction);
                }
                else if(setValue==0 && setValue1==1)
                {
                    int a=getValue_a();
                    double b=d_value2;
                    double subtraction=a-b;
                    D_ANS=subtraction;
                    text.setText(val+"="+subtraction);
                }
                else {
                    int a=getValue_a();
                    int b=getValue_b();
                    int subtraction=a-b;
                    D_ANS=subtraction;
                    text.setText(val+"="+subtraction);
                }

            }
            else if(ch[i]=='*')
            {
                if(setValue==1)
                {
                    double a=d_value1;
                    double b=d_value2;
                    double Multi=a*b;
                    D_ANS=Multi;
                    text.setText(val+"="+Multi);
                }
                else if(setValue==0 && setValue1==1)
                {
                    int a=getValue_a();
                    double b=d_value2;
                    double Multi=a*b;
                    D_ANS=Multi;
                    text.setText(val+"="+Multi);
                }
                else {
                    int a=getValue_a();
                    int b=getValue_b();
                    int Multi=a*b;
                    D_ANS=Multi;
                    text.setText(val+"="+Multi);
                }

            }
            else if(ch[i]=='/')
            {
                if(setValue==1)
                {
                    double a=d_value1;
                    double b=d_value2;
                    double Div=a/b;
                    D_ANS=Div;
                    text.setText(val+"="+Div);
                }
                else if(setValue==0 && setValue1==1)
                {
                    int a=getValue_a();
                    double b=d_value2;
                    double Div=a/b;
                    D_ANS=Div;
                    text.setText(val+"="+Div);
                }
                else {
                    int a=getValue_a();
                    int b=getValue_b();
                    float Div=(float) a/b;
                    D_ANS=Div;
                    text.setText(val+"="+Div);
                }

            }

        }

        else if (e.getSource()==b16)
        {
            text.setText("");
        }
        else if (e.getSource()==b17)
        {
            text.setText(D_ANS+"");
        }
        else if (e.getSource()==b18)
        {
            char[] ch= val.toCharArray();
            int value= val.length()-1;
            char []ch2= new char[value];
            for (int i=0; i<value;i++)
            {
                ch2[i]=ch[i];
            }
            String temp=String.valueOf(ch2);
            text.setText(temp);
        }

        else if (e.getSource()==b19)
        {
            char x='.';
            text.setText(val+x+"");
        }

    }

    public void setValue(int x ,int y)
    {
        Value1=x;
        Value2=y;
    }
    public void setValue_a(int x)
    {
        Value1=x;
    }

    public void setValue(double x ,double y)
    {
        d_value1=x;
        d_value2=y;
    }
    public int getValue_a()
    {
        return Value1;
    }
    public int getValue_b()
    {
        return Value2;
    }

    public void  setIndex(int i)
    {
        Index=i;
    }
    public int getIndex()
    {
        return Index;
    }
    public  static void main(String [] args)
    {
            Calculator Cal = new Calculator(320,450);

    }

}

