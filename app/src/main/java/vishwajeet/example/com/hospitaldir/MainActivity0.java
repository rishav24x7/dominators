package vishwajeet.example.com.hospitaldir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity0 extends AppCompatActivity {
      TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main0);
         textView= (TextView) findViewById(R.id.text);

    }
    public void abc (View View)
    {
        String button_text;
        button_text=((Button)View).getText().toString();
        if(button_text.equals("Yes")){
            Intent i = new Intent(this, MapsActivity.class);
            startActivity(i);
        }
        else if(button_text.equals("No")) {
            Intent No = new Intent(this, MainActivity.class);
            startActivity(No);
        }
    }

}
