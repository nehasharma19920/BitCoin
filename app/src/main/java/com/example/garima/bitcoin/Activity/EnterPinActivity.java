package com.example.garima.bitcoin.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.garima.bitcoin.R;

public class EnterPinActivity extends BaseActivity {
    private EditText pinBox0;
    private EditText pinBox1;
    private EditText pinBox2;
    private EditText pinBox3;
    private EditText[] pinBoxArray;
    private TextView statusView;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private ImageButton buttonDeleteBack;
    private ImageView pinDescTV;
    private TextView enterPinTV;
    private String userEntered;
    private String userEnteredPin;
    private String userMobileNumber;

    @Override
    protected void initViews() {
        settingTitle(getString(R.string.enter_pin));
        userEntered = "";
        pinBox0 = (EditText) findViewById(R.id.pinBox0);
        pinBox1 = (EditText) findViewById(R.id.pinBox1);
        pinBox2 = (EditText) findViewById(R.id.pinBox2);
        pinBox3 = (EditText) findViewById(R.id.pinBox3);
        pinBoxArray = new EditText[PIN_LENGTH];
        pinBoxArray[0] = pinBox0;
        pinBoxArray[1] = pinBox1;
        pinBoxArray[2] = pinBox2;
        pinBoxArray[3] = pinBox3;
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDeleteBack = (ImageButton) findViewById(R.id.buttonDeleteBack);
        statusView = (TextView) findViewById(R.id.statusMessage);
        enterPinTV = (TextView) findViewById(R.id.enterPinTV);
        pinDescTV = (ImageView) findViewById(R.id.pinDescTV);

    }

    @Override
    protected void initContext() {
        context = EnterPinActivity.this;
        currentActivity = EnterPinActivity.this;

    }

    @Override
    protected void initListners() {

    }

    @Override
    protected boolean isActionBar() {
        return true;
    }

    @Override
    protected boolean isHomeButton() {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_pin);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onAlertClicked(int alertType) {

    }
}
