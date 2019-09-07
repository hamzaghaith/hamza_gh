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

public class Resturant_e12 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"Hadramout Restaurant" , "Green Saloon Restaurant & Sweets" , "Mafraq Pizza" };
    String mDescription []={"","","",""};

    int images[] = {R.drawable.hadramoutrestaurant, R.drawable.greensaloon,R.drawable.mafraqpizza};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e12);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%B6%D8%B1%D9%85%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82&spell=1&sa=X&ved=0ahUKEwjnhpTnl77kAhUGDmMBHWbMCjcQBQglKAA&biw=360&bih=600#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2126246461377099550,rc_q:Hadramout%2520restaurant,ru_q:Hadramout%2520restaurant"));
                    startActivity(googleIntent);
                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=5ltzXcD-Dqq8gwfsv7_4CQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%88+%D8%AD%D9%84%D9%88%D9%8A%D8%A7%D8%AA+%D8%A7%D9%84%D8%B5%D8%A7%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%88+%D8%AD%D9%84%D9%88%D9%8A%D8%A7%D8%AA+%D8%A7%D9%84%D8%B5%D8%A7%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82&gs_l=mobile-gws-wiz-serp.3..33i22i29i30l5.22797.45829..45873...1.0..0.271.3905.0j21j3......0....1.......8..41j0j46j41i22i30j0i19j0i10i19j0i22i30i19j0i22i10i30i19j0i22i30j0i22i10i30j0i13i10i30i19j33i21j33i160.vkjN4mkmnjo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3407140788522119260,rc_q:Restaurant%2520%2526%2520Sweets%2520Green%2520Saloon,ru_q:Restaurant%2520%2526%2520Sweets%2520Green%2520Saloon"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=FVxzXciaHJiEjLsP7JytKA&q=%D8%A8%D9%8A%D8%AA%D8%B2%D8%A7+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82&oq=%D8%A8%D9%8A%D8%AA%D8%B2%D8%A7+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82&gs_l=mobile-gws-wiz-serp.3..0i19l3j0i22i30i19l5.18669.23684..23755...1.1..0.165.1133.0j8......0....1.......8..0i71j41j0j46.dk4PmGowY1o#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6004641461002178710,rc_q:Pizza%2520divider,ru_q:Pizza%2520divider"));
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
