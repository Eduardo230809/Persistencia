package ni.edu.uca.persistenciaroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.persistenciaroom.databinding.ActivityMainBinding
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // setupActionBarWithNavController(findNavController(R.id.listaFragment)
      //  )
  //  }
   // override fun onSupportNavigateUp(): Boolean {
      //  val navController = findNavController(R.id.listaFragment)
      //  return navController.navigateUp() ||
      //          super.onSupportNavigateUp()
    }
}
