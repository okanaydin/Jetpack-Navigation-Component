package com.devfest_istanbul_2019_jetpack_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devfest_istanbul_2019_jetpack_navigation.model.Speaker
import kotlinx.android.synthetic.main.fragment_speaker_list.*

class SpeakerListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_speaker_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Speaker 1
        imgSpeaker1.setImageResource(Speaker.getOkanInfo().image)
        tvSpeakerName1.text = Speaker.getOkanInfo().name
        tvSpeakerTitle1.text = Speaker.getOkanInfo().title

        //Speaker 2
        imgSpeaker2.setImageResource(Speaker.getMertInfo().image)
        tvSpeakerName2.text = Speaker.getMertInfo().name
        tvSpeakerTitle2.text = Speaker.getMertInfo().title

        cardViewOkan.setOnClickListener {
            findNavController().navigate(R.id.action_speakerListFragment_to_speakerDetailFragment)
        }

        cardViewMert.setOnClickListener {
            findNavController().navigate(R.id.action_speakerListFragment_to_speakerDetailFragment)
        }
    }
}
