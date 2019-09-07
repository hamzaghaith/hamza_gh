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

public class Resturant_e7 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"مطعم عمو صالح الشامي", " بروستد لقمه الرضوان / عجلون" , "مطعم وكافيه اطلالة القلعة"};
    String mDescription[] = {"","",""};
    int images[] = {R.drawable.amorestaurant, R.drawable.broasted,R.drawable.castlerestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e7);
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

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=ClRzXYmIGZXMgwf0mougBw&hotel_occupancy=&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B9%D9%85%D9%88+%D8%B5%D8%A7%D9%84%D8%AD+%D8%A7%D9%84%D8%B4%D8%A7%D9%85%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B9%D9%85%D9%88+%D8%B5%D8%A7%D9%84%D8%AD+&gs_l=mobile-gws-wiz-serp.1.1.0i19l4j0i22i30i19l4.3600.8325..12116...0.1..0.208.1613.0j9j1......0....1.......8..0i71j41i19j41i22i30j41j0j46j0i22i30.e5JmUggkyiY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:7188578275505474628,rc_q:Amo%2520Saleh%2520Al-Shami%2520Resturant%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B9%25D9%2585%25D9%2588%2520%25D8%25B5%25D8%25A7%25D9%2584%25D8%25AD%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25A7%25D9%2585%25D9%258A,ru_q:Amo%2520Saleh%2520Al-Shami%2520Resturant%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B9%25D9%2585%25D9%2588%2520%25D8%25B5%25D8%25A7%25D9%2584%25D8%25AD%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25A7%25D9%2585%25D9%258A"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MlRzXaG0NuaBjLsPjsmo8AM&q=%D8%A8%D8%B1%D9%88%D8%B3%D8%AA%D8%AF+%D9%84%D9%82%D9%85%D9%87+%D8%A7%D9%84%D8%B1%D8%B6%D9%88%D8%A7%D9%86+%D8%B9%D8%AC%D9%84%D9%88%D9%86&oq=%D8%A8%D8%B1%D9%88%D8%B3%D8%AA%D8%AF+%D9%84%D9%82%D9%85%D9%87+%D8%A7%D9%84%D8%B1%D8%B6%D9%88%D8%A7%D9%86+%D8%B9%D8%AC%D9%84%D9%88%D9%86&gs_l=mobile-gws-wiz-serp.3..0i22i30i19.19619.25393..25426...1.0..0.267.2030.0j8j3......0....1.......8..41i19j41i22i30j41j0j46j46i275j0i10j0i22i30j33i160.xyYWfR9w6-I#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5034675348128778015,rc_q:Broasted%2520summit%2520Radwan%2520%252F%2520Ajloun,ru_q:Broasted%2520summit%2520Radwan%2520%252F%2520Ajloun"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=TVRzXYbAOeHigwehkLWgAw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%88%D9%83%D8%A7%D9%81%D9%8A%D9%87+%D8%A7%D8%B7%D9%84%D8%A7%D9%84%D8%A9+%D8%A7%D9%84%D9%82%D9%84%D8%B9%D8%A9&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%88+%D9%83%D8%A7%D9%81%D9%8A%D9%87+%D8%A3%D8%B7%D9%84%D8%A7%D9%84%D9%87+%D8%A7%D9%84%D9%82&gs_l=mobile-gws-wiz-serp.1.0.0i22i30j33i22i29i30l3.19306.37212..39097...2.1..0.226.3575.0j20j2......0....1.......8..0i71j41j41i19j41i22i30j0j46j0i19j0i10i19j0i13j0i13i30j0i13i30i19j0i22i30i19j33i21j33i160.uaLC8OJi3Bk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6947101280495121951,rc_q:Castle%2520View%2520Resturant%2520and%2520Cafe%2520Ajloun,ru_q:Castle%2520View%2520Resturant%2520and%2520Cafe%2520Ajloun"));
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
