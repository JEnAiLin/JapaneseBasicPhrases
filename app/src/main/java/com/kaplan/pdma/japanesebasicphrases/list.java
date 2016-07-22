package com.kaplan.pdma.japanesebasicphrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        final ArrayList<String> myList = new ArrayList<String>();

        myList.add("toire = Toilet");
        myList.add("tasukete = HELP");
        myList.add("wakarimasen = I don't understand");
        myList.add("keisatsu = Police");
        myList.add("jikan = Time");
        myList.add("shitsumon = Question");
        myList.add("itsu = When");
        myList.add("sensei = Teacher");
        myList.add("gakusei = Student");
        myList.add("hoteru = Hotel");
        myList.add("kuukou = Airport");
        myList.add("eki = Station");
        myList.add("nihon = Japan");
        myList.add("onaka suita = Hungry");
        myList.add("tabemasu = To Eat");
        myList.add("oishii = Tasty");
        myList.add("konbini = Convenience Store");
        myList.add("arigatougozaimasu = Thank You");
        myList.add("mata ashita = See You Tomorrow");
        myList.add("oyasuminasai = Good Night");
        myList.add("atsui = Hot");
        myList.add("samui = Cold");
        myList.add("aka = Red");
        myList.add("ao = Blue");
        myList.add("kuro = Black");
        myList.add("shiro = White");
        myList.add("juu = Ten");
        myList.add("hyaku = 100");
        myList.add("sen = 1,000");
        myList.add("man = 10,000");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);

        myListView.setAdapter(arrayAdapter);
    }
}
