package se.miun.jarhjo.dt031g.wtest016_opengltest01;

import androidx.appcompat.app.AppCompatActivity;


import android.opengl.GLSurfaceView;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private GLSurfaceView gLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        gLView = new MyGLSurfaceView(this);
        setContentView(gLView);

    }
}
