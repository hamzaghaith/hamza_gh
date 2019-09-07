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

public class Tourismplacse_a6 extends Activity {

    ListView listview;

    String mTitle[]=new String[]{"محميه ضانا","قلعه السلع"," حمامات عفرا","كهف لوط"};

    String mDescription [] = {"منتزه وطني","تاريخي","علاجي ","تاريخي"};

    int images[] = {R.drawable.dhanareserve, R.drawable.castlegoods, R.drawable.ofrabaths, R.drawable.cavelot};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a6);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=vwBdXa6LPIHFwQLDkrXADQ&q=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D8%B6%D8%A7%D9%86%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D8%B6%D8%A7%D9%86%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...47953.55425..56668...0.1..0.222.4537.0j23j3......0....1.........0i71j0i30j0i5i30j0i7i30j46i67i275j46i67j0i13i30j0i8i30j30i10.NFoatXTZzLY#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5940986896009862011,rc_q:%25D9%2585%25D8%25AD%25D9%2585%25D9%258A%25D8%25A9%2520%25D8%25B6%25D8%25A7%25D9%2586%25D8%25A7,ru_q:%25D9%2585%25D8%25AD%25D9%2585%25D9%258A%25D8%25A9%2520%25D8%25B6%25D8%25A7%25D9%2586%25D8%25A7"));
                    startActivity(googleIntent);

                }
                else if(position==1)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=-gBdXcu7IMTDwAKCnbeYDQ&q=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D8%B3%D9%84%D8%B9+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%82%D9%84%D8%B9%D9%87+%D8%A7%D9%84%D8%B3%D9%84%D8%B9+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...31117.34570..35185...0.1..0.195.2127.0j13......0....1.........0i71j0i7i30j0i30j0i8i30j30i10.82FltF7AUTI#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:7719945646145139336,rc_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%2584%25D8%25B9,ru_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%2584%25D8%25B9"));
                    startActivity(googleIntent);

                }

                else if(position==2)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=HwFdXbevNs7VwQK7l4CABA&q=%D8%AD%D9%85%D8%A7%D9%85%D8%A7%D8%AA+%D8%B9%D9%81%D8%B1%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D8%AD%D9%85%D8%A7%D9%85%D8%A7%D8%AA+%D8%B9%D9%81%D8%B1%D8%A7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...32097.37399..38195...0.0..0.239.2437.0j12j2......0....1.........0i7i30j0i30j0i8i30j30i10.kUwKaIbAtvo#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:15343974744172080197,rc_q:%25D8%25AD%25D9%2585%25D8%25A7%25D9%2585%25D8%25A7%25D8%25AA%2520%25D8%25B9%25D9%2581%25D8%25B1%25D8%25A7,ru_q:%25D8%25AD%25D9%2585%25D8%25A7%25D9%2585%25D8%25A7%25D8%25AA%2520%25D8%25B9%25D9%2581%25D8%25B1%25D8%25A7"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {

                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=SAFdXfqnAsbVwQLCtL2YAg&q=%D9%83%D9%87%D9%81+%D9%84%D9%88%D8%B7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%83%D9%87%D9%81+%D9%84%D9%88%D8%B7+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D9%87+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...57503.60894..61629...0.1..1.975.3179.0j7j4-1j1j1......0....1.........0i71j0i7i30j0i30j0i8i30.R8EUgWbwK60#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5354071698814997535,rc_q:%25D9%2583%25D9%2587%25D9%2581%2520%25D9%2584%25D9%2588%25D8%25B7,ru_q:%25D9%2583%25D9%2587%25D9%2581%2520%25D9%2584%25D9%2588%25D8%25B7"));
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
