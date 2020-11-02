package com.example.nearbyforeattogether

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class NearByRecycleViewAdapter(private val context: Context,
                               private val data: ArrayList<RowData>) : RecyclerView.Adapter<NearByRecycleViewAdapter.MyViewHolder>(), ItemTouchHelperAdapter{
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.avatar)
        private val name: TextView = itemView.findViewById(R.id.name)
        private val description: TextView = itemView.findViewById(R.id.description)
        fun bind(row: RowData){
            name.text = row.name
            description.text = row.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(inflater.inflate(R.layout.recycle_view_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
        Picasso.with(context).load(data[position].avatar).resize(400,400).into(holder.image)
    }

    override fun getItemCount(): Int = data.size
    override fun onItemDismiss(position: Int) {
        data.removeAt(position)
        notifyItemRemoved(position)
    }
}