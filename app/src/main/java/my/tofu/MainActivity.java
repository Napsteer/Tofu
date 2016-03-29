package my.tofu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void changeTeamScore(int value, String team) {
        int score;
        TextView tvTeamScore = null;
        switch (team) {
            case "red":
                tvTeamScore = (TextView) findViewById(R.id.tvRedTeamScore);
                break;
            case "green":
                tvTeamScore = (TextView) findViewById(R.id.tvGreenTeamScore);
                break;
            default:
                Toast.makeText(this.getApplicationContext(), "Wrong team!", Toast.LENGTH_SHORT).show();
                return;
        }
        score = Integer.parseInt(tvTeamScore.getText().toString());
        score += value;
        tvTeamScore.setText(Integer.toString(score));
    }

}
