package vn.edu.vlsc.lab3a

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.edu.vlsc.lab3a.databinding.ItemStudentBinding

class StudentAdapter(private val studentList: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(val binding: ItemStudentBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = ItemStudentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val (name, mssv) = studentList[position]
        holder.binding.tvName.text = name
        holder.binding.tvMssv.text = holder.itemView.context.getString(R.string.student_mssv, mssv)
    }

    override fun getItemCount(): Int = studentList.size
}