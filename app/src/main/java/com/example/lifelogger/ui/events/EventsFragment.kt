package com.example.lifelogger.ui.events

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifelogger.R
import com.example.lifelogger.EventData

class EventsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_events_list, container, false)
        // TODO: somehow get mutable items from the database; no idea how
        val items = mutableListOf(EventData("code", "1970-01-01", "clean up code"))
        if (view !is RecyclerView) throw IllegalStateException("inflated view is not RecyclerView")
        view.layoutManager = LinearLayoutManager(context)
        view.adapter = EventDataRecyclerViewAdapter(items)
        return view
    }
}
