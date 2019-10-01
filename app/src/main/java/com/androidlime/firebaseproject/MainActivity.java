package com.androidlime.firebaseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

     private DatabaseReference databaseReference;


    // private EditText editText;



    String[] name={"Mithun","Laboni","Sazzad","Chodon","Priya","Boss"};


    ArrayList<DataList>arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         databaseReference= FirebaseDatabase.getInstance().getReference().child("User");
        //   databaseReference= FirebaseDatabase.getInstance().getReference().child("info");


        ///  object create kore firebase a data add korci..............................>

        //    UserData userData=new UserData("Mithun","25");
        //  databaseReference.setValue(userData);


        //Hasmap er use kore firebase a data add korci......................................>

        //   HashMap<String,String> hashMap=new HashMap<>();
        //    hashMap.put("Like","FaceBook");
        //   hashMap.put("Hoby","Programming");

        //  databaseReference.setValue(hashMap);


        //editText= (EditText) findViewById(R.id.write);

        arrayList =new ArrayList<DataList>();


        int i =0;

       while (i<name.length)
       {

           DataList dataList=new DataList(name[i]);
           arrayList.add(dataList);
           i++;

       }


        databaseReference.child("List").setValue(arrayList);


    }


    //onclik method ta use kore Hasmap er madhome data add korci......................

    ///public void SendData(View view) {


    /// String data=editText.getText().toString();


    //  HashMap<String,String> hashMap=new HashMap<>();
    //  hashMap.put("userdata",data);


    //  databaseReference.child("User1").setValue(hashMap);

//  }





}
