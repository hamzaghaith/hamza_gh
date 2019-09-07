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

public class Tourismplacse_a2 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"متحف دار السرايا","بيت عرار الثقافي" };


    String mDescription[] = {"تاريخي","ثقافي"};
    int images[] = {R.drawable.daralsarayamuseum,R.drawable.ararculturalhouse};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a2);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=n_hcXabTAs7UwAKXwK74BA&q=%D9%85%D8%AA%D8%AD%D9%81+%D8%AF%D8%A7%D8%B1+%D8%A7%D9%84%D8%B3%D8%B1%D8%A7%D9%8A%D8%A7+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D8%AF%D8%A7%D8%B1+%D8%A7%D9%84%D8%B3%D8%B1%D8%A7%D9%8A%D8%A7+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...71266.78748..79678...0.1..0.233.5252.0j21j7......0....1.........0i71j0i7i30j0i30j46i67i275j46i67j0i13j0j30i10.Jmx-jihFFZo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2814077232301631203,rc_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25AF%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25B3%25D8%25B1%25D8%25A7%25D9%258A%25D8%25A7,ru_q:%25D9%2585%25D8%25AA%25D8%25AD%25D9%2581%2520%25D8%25AF%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25B3%25D8%25B1%25D8%25A7%25D9%258A%25D8%25A7"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=NvlcXdecO47WwALyl6OwBg&q=%D8%A8%D9%8A%D8%AA+%D8%B9%D8%B1%D8%A7%D8%B1+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D8%A8%D9%8A%D8%AA+%D8%B9%D8%B1%D8%A7%D8%B1+%D8%A7%D9%84%D8%AB%D9%82%D8%A7%D9%81%D9%8A+%D8%A7%D8%B1%D8%A8%D8%AF+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...20883.27415..28331...0.1..0.430.5601.2-19j0j2......0....1.........0i71j0i7i30j0i8i7i30.Vk8v2_k2aLo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:3019751873913304186,rc_q:%25D8%25A8%25D9%258A%25D8%25AA%2520%25D8%25B9%25D8%25B1%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25AB%25D9%2582%25D8%25A7%25D9%2581%25D9%258A,ru_q:%25D8%25A8%25D9%258A%25D8%25AA%2520%25D8%25B9%25D8%25B1%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25AB%25D9%2582%25D8%25A7%25D9%2581%25D9%258A"));
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

