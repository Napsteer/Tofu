package my.tofu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


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

    private void incrementGreenTeamScore() {
        TextView tvGreenTeamScore =  (TextView) findViewById(R.id.tvGreenTeamScore);
        int score = Integer.parseInt(tvGreenTeamScore.getText().toString());
        score++;
        tvGreenTeamScore.setText(Integer.toString(score));
    }

    private void incrementRedTeamScore() {
        TextView tvRedTeamScore =  (TextView) findViewById(R.id.tvRedTeamScore);
        int score = Integer.parseInt(tvRedTeamScore.getText().toString());
        score++;
        tvRedTeamScore.setText(Integer.toString(score));
    }
}
