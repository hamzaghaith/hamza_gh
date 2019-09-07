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

public class Resturant_a11 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"مطعم بيت البركة"  , "مطبخ البتراء" };


    String mDescription[] = {"","","",""};
    int images[] = {R.drawable.barakahouserestaurant, R.drawable.petrakitchen};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant_a11);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=SHRdXe2MPKKn1fAPv9a1wAs&q=%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%8A%D8%AA+%D8%A7%D9%84%D8%A8%D8%B1%D9%83%D9%87+%D9%85%D8%B9%D8%A7%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=+%D9%85%D8%B7%D8%B9%D9%85+%D8%A8%D9%8A%D8%AA+%D8%A7%D9%84%D8%A8%D8%B1%D9%83%D9%87+%D9%85%D8%B9%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.1.0.30i10.15627.26585..28851...0.1..0.188.4092.0j25......0....1.........0i71j0i67j0i7i10i30j0i7i30j46i67.UOywyIZiyjw#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:11249969658647647773,rc_q:Beit%2520Al-Barakah%2520restaurant,ru_q:Beit%2520Al-Barakah%2520restaurant"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {
                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?ei=sXRdXauKNPCP1fAP0paVmA4&q=%D9%85%D8%B7%D8%A8%D8%AE+%D8%A7%D9%84%D8%A8%D8%AA%D8%B1%D8%A7%D8%A1++%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B7%D8%A8%D8%AE+%D8%A7%D9%84%D8%A8%D8%AA%D8%B1%D8%A7%D8%A1++%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...7101.8049..8839...0.1..0.168.597.0j4......0....1.........0i71j30i10.eub74qZtm4Y#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6584750682822410668,rc_q:Petra%2520Kitchen,ru_q:Petra%2520Kitchen"));
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
