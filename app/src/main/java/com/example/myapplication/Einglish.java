package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

public class Einglish extends Activity {
    ListView listView;
    String mTitle[] =new String[]{"Amman","Irbid","Jerash","Alsalt","Alzarqa","Altafila","Ajloun","Alaqaba"
            ,"Alkarak","Madaba","Maan","Almafraq"};
    String mDescription[] = {"","","","","","","","","","","",""};
    int images[] = {R.drawable.amman, R.drawable.irbid, R.drawable.jerash, R.drawable.salt,
            R.drawable.zarqa,R.drawable.tafila,R.drawable.ajloun,R.drawable.aqaba
            ,R.drawable.karak,R.drawable.madaba,R.drawable.maan,R.drawable.mafraq};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einglish);

        listView=(ListView)findViewById(R.id.lv);

        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub

                if(position==0)
                {
                    Intent i=new Intent("android.intent.action.amman_e");
                    startActivity(i);
                }
                else if(position==1){
                    Intent i=new Intent("android.intent.action.irbid_e");
                    startActivity(i);
                }

                else if(position==2)
                {
                    Intent i=new Intent("android.intent.action.jerash_e");
                    startActivity(i);
                }

                else if(position==3)
                {
                    Intent i=new Intent("android.intent.action.salt_e");
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i=new Intent("android.intent.action.zarqa_e");
                    startActivity(i);
                }

                else if(position==5)
                {
                    Intent i=new Intent("android.intent.action.tafilah_e");
                    startActivity(i);
                }
                else if(position==6)
                {
                    Intent i=new Intent("android.intent.action.ajloun_e");
                    startActivity(i);
                }


                else if(position==7)
                {
                    Intent i=new Intent("android.intent.action.aqaba_e");
                    startActivity(i);
                }
                else if(position==8)
                {
                    Intent i=new Intent("android.intent.action.kara_e");
                    startActivity(i);
                }
                else if(position==9)
                {
                    Intent i=new Intent("android.intent.action.madaba_e");
                    startActivity(i);
                }
                else if(position==10)
                {
                    Intent i=new Intent("android.intent.action.maan_e");
                    startActivity(i);
                }
                else if(position==11)
                {
                    Intent i=new Intent("android.intent.action.mafraq_e");
                    startActivity(i);
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
