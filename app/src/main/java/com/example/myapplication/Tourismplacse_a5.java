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

public class Tourismplacse_a5 extends Activity {

    ListView listview;

    String mTitle [] = new String [] {"قصر عمرة","قصر شبيب"};
    String mDescription [] = {"تاريخي","تاريخي"};

    int images[] = {R.drawable.amrapalace, R.drawable.shabibpalace};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a5);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=nP9cXcqsFIOkwAKz2KGoCw&q=%D9%82%D8%B5%D8%B1+%D8%B9%D9%85%D8%B1%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&oq=%D9%82%D8%B5%D8%B1+%D8%B9%D9%85%D8%B1%D9%87+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...49386.59664..60745...0.1..0.302.4758.0j13j10j1......0....1.........0i71j30i10j0i7i30j46i67i275j0i8i7i30j0i13i30j0i8i13i30j0i30.I01c42FrVa0#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:4189699778198464204,rc_q:%25D9%2582%25D8%25B5%25D9%258A%25D8%25B1%2520%25D8%25B9%25D9%2585%25D8%25B1%25D9%2587,ru_q:%25D9%2582%25D8%25B5%25D9%258A%25D8%25B1%2520%25D8%25B9%25D9%2585%25D8%25B1%25D9%2587"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=NgBdXefKDYbVwQLq8YWgDA&q=%D9%82%D8%B5%D8%B1+%D8%B4%D8%A8%D9%8A%D8%A8+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%82%D8%B5%D8%B1+%D8%B4%D8%A8%D9%8A%D8%A8+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i5i30l2.8000.13970..14765...0.1..0.223.3481.0j15j4......0....1.........0i71j0i7i30j0i7i5i30.vcWuVOspc6g#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15903649970668547733,rc_q:%25D9%2582%25D8%25B5%25D8%25B1%2520%25D8%25B4%25D8%25A8%25D9%258A%25D8%25A8,ru_q:%25D9%2582%25D8%25B5%25D8%25B1%2520%25D8%25B4%25D8%25A8%25D9%258A%25D8%25A8"));
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
