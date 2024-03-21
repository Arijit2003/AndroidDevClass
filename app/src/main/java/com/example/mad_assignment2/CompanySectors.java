package com.example.mad_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

public class CompanySectors extends AppCompatActivity {
    String tata="Tata Motors Limited is an Indian multinational automotive company, headquartered in Mumbai and part of the Tata Group. The company produces cars, trucks, vans, and busses.[6]\n" +
            "\n" +
            "Subsidiaries include British Jaguar Land Rover and South Korean Tata Daewoo. Tata Motors has joint ventures with Hitachi (Tata Hitachi Construction Machinery) and Stellantis, which makes vehicle parts for Fiat Chrysler and Tata-branded vehicles. On 12 October 2021, private equity firm TPG invested $1 billion in Tata Motors' electric vehicle subsidiary.[7]";
    String microsoft="We operate our business in five segments: Windows & Windows Live Division, Server and Tools, Online Services Division, Microsoft Business Division, and Entertainment and Devices Division. Our segments provide management with a comprehensive financial view of our key businesses. The segments enable the alignment of strategies and objectives across the development, sales, marketing, and services organizations, and they provide a framework for timely and rational allocation of development, sales, marketing, and services resources within businesses. Additional information on our operating segments and geographic and product information is contained";
    String amazon="The company has multiple subsidiaries, including Amazon Web Services, providing cloud computing, Zoox, a self-driving car division, Kuiper Systems, a satellite Internet provider, and Amazon Lab126, a computer hardware R&D provider. Other subsidiaries include Ring, Twitch, IMDb, and Whole Foods Market.";
    String reliance = "Our operations span the exploration and production of oil and gas to the manufacture of petroleum products, polyester products, polyester intermediates, plastics, polymer intermediates, chemicals, synthetic textiles and fabrics. Each of our brands is a natural extension of our philosophy of excellence.";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_sectors);
        findViewById(R.id.nextBtn).setOnClickListener(view->{
            startActivity(new Intent(this,LabAssessment2.class));
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void showPOPUP(View view) {
        switch (view.getId()){
            case R.id.reliance:{
                getPopUp(reliance);
                break;
            }
            case R.id.microsoft:{
                getPopUp(microsoft);
                break;
            }
            case R.id.amazon:{
                getPopUp(amazon);
                break;
            }
            case R.id.tataMotors:{
                getPopUp(tata);
                break;
            }


        }
    }
    public void getPopUp(String s){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.sectors);
        TextView tv = dialog.findViewById(R.id.sectorContent);
        tv.setText(s);
        ImageButton imageButton = dialog.findViewById(R.id.closeBtn);
        imageButton.setOnClickListener((view)->{
            dialog.dismiss();
        });
        dialog.show();
    }
}