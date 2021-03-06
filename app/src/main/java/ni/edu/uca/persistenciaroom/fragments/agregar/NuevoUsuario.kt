package ni.edu.uca.persistenciaroom.fragments.agregar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ni.edu.uca.persistenciaroom.R
import ni.edu.uca.persistenciaroom.bd.entidades.UsuariosEntity
import ni.edu.uca.persistenciaroom.bd.viewmodel.UsuarioViewModels
import ni.edu.uca.persistenciaroom.databinding.FragmentNuevoUsuarioBinding

class NuevoUsuario : Fragment() {
    lateinit var fBinding: FragmentNuevoUsuarioBinding
    private lateinit var viewModel: UsuarioViewModels
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        fBinding = FragmentNuevoUsuarioBinding.inflate(layoutInflater)
        viewModel =
            ViewModelProvider(this).get(UsuarioViewModels::class.java)
        fBinding.BtnGuardar.setOnClickListener {
            guardarRegistro()
        }
        return fBinding.root
    }
    private fun guardarRegistro() {
        //val baseDatos = MainBaseDatos.getDataBase(this)
        val userName = fBinding.TxtUserName.text.toString()
        val pass = fBinding.TxtPassword.text.toString()
        val nombres = fBinding.TxtNombres.text.toString()
        val apellidos = fBinding.TxtApellidos.text.toString()
        val email = fBinding.TxtEmail.text.toString()
        //Crear objeto
        val usuario = UsuariosEntity(0, userName, pass, email,
            nombres, apellidos)
        //Agregar nuevo usuario
        viewModel.agregarUsuario(usuario)
        Toast.makeText(requireContext(), "Registro guardado",
            Toast.LENGTH_LONG).show()
        findNavController().navigate(R.id.ir_Lista)
    }
}