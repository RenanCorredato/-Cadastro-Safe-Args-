package com.masterclass.cadastro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.masterclass.cadastro.databinding.FragmentTelaDoisBinding



class TelaDoisFragment() : Fragment() {
    private var binding: FragmentTelaDoisBinding? = null
    private val args: TelaDoisFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTelaDoisBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
               binding?.btNext?.setOnClickListener {



            val name = args.name
            val cpf = args.cpf
            val email = args.email
            val cep = binding?.etCep?.text.toString()
            val city = binding?.etCity?.text.toString()
            val adresss = binding?.etAddress?.text.toString()
            val number = binding?.etNumber?.text.toString()
            val complement = binding?.etComplement?.text.toString()

            val destination = TelaDoisFragmentDirections.actionTelaDoisFragmentToTelaTresFragment(
                name,cpf,email,cep,city,adresss,number,complement)
            findNavController().navigate(destination)

        }


    }

}



