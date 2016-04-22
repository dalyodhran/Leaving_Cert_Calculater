package iedalyo25.dcu.computing.leavingcertcalculater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnConSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnConSub = (Button) findViewById(R.id.btnConSub);
    }

    public void onClick(View view){
        Intent i = new Intent(this, LevelActivity.class);

        final Spinner spSub1 = (Spinner)findViewById(R.id.spSub1);
        final Spinner spSub2 = (Spinner)findViewById(R.id.spSub2);
        final Spinner spSub3 = (Spinner)findViewById(R.id.spSub3);
        final Spinner spSub4 = (Spinner)findViewById(R.id.spSub4);
        final Spinner spSub5 = (Spinner)findViewById(R.id.spSub5);
        final Spinner spSub6 = (Spinner)findViewById(R.id.spSub6);

        String userSub1 = spSub1.getSelectedItem().toString();
        String userSub2 = spSub2.getSelectedItem().toString();
        String userSub3 = spSub3.getSelectedItem().toString();
        String userSub4 = spSub4.getSelectedItem().toString();
        String userSub5 = spSub5.getSelectedItem().toString();
        String userSub6 = spSub6.getSelectedItem().toString();

        i.putExtra("userSubSel1", userSub1);
        i.putExtra("userSubSel2", userSub2);
        i.putExtra("userSubSel3", userSub3);
        i.putExtra("userSubSel4", userSub4);
        i.putExtra("userSubSel5", userSub5);
        i.putExtra("userSubSel6", userSub6);

        this.startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
