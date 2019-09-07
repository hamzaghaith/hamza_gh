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

public class Tourismplacse_a10 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"متحف مادبا الأثرية" , "كنيسة سانت جورج الأرثوذكسية اليونانية","كنيسة الرسل" };
    String mDescription[] = {"تاريخي","ديني+تاريخي","ديني+تاريخي"};
    int images[] = {R.drawable.madabaarchaeologicalmuseum,R.drawable.greekorthodox,R.drawable.churchoftheapostles};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a10);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=BihdXdXjD4mkwQLQ_q5w&q=%D9%85%D8%AA%D8%AD%D9%81+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AA%D8%AD%D9%81+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%AB%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...47101.56923..59540...1.1..0.296.5129.0j20j7......0....1.........0i71j0i30j0i7i30j0i7i10i30j46i67i275j0i8i7i10i30j0i7i5i30j41j0j0i8i7i30j0i13i30j0i8i13i30j30i10.6mNUSABymQA#istate=lrl:iv&rlimm=10550674986140970688"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=nihdXYfzKYbZwQLOsKjgCw&q=%D9%83%D9%86%D9%8A%D8%B3%D9%87+%D8%B3%D8%A7%D9%86%D8%AA+%D8%AC%D9%88%D8%B1%D8%AC+%D8%A7%D9%84%D9%8A%D9%88%D9%86%D8%A7%D9%86%D9%8A%D9%87+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%83%D9%86%D9%8A%D8%B3%D9%87+%D8%B3%D8%A7%D9%86%D8%AA+%D8%AC%D9%88%D8%B1%D8%AC+%D8%A7%D9%84%D9%8A%D9%88%D9%86%D8%A7%D9%86%D9%8A%D9%87+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...15101.17490..18445...0.1..0.374.2456.2-7j2......0....1.........0i71.aQB7Py-XY7A#istate=lrl:iv&rlimm=7332986411042896643"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=syhdXe6IHsLEwQKuqp6IBA&q=%D9%83%D9%86%D9%8A%D8%B3%D9%87+%D8%A7%D9%84%D8%B1%D8%B3%D9%84+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%83%D9%86%D9%8A%D8%B3%D9%87+%D8%A7%D9%84%D8%B1%D8%B3%D9%84+%D9%85%D8%A7%D8%AF%D8%A8%D8%A7+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...36863.41620..42265...0.0..0.1335.8728.6-2j6......0....1.QXECUJaocIY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17972147527194103117,rc_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B1%25D8%25B3%25D9%2584,ru_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B1%25D8%25B3%25D9%2584"));
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
