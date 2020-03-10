package com.example.fragmentex.activityToFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentex.R
import kotlinx.android.synthetic.main.activity_user_name.*

class UserNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_name)
        btn_send.setOnClickListener{
            val userDetailFragment = UserDetailFragment()
            userDetailFragment.setData(et_user_name.text.toString())
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.layout_container, userDetailFragment)
            fragmentTransaction.commit()
        }

    }
}
