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

public class Resturant_a5 extends Activity {
    ListView listview;

    String mTitle [] = new String []{ "مطعم أبناء أبو وجيه" , "مطعم نار سناك","مطاعم أبو نافع" };
    String mDescription [] = {"","","","",""};

    int images[] = {R.drawable.abuwajeehsonsrestaurant, R.drawable.narsnackrestaurant, R.drawable.abounafearestaurant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a5);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=RgBdXcO2KMbUwAL744z4DQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%A8%D9%86%D8%A7%D8%A1+%D8%A7%D8%A8%D9%88+%D9%88%D8%AC%D9%8A%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%A8%D9%86%D8%A7%D8%A1+%D8%A7%D8%A8%D9%88+%D9%88%D8%AC%D9%8A%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...28987.40722..41427...0.1..0.304.4057.0j21j1j1......0....1.........0i71j0i7i30j0i7i5i30j46i67j0i30j0i8i30j0i8i7i30j30i10.n2Hnftbk3zk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3425010221381694640,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A3%25D8%25A8%25D9%2586%25D8%25A7%25D8%25A1%2520%25D8%25A3%25D8%25A8%25D9%2588%2520%25D9%2588%25D8%25AC%25D9%258A%25D9%2587,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A3%25D8%25A8%25D9%2586%25D8%25A7%25D8%25A1%2520%25D8%25A3%25D8%25A8%25D9%2588%2520%25D9%2588%25D8%25AC%25D9%258A%25D9%2587"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=cgBdXaT6A8ujwALyuqyQDw&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%B1+%D8%B3%D9%86%D8%A7%D9%83+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%86%D8%A7%D8%B1+%D8%B3%D9%86%D8%A7%D9%83+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...35428.40166..40590...0.1..0.201.3836.0j20j2......0....1.........0i71j30i10j0i7i30j0i30j0i8i30.82e9U9hSRmI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14498731077121460693,rc_q:%25D9%2586%25D8%25A7%25D8%25B1%2520%25D8%25B3%25D9%2586%25D8%25A7%25D9%2583%2520nar%2520snack,ru_q:%25D9%2586%25D8%25A7%25D8%25B1%2520%25D8%25B3%25D9%2586%25D8%25A7%25D9%2583%2520nar%2520snack"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=nABdXYDtMYHNwQLR2ZTQCA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%86%D8%A7%D9%81%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%86%D8%A7%D9%81%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...26915.30327..31054...0.1..0.203.2704.0j15j1......0....1.........0i71j0i7i30j0i30j0i8i30j0i8i7i30j30i10.sHX0JUY9NQQ#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15884504847404736322,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D8%25A8%25D9%2588%2520%25D9%2586%25D8%25A7%25D9%2581%25D8%25B9,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D8%25A8%25D9%2588%2520%25D9%2586%25D8%25A7%25D9%2581%25D8%25B9"));
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
