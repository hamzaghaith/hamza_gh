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

public class Tourismplacse_a9 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"قلعة الكرك" , "مقام النبي نوح","وادي بن حماد"};
    String mDescription[] = {"تاريخي","تاريخي","تاريخي"};
    int images[] = {R.drawable.karakcastle,R.drawable.noah,R.drawable.wadibinhammad};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a9);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=4iZdXYli0cbAAtmqudAP&q=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i7i30j0i30.45209.51177..52129...0.1..1.273.3286.0j19j1......0....1.........0i71j33i21j0i7i10i30j46i67i275j0i13j0i8i7i30j0i13i30j0i8i13i30.iZIqZhJyGOg#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17300158050447422158,rc_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25A7%25D9%2584%25D9%2583%25D8%25B1%25D9%2583,ru_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25A7%25D9%2584%25D9%2583%25D8%25B1%25D9%2583"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=GCddXcyqBoXPwAKbtYCIBg&q=%D9%85%D9%82%D8%A7%D9%85+%D8%A7%D9%84%D9%86%D8%A8%D9%8A+%D9%86%D9%88%D8%AD+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D9%82%D8%A7%D9%85+%D8%A7%D9%84%D9%86%D8%A8%D9%8A+%D9%86%D9%88%D8%AD+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...32407.41945..42417...0.1..0.205.2982.0j15j3......0....1.........0i71j30i10j0i8i13i30j0i8i7i30.wo_j80XFArs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:626935843043152534,rc_q:%25D9%2585%25D9%2582%25D8%25A7%25D9%2585%2520%25D8%25A7%25D9%2584%25D9%2586%25D8%25A8%25D9%258A%2520%25D9%2586%25D9%2588%25D8%25AD,ru_q:%25D9%2585%25D9%2582%25D8%25A7%25D9%2585%2520%25D8%25A7%25D9%2584%25D9%2586%25D8%25A8%25D9%258A%2520%25D9%2586%25D9%2588%25D8%25AD"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=RCddXYC9HMzLwQKyyq2IDg&q=%D9%88%D8%A7%D8%AF%D9%8A+%D8%A8%D9%86+%D8%AD%D9%85%D8%A7%D8%AF+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%88%D8%A7%D8%AF%D9%8A+%D8%A8%D9%86+%D8%AD%D9%85%D8%A7%D8%AF+%D8%A7%D9%84%D9%83%D8%B1%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...31732.37582..38431...0.1..2.256.3407.0j16j3....2..0....1.........0i71j46i67i275j0i7i30j46i13i275j0i8i7i30j0i13i30j0i8i67j0i30j0i8i30j30i10.DhRLMCvryRo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5648649687470933166,rc_q:Wadi%2520Bin%2520Hammad,ru_q:Wadi%2520Bin%2520Hammad"));
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
