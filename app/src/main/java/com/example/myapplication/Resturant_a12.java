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

public class Resturant_a12 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"مطعم حضرموت" , "مطعم وحلويات الصالون الأخضر", "بيتزا المفرق" };
    String mDescription []={"","","",""};

    int images[] = {R.drawable.hadramoutrestaurant, R.drawable.greensaloon,R.drawable.mafraqpizza};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a12);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=6nRdXd_FKuPExgPxt6qQDQ&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%B6%D8%B1+%D9%85%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%AD%D8%B6%D8%B1+%D9%85%D9%88%D8%AA+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i13.180170.188082..189028...0.1..0.321.4679.0j24j2j1......0....1.........0i71j0i30j0i5i30j0i7i30j46i67i275j0i67j0i7i10i30j0i8i7i30j0i7i5i30j0i8i30j0j30i10.20JHTJXeH8s#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2126246461377099550,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25AD%25D8%25B6%25D8%25B1%2520%25D9%2585%25D9%2588%25D8%25AA,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25AD%25D8%25B6%25D8%25B1%2520%25D9%2585%25D9%2588%25D8%25AA"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=qXVdXduvLJGYlwSlmrrAAg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%B5%D8%A7%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%B5%D8%A7%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%AE%D8%B6%D8%B1+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...3698.8982..11072...0.1..0.284.3638.0j19j2......0....1.........0i71j0i7i30j0i30j0i8i30j0i8i7i30j30i10.uV8WfFmNkgs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5655273975657332074,rc_q:%25D8%25AD%25D9%2584%25D9%2588%25D9%258A%25D8%25A7%25D8%25AA%2520%25D8%25A7%25D9%2584%25D8%25B5%25D8%25A7%25D9%2584%25D9%2588%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25A7%25D8%25AE%25D8%25B6%25D8%25B1,ru_q:%25D8%25AD%25D9%2584%25D9%2588%25D9%258A%25D8%25A7%25D8%25AA%2520%25D8%25A7%25D9%2584%25D8%25B5%25D8%25A7%25D9%2584%25D9%2588%25D9%2586%2520%25D8%25A7%25D9%2584%25D8%25A7%25D8%25AE%25D8%25B6%25D8%25B1"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=ynVdXbuIAYy_lwSphIvgBg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%8A%D8%AA%D8%B2%D8%A7+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%8A%D8%AA%D8%B2%D8%A7+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...3019.6018..6422...0.1..1.183.1474.0j10......0....1.........0i71j0i7i30j0i30j0i8i30j0i13i30j0i8i13i30j30i10.DjkF5qL136k#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6004641461002178710,rc_q:%25D8%25A8%25D9%258A%25D8%25AA%25D8%25B2%25D8%25A7%2520%25D8%25A7%25D9%2584%25D9%2585%25D9%2581%25D8%25B1%25D9%2582,ru_q:%25D8%25A8%25D9%258A%25D8%25AA%25D8%25B2%25D8%25A7%2520%25D8%25A7%25D9%2584%25D9%2585%25D9%2581%25D8%25B1%25D9%2582"));
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
