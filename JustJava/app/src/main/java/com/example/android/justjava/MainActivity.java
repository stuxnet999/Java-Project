package com.example.android.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity 
{

    int quantity=2 ;
    boolean hasWippedCream = false;
    boolean hasChocolate = false;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decrement(View view) 
    {
        if(quantity>1) 
        {
            quantity--;
        }
        else 
        {

             Toast.makeText(getApplicationContext(), "You cannot have less than one cup of coffee", Toast.LENGTH_SHORT).show();
        }
        display(quantity);

    }

    public void increment(View view) 
    {
        if(quantity < 100)
            quantity++;
        else
        {

            Toast.makeText(getApplicationContext(), "You cannot have more than 100 cup of coffee", Toast.LENGTH_SHORT).show();

        }
        display(quantity);
    }

    public void onClickBox1(View view) 
    {

        CheckBox newbox = (CheckBox) findViewById(R.id.wippedCream);
        hasWippedCream = newbox.isChecked();

    }
    public void onClickBox2(View view) 
    {

        CheckBox newCheck = findViewById(R.id.chocolate);
        hasChocolate = newCheck.isChecked();

    }

    public void submitOrder(View view) 
    {
        String name= editName();

        String message ="Name: " + name;
        message+= "\nQuantity : " + quantity ;
        message+="\nWipped Creame ?  "+ hasWippedCream;
        message+= "\nChocolate? "+ hasChocolate;
        message+="\nTotal: $" + calcPrice() ;
        message+="\nThankyou!";


        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_SUBJECT, "Coffee order");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("text/plain");

        if(intent.resolveActivity(getPackageManager())!=null) 
        {
            startActivity(intent);
        }
    }

     private int calcPrice() 
     {

        int price = quantity *5;
        if (hasChocolate == true)
            price += 2*quantity;
        if(hasWippedCream == true)
            price += 1*quantity;

        return price;

    }

    private void display(int number) 
    {
        TextView newText = (TextView) findViewById(R.id.quantity_text_view);
        newText.setText(String.valueOf(number));
    }

/*    private void displayMessage(String message) {
        TextView newText = (TextView) findViewById(R.id.price_text_view);
        newText.setText(message);
    }
*/
    public String editName() 
    {
        EditText newText = (EditText) findViewById(R.id.editted);
        str = newText.getText().toString();
        return str;
    }

}

