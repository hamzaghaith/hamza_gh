package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

public class Resturant_a9 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"مطعم عادل حلبي" , "مطعم قلعة الملك"};
    String mDescription[] = {"","",""};
    int images[] = {R.drawable.adelhalabirestaurant,R.drawable.kingscastlerestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a9);
        listview=(ListView)findViewById(R.id.lv);
        // now create an adapter class
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listview.setAdapter(adapter);
        // there is my mistake...
        // now again check this..
        // now set item click on list view
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                if(position==0)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=widdXcmZK4nbwQLR0JCoAg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B9%D8%AF%D9%84+%D8%AD%D9%84%D8%A8%D9%8A+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B9%D8%AF%D9%84+%D8%AD%D9%84%D8%A8%D9%8A+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.13821.27687..28025...5.0..1.417.3777.0j8j6j2j1......0....1.........0i30j0i8i30.mIwjEqPmMl4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:13550852181689151167,rc_q:Adel%2520Halabi%2520Restaurant,ru_q:Adel%2520Halabi%2520Restaurant"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=4CddXeblAozKwALalarQBA&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D9%85%D9%84%D9%83+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D9%85%D9%84%D9%83+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...31168.35534..36055...0.0..0.352.3388.0j16j1j1......0....1.........0i30j0i8i30.iBjHcivEsfE#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14923645537808386389,rc_q:King's%2520Castle%2520Restaurant,ru_q:King's%2520Castle%2520Restaurant"));
                    startActivity(googleIntent);

                }





            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.resturants, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }


        @Override
        public View getView(int position,  View convertView,  ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View resturants = layoutInflater.inflate(R.layout.resturants, parent, false);
            ImageView images = resturants.findViewById(R.id.image);
            TextView myTitle = resturants.findViewById(R.id.textView1);
            TextView myDescription = resturants.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return resturants;
        }
    }
}
