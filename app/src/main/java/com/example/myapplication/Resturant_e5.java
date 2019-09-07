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

public class Resturant_e5 extends Activity {

    ListView listview;

    String mTitle [] = new String [] {"Abu Wajeeh Sons Restaurant", "Nar Snack Restaurant", "Abu Nafi Restaurants"};
    String mDescription [] = {"","","","",""};

    int images[] = {R.drawable.abuwajeehsonsrestaurant, R.drawable.narsnackrestaurant, R.drawable.abounafearestaurant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e5);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?source=hp&ei=9QZxXdn-E8uJlwSNxLGoCA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%A8%D9%86%D8%A7%D8%A1+%D8%A7%D8%A8%D9%88+%D9%88%D8%AC%D9%8A%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%A8%D9%86%D8%A7%D8%A1+%D8%A7%D8%A8%D9%88+%D9%88%D8%AC%D9%8A%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&gs_l=mobile-gws-wiz-hp.3..0i22i30l8.2930.10120..10188...1.0..1.254.2855.0j8j6......0....1.......8..41j41i19j41i22i10i30j0j0i131j46j0i19j0i22i30i19.067gUkASmFk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3425010221381694640,rc_q:Abu%2520Wajih%2520Sons%2520Restaurant,ru_q:Abu%2520Wajih%2520Sons%2520Restaurant"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MQdxXdqIMo-6kwWWuIiwBg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%B1+%D8%B3%D9%86%D8%A7%D9%83+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%B1+%D8%B3%D9%86%D8%A7%D9%83+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&gs_l=mobile-gws-wiz-serp.3..0i19l2j0i22i30i19l6.26870.37151..37225...2.1..0.240.2624.0j7j6......0....1.......8..0i71j41j41i19j41i22i10i30j0j0i131j46.2IvOHsIb8D4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14498731077121460693,rc_q:NAR%2520Snack%2520Restaurant,ru_q:NAR%2520Snack%2520Restaurant"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MQdxXdqIMo-6kwWWuIiwBg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%86%D8%A7%D9%81%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%86%D8%A7%D9%81%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1&gs_l=mobile-gws-wiz-serp.3..0i19l4j0i22i30i19l4.4106.8326..8341...0.1..2.765.3116.0j3j5j6-2......0....1.......8..0i71j41j41i19j41i22i10i30j0j0i131j46.4594KFdo_eM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15884504847404736322,rc_q:abu%2520Nafe,ru_q:abu%2520Nafe"));
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
