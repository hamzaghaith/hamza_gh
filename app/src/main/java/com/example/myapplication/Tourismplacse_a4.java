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

public class Tourismplacse_a4 extends Activity {

    ListView listview;


    String mTitle[]=new String[]{"متحف السلط الأثري" ,  "الكنيسة الأرثوذكسية" , "المسجد العثماني" ,"مطل شراع الستين","البحر الميت"};

    String mDescription [] = {"تاريخي","ديني","ديني","ترفيهي","علاجي"};

    int images[] = {R.drawable.saltmuseum, R.drawable.achurch, R.drawable.theottomanmosque, R.drawable.overlookingthe60thstreet
            , R.drawable.deadsea};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a4);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=tfxcXcHDFIHewAKx2rCwCQ&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%84%D8%B7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D8%B3%D9%84%D8%B7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...141422.147355..148306...0.0..0.266.4725.0j17j8......0....1.........0i7i30j46i67i275j0i13j0j0i8i30.fm2HzIXO6dY#istate=lrl:iv&rlimm=12084846055080725395"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=S_1cXYb3I4TMwQKZyomICA&q=%D8%A7%D9%84%D9%83%D9%86%D9%8A%D8%B3%D9%87+%D8%A7%D9%84%D8%A3%D8%B1%D8%AB%D9%88%D8%B0%D9%83%D8%B3%D9%8A%D9%87+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D9%83%D9%86%D9%8A%D8%B3%D9%87+%D8%A7%D9%84%D8%A3%D8%B1%D8%AB%D9%88%D8%B0%D9%83%D8%B3%D9%8A%D9%87+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...34990.82454..83172...15.1..0.401.7328.0j13j20j0j1......0....1.........0i71j30i10j0i8i30j0i7i30j0i8i7i30.lHMXbcJiDBs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1265983744569339865,rc_q:St%2520George's%2520Church%252C%2520As-Salt.,ru_q:St%2520George's%2520Church%252C%2520As-Salt"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=oP1cXaGEIYrdwQLlxb2ABw&q=%D8%A7%D9%84%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B9%D8%AB%D9%85%D8%A7%D9%86%D9%8A+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B9%D8%AB%D9%85%D8%A7%D9%86%D9%8A+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...33512.38839..39693...0.1..0.252.3435.0j13j5......0....1.........0i71j0i7i30j0i8i7i30j30i10.RZ-IEwZfyYE#istate=lrl:iv&rlimm=14917047501269273784"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=yv1cXZOdFcmkwQLLi5uQCA&q=%D9%85%D8%B7%D9%84+%D8%B4%D8%A7%D8%B1%D8%B9+%D8%A7%D9%84%D8%B3%D8%AA%D9%8A%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D9%84+%D8%B4%D8%A7%D8%B1%D8%B9+%D8%A7%D9%84%D8%B3%D8%AA%D9%8A%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7++%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...35321.44172..44841...0.1..0.259.3121.0j10j6......0....1.........0i71j0i7i30j0i8i7i30j30i10.w12_7NT4oLg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3255582000708998113,rc_q:%25D9%2585%25D8%25B7%25D9%2584%2520%25D8%25B4%25D8%25A7%25D8%25B1%25D8%25B9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D8%25AA%25D9%258A%25D9%2586,ru_q:%25D9%2585%25D8%25B7%25D9%2584%2520%25D8%25B4%25D8%25A7%25D8%25B1%25D8%25B9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D8%25AA%25D9%258A%25D9%2586"));
                    startActivity(googleIntent);

                }

                else
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/travel/hotels/%D8%A7%D9%84%D8%A8%D8%AD%D8%B1%20%D8%A7%D9%84%D9%85%D9%8A%D8%AA/entity/CgsIgrGFhorpv8bzARAB?g2lb=4208993%2C4253230%2C4253565%2C4254308%2C4258168%2C4260007%2C4274032%2C4276661%2C4282357%2C4291191%2C4295675%2C4296057%2C4265427%2C4270859%2C4272931%2C4295946&hl=ar&gl=jo&un=1&q=%D9%85%D9%88%D9%82%D8%B9%20%D8%A7%D9%84%D8%A8%D8%AD%D8%B1%20%D8%A7%D9%84%D9%85%D9%8A%D8%AA%20%20%D9%81%D9%8A%20%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&rp=OAJAAEgC&ictx=1&hrf=KhYKBwjjDxAIGBUSBwjjDxAIGBYYASgAsAEAaAGaARcSFdin2YTYqNit2LEg2KfZhNmF2YrYqqIBIQoIL20vMDJjbnASFdin2YTYqNit2LEg2KfZhNmF2YrYqpIBAiAB&tcfs=EjsKCC9tLzAyY25wEhXYp9mE2KjYrdixINin2YTZhdmK2KoaGAoKMjAxOS0wOC0yMRIKMjAxOS0wOC0yMlIA&ap=MAFaAA"));
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
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }


        @Override
        public View getView(int position,  View convertView,  ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }
}
