package iedalyo25.dcu.computing.leavingcertcalculater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class GradeActivity extends AppCompatActivity {

    Bundle userSel;
    private String [] lcvpArry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userSel = getIntent().getExtras();
        if(userSel == null){
            return;
        }

        String userSel1 = userSel.getString("userSubSel1");
        String userSel2 = userSel.getString("userSubSel2");
        String userSel3 = userSel.getString("userSubSel3");
        String userSel4 = userSel.getString("userSubSel4");
        String userSel5 = userSel.getString("userSubSel5");
        String userSel6 = userSel.getString("userSubSel6");

        final TextView userSubSel1 = (TextView)findViewById(R.id.tvSubG1);
        final TextView userSubSel2 = (TextView)findViewById(R.id.tvSubG2);
        final TextView userSubSel3 = (TextView)findViewById(R.id.tvSubG3);
        final TextView userSubSel4 = (TextView)findViewById(R.id.tvSubG4);
        final TextView userSubSel5 = (TextView)findViewById(R.id.tvSubG5);
        final TextView userSubSel6 = (TextView)findViewById(R.id.tvSubG6);

        userSubSel1.setText("1. " + userSel1);
        userSubSel2.setText("2. " + userSel2);
        userSubSel3.setText("3. " + userSel3);
        userSubSel4.setText("4. " + userSel4);
        userSubSel5.setText("5. " + userSel5);
        userSubSel6.setText("6. " + userSel6);

        Spinner spGrade1 = (Spinner)findViewById(R.id.spGrade1);
        Spinner spGrade2 = (Spinner)findViewById(R.id.spGrade2);
        Spinner spGrade3 = (Spinner)findViewById(R.id.spGrade3);
        Spinner spGrade4 = (Spinner)findViewById(R.id.spGrade4);
        Spinner spGrade5 = (Spinner)findViewById(R.id.spGrade5);
        Spinner spGrade6 = (Spinner)findViewById(R.id.spGrade6);

        this.lcvpArry = new String[] {
                "Select Grade", "Distinction", "Merit", "Pass"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, lcvpArry);

        if(userSel1.equals("L.C.V.P")){
            spGrade1.setAdapter(adapter);
        }

        if(userSel2.equals("L.C.V.P")){
            spGrade2.setAdapter(adapter);
        }

        if(userSel3.equals("L.C.V.P")){
            spGrade3.setAdapter(adapter);
        }

        if(userSel4.equals("L.C.V.P")){
            spGrade4.setAdapter(adapter);
        }

        if(userSel5.equals("L.C.V.P")){
            spGrade5.setAdapter(adapter);
        }

        if(userSel6.equals("L.C.V.P")){
            spGrade6.setAdapter(adapter);
        }
    }

    public void onClick(View view){
        Intent i = new Intent(this, ResultActivity.class);

        final Spinner spGrade1 = (Spinner)findViewById(R.id.spGrade1);
        final Spinner spGrade2 = (Spinner)findViewById(R.id.spGrade2);
        final Spinner spGrade3 = (Spinner)findViewById(R.id.spGrade3);
        final Spinner spGrade4 = (Spinner)findViewById(R.id.spGrade4);
        final Spinner spGrade5 = (Spinner)findViewById(R.id.spGrade5);
        final Spinner spGrade6 = (Spinner)findViewById(R.id.spGrade6);

        String userGrade1 = spGrade1.getSelectedItem().toString();
        String userGrade2 = spGrade2.getSelectedItem().toString();
        String userGrade3 = spGrade3.getSelectedItem().toString();
        String userGrade4 = spGrade4.getSelectedItem().toString();
        String userGrade5 = spGrade5.getSelectedItem().toString();
        String userGrade6 = spGrade6.getSelectedItem().toString();

        String userSel1 = userSel.getString("userSubSel1");
        String userSel2 = userSel.getString("userSubSel2");
        String userSel3 = userSel.getString("userSubSel3");
        String userSel4 = userSel.getString("userSubSel4");
        String userSel5 = userSel.getString("userSubSel5");
        String userSel6 = userSel.getString("userSubSel6");

        String userSelLevel1 = userSel.getString("userLevelSel1");
        String userSelLevel2 = userSel.getString("userLevelSel2");
        String userSelLevel3 = userSel.getString("userLevelSel3");
        String userSelLevel4 = userSel.getString("userLevelSel4");
        String userSelLevel5 = userSel.getString("userLevelSel5");
        String userSelLevel6 = userSel.getString("userLevelSel6");

        i.putExtra("userSelGrade1", userGrade1);
        i.putExtra("userSelGrade2", userGrade2);
        i.putExtra("userSelGrade3", userGrade3);
        i.putExtra("userSelGrade4", userGrade4);
        i.putExtra("userSelGrade5", userGrade5);
        i.putExtra("userSelGrade6", userGrade6);

        i.putExtra("userSubSel1", userSel1);
        i.putExtra("userSubSel2", userSel2);
        i.putExtra("userSubSel3", userSel3);
        i.putExtra("userSubSel4", userSel4);
        i.putExtra("userSubSel5", userSel5);
        i.putExtra("userSubSel6", userSel6);

        i.putExtra("userSelLevel1", userSelLevel1);
        i.putExtra("userSelLevel2", userSelLevel2);
        i.putExtra("userSelLevel3", userSelLevel3);
        i.putExtra("userSelLevel4", userSelLevel4);
        i.putExtra("userSelLevel5", userSelLevel5);
        i.putExtra("userSelLevel6", userSelLevel6);

        this.startActivity(i);
    }

}
