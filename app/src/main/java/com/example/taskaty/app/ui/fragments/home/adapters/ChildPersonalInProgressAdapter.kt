package com.example.taskaty.app.ui.fragments.home.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.taskaty.databinding.ItemInprogressPersonalCardBinding
import com.example.taskaty.domain.entities.Task

class ChildPersonalInProgressAdapter(private val items: List<Task>) : Adapter<ChildPersonalInProgressAdapter.InProgressViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InProgressViewHolder {
        val binding = ItemInprogressPersonalCardBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return InProgressViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: InProgressViewHolder, position: Int) {
        val task = items[position]
        holder.bind(task)
    }

    class InProgressViewHolder(val binding: ItemInprogressPersonalCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.apply {
                taskCardHeaderInProgress.text = task.title
                taskCardDescriptionInProgress.text = task.description
                taskCardDateInProgress.text = task.creationTime.toString()
                timeTextInProgress.text = task.creationTime.toString()
            }
        }
    }
}