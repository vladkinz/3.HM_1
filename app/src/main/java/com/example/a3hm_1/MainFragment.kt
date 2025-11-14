package com.example.a3hm_1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a3hm_1.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: SerialAdapter
    private var listSerial = arrayListOf<SerialModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = SerialAdapter(listSerial, onClick = { model ->
            Log.d("ololo", "onViewCreated: ${model.name} ")
            val bundle = Bundle()
            bundle.putSerializable("serial", model)
            if (findNavController().currentDestination?.id == R.id.mainFragment) {
                findNavController().navigate(R.id.action_mainFragment_to_detailFragment, bundle)
            }

        })
        binding.rvSerials.adapter = adapter
    }

    fun loadData() {
        listSerial.add(
            SerialModel(
                img = "https://th.bing.com/th/id/R.4c962fc05528f5289cec59d90d053066?rik=0l9Tb32JF2J3wA&pid=ImgRaw&r=0",
                name = "Чернобыль", episode = "S1E5", date = "Mon,Jun 3, 2019", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/07/the-bear-tv-show-poster.jpg",
                name = "The Bear", episode = "S2E10", date = "Thu,Jun 22, 2023", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://m.media-amazon.com/images/M/MV5BZmJkMDRjYzEtMWI3Ny00OWE3LWJlNTItMGQ1MTQzMzc3NDY5XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Shogun", episode = "S1E9", date = "Tue,Apr 16, 2024", days = 3
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://th.bing.com/th/id/R.4c962fc05528f5289cec59d90d053066?rik=0l9Tb32JF2J3wA&pid=ImgRaw&r=0",
                name = "Чернобыль", episode = "S1E5", date = "Mon,Jun 3, 2019", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/07/the-bear-tv-show-poster.jpg",
                name = "The Bear", episode = "S2E10", date = "Thu,Jun 22, 2023", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://m.media-amazon.com/images/M/MV5BZmJkMDRjYzEtMWI3Ny00OWE3LWJlNTItMGQ1MTQzMzc3NDY5XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Shogun", episode = "S1E9", date = "Tue,Apr 16, 2024", days = 3
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://th.bing.com/th/id/R.4c962fc05528f5289cec59d90d053066?rik=0l9Tb32JF2J3wA&pid=ImgRaw&r=0",
                name = "Чернобыль", episode = "S1E5", date = "Mon,Jun 3, 2019", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/07/the-bear-tv-show-poster.jpg",
                name = "The Bear", episode = "S2E10", date = "Thu,Jun 22, 2023", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://m.media-amazon.com/images/M/MV5BZmJkMDRjYzEtMWI3Ny00OWE3LWJlNTItMGQ1MTQzMzc3NDY5XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Shogun", episode = "S1E9", date = "Tue,Apr 16, 2024", days = 3
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://th.bing.com/th/id/R.4c962fc05528f5289cec59d90d053066?rik=0l9Tb32JF2J3wA&pid=ImgRaw&r=0",
                name = "Чернобыль", episode = "S1E5", date = "Mon,Jun 3, 2019", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://static1.colliderimages.com/wordpress/wp-content/uploads/2023/07/the-bear-tv-show-poster.jpg",
                name = "The Bear", episode = "S2E10", date = "Thu,Jun 22, 2023", days = 1
            )
        )
        listSerial.add(
            SerialModel(
                img = "https://m.media-amazon.com/images/M/MV5BZmJkMDRjYzEtMWI3Ny00OWE3LWJlNTItMGQ1MTQzMzc3NDY5XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Shogun", episode = "S1E9", date = "Tue,Apr 16, 2024", days = 3
            )
        )
    }
}