package com.devfest_istanbul_2019_jetpack_navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.devfest_istanbul_2019_jetpack_navigation.model.Speaker
import kotlinx.android.synthetic.main.fragment_speaker_detail.*

class SpeakerDetailFragment : Fragment() {

    private val bundle: SpeakerDetailFragmentArgs by navArgs()
    private var speaker: Speaker? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_speaker_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        speaker = bundle.speaker

        speaker?.let {
            imgSpeakerDetail.setImageResource(it.image)
            tvSpeakerNameDetail.text = it.name
            tvSpeakerTitleDetail.text = it.title
            tvSpeakerLocationDetail.text = it.location
            tvSpeakerBioDetail.text = it.description
        }
    }
}
