package iedalyo25.dcu.computing.leavingcertcalculater;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {

    Button btnLevel1, btnLevel2,btnLevel3, btnLevel4, btnLevel5, btnLevel6;
    Bundle subSelections;
    private int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
    private String subLevel1, subLevel2, subLevel3, subLevel4, subLevel5, subLevel6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        subSelections = getIntent().getExtras();
        if(subSelections == null){
            return;
        }

        String userSel = subSelections.getString("userSubSel1");
        String userSe2 = subSelections.getString("userSubSel2");
        String userSe3 = subSelections.getString("userSubSel3");
        String userSe4 = subSelections.getString("userSubSel4");
        String userSe5 = subSelections.getString("userSubSel5");
        String userSe6 = subSelections.getString("userSubSel6");

        final TextView userSubSel1 = (TextView)findViewById(R.id.tvSub1);
        final TextView userSubSel2 = (TextView)findViewById(R.id.tvSub2);
        final TextView userSubSel3 = (TextView)findViewById(R.id.tvSub3);
        final TextView userSubSel4 = (TextView)findViewById(R.id.tvSub4);
        final TextView userSubSel5 = (TextView)findViewById(R.id.tvSub5);
        final TextView userSubSel6 = (TextView)findViewById(R.id.tvSub6);

        String sel1 = "1. " + userSel;
        String sel2 = "2. " + userSe2;
        String sel3 = "3. " + userSe3;
        String sel4 = "4. " + userSe4;
        String sel5 = "5. " + userSe5;
        String sel6 = "6. " + userSe6;

        userSubSel1.setText(sel1);
        userSubSel2.setText(sel2);
        userSubSel3.setText(sel3);
        userSubSel4.setText(sel4);
        userSubSel5.setText(sel5);
        userSubSel6.setText(sel6);

        buttonLogic();

    }

    public  void onClick(View view){
        Intent i = new Intent(this, GradeActivity.class);

        String userSel = subSelections.getString("userSubSel1");
        String userSe2 = subSelections.getString("userSubSel2");
        String userSe3 = subSelections.getString("userSubSel3");
        String userSe4 = subSelections.getString("userSubSel4");
        String userSe5 = subSelections.getString("userSubSel5");
        String userSe6 = subSelections.getString("userSubSel6");

        i.putExtra("userSubSel1", userSel);
        i.putExtra("userSubSel2", userSe2);
        i.putExtra("userSubSel3", userSe3);
        i.putExtra("userSubSel4", userSe4);
        i.putExtra("userSubSel5", userSe5);
        i.putExtra("userSubSel6", userSe6);

        i.putExtra("userLevelSel1", subLevel1);
        i.putExtra("userLevelSel2", subLevel2);
        i.putExtra("userLevelSel3", subLevel3);
        i.putExtra("userLevelSel4", subLevel4);
        i.putExtra("userLevelSel5", subLevel5);
        i.putExtra("userLevelSel6", subLevel6);

        this.startActivity(i);
    }

    private void buttonLogic() {
        btnLevel1 = (Button) findViewById(R.id.btnLevel1);
        btnLevel2 = (Button) findViewById(R.id.btnLevel2);
        btnLevel3 = (Button) findViewById(R.id.btnLevel3);
        btnLevel4 = (Button) findViewById(R.id.btnLevel4);
        btnLevel5 = (Button) findViewById(R.id.btnLevel5);
        btnLevel6 = (Button) findViewById(R.id.btnLevel6);

        btnLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSel = subSelections.getString("userSubSel1");
                if (!"Select Subject".equals(userSel) && !"L.C.V.P".equals(userSel)) {
                    int mod = count % 3;
                    if (mod == 0) {
                        btnLevel1.setBackgroundColor(Color.parseColor("#0080FF"));
                        btnLevel1.setTextColor(Color.WHITE);
                        btnLevel1.setText(getString(R.string.Higher));
                        subLevel1 = "Higher";
                        count++;
                    }

                    if (mod == 1) {
                        btnLevel1.setBackgroundColor(Color.parseColor("#F6270D"));
                        btnLevel1.setTextColor(Color.WHITE);
                        btnLevel1.setText(getString(R.string.Ord));
                        subLevel1 = "Ord";
                        count++;
                    }

                    if (mod == 2) {
                        btnLevel1.setBackgroundColor(Color.parseColor("#7F00FF"));
                        btnLevel1.setTextColor(Color.WHITE);
                        btnLevel1.setText(getString(R.string.Found));
                        subLevel1 = "Found";
                        count++;
                    }
                } else if (userSel.equals("L.C.V.P")) {
                    btnLevel1.setBackgroundColor(Color.parseColor("#FF01F4"));
                    btnLevel1.setTextColor(Color.WHITE);
                    btnLevel1.setText("N/A");
                    subLevel1 = "L.C.V.P";
                }
            }
        });

        btnLevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSel = subSelections.getString("userSubSel2");
                if (!"Select Subject".equals(userSel) && !"L.C.V.P".equals(userSel)) {
                    int mod = count1 % 3;
                    if (mod == 0) {
                        btnLevel2.setBackgroundColor(Color.parseColor("#0080FF"));
                        btnLevel2.setTextColor(Color.WHITE);
                        btnLevel2.setText(getString(R.string.Higher));
                        subLevel2 = "Higher";
                        count1++;
                    }

                    if (mod == 1) {
                        btnLevel2.setBackgroundColor(Color.parseColor("#F6270D"));
                        btnLevel2.setTextColor(Color.WHITE);
                        btnLevel2.setText(getString(R.string.Ord));
                        subLevel2 = "Ord";
                        count1++;
                    }

                    if (mod == 2) {
                        btnLevel2.setBackgroundColor(Color.parseColor("#7F00FF"));
                        btnLevel2.setTextColor(Color.WHITE);
                        btnLevel2.setText(getString(R.string.Found));
                        subLevel2 = "Found";
                        count1++;
                    }
                } else if (userSel.equals("L.C.V.P")) {
                    btnLevel2.setBackgroundColor(Color.parseColor("#FF01F4"));
                    btnLevel2.setTextColor(Color.WHITE);
                    btnLevel2.setText("N/A");
                    subLevel2 = "L.C.V.P";
                }
            }
        });

        btnLevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSel = subSelections.getString("userSubSel3");
                if (!"Select Subject".equals(userSel) && !"L.C.V.P".equals(userSel)) {
                    int mod = count2 % 3;
                    if (mod == 0) {
                        btnLevel3.setBackgroundColor(Color.parseColor("#0080FF"));
                        btnLevel3.setTextColor(Color.WHITE);
                        btnLevel3.setText(getString(R.string.Higher));
                        subLevel3 = "Higher";
                        count2++;
                    }

                    if (mod == 1) {
                        btnLevel3.setBackgroundColor(Color.parseColor("#F6270D"));
                        btnLevel3.setTextColor(Color.WHITE);
                        btnLevel3.setText(getString(R.string.Ord));
                        subLevel3 = "Ord";
                        count2++;
                    }

                    if (mod == 2) {
                        btnLevel3.setBackgroundColor(Color.parseColor("#7F00FF"));
                        btnLevel3.setTextColor(Color.WHITE);
                        btnLevel3.setText(getString(R.string.Found));
                        subLevel3 = "Found";
                        count2++;
                    }
                } else if (userSel.equals("L.C.V.P")) {
                    btnLevel3.setBackgroundColor(Color.parseColor("#FF01F4"));
                    btnLevel3.setTextColor(Color.WHITE);
                    btnLevel3.setText("N/A");
                    subLevel3 = "L.C.V.P";
                }
            }
        });

        btnLevel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSel = subSelections.getString("userSubSel4");
                if (!"Select Subject".equals(userSel) && !"L.C.V.P".equals(userSel)) {
                    int mod = count3 % 3;
                    if (mod == 0) {
                        btnLevel4.setBackgroundColor(Color.parseColor("#0080FF"));
                        btnLevel4.setTextColor(Color.WHITE);
                        btnLevel4.setText(getString(R.string.Higher));
                        subLevel4 = "Higher";
                        count3++;
                    }

                    if (mod == 1) {
                        btnLevel4.setBackgroundColor(Color.parseColor("#F6270D"));
                        btnLevel4.setTextColor(Color.WHITE);
                        btnLevel4.setText(getString(R.string.Ord));
                        subLevel4 = "Ord";
                        count3++;
                    }

                    if (mod == 2) {
                        btnLevel4.setBackgroundColor(Color.parseColor("#7F00FF"));
                        btnLevel4.setTextColor(Color.WHITE);
                        btnLevel4.setText(getString(R.string.Found));
                        subLevel4 = "Found";
                        count3++;
                    }
                } else if (userSel.equals("L.C.V.P")) {
                    btnLevel4.setBackgroundColor(Color.parseColor("#FF01F4"));
                    btnLevel4.setTextColor(Color.WHITE);
                    btnLevel4.setText("N/A");
                    subLevel4 = "L.C.V.P";
                }
            }
        });

        btnLevel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSel = subSelections.getString("userSubSel5");
                if (!"Select Subject".equals(userSel) && !"L.C.V.P".equals(userSel)) {
                    int mod = count4 % 3;
                    if (mod == 0) {
                        btnLevel5.setBackgroundColor(Color.parseColor("#0080FF"));
                        btnLevel5.setTextColor(Color.WHITE);
                        btnLevel5.setText(getString(R.string.Higher));
                        subLevel5 = "Higher";
                        count4++;
                    }

                    if (mod == 1) {
                        btnLevel5.setBackgroundColor(Color.parseColor("#F6270D"));
                        btnLevel5.setTextColor(Color.WHITE);
                        btnLevel5.setText(getString(R.string.Ord));
                        subLevel5 = "Ord";
                        count4++;
                    }

                    if (mod == 2) {
                        btnLevel5.setBackgroundColor(Color.parseColor("#7F00FF"));
                        btnLevel5.setTextColor(Color.WHITE);
                        btnLevel5.setText(getString(R.string.Found));
                        subLevel5 = "Found";
                        count4++;
                    }
                } else if (userSel.equals("L.C.V.P")) {
                    btnLevel5.setBackgroundColor(Color.parseColor("#FF01F4"));
                    btnLevel5.setTextColor(Color.WHITE);
                    btnLevel5.setText("N/A");
                    subLevel5 = "L.C.V.P";
                }
            }
        });

        btnLevel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSel = subSelections.getString("userSubSel6");
                if (!"Select Subject".equals(userSel) && !"L.C.V.P".equals(userSel)) {
                    int mod = count5 % 3;
                    if (mod == 0) {
                        btnLevel6.setBackgroundColor(Color.parseColor("#0080FF"));
                        btnLevel6.setTextColor(Color.WHITE);
                        btnLevel6.setText(getString(R.string.Higher));
                        subLevel6 = "Higher";
                        count5++;
                    }

                    if (mod == 1) {
                        btnLevel6.setBackgroundColor(Color.parseColor("#F6270D"));
                        btnLevel6.setTextColor(Color.WHITE);
                        btnLevel6.setText(getString(R.string.Ord));
                        subLevel6 = "Ord";
                        count5++;
                    }

                    if (mod == 2) {
                        btnLevel6.setBackgroundColor(Color.parseColor("#7F00FF"));
                        btnLevel6.setTextColor(Color.WHITE);
                        btnLevel6.setText(getString(R.string.Found));
                        subLevel6 = "Found";
                        count5++;
                    }
                } else if (userSel.equals("L.C.V.P")) {
                    btnLevel6.setBackgroundColor(Color.parseColor("#FF01F4"));
                    btnLevel6.setTextColor(Color.WHITE);
                    btnLevel6.setText("N/A");
                    subLevel6 = "L.C.V.P";
                }
            }
        });
    }
}
