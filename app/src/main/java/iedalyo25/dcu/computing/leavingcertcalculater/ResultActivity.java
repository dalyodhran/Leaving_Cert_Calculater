package iedalyo25.dcu.computing.leavingcertcalculater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Switch;
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

    public boolean isMaths(){
        userSel = getIntent().getExtras();
        if(userSel == null) {

        }
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

            if (userSel1.equals("Mathematics") && userLevel1.equals("Higher")) {
                isMaths = true;
            }
            if (userSel2.equals("Mathematics") && userLevel2.equals("Higher")) {
                isMaths = true;
            }
            if (userSel3.equals("Mathematics") && userLevel3.equals("Higher")) {
                isMaths = true;
            }
            if (userSel4.equals("Mathematics") && userLevel4.equals("Higher")) {
                isMaths = true;
            }
            if (userSel5.equals("Mathematics") && userLevel5.equals("Higher")) {
                isMaths = true;
            }
            if (userSel6.equals("Mathematics") && userLevel6.equals("Higher")) {
                isMaths = true;
            }
        return isMaths;
    }

    public int lScore(String [] lcvp){
        int sum = 0;
        for(int i = 0; i < lcvp.length; i++){
            String a = lcvp[i];
            if(a != null) {
                switch (a) {
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
        for(int i = 0; i < found.length; i++){
            String a = found[i];
            if(a != null) {
                switch (a) {
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

        for(int i = 0; i < ordinary.length; i++) {
            String a = ordinary[i];
            if(a != null){
                switch (a) {
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

        for(int i = 0; i < hi.length; i++){
            String a = hi[i];
            if(a != null){
                switch (a) {
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
                        sum += 40;
                }
            }
        }
        return sum;
    }

    public String [] fillLcvpArray(String [] l){
        userSel = getIntent().getExtras();
        if(userSel == null){
            userSel = null;
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

        if(userLevel1.equals("L.C.V.P")){
            l[point] = userGrade1;
            point++;
        }
        if(userLevel2.equals("L.C.V.P")){
            l[point] = userGrade2;
            point++;
        }
        if(userLevel3.equals("L.C.V.P")){
            l[point] = userGrade3;
            point++;
        }
        if(userLevel4.equals("L.C.V.P")){
            l[point] = userGrade4;
            point++;
        }
        if(userLevel5.equals("L.C.V.P")){
            l[point] = userGrade5;
            point++;
        }
        if(userLevel6.equals("L.C.V.P")){
            l[point] = userGrade6;
        }
        return l;
    }

    public String [] fillFoundArray(String [] fo){
        userSel = getIntent().getExtras();
        if(userSel == null){
            userSel = null;
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


        if(userLevel1.equals("Found")){
            fo[point] = userGrade1;
            point++;
        }
        if(userLevel2.equals("Found")){
            fo[point] = userGrade2;
            point++;
        }
        if(userLevel3.equals("Found")){
            fo[point] = userGrade3;
            point++;
        }
        if(userLevel4.equals("Found")){
            fo[point] = userGrade4;
            point++;
        }
        if(userLevel5.equals("Found")){
            fo[point] = userGrade5;
            point++;
        }
        if(userLevel6.equals("Found")){
            fo[point] = userGrade6;
        }
        return fo;
    }

    public String [] fillOrdArray(String [] ord){
        userSel = getIntent().getExtras();
        if(userSel == null){
            userSel = null;
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

        if(userLevel1.equals("Ord")){
            ord[point] = userGrade1;
            point++;
        }
        if(userLevel2.equals("Ord")){
            ord[point] = userGrade2;
            point++;
        }
        if(userLevel3.equals("Ord")){
            ord[point] = userGrade3;
            point++;
        }
        if(userLevel4.equals("Ord")){
            ord[point] = userGrade4;
            point++;
        }
        if(userLevel5.equals("Ord")){
            ord[point] = userGrade5;
            point++;
        }
        if(userLevel6.equals("Ord")){
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

        if(userLevel1.equals("Higher")){
            hi[point] = userGrade1;
            point++;
        }
        if(userLevel2.equals("Higher")){
            hi[point] = userGrade2;
            point++;
        }
        if(userLevel3.equals("Higher")){
            hi[point] = userGrade3;
            point++;
        }
        if(userLevel4.equals("Higher")){
            hi[point] = userGrade4;
            point++;
        }
        if(userLevel5.equals("Higher")){
            hi[point] = userGrade5;
            point++;
        }
        if(userLevel6.equals("Higher")) {
            hi[point] = userGrade6;
        }
        return hi;
    }

    public void setViews(){
        userSel = getIntent().getExtras();
        if(userSel == null){
            return;
        }

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

        userSubSel1.setText("1. " + userSel1);
        userSubSel2.setText("2. " + userSel2);
        userSubSel3.setText("3. " + userSel3);
        userSubSel4.setText("4. " + userSel4);
        userSubSel5.setText("5. " + userSel5);
        userSubSel6.setText("6. " + userSel6);

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
    }
}
