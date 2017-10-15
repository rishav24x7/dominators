package vishwajeet.example.com.hospitaldir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textView = (TextView) findViewById(R.id.text);
    }

    public void xyz (View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("BLOOD BANK")) {
            Intent a = new Intent(this, Bloodbank2.class);
            startActivity(a);
        }
        else if (button_text.equals("HOSPITALS")) {
            Intent b = new Intent(this, MainActivity0.class);
            startActivity(b);
        }
        else if (button_text.equals("SURVEY REPORTS")) {
            Intent C = new Intent(this, SurveyActivity.class);
            startActivity(C);
        }
    }
}