package simoncr.com.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button spotifyButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button buildButton;
    private Button xyzButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyButton = (Button)findViewById(R.id.spotify);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(spotifyButton.getText().toString());
            }
        });

        scoresButton = (Button)findViewById(R.id.scores);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(scoresButton.getText().toString());
            }
        });

        libraryButton = (Button)findViewById(R.id.library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(libraryButton.getText().toString());
            }
        });

        buildButton = (Button)findViewById(R.id.build_bigger);
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(buildButton.getText().toString());
            }
        });

        xyzButton = (Button)findViewById(R.id.xyz);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showMessage(xyzButton.getText().toString());
            }
        });

        capstoneButton = (Button)findViewById(R.id.capstone);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(capstoneButton.getText().toString());
            }
        });


    }

    private void showMessage(String message) {

        String finalMessage = String.format(getString(R.string.message), message);
        Toast.makeText(this,finalMessage,Toast.LENGTH_SHORT).show();
    }


}
