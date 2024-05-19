package sg.edu.np.mad.madpractical4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_message_group);

        Button btnGroup1 = findViewById(R.id.btnGroup1);
        btnGroup1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view) {
               FragmentManager fragmentManager = getSupportFragmentManager();
               fragmentManager.beginTransaction()
                       .replace(R.id.fragmentContainerView2, Group1Fragment.class, null)
                       .setReorderingAllowed(true)
                       .addToBackStack("name")
                       .commit();
           }
        });

        Button btnGroup2 = findViewById(R.id.btnGroup2);
        btnGroup2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, Group2Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
    }
}