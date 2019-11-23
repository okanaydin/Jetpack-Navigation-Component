package com.devfest_istanbul_2019_jetpack_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.devfest_istanbul_2019_jetpack_navigation.model.Speaker
import kotlinx.android.synthetic.main.fragment_speaker_list.*

class SpeakerListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //Speaker 1
        img_speaker_1.setImageResource(Speaker.getOkanInfo().image)
        tv_speaker_name_1.text = Speaker.getOkanInfo().name
        tv_speaker_title_1.text = Speaker.getOkanInfo().title

        //Speaker 2
        img_speaker_2.setImageResource(Speaker.getMertInfo().image)
        tv_speaker_name_2.text = Speaker.getMertInfo().name
        tv_speaker_title_2.text = Speaker.getMertInfo().title

        return inflater.inflate(R.layout.fragment_speaker_list, container, false)
    }
}
