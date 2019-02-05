package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String optr;
    int op1;
    int op2;
    EditText display;
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,cancel,equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         one = (Button) findViewById(R.id.one);
         two = (Button) findViewById(R.id.two);
         three = (Button) findViewById(R.id.three);
       four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
         six = (Button) findViewById(R.id.six);
         seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
         zero = (Button) findViewById(R.id.zero);
         add = (Button) findViewById(R.id.add);
         sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
         div = (Button) findViewById(R.id.div);
         equal = (Button) findViewById(R.id.equal);
         cancel = (Button) findViewById(R.id.cancel);
       display = (EditText) findViewById(R.id.disp);

        try {
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            equal.setOnClickListener(this);
            cancel.setOnClickListener(this);
        }
        catch(Exception e){
        }

    }

    public void operation() {
        if (optr.equals("+")) {
           // if(display.getText().toString().trim().length() <= 0) return;
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 + op2;
            display.setText("Result:"+ Integer.toString(op1));
        }
        else if (optr.equals("-")) {
            //if(display.getText().toString().trim().length() <= 0) return;
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 - op2;
            display.setText("Result:" + Integer.toString(op1));
        }
        else if (optr.equals("*")) {
           // if(display.getText().toString().trim().length() <= 0) return;
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 * op2;
            display.setText("Result:" + Integer.toString(op1));
        }
        else if (optr.equals("/")) {
         //   if(display.getText().toString().trim().length() <= 0) return;
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 / op2;
            display.setText("Result:" + Integer.toString(op1));
        }

    }


    public void onClick(View arg0) {
    Editable str=display.getText();
    switch(arg0.getId())
        {
            case R.id.one:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(one.getText());
                display.setText(str);
                break;

            case R.id.two:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(two.getText());
                display.setText(str);
                break;

            case R.id.three:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(three.getText());
                display.setText(str);
                break;

            case R.id.four:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(four.getText());
                display.setText(str);
                break;
            case R.id.five:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(five.getText());
                display.setText(str);
                break;

            case R.id.six:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(six.getText());
                display.setText(str);
                break;

            case R.id.seven:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(seven.getText());
                display.setText(str);
                break;

            case R.id.eight:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(eight.getText());
                display.setText(str);
                break;

            case R.id.nine:
                if(op2!=0)
                {
                    op2=0;
                    display.setText("");
                }
                str=str.append(nine.getText());
                display.setText(str);
                break;
            case R.id.add:

                optr="+";
                if(op1==0)
                {
                    op1=Integer.parseInt(display.getText().toString());
                    display.setText("");
                }
                else if(op2!=0)
                {
                    op2=0;
                    display.setText("");

                }
                else
                {
                    //if(display.getText().toString().trim().length() <= 0) return;
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 + op2;
                    display.setText("Result:" + Integer.toString(op1));
                }
                break;
            case R.id.sub:
                optr="-";
                if(op1==0)
                {
                    op1=Integer.parseInt(display.getText().toString());
                    display.setText("");
                }
                else if(op2!=0)
                {
                    op2=0;
                    display.setText("");

                }
                else {
                    //if(display.getText().toString().trim().length() <= 0) return;
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 - op2;
                    display.setText("Result:" + Integer.toString(op1));
                }
                break;
            case R.id.mul:
                optr="*";
                if(op1==0)
                {
                    op1=Integer.parseInt(display.getText().toString());
                    display.setText("");
                }
                else if(op2!=0)
                {
                    op2=0;
                    display.setText("");

                }
                else {
                   // if(display.getText().toString().trim().length() <= 0) return;
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 * op2;
                    display.setText("Result:" + Integer.toString(op1));
                }
                break;
            case R.id.div:
                optr="/";
                if(op1==0)
                {
                    op1=Integer.parseInt(display.getText().toString());
                    display.setText("");
                }
                else if(op2!=0)
                {
                    op2=0;
                    display.setText("");

                }
                else {
                   // if(display.getText().toString().trim().length() <= 0) return;
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 / op2;
                    display.setText("Result:" + Integer.toString(op1));
                }
                break;
            case R.id.equal:
                if(!optr.equals(null))
                {
                    if(op2!=0)
                    {
                   //     if(display.getText().toString().trim().length() <= 0) return;
                     if(optr.equals("+"))
                     {
                         display.setText("");

                         display.setText("Result:"+Integer.toString(op1));
                     }
                        else if(optr.equals("-"))
                        {
                            display.setText("");
                          //  op1=op1-op2;
                            display.setText("Result:"+Integer.toString(op1));
                        }
                        else if(optr.equals("*"))
                        {
                            display.setText("");
                           // op1=op1*op2;
                            display.setText("Result:"+Integer.toString(op1));
                        }
                        else if(optr.equals("/"))
                        {
                            display.setText("");
                         //   op1=op1/op2;
                            display.setText("Result:"+Integer.toString(op1));
                        }
                    }
                    else
                    {
                        operation();
                    }
                }
                break;
        }

    }
}