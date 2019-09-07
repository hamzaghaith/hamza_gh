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

public class Tourismplacse_a8 extends Activity {

    ListView listview;
    String mTitle[]=new String[]{"قلعة العقبة" ,"مسجد الشريف حسين بن علي"
            , "شاطئ الغندور" , "العقبة أكواريوم","وادي رم"};
    String mDescription[] = {"تاريخي", "ديني", "ترفيهي","ترفيهي","ترفيهي سياحي تاريخي"};
    int images[] = {R.drawable.castleaqaba,R.drawable.mosqueofsharifhusseinbinali
            ,R.drawable.ghandourbeach,R.drawable.aqabaaquarium,R.drawable.wadirum};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a8);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=0yNdXYeYEYHVwAL82JPgBA&q=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...138618.146564..149004...0.1..1.355.3594.0j11j6j1......0....1.........0i71j0i7i30j0i7i10i30j0i67j46i67j0i13j0i8i7i30j30i10.rq-j8srIsI4#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:1168212378646810962,rc_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B9%25D9%2582%25D8%25A8%25D8%25A9,ru_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B9%25D9%2582%25D8%25A8%25D8%25A9"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=bSRdXYzYEYjEwAKa35SADQ&q=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B4%D8%B1%D9%8A%D9%81+%D8%AD%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B3%D8%AC%D8%AF+%D8%A7%D9%84%D8%B4%D8%B1%D9%8A%D9%81+%D8%AD%D8%B3%D9%8A%D9%86+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...33339.37871..38680...0.1..1.456.4386.0j5j7j3j2......0....1.........0i71j46i67i275j0i7i30j30i10.bbPpc7_iV-M#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:16775853054501355002,rc_q:%25D9%2585%25D8%25B3%25D8%25AC%25D8%25AF%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25B1%25D9%258A%25D9%2581%2520%25D8%25AD%25D8%25B3%25D9%258A%25D9%2586%2520%25D8%25A8%25D9%2586%2520%25D8%25B9%25D9%2584%25D9%258A,ru_q:%25D9%2585%25D8%25B3%25D8%25AC%25D8%25AF%2520%25D8%25A7%25D9%2584%25D8%25B4%25D8%25B1%25D9%258A%25D9%2581%2520%25D8%25AD%25D8%25B3%25D9%258A%25D9%2586%2520%25D8%25A8%25D9%2586%2520%25D8%25B9%25D9%2584%25D9%258A"));
                    startActivity(googleIntent);


                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=tyRdXZDFNsPFwQKr6JaoAw&q=%D8%B4%D8%A7%D8%B7%D8%A6+%D8%A7%D9%84%D8%BA%D9%86%D8%AF%D9%88%D8%B1+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D8%B4%D8%A7%D8%B7%D8%A6+%D8%A7%D9%84%D8%BA%D9%86%D8%AF%D9%88%D8%B1+%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...12317.25389..26048...1.1..0.868.4583.0j6j2j1j3j1j1......0....1.........0i71j46i67i275j0i7i30j0i13j0.FaP0vWsgMZE#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:17445966292116881516,rc_q:%25D8%25B4%25D8%25A7%25D8%25B7%25D8%25A6%2520%25D8%25A7%25D9%2584%25D8%25BA%25D9%2586%25D8%25AF%25D9%2588%25D8%25B1,ru_q:%25D8%25B4%25D8%25A7%25D8%25B7%25D8%25A6%2520%25D8%25A7%25D9%2584%25D8%25BA%25D9%2586%25D8%25AF%25D9%2588%25D8%25B1"));
                    startActivity(googleIntent);


                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=7yRdXZfpK4WkwQKd06-AAQ&q=%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%83%D9%88%D8%A7%D8%B1%D9%8A%D9%88%D9%85+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D8%A7%D9%84%D8%B9%D9%82%D8%A8%D9%87+%D8%A7%D9%83%D9%88%D8%A7%D8%B1%D9%8A%D9%88%D9%85+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i71l5.36683.45107..46044...0.2..0.0.0.......0....1.1GoIwtwIVUs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:11798860079545269701,rc_q:Aqaba%2520Aquarium,ru_q:Aqaba%2520Aquarium"));
                    startActivity(googleIntent);


                }

                else if(position==4)
                {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=وادي رم");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);


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
