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

public class Tourismplacse_a7 extends Activity {
    ListView listview;
    String mTitle[]=new String[]{"قلعة عجلون" , "منتزه و محمية غابة عجلون" , "منتزه اشتفينا السياحي"
            ,"مسار الجب السياحي" , "محمية غابات دبين" , "كنيسة سيدة الجبل"};
    String mDescription[] = {"تاريخي","ترفيهي","ترفيهي","مزار سياحي","محميه وطنيه","ديني"};
    int images[] = {R.drawable.ajlooncastle,R.drawable.ajlounforestpark,R.drawable.ishtafinatouristpark
            ,R.drawable.thepathofthetourist,R.drawable.dibeenforestreserve,R.drawable.churchofourladyofthemountain};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourismplacse_a7);
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


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=0SFdXbyKO8LOwQLTqpK4BQ&q=%D9%82%D9%84%D8%B9%D9%87+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%82%D9%84%D8%B9%D9%87+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..0i7i30.75941.82514..84485...0.0..1.420.3730.0j3j9j2j1......0....1.........0i30j46i67i275j0i13.7_wQK7AUs9w#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:12472082876583266860,rc_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586,ru_q:%25D9%2582%25D9%2584%25D8%25B9%25D8%25A9%2520%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586"));
                    startActivity(googleIntent);

                }


                else if(position==1)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=KCJdXaOZINLfwQL73ZSIAg&q=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D9%88%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D9%88%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...39255.43642..44635...0.1..0.391.3504.0j6j9j1......0....1.........0i71j46i67i275j0i7i30j30i10.1LUulZEQykc#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:6033599800690261870,rc_q:%25D9%2585%25D8%25AA%25D9%2586%25D8%25B2%25D9%2587%2520%25D9%2588%2520%25D9%2585%25D8%25AD%25D9%2585%25D9%258A%25D8%25A9%2520%25D8%25BA%25D8%25A7%25D8%25A8%25D8%25A7%25D8%25AA%2520%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586,ru_q:%25D9%2585%25D8%25AA%25D9%2586%25D8%25B2%25D9%2587%2520%25D9%2588%2520%25D9%2585%25D8%25AD%25D9%2585%25D9%258A%25D8%25A9%2520%25D8%25BA%25D8%25A7%25D8%25A8%25D8%25A7%25D8%25AA%2520%25D8%25B9%25D8%25AC%25D9%2584%25D9%2588%25D9%2586"));
                    startActivity(googleIntent);

                }


                else if(position==2)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=VyJdXZrtDczZwQKnwbjQDA&q=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D8%B4%D8%AA%D9%81%D9%8A%D9%86%D8%A7+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D9%86%D8%AA%D8%B2%D9%87+%D8%A7%D8%B4%D8%AA%D9%81%D9%8A%D9%86%D8%A7+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...37495.65633..66421...3.1..0.262.4973.0j11j13......0....1.........0i71j30i10.Mufkmea9SfA#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:10211078725541908745,rc_q:%25D9%2585%25D9%2586%25D8%25AA%25D8%25B2%25D9%2587%2520%25D8%25A7%25D8%25B4%25D8%25AA%25D9%2581%25D9%258A%25D9%2586%25D8%25A7%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D9%258A,ru_q:%25D9%2585%25D9%2586%25D8%25AA%25D8%25B2%25D9%2587%2520%25D8%25A7%25D8%25B4%25D8%25AA%25D9%2581%25D9%258A%25D9%2586%25D8%25A7%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D9%258A"));
                    startActivity(googleIntent);

                }

                else if(position==3)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=nCJdXfLUB8HZwQKV8qXYDg&q=%D9%85%D8%B3%D8%A7%D8%B1+%D8%A7%D9%84%D8%AC%D8%A8+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%B3%D8%A7%D8%B1+%D8%A7%D9%84%D8%AC%D8%A8+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D9%8A+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3...42481.49810..50396...0.1..0.305.5998.0j7j19j1......0....1.........0i71j46i67i275j0i7i30.ojQvglNUCXw#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:5865522979500227194,rc_q:%25D9%2585%25D8%25B3%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D9%258A,ru_q:%25D9%2585%25D8%25B3%25D8%25A7%25D8%25B1%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%2520%25D8%25A7%25D9%2584%25D8%25B3%25D9%258A%25D8%25A7%25D8%25AD%25D9%258A"));
                    startActivity(googleIntent);

                }

                else if(position==4)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=0CJdXdWXKdD5wQKds5r4Ag&q=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D9%88%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%AF%D8%A8%D9%8A%D9%86+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%85%D8%AD%D9%85%D9%8A%D9%87+%D9%88%D8%BA%D8%A7%D8%A8%D8%A7%D8%AA+%D8%AF%D8%A8%D9%8A%D9%86+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.51807.59756..60592...0.0..0.278.4968.0j9j14......0....1.........0i7i30j0i8i7i30j0i8i30j0i8i13i30j33i10.EfEDOZL8_0E#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:14925668244918489302,rc_q:%25D9%2585%25D8%25AD%25D9%2585%25D9%258A%25D8%25A9%2520%25D8%25BA%25D8%25A7%25D8%25A8%25D8%25A7%25D8%25AA%2520%25D8%25AF%25D8%25A8%25D9%258A%25D9%2586,ru_q:%25D9%2585%25D8%25AD%25D9%2585%25D9%258A%25D8%25A9%2520%25D8%25BA%25D8%25A7%25D8%25A8%25D8%25A7%25D8%25AA%2520%25D8%25AF%25D8%25A8%25D9%258A%25D9%2586"));
                    startActivity(googleIntent);

                }

                else if(position==5)
                {


                    Intent googleIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?hl=ar&biw=360&bih=600&ei=DyNdXbvdBYvfwAKTt5mQCQ&q=%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%B3%D9%8A%D8%AF%D9%87+%D8%A7%D9%84%D8%AC%D8%A8%D9%84+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&oq=%D9%83%D9%86%D8%B3%D9%8A%D9%87+%D8%B3%D9%8A%D8%AF%D9%87+%D8%A7%D9%84%D8%AC%D8%A8%D9%84+%D8%B9%D8%AC%D9%84%D9%88%D9%86+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86&gs_l=mobile-gws-wiz-serp.3..30i10.24683.30947..31562...0.1..0.342.4418.0j12j8j1......0....1.........0i71j0i8i30j46i67i275j0i7i30j0i8i7i30.nmXcPN6oUTs#trex=m_t:lcl_akp,rc_f:nav,rc_ludocids:8357605594836829364,rc_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25B3%25D9%258A%25D8%25AF%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%25D9%2584,ru_q:%25D9%2583%25D9%2586%25D9%258A%25D8%25B3%25D8%25A9%2520%25D8%25B3%25D9%258A%25D8%25AF%25D8%25A9%2520%25D8%25A7%25D9%2584%25D8%25AC%25D8%25A8%25D9%2584"));
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
