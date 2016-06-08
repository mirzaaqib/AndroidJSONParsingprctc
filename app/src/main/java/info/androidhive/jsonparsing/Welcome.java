package info.androidhive.jsonparsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Mirzaaqibbeg on 17-03-2016.
 */
public class Welcome extends Activity {


        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        }

        public  void  onClick(View v)
        {

            Intent intent=new Intent(this,Home.class);

            startActivity(intent);
        }

    public  void  laundryClick(View v)
    {

        Intent intent=new Intent(this,Home.class);

        startActivity(intent);
    }
    public  void  trainingClick(View v)
    {

        Intent intent=new Intent(this,Home.class);

        startActivity(intent);
    }
    public  void  flowerClick(View v)
    {

        Intent intent=new Intent(this,Home.class);

        startActivity(intent);
    }


}
