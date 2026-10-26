package vn.edu.vlsc.lab3a

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import vn.edu.vlsc.lab3a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Danh sách sinh viên mẫu
        val studentList = listOf(
            Student("Nguyễn Văn An", "2024001"),
            Student("Trần Thị Bình", "2024002"),
            Student("Lê Hoàng Cường", "2024003"),
            Student("Phạm Thị Dung", "2024004"),
            Student("Hoàng Văn Em", "2024005"),
        )

        // Thiết lập Adapter và LayoutManager cho RecyclerView
        val adapter = StudentAdapter(studentList)
        binding.rvStudents.adapter = adapter
        binding.rvStudents.layoutManager = LinearLayoutManager(this)
    }
}