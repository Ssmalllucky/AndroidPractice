package com.ssmalllucky.androidpractice.second

import android.appwidget.AppWidgetProvider
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RemoteViews
import androidx.fragment.app.Fragment
import com.ssmalllucky.androidpractice.R
import kotlinx.android.synthetic.main.f_dynamic.*

class DynamicFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(DynamicFragment::javaClass.name,"onCreateView")
        var view = inflater.inflate(R.layout.f_dynamic, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(DynamicFragment::javaClass.name,"onActivityCreated")
        dynamicTV.setText(arguments?.getInt("counter").toString())
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(DynamicFragment::javaClass.name,"onAttach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(DynamicFragment::javaClass.name,"onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(DynamicFragment::class.java.simpleName,"onDetach")
    }
}