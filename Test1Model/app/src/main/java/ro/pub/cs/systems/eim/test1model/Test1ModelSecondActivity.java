package ro.pub.cs.systems.eim.test1model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test1ModelSecondActivity extends AppCompatActivity {

    private TextView numberOfClicksTextView;
    private Button okButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_test1_second);

        numberOfClicksTextView = (TextView) findViewById(R.id.number_of_clicks_text_view);
        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey(Constants.NUMBER_OF_CLICKS)) {
            int numberOfClicks = intent.getIntExtra(Constants.NUMBER_OF_CLICKS, -1);
            numberOfClicksTextView.setText(String.valueOf(numberOfClicks));
        }
        okButton = (Button)findViewById(R.id.ok_button);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_OK, null);
                finish();
            }
        });

        cancelButton = (Button)findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED, null);
                finish();
            }
        });
    }
}