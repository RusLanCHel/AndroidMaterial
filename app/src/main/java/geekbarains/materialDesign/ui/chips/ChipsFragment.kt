package geekbarains.materialDesign.ui.chips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat.recreate
import androidx.fragment.app.Fragment
import com.google.android.material.chip.Chip
import geekbarains.materialDesign.R
import kotlinx.android.synthetic.main.fragment_chips.*

class ChipsFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chips, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chipGroup.setOnCheckedChangeListener { group, checkedId ->
            group.findViewById<Chip>(checkedId)?.let { chip ->
                if(chip.id == R.id.chipNormal){
                    activity?.setTheme(R.style.AppTheme)
                    activity?.let { it.recreate() }
                }
                if(chip.id == R.id.chipMoon){
                    activity?.setTheme(R.style.MoonAppTheme)
                    activity?.let { it.recreate() }
                }
            }
        }
    }
}
