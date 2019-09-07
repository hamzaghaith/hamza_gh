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

public class Resturant_a1 extends Activity {
    ListView listview;

    String mTitle[]=new String[]{"مطعم هاشم", "مطعم سفره" , "مطعم أريج شام" , "مطعم فخر الدين"  , "كان زمان"};
    String mDescription[] = {"","","","",""};
    int images[] = {R.drawable.hashimrestaurant, R.drawable.restauranttravel, R.drawable.areejshamrestaurant
            , R.drawable.fakhreldinrestaurant, R.drawable.restaurantzaman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a1);
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

                if(position==0)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=vPdcXazeI43dwQL0u6ywDA&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%87%D8%A7%D8%B4%D9%85+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%87%D8%A7%D8%B4%D9%85+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...48573.52324..53276...0.2..0.785.3674.0j5j3j2j0j1j1......0....1.........0i71j0i7i30j46i67j0i13j30i10.NlIaOq4bIEI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16706868647590184418,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2587%25D8%25A7%25D8%25B4%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25B9%25D8%25A8%25D9%258A,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2587%25D8%25A7%25D8%25B4%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25B9%25D8%25A8%25D9%258A"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=vPdcXazeI43dwQL0u6ywDA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B3%D9%81%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B3%D9%81%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...4868.9889..10937...0.1..0.639.3604.2-10j0j1j1......0....1.........0i71j0i7i30j46i67j0i13j0i13i5i30j0i8i13i30j30i10.VsDX5r3iMH4#istate=lrl:iv&rlimm=4548883249632360849"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=KvhcXcGaF4bYwQK1v6OADg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%B1%D9%8A%D8%AC+%D8%A7%D9%84%D8%B4%D8%A7%D9%85+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%B1%D9%8A%D8%AC+%D8%A7%D9%84%D8%B4%D8%A7%D9%85+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...28719.32896..33503...0.1..0.996.6857.2-5j5j6-4......0....1.........0i71j0i7i30j0i13j33i10.I4_Yvgq_LWs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:721976942593220058,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A3%25D8%25B1%25D9%258A%25D8%25AC%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25A7%25D9%2585,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A3%25D8%25B1%25D9%258A%25D8%25AC%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25A7%25D9%2585"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=TvhcXcPpFcTDwAKCnbeYDQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AE%D8%B1+%D8%A7%D9%84%D8%AF%D9%8A%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AE%D8%B1+%D8%A7%D9%84%D8%AF%D9%8A%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...34767.38965..39675...0.1..0.543.6564.2-5j11j2j1......0....1.........0i71j0i7i30j0i13.30gPPbmPT2U#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4600019864815893504,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2581%25D8%25AE%25D8%25B1%25D8%25A7%25D9%2584%25D8%25AF%25D9%258A%25D9%2586,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2581%25D8%25AE%25D8%25B1%25D8%25A7%25D9%2584%25D8%25AF%25D9%258A%25D9%2586"));
                    startActivity(googleIntent);
                }

                else if(position==4)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=efhcXbfxLM3TwALbybOQAw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A7%D9%86+%D8%B2%D9%85%D8%A7%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%83%D8%A7%D9%86+%D8%B2%D9%85%D8%A7%D9%86+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...15386.19617..20574...0.1..0.354.3180.0j15j1j1......0....1.........0i71j0i7i30j0i13j0i8i7i30j30i10j33i10.gXBC6U7hY7Y#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5161381331042390166,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2583%25D8%25A7%25D9%2586%2520%25D8%25B2%25D9%2585%25D8%25A7%25D9%2586%2520Kan%2520Zamaan%2520Restaurant,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2583%25D8%25A7%25D9%2586%2520%25D8%25B2%25D9%2585%25D8%25A7%25D9%2586%2520Kan%2520Zamaan%2520Restaurant"));
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
