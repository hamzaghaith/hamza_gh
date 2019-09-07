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

public class Resturant_a10 extends Activity {
    ListView listview;
    String mTitle[]=new String[]{"مطعم دارنا" , "مطعم سلة الغداء" , "مطعم أسوار مادبا" ,
            "مطعم حارة جدودنا" , "مطعم مندي مادبا" };
    String mDescription[] = {"","","","",""};
    int images[] = {R.drawable.darnarestaurant, R.drawable.restaurantlunchbasket,R.drawable.madabafencesrestaurant
            ,R.drawable.haretjdoudnarestaurant,R.drawable.mandirestaurant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a10);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=cildXafoN4LUwAKYuYXYCA&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%AF%D8%A7%D8%B1%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%AF%D8%A7%D8%B1%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...30920.39617..40716...0.0..1.306.4540.0j11j10j1......0....1.........30i10j46i275j0i7i30j0i8i7i30j0i8i30.7hWr3qr2FiY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10082549763838367680,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25AF%25D8%25A7%25D8%25B1%25D9%2586%25D8%25A7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25AF%25D8%25A7%25D8%25B1%25D9%2586%25D8%25A7"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=nSldXZW7CIHDwAKfpb6wCQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%B3%D9%84%D9%87+%D8%A7%D9%84%D8%BA%D8%AF%D8%A7%D8%A1+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%B3%D9%84%D9%87+%D8%A7%D9%84%D8%BA%D8%AF%D8%A7%D8%A1+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.29383.34691..35623...1.1..0.275.3401.0j9j7......0....1.........0i71j0i7i30j0i8i30.ljaTDgPiBbo#istate=lrl:iv&rlimm=11993315623967520804"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=wildXdnpIMLawQKS_KP4CQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%B3%D9%88%D8%A7%D8%B1+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A3%D8%B3%D9%88%D8%A7%D8%B1+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...42974.46912..47491...0.0..1.476.4068.0j11j7j0j1......0....1.........0i8i13i30j0i7i30j0i8i30j30i10.N88-dCG9fdY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:11309374115105870239,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D8%25B3%25D9%2588%25D8%25A7%25D8%25B1%2520%25D9%2585%25D8%25A7%25D8%25AF%25D8%25A8%25D8%25A7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D8%25B3%25D9%2588%25D8%25A7%25D8%25B1%2520%25D9%2585%25D8%25A7%25D8%25AF%25D8%25A8%25D8%25A7"));
                    startActivity(googleIntent);

                }


                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=8yldXdSZN8fQwQKEwbbIBQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%A7%D8%B1%D9%87+%D8%AC%D8%AF%D9%88%D8%AF%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%A7%D8%B1%D9%87+%D8%AD%D8%AF%D9%88%D8%AF%D9%86%D8%A7+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.1.0.30i10.54323.59693..61702...1.1..0.256.4120.0j9j11......0....1.........0i71j0i7i30j0i8i7i30j0i8i30j0i8i13i30.xkwN_aa-oZw#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:333736136090912191,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25AD%25D8%25A7%25D8%25B1%25D8%25A9%2520%25D8%25AC%25D8%25AF%25D9%2588%25D8%25AF%25D9%2586%25D8%25A7,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25AD%25D8%25A7%25D8%25B1%25D8%25A9%2520%25D8%25AC%25D8%25AF%25D9%2588%25D8%25AF%25D9%2586%25D8%25A7"));
                    startActivity(googleIntent);

                }


                else if(position==4)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=MypdXdHcHdH4wAKykqioDQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D9%86%D8%AF%D9%8A++%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D9%86%D8%AF%D9%8A++%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...47983.51917..52676...0.1..0.484.4105.0j4j7j4j1......0....1.........0i71j30i10j0i7i30j0i8i30.3MRCzv3XmOw#istate=lrl:iv&rlimm=6102047027208247085"));
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
