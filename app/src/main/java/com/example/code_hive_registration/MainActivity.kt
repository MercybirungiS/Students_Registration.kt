package com.example.code_hive_registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etName=findViewById<EditText>(R.id.etName)
        var etDOB=findViewById<EditText>(R.id.etDOB)
        var etNationality=findViewById<EditText>(R.id.etNationality)
        var etIDno=findViewById<EditText>(R.id.etIDno)
        var etEmail=findViewById<EditText>(R.id.etEmail)
        var etPhoneNumber=findViewById<EditText>(R.id.etPhoneNumber)
        var btnRegister=findViewById<Button>(R.id.btnRegister)


        btnRegister.setOnClickListener {
            var name=etName.text.toString()
            var dob=etDOB.text.toString()
            var nationality=etNationality.text.toString()
            var idNumber=etIDno.text.toString()
            var email=etEmail.text.toString()
            var phoneNumber=etPhoneNumber.text.toString()

            var details=Details(name=name,dob=dob,nationality=nationality,idNumber=idNumber,email=email,phoneNumber=phoneNumber)



            Toast.makeText(baseContext,details.toString(),Toast.LENGTH_LONG).show()
//            Toast.makeText(baseContext,dob,Toast.LENGTH_LONG).show()
//            Toast.makeText(baseContext,nationality,Toast.LENGTH_LONG).show()
//            Toast.makeText(baseContext,idNumber,Toast.LENGTH_LONG).show()
//            Toast.makeText(baseContext,email,Toast.LENGTH_LONG).show()
//            Toast.makeText(baseContext,phoneNumber,Toast.LENGTH_LONG).show()

        }
    }
}
data class Details (var name:String,
                    var dob:String,
                    var nationality:String,
                    var idNumber:String,
                    var email:String,
                    var phoneNumber:String)

