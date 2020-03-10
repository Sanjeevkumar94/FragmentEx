package com.example.fragmentex.ParacebleDataSendToFragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentex.R


class EmployeeDetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val viewObj = inflater.inflate(R.layout.fragment_employee_detail, container, false)
        val tvUserName = viewObj.findViewById(R.id.tv_user_name) as TextView
        val tvPassword = viewObj.findViewById(R.id.tv_user_password) as TextView

        val bundle = arguments

        if (bundle != null) {
            val employee = bundle.getParcelable("employeeObj") as Employee
            tvUserName.text = employee.name
            tvPassword.text = employee.password
        }

        return viewObj
    }

}
