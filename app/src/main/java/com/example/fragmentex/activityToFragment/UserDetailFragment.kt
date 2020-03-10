package com.example.fragmentex.activityToFragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentex.R

class UserDetailFragment : Fragment() {


    var tvUser: TextView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val viewObj = inflater.inflate(R.layout.fragment_user_detail, container, false)
        tvUser = viewObj.findViewById(R.id.tv_detail)
        return viewObj
    }


    fun setData(name: String) {
        tvUser!!.text = name

    }


}
