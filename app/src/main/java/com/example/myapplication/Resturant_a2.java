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

public class Resturant_a2 extends Activity {
    ListView listview;

    String mTitle[]=new String[]{"مطعم السلطان", " مطعم ياسين الفوال","مطعم نور ماليزيا"};


    String mDescription[] = {""," ",""};
    int images[] = {R.drawable.sultanrestaurant, R.drawable.yassinalfawwalrestaurant, R.drawable.nourrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a2);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&q=%D8%A7%D9%84%D8%B3%D9%84%D8%B7%D8%A7%D9%86+%D8%A5%D8%B1%D8%A8%D8%AF&ludocid=12512468751125527379&ibp=gwp;0,7&lsig=AB86z5WQDHsarkvVryMfkQGbjO1d&phdesc=aRtqPq-tAGI&sa=X&ved=2ahUKEwiDiqanv5PkAhWLZlAKHTS0A6MQvS4wAXoECAsQYA&biw=360&bih=600"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=8vlcXYPJMovNwQK06I6YCg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D9%81%D9%88%D8%A7%D9%84+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D9%81%D9%88%D8%A7%D9%84+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...68.18231..18989...8.0..1.1060.5059.1j6j1j1j0j1j2j1......0....1.........33i160j30i10j33i10.qupe9XjUgwg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10098685370968507304,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%258A%25D8%25A7%25D8%25B3%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D9%2581%25D9%2588%25D8%25A7%25D9%2584,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%258A%25D8%25A7%25D8%25B3%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D9%2581%25D9%2588%25D8%25A7%25D9%2584"));
                    startActivity(googleIntent);

                }


                else
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=L_pcXa_yDM_5wAKE-4mAAQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D9%88%D8%B1+%D9%85%D8%A7%D9%84%D9%8A%D8%B2%D9%8A%D8%A7+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D9%88%D8%B1+%D9%85%D8%A7%D9%84%D9%8A%D8%B2%D9%8A%D8%A7+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...33336.39578..40323...0.0..1.1511.5839.0j1j4j5-2j1j1j1......0....1.........30i10.ueloRhU1H2Q#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:13217545224125216715,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2586%25D9%2588%25D8%25B1%2520%25D9%2585%25D8%25A7%25D9%2584%25D9%258A%25D8%25B2%25D9%258A%25D8%25A7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2586%25D9%2588%25D8%25B1%2520%25D9%2585%25D8%25A7%25D9%2584%25D9%258A%25D8%25B2%25D9%258A%25D8%25A7"));
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
