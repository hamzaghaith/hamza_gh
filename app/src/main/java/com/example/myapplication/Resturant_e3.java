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

public class Resturant_e3 extends Activity {


    ListView listview;

    String mTitle[]=new String[]{"Ya hala resturant" , "Restaurants and Gardens Green Valley" ,
            " Panorama Jerash Restaurants", "Abu Ahmed Restaurant"};

    String mDescription[] = {"","","",""};
    int images[] = {R.drawable.yahalarestaurant, R.drawable.greenvalleyrestaurant,
            R.drawable.panoramarestaurant, R.drawable.abouahmedrestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_e3);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=SPlwXYaBLoaIlwSJ9oSACg&hotel_occupancy=&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7+%D9%87%D9%84%D8%A7+%D9%81%D9%8A+%D8%AC%D8%B1%D8%B4&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%8A%D8%A7+%D9%87%D9%84%D8%A7+%D9%81%D9%8A+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19l7.3269.11525..11563...2.0..1.401.4430.2-7j7j1......0....1.......8..41j41i19j41i22i30j0i131j0j46j0i10i19j0i22i30j0i13i30i19j0i8i13i30i19.irTamhwJ7D4#trex=m_t:lcl_akp,rc_ludocids:8183655448583039001,ru_phdesc:wPvmgATLqC0"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=evlwXfnUKcWLlwTttazgBQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%88%D8%AD%D8%AF%D8%A7%D8%A6%D9%82+%D8%A7%D9%84%D9%88%D8%A7%D8%AF%D9%8A+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%88%D8%AD%D8%AF%D8%A7%D8%A6%D9%82+&gs_l=mobile-gws-wiz-serp.1.0.0i19l8.1427065.1436504..1439706...0.1..0.237.2415.0j6j6....2..0....1.......8..0i71j41j41i19j41i22i30j0i131j0j46j0i13j0i13i30.XH8rolM6dSM#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17300712602299005059,rc_q:Restaurants%2520and%2520Gardens%2520Green%2520Valley,ru_q:Restaurants%2520and%2520Gardens%2520Green%2520Valley"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=HP9wXeWWB42zkwXo7baQBw&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D8%A7%D9%86%D9%88%D8%B1%D8%A7%D9%85%D8%A7+%D8%AC%D8%B1%D8%B4&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D8%A7%D9%86%D9%88%D8%B1%D8%A7%D9%85%D8%A7+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-serp.3..0i19j0i22i30i19j33i160.110192.119745..119804...3.1..0.258.2034.0j5j5....2..0....1.......8..0i71j41i19j41j41i22i30j0i131j0j46j46i275j0i22i30.-zZe0xhae5Q#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:87662448184506685,rc_q:Panorama%2520Jerash%2520Restaurants,ru_q:Panorama%2520Jerash%2520Restaurants"));
                    startActivity(googleIntent);
                }


                else
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?biw=360&bih=600&ei=lv9wXc2MAY32gAbRv6jgCQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%A7%D8%AD%D9%85%D8%AF+%D9%81%D9%8A+%D8%AC%D8%B1%D8%B4&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D8%A7%D8%AD%D9%85%D8%AF+%D9%81%D9%8A+%D8%AC%D8%B1%D8%B4&gs_l=mobile-gws-wiz-serp.3..0i22i30l5j33i22i29i30j33i160l2.24269.32090..32159...2.1..1.266.4048.0j8j12....2..0....1.......8..0i71j41j41i19j0i131j0j46.Fakq4-cBtCY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10306592406264227834,rc_q:Abu%2520Ahmed%2520Restaurant,ru_q:Abu%2520Ahmed%2520Restaurant"));
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
