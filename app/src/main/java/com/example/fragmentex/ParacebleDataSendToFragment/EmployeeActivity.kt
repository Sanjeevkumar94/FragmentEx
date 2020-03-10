package com.example.fragmentex.ParacebleDataSendToFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentex.R
import kotlinx.android.synthetic.main.activity_employee.*

class EmployeeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        btn_login.setOnClickListener {

            val employeeDetailFragment = EmployeeDetailFragment()

            var employee = Employee(et_user_name.text.toString(),et_password.text.toString())

            val bundle = Bundle()
            bundle.putParcelable("employeeObj",employee)

            employeeDetailFragment.arguments = bundle

            val fm = fragmentManager
            val ft = fm.beginTransaction()
            ft.replace(R.id.frame_layout,employeeDetailFragment)
            ft.commit()
        }



    }
}
