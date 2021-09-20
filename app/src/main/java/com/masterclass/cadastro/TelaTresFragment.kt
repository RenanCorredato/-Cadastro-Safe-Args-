package com.masterclass.cadastro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.masterclass.cadastro.databinding.FragmentTelaTresBinding


class TelaTresFragment : Fragment() {

    private val args: TelaTresFragmentArgs by navArgs()

    private var binding: FragmentTelaTresBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTelaTresBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when(binding?.apply {

            tvName2.text = getString(R.string.ola,args.name)
            tvCpf2.text = args.cpf
            tvEmail2.text = args.email

            tvCep2.text = args.cep.toString()
            tvCity2.text = args.cidade
            tvAddress2.text = args.endereco
            tvNumber2.text = args.numero
            tvComplement2.text = args.complemento
        }){

        }


    }

}