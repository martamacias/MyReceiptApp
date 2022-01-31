package com.example.myreceiptapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myreceiptapp.R
import com.example.myreceiptapp.databinding.FragmentReceiptDetailBinding

class ReceiptDetailFragment : Fragment() {
    private lateinit var binding: FragmentReceiptDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentReceiptDetailBinding.inflate(layoutInflater)
        return binding.root
    }

}