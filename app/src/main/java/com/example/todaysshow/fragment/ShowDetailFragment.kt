package com.example.todaysshow.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.todaysshow.R

class ShowDetailFragment(parent: String, title: String) : Fragment() {

    var parent = parent
    var title = title


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewGroup: ViewGroup = inflater.inflate(R.layout.activity_show_detail_fragment, null) as ViewGroup

        var showDetailTitleTextView = viewGroup.findViewById<TextView>(R.id.show_detail_title_tv)
        showDetailTitleTextView.setText(title)

        var closeBt : Button = viewGroup.findViewById<Button>(R.id.show_detail_fragment_close_bt)
        closeBt.setOnClickListener(View.OnClickListener {
            if (parent.equals("Home")) {
                var parentFrag: HomeFragment =
                    this@ShowDetailFragment.parentFragment as HomeFragment
                parentFrag.BackToHome()
            }
        })

        return viewGroup
    }
}