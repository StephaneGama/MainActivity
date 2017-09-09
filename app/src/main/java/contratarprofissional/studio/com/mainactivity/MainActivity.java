package contratarprofissional.studio.com.mainactivity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.app.ListFragment;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LstFragment lstFragment=(LstFragment)getSupportFragmentManager().findFragmentByTag("lstfragment");
        if (lstFragment==null){
            lstFragment=new LstFragment();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.add(android.R.id.content,lstFragment,"lstfragment");
            transaction.commit();


            }

    }
}


