package iedalyo25.dcu.computing.leavingcertcalculater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Bundle userSel;

    String userSel1, userSel2, userSel3, userSel4, userSel5, userSel6;
    String userGrade1, userGrade2, userGrade3, userGrade4, userGrade5, userGrade6;
    String userLevel1, userLevel2, userLevel3, userLevel4, userLevel5, userLevel6;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Result");
        setSupportActionBar(toolbar);
        tvResult = (TextView)findViewById(R.id.tvResult);
        setViews();

        String [] higher = new String[6];
        String [] ordinary = new String[6];
        String [] found = new String[6];
        String [] lcvp = new String[6];

        fillHiArrays(higher);
        fillOrdArray(ordinary);
        fillFoundArray(found);
        fillLcvpArray(lcvp);

        int answer = 0;
        answer += hiScore(higher);
        answer += odScore(ordinary);
        answer += foScore(found);
        answer += lScore(lcvp);

        if(isMaths()){
            answer += 25;
        }

        String a = Integer.toString(answer);

        tvResult.setText(a);
    }

    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }

    public boolean isMaths(){
        userSel = getIntent().getExtras();

        userSel1 = userSel.getString("userSubSel1");
        userSel2 = userSel.getString("userSubSel2");
        userSel3 = userSel.getString("userSubSel3");
        userSel4 = userSel.getString("userSubSel4");
        userSel5 = userSel.getString("userSubSel5");
        userSel6 = userSel.getString("userSubSel6");

        userLevel1 = userSel.getString("userSelLevel1");
        userLevel2 = userSel.getString("userSelLevel2");
        userLevel3 = userSel.getString("userSelLevel3");
        userLevel4 = userSel.getString("userSelLevel4");
        userLevel5 = userSel.getString("userSelLevel5");
        userLevel6 = userSel.getString("userSelLevel6");

        boolean isMaths = false;

        if ("Mathematics".equals(userSel1) && "Higher".equals(userLevel1)) {
            isMaths = true;
        }
        if ("Mathematics".equals(userSel2) && "Higher".equals(userLevel2)) {
            isMaths = true;
        }
        if ("Mathematics".equals(userSel3) && "Higher".equals(userLevel3)) {
            isMaths = true;
        }
        if ("Mathematics".equals(userSel4) && "Higher".equals(userLevel4)) {
            isMaths = true;
        }
        if ("Mathematics".equals(userSel5) && "Higher".equals(userLevel5)) {
            isMaths = true;
        }
        if ("Mathematics".equals(userSel6) && "Higher".equals(userLevel6)) {
            isMaths = true;
        }
        return isMaths;
    }

    public int lScore(String [] lcvp){
        int sum = 0;
        for(String i : lcvp){
            if(i != null) {
                switch (i) {
                    case "Distinction":
                        sum += 70;
                        break;
                    case "Merit":
                        sum += 50;
                        break;
                    case "Pass":
                        sum += 30;
                        break;
                    default:
                        sum += 0;
                }
            }
        }
        return sum;
    }

    public int foScore(String [] found){
        int sum = 0;
        for(String i : found){
            if(i != null) {
                switch (i) {
                    case "A1":
                        sum += 20;
                        break;
                    case "A2":
                        sum += 15;
                        break;
                    case "B1":
                        sum += 10;
                        break;
                    case "B2":
                        sum += 5;
                        break;
                    default:
                        sum += 0;
                }
            }
        }
        return sum;
    }

    public int odScore(String [] ordinary){
        int sum = 0;

        for(String i : ordinary) {
            if(i != null){
                switch (i) {
                    case "A1":
                        sum += 60;
                        break;
                    case "A2":
                        sum += 50;
                        break;
                    case "B1":
                        sum += 45;
                        break;
                    case "B2":
                        sum += 40;
                        break;
                    case "B3":
                        sum += 35;
                        break;
                    case "C1":
                        sum += 30;
                        break;
                    case "C2":
                        sum += 25;
                        break;
                    case "C3":
                        sum += 20;
                        break;
                    case "D1":
                        sum += 15;
                        break;
                    case "D2":
                        sum += 10;
                        break;
                    case "D3":
                        sum += 5;
                        break;
                    default:
                        sum += 0;
                }
            }
        }
        return sum;
    }

    public int hiScore(String [] hi){
        int sum = 0;
        for(String i : hi){
            if(i != null){
                switch (i) {
                    case "A1":
                        sum += 100;
                        break;
                    case "A2":
                        sum += 90;
                        break;
                    case "B1":
                        sum += 85;
                        break;
                    case "B2":
                        sum += 80;
                        break;
                    case "B3":
                        sum += 75;
                        break;
                    case "C1":
                        sum += 70;
                        break;
                    case "C2":
                        sum += 65;
                        break;
                    case "C3":
                        sum += 60;
                        break;
                    case "D1":
                        sum += 55;
                        break;
                    case "D2":
                        sum += 50;
                        break;
                    case "D3":
                        sum += 45;
                        break;
                    default:
                        sum += 0;
                }
            }
        }
        return sum;
    }

    public String [] fillLcvpArray(String [] l){
        userSel = getIntent().getExtras();

        userLevel1 = userSel.getString("userSelLevel1");
        userLevel2 = userSel.getString("userSelLevel2");
        userLevel3 = userSel.getString("userSelLevel3");
        userLevel4 = userSel.getString("userSelLevel4");
        userLevel5 = userSel.getString("userSelLevel5");
        userLevel6 = userSel.getString("userSelLevel6");

        userGrade1 = userSel.getString("userSelGrade1");
        userGrade2 = userSel.getString("userSelGrade2");
        userGrade3 = userSel.getString("userSelGrade3");
        userGrade4 = userSel.getString("userSelGrade4");
        userGrade5 = userSel.getString("userSelGrade5");
        userGrade6 = userSel.getString("userSelGrade6");

        int point = 0;

        if("L.C.V.P".equals(userLevel1)){
            l[point] = userGrade1;
            point++;
        }
        if("L.C.V.P".equals(userLevel2)){
            l[point] = userGrade2;
            point++;
        }
        if("L.C.V.P".equals(userLevel3)){
            l[point] = userGrade3;
            point++;
        }
        if("L.C.V.P".equals(userLevel4)){
            l[point] = userGrade4;
            point++;
        }
        if("L.C.V.P".equals(userLevel5)){
            l[point] = userGrade5;
            point++;
        }
        if("L.C.V.P".equals(userLevel6)){
            l[point] = userGrade6;
        }
        return l;
    }

    public String [] fillFoundArray(String [] fo){
        userSel = getIntent().getExtras();

        userLevel1 = userSel.getString("userSelLevel1");
        userLevel2 = userSel.getString("userSelLevel2");
        userLevel3 = userSel.getString("userSelLevel3");
        userLevel4 = userSel.getString("userSelLevel4");
        userLevel5 = userSel.getString("userSelLevel5");
        userLevel6 = userSel.getString("userSelLevel6");

        userGrade1 = userSel.getString("userSelGrade1");
        userGrade2 = userSel.getString("userSelGrade2");
        userGrade3 = userSel.getString("userSelGrade3");
        userGrade4 = userSel.getString("userSelGrade4");
        userGrade5 = userSel.getString("userSelGrade5");
        userGrade6 = userSel.getString("userSelGrade6");

        int point = 0;


        if("Found".equals(userLevel1)){
            fo[point] = userGrade1;
            point++;
        }
        if("Found".equals(userLevel2)){
            fo[point] = userGrade2;
            point++;
        }
        if("Found".equals(userLevel3)){
            fo[point] = userGrade3;
            point++;
        }
        if("Found".equals(userLevel4)){
            fo[point] = userGrade4;
            point++;
        }
        if("Found".equals(userLevel5)){
            fo[point] = userGrade5;
            point++;
        }
        if("Found".equals(userLevel6)){
            fo[point] = userGrade6;
        }
        return fo;
    }

    public String [] fillOrdArray(String [] ord){
        userSel = getIntent().getExtras();

        userLevel1 = userSel.getString("userSelLevel1");
        userLevel2 = userSel.getString("userSelLevel2");
        userLevel3 = userSel.getString("userSelLevel3");
        userLevel4 = userSel.getString("userSelLevel4");
        userLevel5 = userSel.getString("userSelLevel5");
        userLevel6 = userSel.getString("userSelLevel6");

        userGrade1 = userSel.getString("userSelGrade1");
        userGrade2 = userSel.getString("userSelGrade2");
        userGrade3 = userSel.getString("userSelGrade3");
        userGrade4 = userSel.getString("userSelGrade4");
        userGrade5 = userSel.getString("userSelGrade5");
        userGrade6 = userSel.getString("userSelGrade6");

        int point = 0;

        if("Ord".equals(userLevel1)){
            ord[point] = userGrade1;
            point++;
        }
        if("Ord".equals(userLevel2)){
            ord[point] = userGrade2;
            point++;
        }
        if("Ord".equals(userLevel3)){
            ord[point] = userGrade3;
            point++;
        }
        if("Ord".equals(userLevel4)){
            ord[point] = userGrade4;
            point++;
        }
        if("Ord".equals(userLevel5)){
            ord[point] = userGrade5;
            point++;
        }
        if("Ord".equals(userLevel6)){
            ord[point] = userGrade6;
        }
        return ord;
    }

    public String [] fillHiArrays(String [] hi){
        userSel = getIntent().getExtras();
        if(userSel == null){
            return hi;
        }

        userLevel1 = userSel.getString("userSelLevel1");
        userLevel2 = userSel.getString("userSelLevel2");
        userLevel3 = userSel.getString("userSelLevel3");
        userLevel4 = userSel.getString("userSelLevel4");
        userLevel5 = userSel.getString("userSelLevel5");
        userLevel6 = userSel.getString("userSelLevel6");

        userGrade1 = userSel.getString("userSelGrade1");
        userGrade2 = userSel.getString("userSelGrade2");
        userGrade3 = userSel.getString("userSelGrade3");
        userGrade4 = userSel.getString("userSelGrade4");
        userGrade5 = userSel.getString("userSelGrade5");
        userGrade6 = userSel.getString("userSelGrade6");

        int point = 0;

        if("Higher".equals(userLevel1)){
            hi[point] = userGrade1;
            point++;
        }
        if("Higher".equals(userLevel2)){
            hi[point] = userGrade2;
            point++;
        }
        if("Higher".equals(userLevel3)){
            hi[point] = userGrade3;
            point++;
        }
        if("Higher".equals(userLevel4)){
            hi[point] = userGrade4;
            point++;
        }
        if("Higher".equals(userLevel5)){
            hi[point] = userGrade5;
            point++;
        }
        if("Higher".equals(userLevel6)) {
            hi[point] = userGrade6;
        }
        return hi;
    }

    public void setViews(){
        userSel = getIntent().getExtras();

        userSel1 = userSel.getString("userSubSel1");
        userSel2 = userSel.getString("userSubSel2");
        userSel3 = userSel.getString("userSubSel3");
        userSel4 = userSel.getString("userSubSel4");
        userSel5 = userSel.getString("userSubSel5");
        userSel6 = userSel.getString("userSubSel6");

        final TextView userSubSel1 = (TextView)findViewById(R.id.tvSub1);
        final TextView userSubSel2 = (TextView)findViewById(R.id.tvSub2);
        final TextView userSubSel3 = (TextView)findViewById(R.id.tvSub3);
        final TextView userSubSel4 = (TextView)findViewById(R.id.tvSub4);
        final TextView userSubSel5 = (TextView)findViewById(R.id.tvSub5);
        final TextView userSubSel6 = (TextView)findViewById(R.id.tvSub6);

        String sel1 = "1. " + userSel1;
        String sel2 = "2. " + userSel2;
        String sel3 = "3. " + userSel3;
        String sel4 = "4. " + userSel4;
        String sel5 = "5. " + userSel5;
        String sel6 = "6. " + userSel6;

        userSubSel1.setText(sel1);
        userSubSel2.setText(sel2);
        userSubSel3.setText(sel3);
        userSubSel4.setText(sel4);
        userSubSel5.setText(sel5);
        userSubSel6.setText(sel6);

        userGrade1 = userSel.getString("userSelGrade1");
        userGrade2 = userSel.getString("userSelGrade2");
        userGrade3 = userSel.getString("userSelGrade3");
        userGrade4 = userSel.getString("userSelGrade4");
        userGrade5 = userSel.getString("userSelGrade5");
        userGrade6 = userSel.getString("userSelGrade6");

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

        userLevel1 = userSel.getString("userSelLevel1");
        userLevel2 = userSel.getString("userSelLevel2");
        userLevel3 = userSel.getString("userSelLevel3");
        userLevel4 = userSel.getString("userSelLevel4");
        userLevel5 = userSel.getString("userSelLevel5");
        userLevel6 = userSel.getString("userSelLevel6");

        final TextView userLevelSel1 = (TextView)findViewById(R.id.tvLevel1);
        final TextView userLevelSel2 = (TextView)findViewById(R.id.tvLevel2);
        final TextView userLevelSel3 = (TextView)findViewById(R.id.tvLevel3);
        final TextView userLevelSel4 = (TextView)findViewById(R.id.tvLevel4);
        final TextView userLevelSel5 = (TextView)findViewById(R.id.tvLevel5);
        final TextView userLevelSel6 = (TextView)findViewById(R.id.tvLevel6);

        if(!"L.C.V.P".equals(userSel1)){
            userLevelSel1.setText(userLevel1);
        }else {
            userLevelSel1.setText("----");
        }

        if(!"L.C.V.P".equals(userSel2)) {
            userLevelSel2.setText(userLevel2);
        }else {
            userLevelSel2.setText("----");
        }

        if(!"L.C.V.P".equals(userSel3)) {
            userLevelSel3.setText(userLevel3);
        }else {
            userLevelSel3.setText("----");
        }

        if(!"L.C.V.P".equals(userSel4)) {
            userLevelSel4.setText(userLevel3);
        }else {
            userLevelSel4.setText(userLevel4);
        }

        if(!"L.C.V.P".equals(userSel5)) {
            userLevelSel5.setText(userLevel5);
        }else {
            userLevelSel5.setText("----");
        }

        if(!"L.C.V.P".equals(userSel6)) {
            userLevelSel6.setText(userLevel6);
        }else {
            userLevelSel6.setText("----");
        }
    }
}
