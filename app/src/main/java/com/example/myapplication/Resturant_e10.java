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

public class Resturant_e10 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Darna Restaurant ","Restaurant Lunch Basket","Madaba Fences Restaurant",
            "Haret Jdoudna Restaurant","Madaba Mandi Restaurant "};
    String mDescription[] = {"","","","",""};
    int images[] = {R.drawable.darnarestaurant, R.drawable.restaurantlunchbasket,R.drawable.madabafencesrestaurant
            ,R.drawable.haretjdoudnarestaurant,R.drawable.mandirestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e10);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=J1pzXb3TCNecjLsPw-aSyAE&hotel_occupancy=&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%AF%D8%A7%D8%B1%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%AF%D8%A7%D8%B1%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.8907.12987..13021...1.0..1.751.2711.0j8j6-2......0....1.......8..41j0j46j0i22i30.5SukBsyc3bo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10082549763838367680,rc_q:Darna%2520Take%2520Away,ru_q:Darna%2520Take%2520Away"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=YFpzXb3EEcXlgwe15KWYAw&q=Food+Basket+Restaurant&oq=Food+Basket+Restaurant&gs_l=mobile-gws-wiz-serp.3..0l3j0i22i30l3.24417.24417..25274...0.0..0.145.279.0j2......0....1.......8..41.L9Jgh6CsIRM#istate=lrl:iv&rlimm=11993315623967520804"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=e1pzXZvLA-etgweE2JKwAw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%B3%D9%88%D8%A7%D8%B1+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%B3%D9%88%D8%A7%D8%B1+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&gs_l=mobile-gws-wiz-serp.3..0i22i30.27783.32919..32956...0.1..1.265.1745.0j8j2......0....1.......8..0i71j41j0j46j0i19j0i22i30i19.b_KXNGhQJdI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:11309374115105870239,rc_q:Aswar%2520Madaba%2520Restaurant,ru_q:Aswar%2520Madaba%2520Restaurant"));
                    startActivity(googleIntent);

                }


                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=nVpzXYqmJIzagwfskIfgBA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%A7%D8%B1%D8%A9+%D8%AC%D8%AF%D9%88%D8%AF%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%A7%D8%B1%D9%87+&gs_l=mobile-gws-wiz-serp.1.1.0i19l6j0i22i30i19l2.18800.21448..24495...0.1..0.194.1121.0j8......0....1.......8..0i71j41j0j46.lsY4kl594Lo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:333736136090912191,rc_q:Haret%2520Jdoudna,ru_q:Haret%2520Jdoudna"));
                    startActivity(googleIntent);
                }


                else if(position==4)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=t1pzXc2iKsOajLsPsbeeyAk&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D9%86%D8%AF%D9%8A+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D9%86%D8%AF%D9%8A+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.22808.26855..26925...1.1..0.208.1523.0j8j2......0....1.......8..0i71j41i19j41j0j46.vD5AfA3pwR0#istate=lrl:iv&rlimm=6102047027208247085"));
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
