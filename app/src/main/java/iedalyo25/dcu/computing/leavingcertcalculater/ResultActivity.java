package iedalyo25.dcu.computing.leavingcertcalculater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Bundle userSel;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
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

        final TextView userSubSel1 = (TextView)findViewById(R.id.tvSub1);
        final TextView userSubSel2 = (TextView)findViewById(R.id.tvSub2);
        final TextView userSubSel3 = (TextView)findViewById(R.id.tvSub3);
        final TextView userSubSel4 = (TextView)findViewById(R.id.tvSub4);
        final TextView userSubSel5 = (TextView)findViewById(R.id.tvSub5);
        final TextView userSubSel6 = (TextView)findViewById(R.id.tvSub6);

        userSubSel1.setText("1. " + userSel1);
        userSubSel2.setText("2. " + userSel2);
        userSubSel3.setText("3. " + userSel3);
        userSubSel4.setText("4. " + userSel4);
        userSubSel5.setText("5. " + userSel5);
        userSubSel6.setText("6. " + userSel6);

        String userGrade1 = userSel.getString("userSelGrade1");
        String userGrade2 = userSel.getString("userSelGrade2");
        String userGrade3 = userSel.getString("userSelGrade3");
        String userGrade4 = userSel.getString("userSelGrade4");
        String userGrade5 = userSel.getString("userSelGrade5");
        String userGrade6 = userSel.getString("userSelGrade6");

        final TextView userGradeSel1 = (TextView)findViewById(R.id.tvGrade1);
        final TextView userGradeSel2 = (TextView)findViewById(R.id.tvGrade2);
        final TextView userGradeSel3 = (TextView)findViewById(R.id.tvGrade3);
        final TextView userGradeSel4 = (TextView)findViewById(R.id.tvGrade4);
        final TextView userGradeSel5 = (TextView)findViewById(R.id.tvGrade5);
        final TextView userGradeSel6 = (TextView)findViewById(R.id.tvGrade6);

        userGradeSel1.setText(userGrade1);
        userGradeSel2.setText(userGrade2);
        userGradeSel3.setText(userGrade3);
        userGradeSel4.setText(userGrade4);
        userGradeSel5.setText(userGrade5);
        userGradeSel6.setText(userGrade6);

        String userLevel1 = userSel.getString("userSelLevel1");
        String userLevel2 = userSel.getString("userSelLevel2");
        String userLevel3 = userSel.getString("userSelLevel3");
        String userLevel4 = userSel.getString("userSelLevel4");
        String userLevel5 = userSel.getString("userSelLevel5");
        String userLevel6 = userSel.getString("userSelLevel6");

        final TextView userLevelSel1 = (TextView)findViewById(R.id.tvLevel1);
        final TextView userLevelSel2 = (TextView)findViewById(R.id.tvLevel2);
        final TextView userLevelSel3 = (TextView)findViewById(R.id.tvLevel3);
        final TextView userLevelSel4 = (TextView)findViewById(R.id.tvLevel4);
        final TextView userLevelSel5 = (TextView)findViewById(R.id.tvLevel5);
        final TextView userLevelSel6 = (TextView)findViewById(R.id.tvLevel6);

        if(!userSel1.equals("L.C.V.P")){
            userLevelSel1.setText(userLevel1);
        }else {
            userLevelSel1.setText("----");
        }

        if(!userSel2.equals("L.C.V.P")) {
            userLevelSel2.setText(userLevel2);
        }else {
            userLevelSel2.setText("----");
        }

        if(!userSel3.equals("L.C.V.P")) {
            userLevelSel3.setText(userLevel3);
        }else {
            userLevelSel3.setText("----");
        }

        if(!userSel4.equals("L.C.V.P")) {
            userLevelSel4.setText(userLevel3);
        }else {
            userLevelSel4.setText(userLevel4);
        }

        if(!userSel5.equals("L.C.V.P")) {
            userLevelSel5.setText(userLevel5);
        }else {
            userLevelSel5.setText("----");
        }

        if(!userSel6.equals("L.C.V.P")) {
            userLevelSel6.setText(userLevel6);
        }else {
            userLevelSel6.setText("----");
        }
/**
        String [] higher = new String[6];
        String [] ordinary = new String[6];
        String [] found = new String[6];
        String [] lcvp = new String[6];

        int ph = 0;
        int po = 0;
        int pf = 0;
        int pl = 0;

       if(!userSel1.equals("Select Subject")){
            switch (userLevel1){
                case "Higher":
                    higher[ph] = userGrade1;
                    ph++;
                    break;
                case "Ord":
                    ordinary[po] = userGrade1;
                    po++;
                    break;
                case "Found":
                    found[pf] = userGrade1;
                    pf++;
                    break;
                case "N/A":
                    lcvp [pl] = userGrade1;
                    pl++;
                    break;
            }
        }

        if(!userSel2.equals("Select Subject")){
            switch (userLevel2){
                case "Higher":
                    higher[ph] = userGrade2;
                    ph++;
                    break;
                case "Ord":
                    ordinary[po] = userGrade2;
                    po++;
                    break;
                case "Found":
                    found[pf] = userGrade2;
                    pf++;
                    break;
                case "N/A":
                    lcvp [pl] = userGrade2;
                    pl++;
                    break;
            }
        }

        if(!userSel3.equals("Select Subject")){
            switch (userLevel3){
                case "Higher":
                    higher[ph] = userGrade3;
                    ph++;
                    break;
                case "Ord":
                    ordinary[po] = userGrade3;
                    po++;
                    break;
                case "Found":
                    found[pf] = userGrade3;
                    pf++;
                    break;
                case "N/A":
                    lcvp [pl] = userGrade3;
                    pl++;
                    break;
            }
        }

        if(!userSel4.equals("Select Subject")){
            switch (userLevel4){
                case "Higher":
                    higher[ph] = userGrade4;
                    ph++;
                    break;
                case "Ord":
                    ordinary[po] = userGrade4;
                    po++;
                    break;
                case "Found":
                    found[pf] = userGrade4;
                    pf++;
                    break;
                case "N/A":
                    lcvp [pl] = userGrade4;
                    pl++;
                    break;
            }
        }

        if(!userSel5.equals("Select Subject")){
            switch (userLevel5){
                case "Higher":
                    higher[ph] = userGrade5;
                    ph++;
                    break;
                case "Ord":
                    ordinary[po] = userGrade5;
                    po++;
                    break;
                case "Found":
                    found[pf] = userGrade5;
                    pf++;
                    break;
                case "N/A":
                    lcvp [pl] = userGrade5;
                    pl++;
                    break;
            }
        }

        if(!userSel6.equals("Select Subject")){
            switch (userLevel6){
                case "Higher":
                    higher[ph] = userGrade6;
                    ph++;
                    break;
                case "Ord":
                    ordinary[po] = userGrade6;
                    po++;
                    break;
                case "Found":
                    found[pf] = userGrade6;
                    pf++;
                    break;
                case "N/A":
                    lcvp [pl] = userGrade6;
                    pl++;
                    break;
            }
        }

        for(int h = 0; h < higher.length; h++){
            System.out.println(higher[h]);
        }

        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;

        for(int i = 0; i < higher.length; i++){
            switch (higher[i]){
                case "A1":
                    point1 += 100;
                    break;
                case "A2":
                    point1 += 90;
                    break;
                case "B1":
                    point1 += 85;
                    break;
                case "B2":
                    point1 += 80;
                    break;
                case "B3":
                    point1 += 75;
                    break;
                case "C1":
                    point1 += 70;
                    break;
                case "C2":
                    point1 += 65;
                    break;
                case "C3":
                    point1 += 60;
                    break;
                case "D1":
                    point1 += 55;
                    break;
                case "D2":
                    point1 += 50;
                    break;
                case "D3":
                    point1 += 45;
                    break;
            }
        }

        for(int i = 0; i < ordinary.length; i++){
            switch (ordinary[i]){
                case "A1":
                    point2 += 60;
                    break;
                case "A2":
                    point2 += 50;
                    break;
                case "B1":
                    point2 += 45;
                    break;
                case "B2":
                    point2 += 40;
                    break;
                case "B3":
                    point2 += 35;
                    break;
                case "C1":
                    point2 += 30;
                    break;
                case "C2":
                    point2 += 25;
                    break;
                case "C3":
                    point2 += 20;
                    break;
                case "D1":
                    point2 += 15;
                    break;
                case "D2":
                    point2 += 10;
                    break;
                case "D3":
                    point2 += 5;
                    break;
            }
        }

        for(int i = 0; i < found.length; i++){
            switch (found[i]){
                case "A1":
                    point3 += 20;
                    break;
                case "A2":
                    point3 += 15;
                    break;
                case "B1":
                    point3 += 10;
                    break;
                case "B2":
                    point3 += 5;
                    break;
            }
        }

        for(int i = 0; i < lcvp.length; i++){
            switch (lcvp[i]){
                case "Distinction":
                    point4 += 70;
                    break;
                case "Merit":
                    point4 += 50;
                    break;
                case "Pass":
                    point4 += 30;
                    break;
            }
        }

        int answer = point1 + point2 + point3 + point4;

        tvResult = (TextView)findViewById(R.id.tvResult);
        tvResult.setText(answer);
    }**/
    }
}
