package com.masterclass.cadastro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.masterclass.cadastro.databinding.FragmentTelaUmBinding

open class TelaUmFragment() : Fragment() {

    private var binding: FragmentTelaUmBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTelaUmBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.buttonNext?.setOnClickListener {
            val name = binding?.etName?.text.toString()
            val cpf = binding?.etCpf?.text.toString()
            val email = binding?.etEmail?.text.toString()

            val destination = TelaUmFragmentDirections.actionTelaUmFragmentToTelaDoisFragment(name,cpf,email)
            findNavController().navigate(destination)
        }

    }

}

