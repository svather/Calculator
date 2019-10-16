package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    Button buttonPrecent, buttonSquareRoot, buttonPower2,
            buttonOneVolume, buttonCE, buttonC, buttonDelete, buttonDivide, buttonMultiply,
    buttonSubtract, buttonAdd, buttonChangeSign, buttonDot, buttonEqual;

    Button buttonNumZero, buttonNumOne,buttonNumTwo, buttonNumThree, buttonNumFour, buttonNumFive,
            buttonNumSix, buttonNumSeven,buttonNumEight,buttonNumNine;

    EditText editResult, editText;

    double result1, result2;
    boolean isPrecent, isDivide, isMultiply, isSubstract, isAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNumZero = (Button) findViewById(R.id.buttonNumZero);
        buttonNumOne = (Button) findViewById(R.id.buttonNumOne);
        buttonNumTwo = (Button) findViewById(R.id.buttonNumTwo);
        buttonNumThree = (Button) findViewById(R.id.buttonNumThree);
        buttonNumFour = (Button) findViewById(R.id.buttonNumFour);
        buttonNumFive = (Button) findViewById(R.id.buttonNumFive);
        buttonNumSix = (Button) findViewById(R.id.buttonNumSix);
        buttonNumSeven = (Button) findViewById(R.id.buttonNumSeven);
        buttonNumEight = (Button) findViewById(R.id.buttonNumEight);
        buttonNumNine = (Button) findViewById(R.id.buttonNumNine);

        buttonPrecent = (Button) findViewById(R.id.buttonPrecent);
        buttonSquareRoot = (Button) findViewById(R.id.buttonSquareRoot);
        buttonPower2 = (Button) findViewById(R.id.buttonPower2);
        buttonOneVolume = (Button) findViewById(R.id.buttonOneVolume);
        buttonCE = (Button) findViewById(R.id.buttonCE);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonChangeSign = (Button) findViewById(R.id.buttonChangeSign);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        editResult = (EditText) findViewById(R.id.editResult);
        editText = (EditText) findViewById(R.id.editText);

        buttonNumZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"0");
            }
        });
        buttonNumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"1");
            }
        });
        buttonNumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"2");
            }
        });
        buttonNumThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"3");
            }
        });
        buttonNumFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"4");
            }
        });
        buttonNumFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"5");
            }
        });
        buttonNumSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"6");
            }
        });
        buttonNumSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"7");
            }
        });
        buttonNumEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"8");
            }
        });
        buttonNumNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"9");
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("Enter number");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    isAdd = true;
                    editText.setText(result1 + " + " + "");
                    editResult.setText(null);
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    isSubstract = true;
                    editText.setText(result1 + " - " + "");
                    editResult.setText(null);
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    isMultiply = true;
                    editText.setText(result1 + " * " + "");
                    editResult.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    isDivide = true;
                    editText.setText(result1 + " / " + "");
                    editResult.setText(null);
                }
            }
        });

        buttonPrecent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    isPrecent = true;
                }
            }
        });
        buttonPower2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    editText.setText(result1 + "^2 " + "");
                    editResult.setText(result1 * result1 + "");
                }
            }
        });
        buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    editText.setText(" √(" + result1 + ")");
                    editResult.setText( java.lang.Math.sqrt(result1) + "");
                }
            }
        });
        buttonOneVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    editText.setText(" 1/" + result1 + "");
                    editResult.setText( 1 / result1 + "");
                }
            }
        });
        buttonChangeSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editResult == null){
                    editResult.setText("");
                }else {
                    result1 = Double.parseDouble(editResult.getText() + "");
                    editText.setText(result1 + "*= -1" + "");
                    editResult.setText( (result1 *= -1) + "");
                }
            }
        });
        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editResult.setText("");
                editText.setText("");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText("");
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText().toString().substring(0, editResult.getText().toString().length() - 1));

            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 = Double.parseDouble(editResult.getText() + "");

                if (isPrecent == true){
                    result2 = (result2 * result1) / 100;
                    isPrecent = false;
                }

                if (isAdd == true) {

                    editResult.setText(result1 + result2 + "");
                    editText.setText(result1 + " + " + result2 + " =");
                    isAdd = false;
                }

                if (isSubstract == true){
                    editResult.setText(result1 - result2 +"");
                    editText.setText(result1 + " - " + result2 + " =");
                    isSubstract=false;
                }

                if (isMultiply == true){
                    editResult.setText(result1 * result2 + "");
                    editText.setText(result1 + " * " + result2 + " =");
                    isMultiply=false;
                }

                if (isDivide == true){
                    editResult.setText(result1 / result2+"");
                    editText.setText(result1 + " / " + result2 + " =");
                    isDivide=false;
                }

            }
        });







    }
}
