package com.devfest_istanbul_2019_jetpack_navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devfest_istanbul_2019_jetpack_navigation.model.Speaker
import kotlinx.android.synthetic.main.fragment_speaker_detail.*
import kotlinx.android.synthetic.main.fragment_speaker_list.*

class SpeakerDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_speaker_detail, container, false)
    }
}
