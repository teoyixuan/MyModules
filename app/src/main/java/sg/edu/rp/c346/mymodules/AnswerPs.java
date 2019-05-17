package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerPs extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_ps);

        tv = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("Module Code:");
        String value1 = intentReceived.getStringExtra("Module Name:");
        String value2 = intentReceived.getStringExtra("Academic Year:");
        String value3 = intentReceived.getStringExtra("Semester:");
        String value4 = intentReceived.getStringExtra("Module Credit:");
        String value5 = intentReceived.getStringExtra("Venue:");

        if(value.equalsIgnoreCase("c346")){
            tv.setText("Module Code: " + value + "\nModule Name: " + value1 + "\nAcademic Year: " +value2 + "\nSemester: " + value3 + "\nModule Credit: " + value4 + "\nVenue: " + value5);
        }
        else{
            tv.setText("Module Code: " + value + "\nModule Name: " + value1 + "\nAcademic Year: " +value2 + "\nSemester: " + value3 + "\nModule Credit: " + value4 + "\nVenue: " + value5);
        }
    }
}
