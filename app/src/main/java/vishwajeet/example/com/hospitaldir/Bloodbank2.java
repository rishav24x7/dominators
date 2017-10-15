package vishwajeet.example.com.hospitaldir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Bloodbank2 extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    Spinner s1,s2;



        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank2);
        s1 = (Spinner) findViewById(R.id.spinner4);
            s2 = (Spinner)findViewById(R.id.spinner5);
        s1.setOnItemSelectedListener(this);
    }
        @Override
        public void onItemSelected (AdapterView < ? > arg0, View arg1,int arg2,
        long arg3){
        // TODO Auto-generated method stub
        String sp1 = String.valueOf(s1.getSelectedItem());

        if (sp1.contentEquals("Current Location")) {
            Intent i = new Intent(this, Mapactibb.class);
            startActivity(i);
        }

        if (sp1.contentEquals("Bihar")) {
            List<String> list = new ArrayList<String>();
            list.add("Maa Vindhyawasini Blood Bank	");
            list.add("A.N. Magadh Medical College Hospital Blood Bank	");
            list.add("Anupam Voluntary blood bank	");
            list.add("Bharat Blood Bank	");
            list.add("Blood bank Indian Red Cross Society	");
            list.add("Blood Bank and Research Centre	");
            list.add("Bose Clinic Blood Bank	");
            list.add("Sadar Hospital	");
            list.add("Kurji Holy Family Hospital Blood Bank	");
            list.add("National blood bank and Research Centre	");
            list.add("Nalanda Medical College and Hospital Blood Bank	");
            list.add("Military Hospital Blood Bank	");
            list.add("Lions Mahavir Cancer Sansthan Blood Bank	");
            list.add("Tripolia Social Service Hospital and Blood Bank	");
            list.add("Sadar Hospital Blood Bank	");
            list.add("Sadar Sub Divisional Hospital Blood Bank	");
            list.add("Shashi Blood Bank	");
            list.add("Rastra Kavi Dinkar Blood Bank ,Sadar Hospital	");
            list.add("Sri Krishna Medical College and Hospital Blood Bank	");
            list.add("Regional blood bank,DMCH, Darbhanga	");
            list.add("Patliputra Blood Bank	");
            list.add("Bihar State blood bank,PMCH	");
            list.add("Red Cross Blood Bank, Indian Red Cross Society	");
            list.add("State of the Art Model Blood Bank	");
            list.add("Palm View Hospital Blood Bank	");
            list.add("Lion?s Jeevan Blood Bank	");
            list.add("Indira Gandhi Institute of Cardiology Blood Bank	");
            list.add("Regional Blood Bank	");
            list.add("Rajendra Prasad Memorial Rotary Blood Bank	");
            list.add("Sadar Hospital blood bank	");
            list.add("Duncan Hospital	");
            list.add("Hai Medicare and Research Institute	");
            list.add("Indian Red Cross Blood Bank,IRCS Blood Bank, Motihari	");
            list.add("IGIMS, Patna	");
            list.add("M.J.K. Hospital Blood Bank	");
            list.add("Katihar Medical College Blood Bank	");
            list.add("Life Line Blood Bank	");
            list.add("Life Care Blood Bank and transfusion Services	");
            list.add("Late Sajjan Kr. Agarwal Blood Bank	");
            list.add("Mata Gujri Memorial (M.G.M.)	");
            list.add("R.B. Memorial Hospital	");
            list.add("Nazareth Hospital Blood Bank	");
            list.add("Narayana Medical College and Hospital	");
            list.add("Mahavir Vaatsalya Blood Bank	");
            list.add("Nalanda Blood Bank	");
            list.add("Sinha Blood Bank	");
            list.add("Patna City Blood Bank	");
            list.add("Bhagwan Mahabir blood bank	");
            list.add("Blood Bank P.N.H.	");
            list.add("Paras Hmri Hospital	");
            list.add("Ruban Memorial Hospital	");
            list.add("Lord Buddha Koshi Medical College and Hospital	");
            list.add("S.K.D.K.M. Hospital	");
            list.add("Shrishti Blood Bank	");
            list.add("Jeevan Rekha Blood Bank	");
            list.add("Lord Budhdha Koshi Medical College	");
            list.add("Krishna Devi Devi Prasad Kejriwal Maternity Hospital	");
            list.add("NMCH, Patna");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);

        }

            if (sp1.contentEquals("Jharkhand")) {
                List<String> list = new ArrayList<String>();
                list.add("Ispat Hospital	");
                list.add("Indian Red Cross Society Blood Bank	");
                list.add("Plant Hospital	");
                list.add("CCL Hospital	");
                list.add("Central Hospital	");
                list.add("Bokaro General Hospital Blood Bank	");
                list.add("Birsha Blood Bank	");
                list.add("Abdur Razzaque Ansari	");
                list.add("Sadar Hospital	");
                list.add("Guru Nanak Hospital and Research Centre Blood Bank Unit	");
                list.add("Sadar Hospital	");
                list.add("Sadar Hospital	");
                list.add("Sadar Hospital	");
                list.add("Sadar Hospital Blood Bank	");
                list.add("Sadar Hospital Blood Bank	");
                list.add("Central Hospital Blood Bank	");
                list.add("Sadar Hospital	");
                list.add("M.G.M. Medical College and Hospital	");
                list.add("Sub-Divisional Hospital Blood Bank	");
                list.add("Patliputra Medical College Hospital	");
                list.add("SAI Hospital Blood Bank	");
                list.add("Military Hospital	");
                list.add("Gua Hospital	");
                list.add("Blood Transfusion Unit	");
                list.add("Archi Jharkhand Blood Bank	");
                list.add("Sadar Hospital	");
                list.add("Sadar Hospital Blood Bank	");
                list.add("Sadar Hospital Blood Bank	");
                list.add("Kiriburu General Hospital	");
                list.add("Seventh Day Adventist Hospital Blood Bank	");
                list.add("State- of- Art Model Blood Bank	");
                list.add("Nagarmal Modi Seva Sadan Hospital	");
                list.add("Military Hospital Blood Bank	");
                list.add("K. M. Memorial Hospital Blood Bank	");
                list.add("Jharkhand Blood Bank	");
                list.add("Jamshedpur Blood Bank	");
                list.add("Kidney Hospital and Urology Centre	");
                list.add("Dhanbad S.N. Chokrabarty Memorial Nursing Home	");
                list.add("Rinchi Trust Hospital Blood bank	");
                list.add("Indian Red Cross Society Blood Bank	");
                list.add("Apurva Hospital and Research Centre	");
                list.add("Sadar Hospital	");
                list.add("Sartaj Blood Bank	");
                list.add("Indian Red Cross Society	");
                list.add("Sadar Hospital	");
                list.add("Devkamal Hospital and Research Centre	");
                list.add("Sadar Hospital Blood Bank	");
                list.add("Sadar Hospital	");
                list.add("Tata Iron and Steel Company (TISCO)	");
                list.add("Tata Central Hospital	");
                list.add("Blood Bank Bokaro	");
                list.add("Dhanbad Blood Bank	");
                list.add("Anand Rotary Blood Bank	");

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                dataAdapter.notifyDataSetChanged();
                s2.setAdapter(dataAdapter);
            }
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
    }
        @Override
        public void onNothingSelected (AdapterView < ? > arg0){
        // TODO Auto-generated method stub

    }

}


