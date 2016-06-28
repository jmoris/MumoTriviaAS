package mumencos.mumotrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        ImageButton btnJugar = (ImageButton)findViewById(R.id.imageButton);
        btnJugar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, NivelActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btnInfo = (ImageButton)findViewById(R.id.imageButton2);
        btnInfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

    }
}
