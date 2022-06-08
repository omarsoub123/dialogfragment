package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

class convDialog  {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt: Button=view.findViewById(R.id.cancelBT)
        val submitbt: Button=view.findViewById(R.id.submitBT)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{

            val num2:TextView=view.findViewById(R.id.editTextNumber2)
            var result=num2.toString().toFloat()
            result= (result*1.79).toFloat()
            Toast.makeText(context,num2.toString()+result.toString()+"USD",Toast.LENGTH_LONG).show())

        }
    }
}