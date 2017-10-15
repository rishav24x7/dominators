package vishwajeet.example.com.hospitaldir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        OnItemSelectedListener{
    Spinner s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (Spinner)findViewById(R.id.spinner2);
        s2 = (Spinner)findViewById(R.id.spinner3);
        s1.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        String sp1= String.valueOf(s1.getSelectedItem());

        if(sp1.contentEquals("Current Location")) {
            Intent i = new Intent(this, MapsActivity.class);
            startActivity(i);
        }

        if(sp1.contentEquals("Andaman and nicobar")){
            List<String> list = new ArrayList<String>();
            list.add("Chakraborty Multi Speciality Hospital	");
            list.add("Inhs Dhanvantri");
            list.add("Maricar Hospital");
            list.add("Pillar Health Centre");
            list.add("G B Pant Hospital, Port Blair	");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Andhra Pradesh")){
            List<String> list = new ArrayList<String>();
            list.add("Care Hospital, Banjara	");
            list.add("Aasha Hospitals	");
            list.add("Abhaya Kidney Care Multispeciality Hospital	");
            list.add("Baby Hospital	");
            list.add("Dr Akbar Eye Hospital And Laser Centre	");
            list.add("Dr.Ysr Memorial Hospitals	");
            list.add("Hrudaya Children Hospital	");
            list.add("Jeevana Jyothi Hospitals Ltd.,	");
            list.add("K K Nursing Home	");
            list.add("Meda Nursing Home	");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);

        }


        if(sp1.contentEquals("Bihar")){
            List<String> list = new ArrayList<String>();
            list.add("All India Institute of Medical Sciences (AIIMS), Patna	");
            list.add("Patna Medical College and Hospital	");
            list.add("Nalanda Medical College and Hospital	");
            list.add("Indira Gandhi Institute of Medical Sciences	");
            list.add("Rajendra Memorial Research Institute of Medical Sciences	");
            list.add("Paras HMRI Hospital	");
            list.add("Ford Hospital	");
            list.add("Kurji Holy Family Hospital	");
            list.add("Rajeshwar Hospital	");
            list.add("Jagdish Memorial Hospital	");
            list.add("Sahyog Hospital	");
            list.add("Dr.Ruban Memorial Hospital	");
            list.add("Dr. Bimal Hospital and Research Center	");
            list.add("Ishwar Dayal Memorial Hospital	");
            list.add("Magadh Hospital	");
            list.add("Arvind Hospital	");
            list.add("Advanced Eye Care	");
            list.add("Advanced Neuro Diagnostic Centre	");
            list.add("Akshat Seva Sadan	");
            list.add("Anami Orthopaedics	");
            list.add("Brindavan Nursing Home	");
            list.add("Chand Memorial Hospital	");
            list.add("Chaupal Hospital Pvt Ltd	");
            list.add("Chikitsa Nursing Home	");
            list.add("Child Hospital	");
            list.add("Childrens Hospital	");
            list.add("Cns Sanjeevani Centre For Neurosurgery Pvt Ltd	");
            list.add("D N Singh Memorial Trust	");
            list.add("Dr Ruban Memorial Hospital And Ratan Stone Clinic	");
            list.add("Dr. Sarojini Sinha Memorial Shiv-Shakti Hospital	");
            list.add("Hai Medicare and Research Institute	");
            list.add("Harsh Clinic	");
            list.add("Jeevak Shalya Nilayam	");
            list.add("Jyoti Punj Hospital	");
            list.add("K. B. Surgical Clinic	");
            list.add("Keshav Hospital Pvt Ltd	");
            list.add("L.B.Aparajita Hospital	");
            list.add("Laxmi Nursing Home Pvt. Ltd	");
            list.add("Mahavir Vaatsalya Aspatal	");
            list.add("Manav Orthopaedic Clinic And Maternity Home	");
            list.add("Max Care Hospital And Research Institute Pvt. Ltd.	");
            list.add("Neeti Nursing Home	");
            list.add("Ortho Care Centre and Nursing Home	");
            list.add("Orthopadic Center	");
            list.add("P.K.Nursing Home Awam Maternity Centre	");
            list.add("Patliputra Netradham Eye Hospital	");
            list.add("Sanjeevani Eye Hospital and Research Institute	");
            list.add("Sheila Urology Centre	");
            list.add("Sparsh Haritage Hospital	");
            list.add("Tara Hospital and Medical Research Centre Pvt Ltd	");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();




    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}
