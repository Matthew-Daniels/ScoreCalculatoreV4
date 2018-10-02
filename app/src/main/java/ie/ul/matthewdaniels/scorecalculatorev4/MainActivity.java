package ie.ul.matthewdaniels.scorecalculatorev4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//reference the colour fix buttons
        Button fix3Button = (Button) findViewById(R.id.fix3Button);
        Button fix2Button = (Button) findViewById(R.id.fix2Button);
        Button fix1Button = (Button) findViewById(R.id.fix1Button);
        Button fix0Button = (Button) findViewById(R.id.fix0Button);

//reference the colour points output
        final TextView pointsOut = (TextView) findViewById(R.id.colourPointsOut);

//reference the distance inputs
        final EditText dist1 =(EditText)findViewById(R.id.nearBallPointsInput);
        final EditText dist2=(EditText)findViewById(R.id.farBallInput);
        final EditText dist3=(EditText)findViewById(R.id.robotHomeInput);

//reference the distance score output
        final TextView Result1=(TextView)findViewById(R.id.nearBallPointsOutput);
        final TextView Result2=(TextView)findViewById(R.id.farBallPointsOutput);
        final TextView Result3=(TextView)findViewById(R.id.robotHomePointsOutput);

//reference the update button
        Button updateButton= (Button)findViewById(R.id.update);

//reference the white/black buttons
        Button wbFail = (Button)findViewById(R.id.wbFail);
        Button wbSuccess = (Button)findViewById(R.id.wbSuccess);

// reference the points output for wb score
        final TextView whiteBlackPointsOutput = (TextView) findViewById(R.id.whiteBlackPointsOutput);

//method to generate wb success score output
        wbSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whiteBlackPointsOutput.setText("100 Points");

            }
        });

  //method to generate 0 score output from wb failure
        wbFail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whiteBlackPointsOutput.setText("0 Points");
       }});


// method to generate distance score outputs

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(dist1.getText().toString());
                Result1.setText("Points is "+num1);

                int num2= Integer.parseInt(dist2.getText().toString());
                Result2.setText("Points is "+num2);

                int num3= Integer.parseInt(dist3.getText().toString());
                Result3.setText("Points is "+num3);
            }
        });


// methods to generate output for colour fix scores

        fix0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsOut.setText("100 Points");

            }
        });

        fix1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsOut.setText("75 Points");

            }
        });

        fix2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsOut.setText("50 Points");

            }
        });

        fix3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsOut.setText("25 Points");

            }
        });

    }








}//end class MainActivity
