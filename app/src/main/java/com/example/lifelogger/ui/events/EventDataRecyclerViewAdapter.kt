package com.example.lifelogger.ui.events

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.lifelogger.EventData
import com.example.lifelogger.databinding.FragmentEventsItemBinding

class EventDataRecyclerViewAdapter(
    private val values: List<EventData>
) : RecyclerView.Adapter<EventDataRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentEventsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.name.text = item.name
        holder.date.text = item.date
        holder.description.text = item.desc
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentEventsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val name: TextView = binding.name
        val date: TextView = binding.date
        val description: TextView = binding.description
    }

}
