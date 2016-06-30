package gradlevars.devdeeds.com.gradlevariables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), BuildConfig.API_KEY + "\n" + BuildConfig.API_URL + "\n" + Boolean.toString(BuildConfig.LOG), Toast.LENGTH_SHORT).show();

    }
}
