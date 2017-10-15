package vishwajeet.example.com.hospitaldir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class SurveyActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        textView = (TextView) findViewById(R.id.text);
    }

    public void pqr (View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("DISTRICT LEVEL HOUSEHOLD AND FACILITY")) {
            Intent a = new Intent(this, DLHF.class);
            startActivity(a);
        } else if (button_text.equals("NATIONAL FAMILY HEALTH SURVEY")) {
            Intent b = new Intent(this, NFHS.class);
            startActivity(b);
        } else if (button_text.equals("ANNUAL HEALTH SURVEY")) {
            Intent C = new Intent(this, AHS.class);
            startActivity(C);
        }
    }
}
