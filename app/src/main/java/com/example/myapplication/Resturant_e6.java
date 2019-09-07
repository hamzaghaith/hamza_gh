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

public class Resturant_e6 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"مطعم الخير للمشاوي التركية" , "مطعم مزاج" , "مطعم أبو مازن" ,
            "مطعم بوابة الطفيلة" };
    String mDescription [] ={"", "", "", ""};

    int images[] = {R.drawable.alkhairturkishgrillrestaurant, R.drawable.moodrestaurant, R.drawable.abumazenrestaurant
            , R.drawable.tafilahgaterestaurant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e6);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=rghxXYjJKcz3kwXklKmYDw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%AE%D9%8A%D8%B1+%D9%84%D9%84%D8%B4%D9%85%D8%A7%D9%88%D9%8A+%D8%A7%D9%84%D8%AA%D8%B1%D9%83%D9%8A%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%AE%D9%8A%D8%B1+%D9%84%D9%84%D8%B4%D9%85%D8%A7%D9%88%D9%8A+%D8%A7%D9%84%D8%AA%D8%B1%D9%83%D9%8A%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..30i10.14636.20760..20787...1.0..0.271.2900.0j6j8......0....1.......8..41i19j41j0j0i131j46j0i22i30j33i160.83WU2x31im0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:13218188752017705596,rc_q:Good%2520Restaurant%2520Turkish%2520Grill,ru_q:Good%2520Restaurant%2520Turkish%2520Grill"));
                    startActivity(googleIntent);


                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=zghxXZrxNcKukwWqi7uwCg&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D8%B2%D8%A7%D8%AC+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D8%B2%D8%A7%D8%AC+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..0i22i30.26924.33255..33287...1.0..0.261.2310.0j4j7......0....1.......8..41j41i19j0j46j0i131j0i10j33i160.p5lrDggKYRc#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2695338366643501152,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2585%25D8%25B2%25D8%25A7%25D8%25AC%2520MAZAJ%2520Resturant,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2585%25D8%25B2%25D8%25A7%25D8%25AC%2520MAZAJ%2520Resturant"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=8ghxXYq5C8-bsAeG3LOIAQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%85%D8%A7%D8%B2%D9%86+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%85%D8%A7%D8%B2%D9%86+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..33i160.20935.26892..26922...1.0..0.254.2234.0j6j5......0....1.......8..41j41i19j0j0i131j46j0i22i30.WrD-pLiKBn4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2304741809930887422,rc_q:Abu%2520Mazen%2520Restaurant,ru_q:Abu%2520Mazen%2520Restaurant"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=DglxXaazM4O4kwWLyp6YAg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87&gs_l=mobile-gws-wiz-serp.3..0i22i30l2j33i160.47281.52938..52972...1.2..0.363.1888.0j3j4j1......0....1.......8..0i71j41j41i19j0j0i131j46.E6uiDK1_AB4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:18211193848793234413,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D9%2588%25D8%25A7%25D8%25A8%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B7%25D9%2581%25D9%258A%25D9%2584%25D8%25A9%2520Tafila%2520Gate,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D9%2588%25D8%25A7%25D8%25A8%25D8%25A9%2520"));
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
