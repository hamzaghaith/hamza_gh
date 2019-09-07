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

public class Resturant_a4 extends Activity {
    ListView listview;

    String mTitle[]=new String[]{ "مطعم ابوخميس"," مطعم الغربال","مطعم طواحين السلط","مطعم فحم و لحم"};

    String mDescription [] = {"","","",""};

    int images[] = {R.drawable.abukhamisrestaurant, R.drawable.thesieverestaurant, R.drawable.windmillsrestaurant
            , R.drawable.charcoalandmeatrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a4);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=kP5cXeHnOsvYwQL-orrICw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%AE%D9%85%D9%8A%D8%B3+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%AE%D9%85%D9%8A%D8%B3+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...3611.23779..28243...3.1..1.349.4629.0j13j9j1......0....1.........0i71j0i7i30j0i8i7i30j0i8i13i30j0i8i30j30i10.0As4qHwOrJc#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2007360791059223533,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A3%25D8%25A8%25D9%2588%2520%25D8%25AE%25D9%2585%25D9%258A%25D8%25B3,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A3%25D8%25A8%25D9%2588%2520%25D8%25AE%25D9%2585%25D9%258A%25D8%25B3"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=Jv9cXeHYJ8rdwQLiloGgBA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%BA%D8%B1%D8%A8%D8%A7%D9%84+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%BA%D8%B1%D8%A8%D8%A7%D9%84+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...28802.33888..34643...1.1..0.233.3662.0j18j3......0....1.........0i71j0i8i30j0i8i13i30j0i8i7i30j30i10.Z2Gdr8aDg4U#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4037443441092554263,rc_q:%25D9%2585%25D8%25B7%25D8%25A7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25BA%25D8%25B1%25D8%25A8%25D8%25A7%25D9%2584,ru_q:%25D9%2585%25D8%25B7%25D8%25A7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25BA%25D8%25B1%25D8%25A8%25D8%25A7%25D9%2584"));
                    startActivity(googleIntent);
                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=S_9cXaPFCsvbwALwmZ-QAQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B7%D9%88%D8%A7%D8%AD%D9%8A%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B7%D9%88%D8%A7%D8%AD%D9%8A%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...35279.39896..40772...0.1..0.289.2461.0j9j4......0....1.........0i71j0i8i7i30j0i8i30j0i8i13i30j30i10.w845gjUzIeM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:9945115932256352592,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B7%25D9%2588%25D8%25A7%25D8%25AD%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%2584%25D8%25B7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B7%25D9%2588%25D8%25A7%25D8%25AD%25D9%258A%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%2584%25D8%25B7"));
                    startActivity(googleIntent);

                }

                else
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=df9cXeDZNYrRwQKs-6WgAw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AD%D9%85+%D9%88+%D9%84%D8%AD%D9%85+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%81%D8%AD%D9%85+%D9%88+%D9%84%D8%AD%D9%85+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.29183.35667..36554...0.1..0.240.2522.0j13j1......0....1.........0i71j0i8i30j0i8i13i30.sEepLSggq7M#istate=lrl:iv&rlimm=3959322196268434581"));
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
