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

public class Resturant_a7 extends Activity {
    ListView listview;
    String mTitle[]=new String[]{"مطعم عمو صالح الشامي", " بروستد لقمه الرضوان / عجلون" , "مطعم وكافيه اطلالة القلعة"};
    String mDescription[] = {"","",""};
    int images[] = {R.drawable.amorestaurant, R.drawable.broasted,R.drawable.castlerestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a7);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=PSNdXZ-rA8zNwAKh2Ydg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B9%D9%85%D9%88+%D8%B5%D8%A7%D9%84%D8%AD+%D8%A7%D9%84%D8%B4%D8%A7%D9%85%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B9%D9%85%D9%88+%D8%B5%D8%A7%D9%84%D8%AD+%D8%A7%D9%84%D8%B4%D8%A7%D9%85%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...37109.46541..47340...0.1..0.291.5281.0j9j17......0....1.........0i71j30i10j46i67i275j0i7i30j0.vjaa693Hxus#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:7188578275505474628,rc_q:Amo%2520Saleh%2520Al-Shami%2520Resturant%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B9%25D9%2585%25D9%2588%2520%25D8%25B5%25D8%25A7%25D9%2584%25D8%25AD%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25A7%25D9%2585%25D9%258A,ru_q:Amo%2520Saleh%2520Al-Shami%2520Resturant%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25B9%25D9%2585%25D9%2588%2520%25D8%25B5%25D8%25A7%25D9%2584%25D8%25AD%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25A7%25D9%2585%25D9%258A"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=biNdXYPmFoimwQKJvou4Ag&q=%D8%A8%D8%B1%D9%88%D8%B3%D8%AA%D8%AF+%D9%84%D9%82%D9%85%D9%87+%D8%A7%D9%84%D8%B1%D8%B6%D9%88%D8%A7%D9%86+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D8%A8%D8%B1%D9%88%D8%B3%D8%AA%D8%AF+%D9%84%D9%82%D9%85%D9%87+%D8%A7%D9%84%D8%B1%D8%B6%D9%88%D8%A7%D9%86+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...38314.48026..48809...0.0..1.314.6142.0j5j21j1......0....1.........46i67i275j0i7i30j0i8i7i30j30i10.c8pTeFCnZxU#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5034675348128778015,rc_q:%25D8%25A8%25D8%25B1%25D9%2588%25D8%25B3%25D8%25AA%25D8%25AF%2520%25D9%2584%25D9%2582%25D9%2585%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B1%25D8%25B6%25D9%2588%25D8%25A7%25D9%2586%252F%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586,ru_q:%25D8%25A8%25D8%25B1%25D9%2588%25D8%25B3%25D8%25AA%25D8%25AF%2520%25D9%2584%25D9%2582%25D9%2585%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B1%25D8%25B6%25D9%2588%25D8%25A7%25D9%2586%252F%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=oSNdXYjoDcHJwQKsvpygBQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%B7%D9%84%D8%A7%D9%84%D9%87+%D8%A7%D9%84%D8%AC%D8%A8%D9%84+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%B7%D9%84%D8%A7%D9%84%D9%87+%D8%A7%D9%84%D8%AC%D8%A8%D9%84+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...33575.47308..48270...1.1..0.553.5472.0j13j9j0j1j1......0....1.........0i71j46i67i275j0i7i30j0j30i10.1_yPYomRytg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6947101280495121951,rc_q:Resturant%2520and%2520cafe'%2520castle%2520view%2520(%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2588%25D9%2583%25D8%25A7%25D9%2581%25D9%258A%25D9%2587%2520%25D8%25A7%25D8%25B7%25D9%2584%25D8%25A7%25D9%2584%25D8%25A9%2520%25D8%25A7%25D9%2584%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520),ru_q:Resturant%2520and%2520cafe'%2520castle%2520view%2520(%2520%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2588%25D9%2583%25D8%25A7%25D9%2581%25D9%258A%25D9%2587%2520%25D8%25A7%25D8%25B7%25D9%2584%25D8%25A7%25D9%2584%25D8%25A9%2520%25D8%25A7%25D9%2584%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520)"));
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
