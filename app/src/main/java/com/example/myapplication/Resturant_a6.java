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

public class Resturant_a6 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"مطعم الخير للمشاوي التركية" , "مطعم مزاج" , "مطعم أبو مازن" ,
            "مطعم بوابة الطفيلة" };
    String mDescription [] ={"", "", "", ""};

    int images[] = {R.drawable.alkhairturkishgrillrestaurant, R.drawable.moodrestaurant, R.drawable.abumazenrestaurant
            , R.drawable.tafilahgaterestaurant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a6);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=SAFdXfqnAsbVwQLCtL2YAg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%AE%D9%8A%D8%B1+%D9%84%D9%84%D8%B4%D9%85%D8%A7%D9%88%D9%8A+%D8%A7%D9%84%D8%AA%D8%B1%D9%83%D9%8A%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D9%84%D8%AE%D9%8A%D8%B1+%D9%84%D9%84%D8%B4%D9%85%D8%A7%D9%88%D9%8A+%D8%A7%D9%84%D8%AA%D8%B1%D9%83%D9%8A%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.27098.41918..42944...0.2..0.361.6810.0j11j18j2......0....1.........0i71j0i7i30j0i30j0i8i30.yty3IuYJ-iY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:13218188752017705596,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25AE%25D9%258A%25D8%25B1%2520%25D9%2584%25D9%2584%25D9%2585%25D8%25B4%25D8%25A7%25D9%2588%25D9%258A%2520%25D8%25A7%25D9%2584%25D8%25AA%25D8%25B1%25D9%2583%25D9%258A%25D8%25A9,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D9%2584%25D8%25AE%25D9%258A%25D8%25B1%2520%25D9%2584%25D9%2584%25D9%2585%25D8%25B4%25D8%25A7%25D9%2588%25D9%258A%2520%25D8%25A7%25D9%2584%25D8%25AA%25D8%25B1%25D9%2583%25D9%258A%25D8%25A9"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=JyFdXbOzM8PIwQLTrLDADA&q=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D8%B2%D8%A7%D8%AC+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D9%85%D8%B2%D8%A7%D8%AC+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...66707.73672..79349...0.0..0.391.5346.0j12j12j1......0....1.........30i10.V_u1hggSbv4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2695338366643501152,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2585%25D8%25B2%25D8%25A7%25D8%25AC%2520MAZAJ%2520Resturant,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D9%2585%25D8%25B2%25D8%25A7%25D8%25AC%2520MAZAJ%2520Resturant"));
                    startActivity(googleIntent);
                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=lSFdXb_EOI7EwAKzkJiwAg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%85%D8%A7%D8%B2%D9%86+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A7%D8%A8%D9%88+%D9%85%D8%A7%D8%B2%D9%86+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...11194.15258..15765...1.0..0.261.2733.0j5j8......0....1.........30i10.KVXPo_hPx8Y#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:2304741809930887422,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D8%25A8%25D9%2588%2520%25D9%2585%25D8%25A7%25D8%25B2%25D9%2586,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A7%25D8%25A8%25D9%2588%2520%25D9%2585%25D8%25A7%25D8%25B2%25D9%2586"));
                    startActivity(googleIntent);
                }

                else if(position==3)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=pyFdXZ6xIJLDwQKAoKrABg&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%88%D8%A7%D8%A8%D9%87+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...36845.39865..40559...0.1..0.260.2745.0j5j8......0....1.........0i71.32Avw7FKe6E#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:18211193848793234413,rc_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D9%2588%25D8%25A7%25D8%25A8%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B7%25D9%2581%25D9%258A%25D9%2584%25D8%25A9%2520Tafila%2520Gate,ru_q:%25D9%2585%25D8%25B7%25D8%25B9%25D9%2585%2520%25D8%25A8%25D9%2588%25D8%25A7%25D8%25A8%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B7%25D9%2581%25D9%258A%25D9%2584%25D8%25A9%2520Tafila%2520Gate"));
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
