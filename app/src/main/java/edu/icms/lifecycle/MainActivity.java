package edu.icms.lifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    //lifecycle start
    //when system created system first time
    //activity creation
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
   @Override
    protected void onStart() {
       // when user visible part
       //when activity start
       //interactive
       super.onStart();
       Log.d("Lifecycle", "onCreate()");
   }
//ok
    @Override
    protected void onResume() {
        //d
        super.onResume();
        Log.d("Lifecycle", "onCreate()");
    }

    @Override
    protected void onPause() {
        // indicates that user is leaving activity
        super.onPause();
        Log.d("Lifecycle", "onCreate()");
    }
    @Override
    protected void onStop() {
        // when activity is no longer visible
        // activity has finished running and about to terminate
        super.onStop();
        Log.d("Lifecycle", "onCreate()");
    }
    @Override
    protected void onDestroy() {
        // terminated activity
        super.onDestroy();
        Log.d("Lifecycle", "onCreate()");
    }
    @Override
    protected void onRestart() {
        // terminated activity
        super.onRestart();
        Log.d("Lifecycle", "onCreate()");
    }

}



