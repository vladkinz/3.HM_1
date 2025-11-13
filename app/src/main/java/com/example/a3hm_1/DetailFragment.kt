package com.example.a3hm_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.a3hm_1.databinding.FragmentDetail2Binding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetail2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetail2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val model = arguments?.getSerializable("serial") as SerialModel?

        model?.let {
            with(binding) {
                imgSerial.loadImg(model.img)
                tvTitle.text = model.name
                tvEpisode.text = model.episode
                tvDate.text = model.date

            }


        }
    }

    private fun ImageView.loadImg(img: String) {
        Glide.with(this).load(img).into(this)
    }

}