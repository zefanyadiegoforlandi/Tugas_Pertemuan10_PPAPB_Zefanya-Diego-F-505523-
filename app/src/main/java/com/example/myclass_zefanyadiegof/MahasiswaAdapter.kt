import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myclass_zefanyadiegof.Mahasiswa
import com.example.myclass_zefanyadiegof.R
import com.example.myclass_zefanyadiegof.databinding.ItemMahasiswaBinding

typealias OnClickMahasiswa = (Mahasiswa) -> Unit

class MahasiswaAdapter(private val mahasiswaList: List<Mahasiswa>, private val onClickMahasiswa: OnClickMahasiswa) :
    RecyclerView.Adapter<MahasiswaAdapter.ItemMahasiswaViewHolder>() {

    inner class ItemMahasiswaViewHolder(val binding: ItemMahasiswaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Mahasiswa) {
            with(binding) {
                namaTextView.text = data.nama
                tanggalLahirTextView.text = data.tanggalLahir


                itemView.setOnClickListener {
                    onClickMahasiswa(data)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMahasiswaViewHolder {
        val binding = ItemMahasiswaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemMahasiswaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }

    override fun onBindViewHolder(holder: ItemMahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswaList[position]
        holder.bind(mahasiswa)
        holder.binding.mahasiswaImageView.setImageResource(mahasiswa.pict)

        holder.itemView.setOnClickListener {
            onClickMahasiswa(mahasiswa)
        }
    }
}
