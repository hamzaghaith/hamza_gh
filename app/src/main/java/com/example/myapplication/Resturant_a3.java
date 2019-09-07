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

public class Resturant_a3 extends Activity {
    ListView listview;

    String mTitle[]=new String[]{ "مطعم يا هلا" , "مطاعم وحدائق الوادي الأخضر" ,
             "مطاعم بانوراما جرش" , "مطعم أبو أحمد"};

    String mDescription[] = {"","","",""};
    int images[] = {R.drawable.yahalarestaurant, R.drawable.greenvalleyrestaurant,
            R.drawable.panoramarestaurant, R.drawable.abouahmedrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a3);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=2_tcXZTANcXWwALc24bABg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7+%D9%87%D9%84%D8%A7+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7+%D9%87%D9%84%D8%A7+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i71l5.42933.46955..47844...0.1..0.584.584.5-1......0....1.KL9DmR_x1L0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2648850255180414680,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%258A%25D8%25A7%25D9%2587%25D9%2584%25D8%25A7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%258A%25D8%25A7%25D9%2587%25D9%2584%25D8%25A7"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=2_tcXZTANcXWwALc24bABg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D9%88%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D9%88%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i7i30l8.85.16014..16893...1.0..4.3965.12228.2-2j6-1j9-3......0....1.........33i160.Vh-0qCOM3RI#istate=lrl:iv&rlimm=17300712602299005059"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=VvxcXfuSLJDdwQLu_YjICw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D8%A7%D9%86%D9%88%D8%B1%D8%A7%D9%85%D8%A7+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D8%A7%D9%86%D9%88%D8%B1%D8%A7%D9%85%D8%A7+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i71l5.31644.41469..42358...0.1..0.0.0.......0....1.Kaj9IDd8vPE#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:87662448184506685,rc_q:%25D9%2585%25D8%25B7%25D8%25A7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D8%25A7%25D9%2586%25D9%2588%25D8%25B1%25D8%25A7%25D9%2585%25D8%25A7%2520%25D8%25AC%25D8%25B1%25D8%25B4,ru_q:%25D9%2585%25D8%25B7%25D8%25A7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D8%25A7%25D9%2586%25D9%2588%25D8%25B1%25D8%25A7%25D9%2585%25D8%25A7%2520%25D8%25AC%25D8%25B1%25D8%25B4"));
                    startActivity(googleIntent);
                }


                else
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=iPxcXZT0PITYwALPjY74Cw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%A7%D8%AD%D9%85%D8%AF+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%A7%D8%AD%D9%85%D8%AF+%D8%AC%D8%B1%D8%B4+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...24570.28295..29085...0.1..0.199.2886.0j16......0....1.........0i71j30i10j0i13i30j0i8i13i30j0i7i30j33i10.JOdaOlzpHWk#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10306592406264227834,rc_q:%25D9%2585%25D8%25B7%25D8%25A7%25D8%25B9%25D9%2585%2520%25D9%2588%25D9%2585%25D8%25B9%25D8%25AC%25D9%2586%25D8%25A7%25D8%25AA%2520%25D8%25A7%25D8%25A8%25D9%2588%2520%25D8%25A7%25D8%25AD%25D9%2585%25D8%25AF,ru_q:%25D9%2585%25D8%25B7%25D8%25A7%25D8%25B9%25D9%2585%2520%25D9%2588%25D9%2585%25D8%25B9%25D8%25AC%25D9%2586%25D8%25A7%25D8%25AA%2520%25D8%25A7%25D8%25A8%25D9%2588%2520%25D8%25A7%25D8%25AD%25D9%2585%25D8%25AF"));
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
